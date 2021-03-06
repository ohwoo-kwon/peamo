package com.osds.peamo.repository;

import com.osds.peamo.model.entity.PerfumeNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PerfumeNoteRepository extends JpaRepository<PerfumeNote, Long> {

    @Query(value = "SELECT note_id FROM peamo.perfumenote WHERE perfume_id = :id AND note_type = :noteType", nativeQuery = true)
    List<Long> getNoteIds(long id, int noteType);

}