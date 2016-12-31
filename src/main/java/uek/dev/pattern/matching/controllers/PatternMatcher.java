package uek.dev.pattern.matching.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uek.dev.pattern.matching.models.Entry;

import javax.validation.Valid;

@RestController
@RequestMapping("/pattern")
public class PatternMatcher {

    @RequestMapping(value = "find", headers = "content-type=application/json", method = RequestMethod.POST)
    ResponseEntity<String> findPattern(@Valid @RequestBody  Entry entry) {
        System.out.println(entry.getPattern());
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }
}
