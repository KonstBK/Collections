import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    private final static List<String> randomWords = asList("Java", "Collections", "List", "Cat", "Dog", "Leon", "Java", "Java",
            "Collections", "List");
    public static void main(String[] args) {
        System.out.println(countOccurance(randomWords, "Java"));
        Integer[] randomNumbers = {1,1,1,4,5,3,3,2,2,1,10,20,40};
        System.out.println(toList(randomNumbers));
        System.out.println(findUnique(toList(randomNumbers)));
        List<Occurance> occurances = calcOccurance(randomWords);
        System.out.println(occurances);
    }

    public static int countOccurance(List<String> entities, String substring){
        int counter = 0;

        for (String entity: entities){
            if (entity.equals(substring)) counter++;
        }

        return counter;
    }

    public static List<Integer> toList(Integer[] numbers){
        List<Integer> convertedNums = new ArrayList<>();
        for (int numb: numbers) {
            convertedNums.add(numb);
        }
        return convertedNums;
    }

    public static List<Integer> findUnique(List<Integer> numbers){
        List<Integer> uniqueNums = new ArrayList<>();

        for (Integer number : numbers){
            if (!uniqueNums.contains(number)){
                uniqueNums.add(number);
            }
        }

        return uniqueNums;
    }

    private static List<Occurance> calcOccurance(List<String> stringsList) {
        List<Occurance> occurances =  new ArrayList<>();
        List<String> oneExemplarElement = findUniqueIntegers(stringsList);

        for (String substring: oneExemplarElement){
            occurances.add(new Occurance(substring, Collections.frequency(stringsList, substring)));
        }

        return occurances;
    }

    private static List<String> findUniqueIntegers(List<String> stringsList) {
        List<String> oneExemplarElement = new ArrayList<>();

        for (String substring: stringsList){
            if(!(oneExemplarElement.contains(substring))){
                oneExemplarElement.add(substring);
            }
        }

        return oneExemplarElement;
    }


}
