package practice;
/*
Create two thread.one thread is finding the average of the first 10 numbers and
another thread is printing the square of the number stored in array arr={1,20,50,15,30}
and make sure both threads can execute one by one.
 */

class AverageThread  implements Runnable{
    public void run() {
        int sum =0;
        for (int i = 1; i<=10; i++){
            sum += i;
        }
        double average = sum/10.0;
        System.out.println("Average of first 10 num: " + average);
    }
}

class SquareThread implements Runnable{
    public void run() {
        int[] arr = {1,20,50,15,30};
        System.out.println("Square of array elements: ");
        for (int num: arr){
            System.out.println(num + " squared is " + num*num);
        }
    }
}
public class TwoThreadExample {
    public static void main(String args[]){
        Thread average = new Thread(new AverageThread());
        Thread square = new Thread(new SquareThread());
        average.start();
        square.start();

        //thread for counting average
        new Thread(){
            public void run(){
                synchronized (this){

                }
            }
        }
    }
}
