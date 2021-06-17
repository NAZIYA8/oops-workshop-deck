/**
 * ****************************************************************************
 * Purpose: This class contains main method where the program execution is
 *          carried out.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 17-06-2021
 * *****************************************************************************
 */

package com.bridgelabz;

import java.util.Scanner;

public class DeckOfCardsMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.initialize();
        Play();
    }

    /**
     * This method is used to add more Players
     * and take the name of players.
     */
    static void Play(){
        while(Players.numberOfPlayers() <4){
            if(Players.numberOfPlayers() >=2){
                System.out.println("Do you want to add more players?");
                String response = scanner.nextLine();
                if(response.toLowerCase().charAt(0) == 'n'){
                    break;
                }
            }
            System.out.println("Enter the name of player " +(Players.numberOfPlayers() + 1));
            String name = scanner.nextLine();
            Players.add(name);
        }
    }
}