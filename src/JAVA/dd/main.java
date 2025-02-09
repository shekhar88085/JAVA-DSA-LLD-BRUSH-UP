package JAVA.dd;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        /*
         * 2 .... 12 >> making list >> 1,2 ...... 12 9
isolate all the odd number 
make square
sum
         * 
         */

         ArrayList<Integer> list = new ArrayList<>();
         list.add(223);
         list.add(2);
         list.add(1);
         list.add(5);
         list.add(12);
         list.add(5);
         list.add(7);
         list.add(9);
         list.add(11);
         list.add(43);



         //sanitizeList = list.stream().filter(o >= 2 && o <= 12).collect(Collection.list);
         ArrayList<Integer> sanitizedList = new ArrayList<>();

         int sum = 0;

         for(int i = 0;i < list.size(); i++){
            // if(list.get(i) >= 2 && list.get(i) <= 12 ){
            //     sanitizedList.add(list.get(i));
            // }
            int element = list.get(i);
            if((element < 2) || (element > 12) || element % 2 == 0){
                continue;
            }
            System.out.println(element);
            sum += element*element;
         }

         System.out.println(sum);
    }
}
