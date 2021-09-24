package ru.netology.AutoService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String msg){
        super(msg);
    }
}
