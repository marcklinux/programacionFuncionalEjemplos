import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    private void m1SquaredNumbers(List<Integer> numbers){
        List<Integer> Squarednumbers = numbers.stream().map(n -> n* n).collect(Collectors.toList());
        Squarednumbers.forEach(System.out::println);
    }

    private void m2FilterNamesWithMore6characters(List<String> names){

        List<String> namesWith6OrMoreChac = names.stream().filter(name -> name.length() > 6)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        namesWith6OrMoreChac.forEach(System.out::println);
    }

    private void m3FilterNUmberPares(List<Integer> numbers){

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);
    }

    private void m4SumAllNumersUsingReduce(List<Integer> numbers){

        int suma = numbers.stream()
                .reduce(0, (a,b)-> a+b);

        System.out.println(suma);
    }

    private void m5UsinFlatMapToFlapAListAnidada(List<List<String>> ListOfListnames){

        List<String> listnamesFlat = ListOfListnames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        listnamesFlat.forEach(System.out::println);
    }


    public static void main(String[] args) {

        App app = new App();
        //app.m1SquaredNumbers(Arrays.asList(1,2,3,4,5));
        //app.m2FilterNamesWithMore6characters(Arrays.asList("Marcos","Janette","Edgar","yuridia"));
        //app.m3FilterNUmberPares(Arrays.asList(1,2,3,4,5,6));
        //app.m4SumAllNumersUsingReduce(Arrays.asList(1,2,3,4,5));
        app.m5UsinFlatMapToFlapAListAnidada(Arrays.asList(
                Arrays.asList("yuri","gari"),
                Arrays.asList("Marco","jannete"),
                Arrays.asList("Valeria","luis")
        ));

    }
}
