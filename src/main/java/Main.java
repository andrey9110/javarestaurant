import util.VotesCheck;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by MyMac on 03.04.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(VotesCheck.isBefore(LocalDateTime.of(2016, Month.APRIL, 4, 10, 0)));
    }
}
