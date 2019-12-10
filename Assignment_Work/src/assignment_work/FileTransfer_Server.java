package assignment_work;

import java.io.*;
import java.net.*;

public class FileTransfer_Server {

    public static void main(String[] args) throws Exception {
        System.out.println("Server Signing ON");
        ServerSocket ss = new ServerSocket(8091);
        Socket soc = ss.accept();
        System.out.println("Server Established connection..");

        InputStream in = soc.getInputStream();
        OutputStream out = soc.getOutputStream();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(in)
        );
        String s1 = br.readLine();
        while (s1 != null) {
            System.out.println(s1);
            s1 = br.readLine();
        }
        soc.close();
        ss.close();

        System.out.println("Server Signing OFF");
    }
}
