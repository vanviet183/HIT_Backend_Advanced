package com.vitvn183.demouploadfile.services;

import com.vitvn183.demouploadfile.entities.Document;
import com.vitvn183.demouploadfile.entities.Segment;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@Service
public interface SegmentService {

    Segment getSegment(Long id);

    List<Segment> getAllSegment();

    void saveSegment(List<Object> jaxbNodes, Document document) throws Exception;

    void writeDocx(Long documentId) throws Exception;

    void deleteDocument(Long id);

}
