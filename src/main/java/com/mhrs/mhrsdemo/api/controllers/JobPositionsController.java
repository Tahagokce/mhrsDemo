package com.mhrs.mhrsdemo.api.controllers;




import com.mhrs.mhrsdemo.business.abstracts.JobPositionService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jopposition")
public class JobPositionsController {

    private JobPositionService jopPositionService;



  @Autowired
    public JobPositionsController(JobPositionService jopPositionService ) {
        super();
        this.jopPositionService = jopPositionService;
    }


    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<JobPosition>>> GetAll (){

        var result =  this.jopPositionService.getAll();
        return ResponseEntity.ok(result);


    }

    @PostMapping("/add")
     public ResponseEntity<Result> Add(@RequestBody JobPosition jobPosition){
      this.jopPositionService.add(jobPosition);
      return ResponseEntity.ok(new SuccessResult("Başarılı"));

    }



}
