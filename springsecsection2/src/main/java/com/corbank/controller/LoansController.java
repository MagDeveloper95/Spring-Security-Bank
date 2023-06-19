package com.corbank.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoansController {

    @GetMapping("/myLoans")
    public String getLoanDetail(){
        return "Here are the loans details from the DB";
    }
}
