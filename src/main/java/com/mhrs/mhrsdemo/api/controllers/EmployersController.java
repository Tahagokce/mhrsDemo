package com.mhrs.mhrsdemo.api.controllers;


import com.mhrs.mhrsdemo.business.abstracts.EmployerService;
import com.mhrs.mhrsdemo.core.utilities.results.DataResult;
import com.mhrs.mhrsdemo.entities.concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employer")
@RequiredArgsConstructor
public class EmployersController  {

    private final EmployerService employerService ;

    @PostMapping("/add")
    public ResponseEntity<DataResult<Employer>> add (@RequestBody Employer employer ){



       var result = this.employerService.save(employer);

        return ResponseEntity.ok(result);
    }


}
