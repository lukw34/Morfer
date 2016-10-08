package com.example.result;

import com.example.sample.Sample;
import com.example.morpheus.MorferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morfer")
public class ResultController {

    @Autowired
    MorferService morferService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Result> sendSample(@RequestBody Sample sample) {
        Result result = new Result(sample);
        morferService.saveResult(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
