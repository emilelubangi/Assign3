package Assignment3;

public abstract class Students {

    abstract String enroll();
    abstract String attend();

}

class Student1 extends Students {

      String enroll() {
          String reg = "Registered";
          return reg;
      }

   String attend() {
       String attendance = "Present";
       return attendance;
    }
}

class Student2 extends Students {
    String enroll() {
        String reg = "Cancelled Registration";
        return reg;
    }
    String attend() {
        String attendance = "Absent";
        return attendance;
    }
}



