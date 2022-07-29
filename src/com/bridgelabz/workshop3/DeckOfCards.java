package com.bridgelabz.workshop3;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[][] cards = new String[4][13];

        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                cards[i][j] = suit[i] + ' ' + rank[j];
            }
        }

        shuffleCards(cards);


        Player player = new Player();
        int noOfPlayer = player.noOfPlayers();
        for(int i=0;i<noOfPlayer;i++){
            System.out.println();
            System.out.println("Cards of player "+ (i+1)+" are:");
            System.out.println();
            for(int j=0;j<9;j++){
                System.out.println(cards[i][j]);
            }
        }
    }

    static void shuffleCards(String[][] cards){
        String temp;
        for (int i =0;i<4;i++) {
            for (int j = 0; j < 13; j++) {
                int a = (int) (Math.random() * 10) % 4;
                int b = (int) (Math.random() * 10) % 13;
                temp = cards[i][j];
                cards[i][j] = cards[a][b];
                cards[a][b] = temp;
            }
        }
    }
}
