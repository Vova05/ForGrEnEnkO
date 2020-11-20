package Pract21G;
import java.util.Scanner;
class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i ); }
}//класс данный по условию задачи
public class TestException extends Exception {
    static void exceptionInt(int tmp) {
        double a=2/tmp;//кидает ошибку

    }
    static void exceptionDouble(double tmp){
        double result=2.0/tmp;//в данном случае Java считает результат равным бесконечности
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        exceptionDouble(sc.nextDouble());
        Exception2 obj=new Exception2();
        int Chek=0;
        while(true) {
            try {
                obj.exceptionDemo();
            } catch (Throwable e) {
                System.out.println(e.getMessage());
                Chek=-1;//выводит сообщение о не коректных данных
            }finally {
                //благодаря finally программа работает до тех пор пока не будет введен -> x!=0
                if(Chek!=-1){
                    break;
                }
                exceptionInt(sc.nextInt());
            }
        }
    }
}

