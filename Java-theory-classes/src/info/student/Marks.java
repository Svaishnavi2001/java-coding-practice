package info.student;

public class Marks {
    String chemistry;
    String maths;
    String biology;
    String science;


    public Marks(String chemistry,String biology){
        this.chemistry=chemistry;
        this.biology=biology;
    }

    public String  getChemistry(){
        return chemistry;
    }

    public void setChemistry(String chemistry){
        this.chemistry=chemistry;
    }

    public String getBiology(){
        return biology;
    }

    public void setBiology(String biology){
        this.biology=biology;
    }
}
