package com.vitvn183.demouploadfile.repositories;

import com.vitvn183.demouploadfile.entities.Segment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SegmentRepository extends JpaRepository<Segment, Long> {

    @Query("select c from Segment c where c.document.id = ?1 and c.paragraph is null")
    List<Segment> findByDocument_IdAnAndPaAndParagraphNull(Long documentId);
}
