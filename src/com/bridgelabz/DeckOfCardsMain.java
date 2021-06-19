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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckOfCardsMain {
    static Scanner scanner = new Scanner(System.in);
    static DeckOfCards deck = new DeckOfCards();

    public static void main(String[] args) {

        deck.initialize();
        Play();
        Sequence();
        Shuffle();
        Distribute();
        Verify();
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

    }

    /**
     * This method to sequence the Players order and how they should receive the
     * cards and further order for play.
     */
    static void Sequence() {
        System.out.print("Enter the order of players:");
        for (int i = 0; i < Players.numberOfPlayers(); i++) {
            System.out.print(Players.getPlayer(i).name);
            if (i < Players.numberOfPlayers() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        String sequence = scanner.nextLine();
        String[] seq = sequence.split(",");
        Player[] players = new Player[Players.numberOfPlayers()];
        for (int i = 1; i <= Players.numberOfPlayers(); i++) {
            String c = seq[i - 1];
            Integer index = Integer.decode(c);
            players[index - 1] = Players.getPlayer(i - 1);
        }
        Players.Sequence(players);
    }


    /**
     * This method is used to Shuffle the cards.
     * Each time we distribute the cards with the Player we shuffle the cards
     */
    static void Shuffle() {
        List<Card> newList = new ArrayList<Card>();
        while (deck.Cards.size() > 0) {
            int index = (int) (Math.random() * deck.Cards.size());
            newList.add(deck.Cards.get(index));
            deck.Cards.remove(index);
        }
        System.out.println("Total cards: " + newList.size());
        deck.Cards = newList;
    }

    /**
     * This method is used to distribute cards in order based on player sequence
     * so that the player receives all 9 cards.
     */
    static void Distribute() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < Players.numberOfPlayers(); j++) {
                Player player = Players.getPlayer(j);
                Card card = deck.Cards.get(0);
                player.cards.add(card);
                deck.Cards.remove(0);
            }
        }
    }

    /**
     * This method is to verify the each Player has got how many
     * different types of cards.
     */
    static void Verify() {
        for (int i = 0; i < Players.numberOfPlayers(); i++) {
            int[] cards = new int[4];
            Player player = Players.getPlayer(i);
            for (int j = 0; j < player.cards.size(); j++) {
                String suit = player.cards.get(j).getSuite();
                switch (suit) {
                    case "Clubs":
                        cards[0]++;
                        break;
                    case "Diamonds":
                        cards[1]++;
                        break;
                    case "Hearts":
                        cards[2]++;
                        break;
                    case "Spades":
                        cards[3]++;
                        break;
                }
            }
            System.out.println("Player:" + player.name);
            System.out.println("Clubs:" + cards[0] + ", Diamonds:" + cards[1] + ", Hearts:" + cards[2] + ", Spades:" + cards[3]);
        }
    }
}

