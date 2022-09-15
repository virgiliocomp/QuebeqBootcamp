package exercicio1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Mensagem {

    public static void retornaHoraDia(){
        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("BET"));
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        if (hora <= 12){
            System.out.println("Bom dia");
        }
        if (hora >= 18){
            System.out.println("Boa noite");
        }
        else{
            System.out.println("Boa tarde");
        }
    }
}
