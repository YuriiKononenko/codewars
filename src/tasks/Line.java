import java.util.ArrayList;
import java.util.List;

public class Line {

    public static String Tickets(int[] peopleInLine) {
        int ticketPrice = 25;
        int change = 0;
        List<Integer> cashDesk = new ArrayList<>();
        for (int i : peopleInLine) {
            change = i - ticketPrice;
            if (change == 0) {
                cashDesk.add(i);
                break;
            }

        }
      //TODO implement this
        return null;
    }

    public static void main(String[] args) {
        Tickets(new int[]{25, 25, 50});
    }

}
