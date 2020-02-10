import java.util.Map;

//NOT FINISHED (REMOVE IS STATEMENTS)
public class Greed {

    public static int greedy(int[] dice) {
        Map<Integer, Integer> dicesCount = countDices(dice);
        int sumToReturn = 0;
        if (dicesCount.get(1) == 1) {
            sumToReturn += 100;
        } else if(dicesCount.get(1)==5){
            sumToReturn+=1000;
        }
        if(dicesCount.get(2)==3){
            sumToReturn+=200;
        }
        if(dicesCount.get(3)==3){
            sumToReturn+=300;
        }
        if(dicesCount.get(4)==3) {

        }

        return sumToReturn;
    }

    private static Map<Integer, Integer> countDices(int[] dice) {
        int onesCounter = 0;
        int twosCounter = 0;
        int threesCounter = 0;
        int foursCounter = 0;
        int fivesCounter = 0;

        for (int i = 0; i < dice.length - 1; i++) {
            switch (dice[i]) {
                case 1:
                    onesCounter++;
                case 2:
                    twosCounter++;
                case 3:
                    threesCounter++;
                case 4:
                    foursCounter++;
                case 5:
                    fivesCounter++;
            }
        }
        return Map.of(1, onesCounter, 2, twosCounter, 3, threesCounter, 4, foursCounter, 5, fivesCounter);
    }

}
