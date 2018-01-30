package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ivesk svori KG: ");
        float svoris = sc.nextFloat();
        System.out.println("Ivesk ugi m; ");
        float ugis = sc.nextFloat();

        System.out.println("KMI: " + skaiciuokle(svoris, ugis));
    }
    public static float skaiciuokle (float svoris, float ugis){
        return svoris/(ugis*ugis);
    }
}
