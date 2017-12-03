package uek.dev.morfer.result.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason="Result type isn't defined")
public class ResultNotDefinedException extends Exception {}