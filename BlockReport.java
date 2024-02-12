import java.io.*;

public class BlockReport {
    public static void main(String[] args) throws FileNotFoundException{
        
        BlockSectionDA blockSectionDA = new BlockSectionDA();

        for(BlockSection blockSection: blockSectionDA.getblockSectionList()){
            System.out.println(blockSection.getBlockCode() + " " + blockSection.getAdviser());
            
            for(Student student:blockSection.getStudentList()){
                System.out.println("\t"+student.getStudentNo()+"\t"+student.getLastName()+"\t"+student.getFirstName());
            }
        }
    }
}