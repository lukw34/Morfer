package uek.dev.sample;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason="Can not find sample property")
public class SampleNotFoundException extends Exception {}
