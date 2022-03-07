import java.util.*;
import java.io.*;

public class sumArr {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);

        String[] num_arr1 = br.readLine().split(" ");
        String[] num_arr2 = br.readLine().split(" ");

        ArrayList<Integer> al = new ArrayList<>();

        for(String s : num_arr1){
            al.add(Integer.parseInt(s));
        }

        for(String s : num_arr2){
            al.add(Integer.parseInt(s));
        }

        Collections.sort(al);

        for(Integer i : al){
            System.out.print(i+ " ");
        }
    }
}
