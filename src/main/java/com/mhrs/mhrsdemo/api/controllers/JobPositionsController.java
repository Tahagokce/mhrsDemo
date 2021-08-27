package com.mhrs.mhrsdemo.api.controllers;




import com.mhrs.mhrsdemo.business.abstracts.JobPositionService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.entities.concretes.JobPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jopposition")
@RequiredArgsConstructor
public class JobPositionsController  {

    private final JobPositionService jopPositionService;

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<JobPosition>>> GetAll (){

        var result =  this.jopPositionService.getAll();
        return ResponseEntity.ok(result);


    }

    @PostMapping("/add")
     public ResponseEntity<Result> Add(@RequestBody JobPosition jobPosition){
      this.jopPositionService.save(jobPosition);
      return ResponseEntity.ok(new SuccessResult("Başarılı"));

    }



}
