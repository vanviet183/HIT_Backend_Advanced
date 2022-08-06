package com.vitvn183.demouploadfile.controllers;

import com.vitvn183.demouploadfile.base.VsResponseUtil;
import com.vitvn183.demouploadfile.services.SegmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/segments")
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
    public ResponseEntity<?> getSegment(@PathVariable Long id) {
        return ResponseEntity.ok(VsResponseUtil.ok(segmentService.getSegment(id)));
    }

    @PostMapping("/write/documents/{idDocument}")
    public ResponseEntity<?> writeDocument(@PathVariable("idDocument") Long idDocument) throws Exception {
        segmentService.writeToDocument(idDocument);
        return ResponseEntity.ok().body("Write document successfully");
    }
}
