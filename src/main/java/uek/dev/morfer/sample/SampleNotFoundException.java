package uek.dev.morfer.sample;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason="Can't find sample property")
public class SampleNotFoundException extends Exception {}
