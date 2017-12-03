package uek.dev.morfer.result.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import uek.dev.morfer.result.models.json.Segment;
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

    private final FileService fileService;

    private final MorferService morferService;
    private final CSVService csvMorferService;

    @Autowired
    public ResultController(FileService fileService, MorferService morferService, CSVService csvMorferService) {
        this.fileService = fileService;
        this.morferService = morferService;
        this.csvMorferService = csvMorferService;
    }

    private ResponseEntity getResponseByResultType(String resultType, String sample) throws ResultNotDefinedException {
        switch (resultType) {
            case "json":
                ArrayList<Segment> interpretations = morferService.createModel(sample);
                return new ResponseEntity<>(interpretations, HttpStatus.OK);
            case "csv":
                String stringResult = csvMorferService.getCSVData(morferService.getMorferResult(sample));
                return new ResponseEntity<>(stringResult, HttpStatus.OK);
            default:
                throw new ResultNotDefinedException();
        }
    }

    @RequestMapping(value = "", headers = "content-type=application/json", method = RequestMethod.POST)
    public ResponseEntity<ArrayList<String>> simpleResult(@Valid @RequestBody Sample sample) {
        return new ResponseEntity<>(morferService.getMorferResult(sample.getSample()), HttpStatus.OK);
    }

    @RequestMapping(value = "json", headers = "content-type=application/json", method = RequestMethod.POST)
    public ResponseEntity jsonResult(@RequestParam(value = "result", required = false, defaultValue = "json") String resultType,
                                     @Valid @RequestBody Sample sample) throws SampleNotFoundException, ResultNotDefinedException {
        String stringSample = sample.getSample();
        if (stringSample == null) {
            throw new SampleNotFoundException();
        }

        return this.getResponseByResultType(resultType, stringSample);
    }

    @RequestMapping(value = "file", headers = "content-type=multipart/*", method = RequestMethod.POST)
    public ResponseEntity csvResult(@RequestParam(value = "result", required = false, defaultValue = "json") String resultType,
                                    @RequestParam("file") MultipartFile multipartFile) throws ResultNotDefinedException {
        String fileData = fileService.readFile(multipartFile);
        return this.getResponseByResultType(resultType, fileData);
    }

}
