package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word:");
        String word=sc.next();//narin 5
        String[] arr=new String[word.length()];
        for(int j=word.length()-1;j>=0;j--){
            arr[j]=String.valueOf(word.charAt(j));
            System.out.println(arr[j]);
        }


    }
}
