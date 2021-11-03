import java.util.*;
import java.util.Scanner;

public class Arraylist
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //I am initializing the arraylist with the type Integer.
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            //Filling the list with numbers from 1-100.
            list.add(i);
        }
        System.out.println(list);
        //Requesting a number input from the user.
        System.out.println("Pick a number, I will then remove all the multiples of that number");
        int number = sc.nextInt();

        //Getting the maximum index of the list.
        int jMax = list.size();
        //I counted down from the back of the list, so it won't interfere with accessing the rest of the list when removing elements on the list.
        for (int j = jMax; j > 0;j--) {
            //Testing for multiples of the input number, and ignoring the input number itself.
            if(list.get(j-1) % number == 0 && list.get(j-1) / number != 1) {
                //Removing the multiples from the list.
                list.remove(j-1);
            }
        }
        System.out.println(list);
    }
}
