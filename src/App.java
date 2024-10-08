import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class App {
    public static int FindHowManyCardSets(String [][] arrayOfCards  ) {
        int MaxAmountOfSets = 0;
        int duplicate = 0;
        HashMap<String, Integer> SetOfSpades = new HashMap<>();
        HashMap<String, Integer> SetOfClubs = new HashMap<>();
        HashMap<String, Integer> SetOfDiamonds = new HashMap<>();
        HashMap<String, Integer> SetOfHearts = new HashMap<>();
        // Each map will contain the number and how many duplicates do we have of it
        for (int i = 0; i < arrayOfCards.length; ++i) {
            switch (arrayOfCards[i][1]){
                case "S":
                    if (SetOfSpades.containsKey(arrayOfCards[i][0])){
                        // We already have this card, we need to increment the second value value of the map
                        duplicate = SetOfSpades.get(arrayOfCards[i][0]);
                        duplicate++;
                        SetOfSpades.replace(arrayOfCards[i][0],duplicate);
                    }else{
                        SetOfSpades.put(arrayOfCards[i][0],1);
                    }
                    break;
                case "C":
                    if (SetOfClubs.containsKey(arrayOfCards[i][0])){
                        // We already have this card, we need to increment the second value value of the map
                        duplicate = SetOfClubs.get(arrayOfCards[i][0]);
                        duplicate++;
                        SetOfClubs.replace(arrayOfCards[i][0],duplicate);
                    }else{
                        SetOfClubs.put(arrayOfCards[i][0],1);
                    }
                    break;
                case "D":
                    if (SetOfDiamonds.containsKey(arrayOfCards[i][0])){
                        // We already have this card, we need to increment the second value value of the map
                        duplicate = SetOfDiamonds.get(arrayOfCards[i][0]);
                        duplicate++;
                        SetOfDiamonds.replace(arrayOfCards[i][0],duplicate);
                    }else{
                        SetOfDiamonds.put(arrayOfCards[i][0],1);
                    }
                    break;
                case "H":
                    if (SetOfHearts.containsKey(arrayOfCards[i][0])){
                        // We already have this card, we need to increment the second value value of the map
                        duplicate = SetOfHearts.get(arrayOfCards[i][0]);
                        duplicate++;
                        SetOfHearts.replace(arrayOfCards[i][0],duplicate);
                    }else{
                        SetOfHearts.put(arrayOfCards[i][0],1);
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
                    System.out.println("It will be ignored");
                }
                
            }   
        if (SetOfSpades.size() == 13 && SetOfClubs.size() == 13 && SetOfDiamonds.size() == 13 && SetOfHearts.size() == 13 ){
            // We can create at least one set of cards
            Integer spadesMaxAmountOfSets = Collections.min(SetOfSpades.values());
            Integer clubesMaxAmountOfSets = Collections.min(SetOfClubs.values());
            Integer diamondsMaxAmountOfSets = Collections.min(SetOfDiamonds.values());
            Integer heartsMaxAmountOfSets = Collections.min(SetOfHearts.values());
            MaxAmountOfSets = Math.min(Math.min(spadesMaxAmountOfSets, clubesMaxAmountOfSets), Math.min(diamondsMaxAmountOfSets, heartsMaxAmountOfSets));
        }
        System.out.println("The map consists of the following:");
        System.out.println("Spades cards:"+ SetOfSpades);
        System.out.println("Clubs cards:"+ SetOfClubs);
        System.out.println("Diamond cards:"+ SetOfDiamonds);
        System.out.println("Hearts cards:"+ SetOfHearts);
        

        return MaxAmountOfSets;
    }

    public static void main(String[] args) throws Exception { 
        String[][] myCards = {
            {"0", "S"},
            {"0", "H"},
            {"0", "D"},
            {"0", "C"},
            {"1", "S"},
            {"1", "H"},
            {"1", "D"},
            {"1", "C"},
            {"2", "S"},
            {"2", "H"},
            {"2", "D"},
            {"2", "C"},
            {"3", "S"},
            {"3", "H"},
            {"3", "D"},
            {"3", "C"},
            {"4", "S"},
            {"4", "H"},
            {"4", "D"},
            {"4", "C"},
            {"5", "S"},
            {"5", "H"},
            {"5", "D"},
            {"5", "C"},
            {"6", "S"},
            {"6", "H"},
            {"6", "D"},
            {"6", "C"},
            {"7", "S"},
            {"7", "H"},
            {"7", "D"},
            {"7", "C"},
            {"8", "S"},
            {"8", "H"},
            {"8", "D"},
            {"8", "C"},
            {"9", "S"},
            {"9", "H"},
            {"9", "D"},
            {"9", "C"},
            {"10", "S"},
            {"10", "H"},
            {"10", "D"},
            {"10", "C"},
            {"11", "S"},
            {"11", "H"},
            {"11", "D"},
            {"11", "C"},
            {"12", "S"},
            {"12", "H"},
            {"12", "D"},
            {"12", "C"},
            {"0", "S"},
            {"0", "H"},
            {"0", "D"},
            {"0", "C"},
            {"1", "S"},
            {"1", "H"},
            {"1", "D"},
            {"1", "C"},
            {"2", "S"},
            {"2", "H"},
            {"2", "D"},
            {"2", "C"},
            {"3", "S"},
            {"3", "H"},
            {"3", "D"},
            {"3", "C"},
            {"4", "S"},
            {"4", "H"},
            {"4", "D"},
            {"4", "C"},
            {"5", "S"},
            {"5", "H"},
            {"5", "D"},
            {"5", "C"},
            {"6", "S"},
            {"6", "H"},
            {"6", "D"},
            {"6", "C"},
            {"7", "S"},
            {"7", "H"},
            {"7", "D"},
            {"7", "C"},
            {"8", "S"},
            {"8", "H"},
            {"8", "D"},
            {"8", "C"},
            {"9", "S"},
            {"9", "H"},
            {"9", "D"},
            {"9", "C"},
            {"10", "S"},
            {"10", "H"},
            {"10", "D"},
            {"10", "C"},
            {"11", "S"},
            {"11", "H"},
            {"11", "D"},
            {"11", "C"},
            {"12", "S"},
            {"12", "H"},
            {"12", "D"},
            {"12", "C"},
            {"0", "S"},
            {"0", "H"},
            {"0", "D"},
            {"0", "C"},
            {"1", "S"},
            {"1", "H"},
            {"1", "D"},
            {"1", "C"},
            {"2", "S"},
            {"2", "H"},
            {"2", "D"},
            {"2", "C"},
            {"3", "S"},
            {"3", "H"},
            {"3", "D"},
            {"3", "C"},
            {"4", "S"},
            {"4", "H"},
            {"4", "D"},
            {"4", "C"},
            {"5", "S"},
            {"5", "H"},
            {"5", "D"},
            {"5", "C"},
            {"6", "S"},
            {"6", "H"},
            {"6", "D"},
            {"6", "C"},
            {"7", "S"},
            {"7", "H"},
            {"7", "D"},
            {"7", "C"},
            {"8", "S"},
            {"8", "H"},
            {"8", "D"},
            {"8", "C"},
            {"9", "S"},
            {"9", "H"},
            {"9", "D"},
            {"9", "C"},
            {"10", "S"},
            {"10", "H"},
            {"10", "D"},
            {"10", "C"},
            {"11", "S"},
            {"11", "H"},
            {"11", "D"},
            {"11", "C"},
            {"12", "S"},
            {"12", "H"},
            {"12", "D"},
            {"12", "C"},
        };
        int cardSets = FindHowManyCardSets(myCards);
        System.out.println("\n\n-------------------------------------------------------------");
        if (cardSets != 0) {
            System.out.println("From the provided cards we can create " + cardSets +" sets of cards ");    
        }else if (cardSets == 1){
            System.out.println("From the provided cards we can create one set of cards");
        }else{
            System.out.println("From the provided cards we cannot create any set of cards ;(");
        }
        System.out.println("-------------------------------------------------------------\n\n");
    }
}
