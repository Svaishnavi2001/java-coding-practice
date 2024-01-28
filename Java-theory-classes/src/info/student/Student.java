package info.student;

public class Student {

    int idName;
    int age;
    int semester;
    String name;
    String email;
    boolean isIndian;

    public Student(int idName,String name){
        this.idName=idName;
        this.name=name;
    }

    public int  getIdName(){
        return idName;
    }
    public void setIdName(int idName){
        this.idName=idName;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
