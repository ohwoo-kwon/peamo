package com.osds.peamo.controller;

import com.osds.peamo.model.entity.Perfume;
import com.osds.peamo.service.PerfumeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/perfume")
@Slf4j
public class PerfumeController {

    private PerfumeService perfumeService;

    @GetMapping("/list")
    public ResponseEntity<ArrayList<Perfume>> getPerfumes(@RequestParam int page) {
        ArrayList<Perfume> response = perfumeService.getPerfumes(page);
        if (response == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping
    public ResponseEntity<Perfume> getPerfume(@RequestParam String id) {
        long perfumeId = Long.parseLong(id);
        Perfume response = perfumeService.getPerfume(perfumeId);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


}