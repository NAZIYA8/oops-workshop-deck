/**
 * ****************************************************************************
 * Purpose: This class contains main method where the program execution is
 * carried out.
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
    static void Play() {
        while (Players.numberOfPlayers() < 4) {
            if (Players.numberOfPlayers() >= 2) {
                System.out.println("Do you want to add more players?");
                String response = scanner.nextLine();
                if (response.toLowerCase().charAt(0) == 'n') {
                    break;
                } else if (response.toLowerCase().charAt(0) != 'y') {
                    System.out.println("Invalid input.");
                    continue;
                }
            }
            System.out.println("Enter the name of player " + (Players.numberOfPlayers() + 1));
            String name = scanner.nextLine();
            Players.add(name);
        }
        Sequence();
    }

    /**
     * This method to sequence the Players order and how they should receive the
     * cards and further order for play.
     */
    static void Sequence() {
        System.out.print("Enter the order of players:");
        for (int i = 0; i < Players.numberOfPlayers(); i++) {
            System.out.print(Players.getPlayer(i));
            if (i < Players.numberOfPlayers() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        String sequence = scanner.nextLine();
        String[] seq = sequence.split(",");
        String[] players = new String[Players.numberOfPlayers()];
        for (int i = 1; i <= Players.numberOfPlayers(); i++) {
            String c = seq[i - 1];
            Integer index = Integer.decode(c);
            players[index - 1] = Players.getPlayer(i - 1);
        }
        Players.Sequence(players);
    }
}

