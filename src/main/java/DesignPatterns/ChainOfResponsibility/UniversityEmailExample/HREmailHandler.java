/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.UniversityEmailExample;

public class HREmailHandler extends MainEmailHandler {

    protected String[] keyWords() {
        // setup keywords for the receiver team
        return new String[]{"career", "job", "faculty"};
    }

    protected void processEmailFinal(String emailText) {
        System.out.println("The Human Resources Team processed the email.");
    }

}