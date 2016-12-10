package uek.dev.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uek.dev.morpheus.MorferService;
import uek.dev.result.Result;
import uek.dev.sample.Sample;
import uek.dev.sample.SampleNotFoundException;

import javax.validation.Valid;

@RestController
@RequestMapping("/morfer")
public class ResultController {

    @Autowired
    MorferService morferService;

    @RequestMapping(value ="", method = RequestMethod.POST)
    public ResponseEntity<Result> sendSample(@Valid @RequestBody Sample sample) throws SampleNotFoundException {
        Result result = new Result(sample);
//        morferService.saveResult(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
