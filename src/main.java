import java.util.ArrayList;
import java.util.List;

public class main{
/*
  Today's Coding Challenge:
  create a function that counts the number of times a particular letter shows up in the word search.
*/

    public static void main(String[] args) {

        String [][]arr={ {"D", "E", "Y", "H", "A", "D"},
                         {"C", "B", "Z", "Y", "J", "K"},
                         {"D", "B", "C", "A", "M", "N"},
                         {"F", "G", "G", "R", "S", "R"},
                         {"V", "X", "H", "A", "S", "S"}
        };
        List<String> list = new ArrayList<>();
        int counter = 0;
        for(int i=0; i <= 4; i++){
            for(int j =0; j<= 5;j++){
                if(arr[i][j].equals("D")){
                    counter++;
                    list.add(arr[i][j]);

                }
            }
        }
        System.out.println("The letter "+list.get(0)+ " show's up "+ counter + " times");
    }
}