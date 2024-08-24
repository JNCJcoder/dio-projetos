import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

// Classe TimeFactory:
class TimeFactory {
    public static LocalTime createTime(String timeString)
    {
        try
        {
            return LocalTime.parse(timeString);
        }
        catch (DateTimeParseException e)
        {
            System.out.println("Formato de hora inválido. Use o formato HH:mm.");

            return null;
        }
    }
}

public class MeetingScheduler {

    private static final LocalTime MIN_TIME = LocalTime.of(9, 0); 
    private static final LocalTime MAX_TIME = LocalTime.of(18, 0); 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        String desiredTimeInput = scanner.nextLine();
        LocalTime desiredTime = TimeFactory.createTime(desiredTimeInput);

        if (desiredTime == null)
        {
            return;
        }

        String currentTimeInput = scanner.nextLine();
        LocalTime currentTime = TimeFactory.createTime(currentTimeInput);

        if (currentTime == null)
        {
            return;
        }
        
        if (isMeetingSchedulable(desiredTime)) {
            System.out.println("Reuniao pode ser agendada.");
        } else {
            System.out.println("Reuniao nao pode ser agendada. Horario fora do intervalo permitido.");
        }
    }

    private static boolean isMeetingSchedulable(LocalTime desiredTime) {
        return !desiredTime.isBefore(MIN_TIME) && !desiredTime.isAfter(MAX_TIME);
    }
}