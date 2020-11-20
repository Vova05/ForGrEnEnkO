package Pract22G;

import java.util.*;

public class MainCl {
    public static int searchUser(List<DataBase> ar, String name) throws MyException {
        for (int i = 0; i < ar.size(); i++){
            if (ar.get(i).getName().equals(name)){
                return i;
            }
        }
        throw new MyException("Name not found");
    }

    public static void main(String[] args) throws NoSuchFieldException, MyException {
        List<DataBase> dataBases = new ArrayList();
        DataBase dataBase1 = new DataBase("Ivan","Laptev",123456);
        DataBase dataBase2 = new DataBase("Liza","GrEnEnKo",110201);// ;)
        DataBase dataBase3 = new DataBase("Vova","Gl",132313);// :)
        DataBase dataBase4 = new DataBase("Vova","Bl",123458);
        DataBase dataBase5 = new DataBase("Egor","Pr",234567);
        dataBases.add(dataBase1);
        dataBases.add(dataBase2);
        dataBases.add(dataBase3);
        dataBases.add(dataBase4);
        dataBases.add(dataBase5);

        dataBases.forEach(dataBase -> System.out.println(dataBase));

        System.out.println("\nИщем покупателя Liza");
        try {
            System.out.println(dataBases.get(searchUser(dataBases, "Liza")));
        }catch (Exception ex){
            throw new MyException("Name not found");
        }
        System.out.println("\nИщем покупателя Konivora");
        try {
            System.out.println(dataBases.get(searchUser(dataBases, "Konivora")));
        }catch (Exception ex){
            System.out.println("Name not found");
            throw new MyException("Name not found");
        }finally {
            while (true){
                System.out.println("Вы ищите :");
                Scanner sc=new Scanner(System.in);
                System.out.println(dataBases.get(searchUser(dataBases,sc.nextLine())));
                if(sc.nextLine()=="stop"){
                    break;
                }
            }
        }
        //Вывод работы программы:

//        Student{family name=Laptev, name=Ivan, ID='123456'}
//        Student{family name=GrEnEnKo, name=Liza, ID='110201'}
//        Student{family name=Gl, name=Vova, ID='132313'}
//        Student{family name=Bl, name=Vova, ID='123458'}
//        Student{family name=Pr, name=Egor, ID='234567'}
//
//        Ищем покупателя Liza
//        Student{family name=GrEnEnKo, name=Liza, ID='110201'}
//
//        Ищем покупателя Konivora
//        Name not found
//        Вы ищите :
//        stop
//        Exception in thread "main" Pract22G.MyException: Name not found
//        at Pract22G.MainCl.searchUser(MainCl.java:14)
//        at Pract22G.MainCl.main(MainCl.java:48)
//
//        Process finished with exit code 1
    }
}
class MyException extends Exception{
    MyException(String message) {
        super(message);
    }
}


