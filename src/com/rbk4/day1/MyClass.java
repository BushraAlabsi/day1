package com.rbk4.day1;
import java.util.Scanner;
import java.util.Random;
public class MyClass {
    public void printMsg (String msg){
        System.out.println(msg);
    }

    public void guessMyNumber (int num){
        Random rand = new Random();
        int  n = rand.nextInt(2);
        if(num == n) {
            System.out.println("Congratulations, You win!");
        } else {
            Scanner reader = new Scanner(System.in);
            boolean guessed = false;
            int count = 1;
            while(count< 3 && !guessed){

                System.out.println("Enter a number: ");
                num = reader.nextInt();

                if(num == n) {
                    System.out.println("Congratulations, You win!");
                    guessed =true;
                } else {
                    count++;
                }
            }
            reader.close();
        }
    }

  public void acceptAndReverse(){
        Scanner reader = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("enter a number");
            int num = reader.nextInt();
            arr[i] = num;
        }

        for(int i=4; i>=0; i--){
            System.out.print(""+arr[i]+",");
        }
    }

    public void acceptAndReverseMe(){
        Scanner reader = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("enter a number");
            int num = reader.nextInt();
            arr[i] = num;
        }

        for(int i=0; i<5; i++){
            System.out.print(""+arr[i]+",");
        }
        for(int i=4; i>=0; i--){
            System.out.print(""+arr[i]+",");
        }
    }

    public void repeatString(String str, int count){
        int x = 0;
        String strRes = "";

        while(x<count){
            strRes += str;
            x++;
        }
        System.out.println(strRes);
    }
    public int firstAndLast(int n){
        int last = n % 10;
        boolean isFirst = false;
        int first =n;
        while(!isFirst){
            first = first/ 10;
            if(first >=1 && first <=9) {
                isFirst = true;
            }
        }
        return last+first;
    }
}
