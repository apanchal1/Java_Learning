
package assignment_work;

import java.io.*;
public class File_Copy_Merge {
    public static void main(String[] args)throws Exception {
        FileInputStream f1=new FileInputStream("D:\\RP\\fileio\\File_Copy_Merge_1.txt");
        FileInputStream f2=new FileInputStream("D:\\RP\\fileio\\File_Copy_Merge_2.txt");
        
        
        
        FileWriter fw=new FileWriter("D:\\RP\\fileio\\File_Copy_Merge_3.txt");
        //BufferedWriter bw=new BufferedWriter(fw);
        
        
        SequenceInputStream sis=new SequenceInputStream(f1,f2);
        
        int i;
        while((i=sis.read())!= -1){
        fw.write((char)i);
        
        }
        fw.close();
        f1.close();
        f2.close();
    }
}
