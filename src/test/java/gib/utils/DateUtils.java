package gib.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateUtils {

    public static String getTodayDate() {
        // Bugünün tarihini al
        LocalDate today = LocalDate.now();

        // Tarih formatını belirle
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM EEEE", new Locale("tr"));

        // Formatlanmış tarihi döndür
        return today.format(formatter);
    }

    public static String getDateAfterDays(int daysAfter) {
        // Bugünden 'daysAfter' gün sonrası tarihini al
        LocalDate futureDate = LocalDate.now().plusDays(daysAfter);

        // Tarih formatını belirle
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM EEEE", new Locale("tr"));

        // Formatlanmış tarihi döndür
        return futureDate.format(formatter);
    }
}
