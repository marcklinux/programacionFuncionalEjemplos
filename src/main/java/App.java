import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    private void m1SquaredNumbers(List<Integer> numbers){
        List<Integer> Squarednumbers = numbers.stream().map(n -> n* n).collect(Collectors.toList());
        Squarednumbers.forEach(System.out::println);
    }



    public static void main(String[] args) {

        App app = new App();
        //app.m1SquaredNumbers(Arrays.asList(1,2,3,4,5));

    }
}
