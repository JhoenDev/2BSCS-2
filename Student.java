public class Student {
    private String studentNo;
    private String lastName;
    private String firstName;

//SETTERS
    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

//GETTERS
    public String getStudentNo(){
        return this.studentNo;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
}

