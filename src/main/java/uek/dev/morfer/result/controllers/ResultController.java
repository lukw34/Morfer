package uek.dev.morfer.result.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import uek.dev.morfer.result.models.json.Result;
import uek.dev.morfer.result.models.json.Word;
import uek.dev.morfer.result.services.CSVService;
import uek.dev.morfer.result.services.FileService;
import uek.dev.morfer.result.services.MorferService;
import uek.dev.morfer.sample.Sample;
import uek.dev.morfer.sample.SampleNotFoundException;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/morfer")
public class ResultController {

    @Autowired
    FileService fileService;

    @Autowired
    MorferService morferService;

    @Autowired
    CSVService csvMorferService;

    @RequestMapping(value = {"", "json"}, headers = "content-type=application/json", method = RequestMethod.POST)
    public ResponseEntity<Result> sendSample(@Valid @RequestBody Sample sample) throws SampleNotFoundException {
        String stringSample = sample.getSample();
        if(stringSample == null) {
            throw new SampleNotFoundException();
        }

        ArrayList<Word> interpretations = morferService.createModel(stringSample);
        Result result = new Result(interpretations);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "csv", headers = "content-type=multipart/*", method = RequestMethod.POST)
    public ResponseEntity<String> handleFile(@RequestParam("file") MultipartFile multipartFile) {
        String fileData = fileService.readFile(multipartFile);
        String result = csvMorferService.getCSVData(morferService.getMorferResult(fileData));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
