package assignment_work;

import java.io.*;
import java.net.*;


public class FileTrasfer_Client {

    public static void main(String[] args) throws Exception {
      
        System.out.println("Client Signing ON");
        Socket soc = new Socket("127.0.0.1", 8091);
        System.out.println("Client Established connection..");

        InputStream in = soc.getInputStream();
        OutputStream out = soc.getOutputStream();
        FileReader fr = new FileReader("D:\\RP\\fileio\\FileTransfer_1.txt");
        BufferedReader br = new BufferedReader(fr);

        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);

        String s1=br.readLine();
         while (s1 != null){
        
            pw.println(s1);
            s1 = br.readLine();
            
         }
        soc.close();

        System.out.println("Client Signing OFF");
    }

}
