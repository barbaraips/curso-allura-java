import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    
    public static void main(final String[] args) {
        
        final List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");
        
        palavras.sort(Comparator.comparing(String::length));
        
        palavras.forEach(System.out::println);
        
    }
}
