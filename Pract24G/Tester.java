package Pract24G;

import java.util.*;

public class Tester {
    public static int searchUser(List<Proger> ar, String name) {
        for (int i = 0; i < ar.size(); i++){
            if (ar.get(i).getName().equals(name)){
                return i;
            }
        }
        //throw new MyException("Name not found");
        return -1;
    }

    public static void main(String[] args) throws NoSuchFieldException, MyException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите дату рождения в любом формате прожимая enter после числа,месяца,года :");
        String tmp,tmp1,tmp2;
        tmp=scanner.nextLine();
        tmp1=scanner.nextLine();
        tmp2=scanner.nextLine();
        List<Proger> progers = new ArrayList();
        Proger proger1 = new Proger("Ivan",tmp+"/"+tmp1+"/"+tmp2);
        Proger proger2 = new Proger("Vova","05/05/2001");
        Proger proger3 = new Proger("Lena","17/10/2001");
        Proger proger4 = new Proger("Liza","11/02/2001");
        Proger proger5 = new Proger("Egor","03/Август/2007");
        progers.add(proger1);
        progers.add(proger2);
        progers.add(proger3);
        progers.add(proger4);
        progers.add(proger5);

        ArrayList<Proger> st = new ArrayList<Proger>();
        st.addAll(progers);

        Collections.sort(progers);
        progers.forEach(proger -> System.out.println(proger));

        System.out.println("\nИщем работника и зпдаем время");
        while(true) {
            System.out.println("\nВведите имя работника (для завершения введите end):");
            String chekName;
            chekName=scanner.nextLine();
            if(chekName=="end"){
                break;
            }
            if(searchUser(progers,chekName)!=-1) {
            System.out.println("Введите время начала работы\n год,месяц,дату,час,минуту,секунду :");
            int year=scanner.nextInt();
            int month=scanner.nextInt();
            int date=scanner.nextInt();
            int hours=scanner.nextInt();
            int minutes=scanner.nextInt();
            int seconds=scanner.nextInt();
                Calendar calendar=new GregorianCalendar();
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, date);
                calendar.set(Calendar.HOUR_OF_DAY, hours);
                calendar.set(Calendar.MINUTE, minutes);
                calendar.set(Calendar.SECOND, seconds);
            System.out.println("Введите время конца работы\n год,месяц,дату,час,минуту,секунду :");
             year=scanner.nextInt();
             month=scanner.nextInt();
             date=scanner.nextInt();
             hours=scanner.nextInt();
             minutes=scanner.nextInt();
             seconds=scanner.nextInt();
                Calendar calendar_end=new GregorianCalendar();
                calendar_end.set(Calendar.YEAR, year);
                calendar_end.set(Calendar.MONTH, month);
                calendar_end.set(Calendar.DAY_OF_MONTH, date);
                calendar_end.set(Calendar.HOUR_OF_DAY, hours);
                calendar_end.set(Calendar.MINUTE, minutes);
                calendar_end.set(Calendar.SECOND, seconds);
                st.get(searchUser(progers, chekName)).addDataWork(calendar, calendar_end);
            }else{
                System.out.println("Имя не найдено \n");
            }

        }
        for(int i=0;i< progers.size();i++){
            System.out.println(progers.get(i)+"\n");
            if(progers.get(i).chekDate()!=-1){
                System.out.println(progers.get(i).datesWorkStart.getTime() + " >> "+ progers.get(i).dateWorkEnd.getTime());
            }

        }

    }
}

class MyException extends Exception{
     MyException(String message) {
        super(message);
    }
}

