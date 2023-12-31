import java.time.*;

/**
 * Спроектуйте та розробіть метод, який визначає, скільки часу пройшло із заданої дати.
 * За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді,
 * наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».
 */


public class Main {
    public static void main(String[] args) {
        LocalDate dateOfbirthday = LocalDate.of(1997, 8, 20);
        calculateTime(dateOfbirthday);

    }

    public static void calculateTime(LocalDate dateOfbirthday) {
        LocalDateTime nowTime = LocalDateTime.now();
        Period period = Period.between(dateOfbirthday, nowTime.toLocalDate());
        LocalDateTime localDateTime = dateOfbirthday.atStartOfDay();

        int hours = nowTime.getHour() - localDateTime.getHour();
        int minutes = nowTime.getMinute() - localDateTime.getMinute();
        int seconds = nowTime.getSecond() - localDateTime.getSecond();


        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }


}
