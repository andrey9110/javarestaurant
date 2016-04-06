package util;

import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by MyMac on 03.04.16.
 */
public class VotesCheck {

    public static boolean isSameDate(LocalDateTime dateTime){
        return dateTime.toLocalDate().equals(LocalDate.now());
    }

    public static boolean isBefore(LocalDateTime dateTime){
        return dateTime.toLocalTime().isBefore(LocalTime.of(11,0));
    }
}
