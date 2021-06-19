# oops-workshop-deck

Program to initialise deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") &
Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players.

UC1 : Setup the initial game with deck of cards and make sure we have unique cards. The number of cards are 52.

UC2 : Moving forward we need to have more than 2 players and Max 4 Players. 
      Create Players Class to add Players from console.

UC3 : Add the method to sequence the Players order and how they should receive the cards and further order for play.

UC4 : Each time we distribute the cards with the Player, Condition is that we shuffle the cards. 
      Make a function to shuffle the cards.

UC5 : Based on the Players sequence the cards needs to be distributed.
      Create a function to distribute and making sure the distributed is in order. 
      The Player should receive all 9 cards each.

UC6 : Verify the each Player has got how many different types of cards like "Clubs", "Diamonds", "Hearts", "Spades".
      Expected output would be an Object or Array {"Clubs": 2, "Diamonds":4, "Hearts":2, "Spades":1}
