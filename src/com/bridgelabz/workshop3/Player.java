package com.bridgelabz.workshop3;

import java.util.Scanner;

public class Player {

    int noOfPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many player to play(2-4)");
        int noOfPlayer = scanner.nextInt();
        if(noOfPlayer>1 && noOfPlayer<5){
            return noOfPlayer;
        }
        else
            return 0;
    }
}
