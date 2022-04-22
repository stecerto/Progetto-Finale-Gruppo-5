package com.themoviedb.movies.Exceptions;

import com.themoviedb.movies.Model.Users;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Errore nei dati inseriti!")
public class DatiMancantiExceptions extends RuntimeException{

    public DatiMancantiExceptions(Users users){
        System.out.println("Dati inseriti incompleti! \n" + users);
    }

}
