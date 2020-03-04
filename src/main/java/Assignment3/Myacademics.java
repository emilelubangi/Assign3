package Assignment3;

public class Myacademics {

    public String name = "Theo";
    public String studentNo = "215042897";


    public String passed() {
        String stat = "Pass";
        return stat;
    }
    public String percent() {
        String per = "85%";
        return per;
    }

}

class Stud extends Myacademics {
    public String surname() {
       String surname = "Sello";
       return surname;
    }

    public String subject() {
        String sub = "ADP";
        return sub;
    }
}

