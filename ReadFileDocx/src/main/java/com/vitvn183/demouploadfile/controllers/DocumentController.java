package com.vitvn183.demouploadfile.controllers;

import com.vitvn183.demouploadfile.base.VsResponseUtil;
import com.vitvn183.demouploadfile.entities.Document;
import com.vitvn183.demouploadfile.services.DocumentService;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/files")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping("")
    public ResponseEntity<?> getListFiles() {
        List<Document> files = documentService.getAllFiles();
        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFile(@PathVariable Long id) {
        Document file = documentService.getFile(id);
        return ResponseEntity.ok(VsResponseUtil.ok(documentService.getFile(id)));
    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException, JAXBException, Docx4JException {
        return ResponseEntity.ok(VsResponseUtil.ok(documentService.uploadFile(multipartFile)));
    }


}
