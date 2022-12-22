package org.example;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExamples {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("Jan");
        try {
            System.out.println("TRY..");
            int x = 3;
            if(index > values.size()){
                throw new MyException();
            }
            //System.out.printf("Value at index 3: %d \n",values.get(3));
            //int x = 5 / 0;
            //System.out.println(x);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No value at index");
            int lastIndex = values.size();
            String lastValue = values.get(lastIndex-1);
            System.out.println(lastValue);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Arithmetic exception");
        }
        finally {
            System.out.println("Cleanup operation");
        }
        System.out.println("line 11");
    }
}
