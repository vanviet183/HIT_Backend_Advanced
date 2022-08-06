package com.vitvn183.demouploadfile.controllers;

import com.vitvn183.demouploadfile.base.VsResponseUtil;
import com.vitvn183.demouploadfile.entities.Document;
import com.vitvn183.demouploadfile.services.SegmentService;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/files")
public class SegmentController {

    private final SegmentService segmentService;

    public SegmentController(SegmentService segmentService) {
        this.segmentService = segmentService;
    }

    @GetMapping("")
    public ResponseEntity<?> getListSegment() {
        return ResponseEntity.status(HttpStatus.OK).body(segmentService.getAllSegment());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFile(@PathVariable Long id) {
        return ResponseEntity.ok(VsResponseUtil.ok(segmentService.getSegment(id)));
    }

//    @PostMapping("/save")
//    public ResponseEntity<?> saveSegment(@RequestParam("file") MultipartFile multipartFile) throws IOException, JAXBException, Docx4JException {
//        return ResponseEntity.ok(VsResponseUtil.ok(segmentService.saveSegment();));
//    }
}
