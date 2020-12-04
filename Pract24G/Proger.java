package Pract24G;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Proger implements Comparable{
    private String name;
    private String dateBirthday="---";
    public void setName(String name){this.name = name;}
    public  Calendar datesWorkStart=null;
    public Calendar dateWorkEnd=null ;
    public String getName(){return name;}

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public Proger(String name, String dateBirthday){
        setName(name);
        setDateBirthday(dateBirthday);
    }

    public String toString() {
        return "Student{" +
                "date  " + dateBirthday  +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public void addDataWork(Calendar start,Calendar end){
            this.datesWorkStart=start;
            this.dateWorkEnd=end;
    }

    public Calendar getDatesWorkStart() {
        return datesWorkStart;
    }
    public Calendar getDatesWorkEnd() {
        return dateWorkEnd;
    }
    public int chekDate(){
        if(datesWorkStart!=null){
            return 1;
        }else{
            return -1;
        }
    }

}
