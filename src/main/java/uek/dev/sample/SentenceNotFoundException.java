package uek.dev.sample;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason="Can not find sentence property")
public class SentenceNotFoundException extends Exception {}
