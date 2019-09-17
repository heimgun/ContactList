package com.klasser;

import java.util.Scanner;

public class oppgave3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

         person[] arr = new person[3];
        for(int i=0; i<3; i++) {
            arr[i] = new person();
        }


        for(int b=0; b<3; b++) {
            System.out.print("Skriv inn ditt navn: ");
            arr[b].navn = scan.nextLine();
            System.out.print("Skriv inn din alder: ");
            arr[b].alder = scan.nextLine();
            System.out.print("Skriv inn ditt telefonnummer: ");
            arr[b].tele = scan.nextLine();
            System.out.print("Skriv inn din e-post: ");
            arr[b].epost = scan.nextLine();
            System.out.println();
        }


        System.out.println("Kontakter:");
        System.out.println(arr[0].personInfo());
        System.out.println(arr[1].personInfo());
        System.out.println(arr[2].personInfo());


    }
}
