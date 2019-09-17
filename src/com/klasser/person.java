package com.klasser;

public class person {
    public String navn;
    public String alder;
    public String tele;
    public String epost;

    public String personInfo(){
        String text = "Navn: "+navn+"\n" + "Alder: "+alder+"\n"+ "Telefonnr.: "+tele+"\n"+"E-post: "+epost+"\n";
        return text;
    }

}
