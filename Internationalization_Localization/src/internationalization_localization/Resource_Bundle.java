/*
The ResourceBundle class is used to internationalize the messeges.
First we have to create properties file a
the name of properties file should be filename_languagecode_country
for eg..... MyMessege_en_US.prperties
 */
package internationalization_localization;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Resource_Bundle {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        p.put("Gretting", "Hello Friendssssssss");
         p.store(new FileWriter("ResourceBundle_en_US.properties"),"Properties File Creation");
        
        ResourceBundle rb=ResourceBundle.getBundle("ResourceBundle",Locale.US);
        System.out.println(Locale.US+" "+rb.getString("Gretting"));
        
    }
}
