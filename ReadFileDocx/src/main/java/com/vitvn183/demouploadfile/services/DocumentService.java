package com.vitvn183.demouploadfile.services;

import com.vitvn183.demouploadfile.entities.Document;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface DocumentService {

    Document getFile(Long id);

    List<Document> getAllFiles();

    Document uploadFile(MultipartFile multipartFile) throws Exception;

    String deleteDocument(Long id);

}
