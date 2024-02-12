import java.util.*;

public class BlockSection {
    private String blockCode;
    private String adviser;
    private List<Student> studentList;


//SETTERS
    public void setBlockCode(String blockCode){
        this.blockCode = blockCode;
    }

    public void setAdviser(String adviser){
        this.adviser = adviser;
    }

    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

//GETTERS
    public String getBlockCode(){
        return this.blockCode;
    }

    public String getAdviser(){
        return this.adviser;
    }

    public List<Student> getStudentList(){
        return this.studentList;
    }
}