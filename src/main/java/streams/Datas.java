package streams;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    
    public static void main(final String[] args) {
        
        //Hoje
        final LocalDate agora = LocalDate.now();
        System.out.println(agora);
        
        // 25 de Janeiro de 2099
        final LocalDate futuro = LocalDate.of(2099, 1, 25);
        System.out.println(futuro);
        
        //Intervalo:
        final Period intervalo = Period.between(agora, futuro);
        System.out.println(intervalo);
        
        //Data formatada  dd/MM/yyyy
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
    
}
