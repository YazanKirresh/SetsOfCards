import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static int FindHowManyCardSets(String [][] arrayOfCards  ) {
        int amountOfSets = 0;
        HashMap<String, Integer> SetOfSpades = new HashMap<>();
        HashMap<String, Integer> SetOfClubs = new HashMap<>();
        HashMap<String, Integer> SetOfDiamonds = new HashMap<>();
        HashMap<String, Integer> SetOfHearts = new HashMap<>();
        //each map will contain the number and how many duplicates do we have of it
        for (int i = 0; i < arrayOfCards.length; ++i) {
            for (int j = 0; j < arrayOfCards[i].length; ++j) {
                switch (arrayOfCards[i][1]){
                    case "S":
                        if (SetOfSpades.containsKey(arrayOfCards[i][j])){
                        // we already have it, we need to increment the send value of the map
                        int duplicate = SetOfSpades.get(arrayOfCards[i][j]);
                        duplicate++;
                        SetOfSpades.put(arrayOfCards[i][0],duplicate);
                        }else{
                            SetOfSpades.put(arrayOfCards[i][0],1);
                        }
                        break;
                    case "C":
                        break;
                    case "D":
                        break;
                    case "H":
                        break;
                }
 
            }
        }   
        System.out.println("Spades cards:"+ SetOfSpades);
        System.out.println("Clubs cards:"+ SetOfClubs);
        System.out.println("Diamond cards:"+ SetOfDiamonds);
        System.out.println("Hearts cards:"+ SetOfHearts);
        return amountOfSets;
    }

    public static void main(String[] args) throws Exception { 
        String[][] myCards = {
            {"0", "S"},
            {"1", "H"},
            {"2", "D"},
            {"3", "C"},
            {"4", "S"},
            {"5", "H"},
            {"6", "D"},
            {"7", "C"},
            {"8", "S"},
            {"9", "H"},
            {"10", "D"},
            {"11", "C"},
            {"12", "S"},
        };
        // input is two dimensional array
        int cardSets = FindHowManyCardSets(myCards);
        if (cardSets != 0) {
            System.out.println("From the provided cards we can create " + cardSets +" sets of cards ");    
        }else{
            System.out.println("From the provided cards we cannot create any card set ;(");
        }
    }
}
