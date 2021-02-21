import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers=Arrays.asList(
                                            "N40","N36",
                                            "B6","B12",
                                            "G53","G49","G60","G50","g64",
                                            "I26","I17","I29",
                                            "071");


        List<String> gNumbers=new ArrayList();

        someBingoNumbers.forEach(bingoNumber->{
            if(bingoNumber.startsWith("G")){
                gNumbers.add(bingoNumber);
                System.out.println(bingoNumber);
            }
        });

        System.out.println("======================================================================================");



        //=============================THIS CODE CAN BE DONE WITH LESS CODE USING STREAMS
//        gNumbers.sort((String s1,String s2)->{//a new List.Sort() method introducd in java 8 that require a Comparator
//            return s1.compareTo(s2);
//        });
//        gNumbers.forEach((gNumber)->{
//           if(gNumber.toUpperCase.startsWith("G")){
//               System.out.println(gNumber);
//           }
//        });


        someBingoNumbers
                .stream()
                .map(String::toUpperCase)//map(s->s.toUpperCase()) is similar
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


    }
}

//NOTE
//1.We only can use Method references when the type can be inferred that's why we didn't use it in "filter(s->s.startsWith("G"))"
