package Pract22G;
import java.util.List;
public class DataBase extends Exception {
    private static int counter = 0;
    private int ID;
    private String name;
    private String familyName;

    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public int getID(){return ID;}
    public void setID(int ID){this.ID=ID;}
    public String getFamilyName(){return familyName;}
    public void setFamilyName(String familyName){this.familyName=familyName;}
    public DataBase(String name,String familyName,int ID){
        setName(name);
        setFamilyName(familyName);
        if(ID>99999) {
            setID(ID);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "family name=" + familyName +
                ", name=" + name +
                ", ID='" + ID + '\'' +
                '}';
    }

}
