package com.vitvn183.demouploadfile.services.impl;

import com.vitvn183.demouploadfile.entities.Document;
import com.vitvn183.demouploadfile.repositories.DocumentRepository;
import com.vitvn183.demouploadfile.services.DocumentService;
import com.vitvn183.demouploadfile.services.SegmentService;
import com.vitvn183.demouploadfile.utils.ConvertObject;
import org.docx4j.docProps.extended.Properties;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.DocPropsExtendedPart;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Objects;

@Service
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;
    private final SegmentService segmentService;

    public DocumentServiceImpl(DocumentRepository documentRepository, SegmentService segmentService) {
        this.documentRepository = documentRepository;
        this.segmentService = segmentService;
    }

    public Document getFile(Long id) {
        return documentRepository.findById(id).get();
    }

    public List<Document> getAllFiles() {          // thực hiện song song code với sự trợ giúp của stream.
        return documentRepository.findAll();
    }

    @Override
    public Document uploadFile(MultipartFile multipartFile) throws Exception {

        System.out.println("Okke");
        File file = ConvertObject.convertMultipartToFile(multipartFile);
        System.out.println(file);

        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(file);

        MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();

        String textNodesXPath = "//w:p";
        List<Object> jaxbNodes = documentPart.getJAXBNodesViaXPath(textNodesXPath, true);

        DocPropsExtendedPart docPropsExtendedPart =  wordMLPackage.getDocPropsExtendedPart();
        Properties extendedProps = docPropsExtendedPart.getContents();
        final Integer pages = extendedProps.getPages();

        Document document = new Document();
        document.setFileName(file.getName());
        document.setExt(file.getName().substring(file.getName().lastIndexOf(".") + 1));
        document.setPath(file.getPath());
        document.setPages(pages);

        documentRepository.save(document);
        segmentService.saveSegment(jaxbNodes, document);
        return document;
    }

    @Override
    public String deleteDocument(Long id) {
        documentRepository.deleteById(id);
        return "Delete successfully";
    }
}
