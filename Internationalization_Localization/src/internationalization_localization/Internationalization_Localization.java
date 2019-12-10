/*
Inter..tion is also abbreviated as I18N (18 LETTERS BETWEEN I AND N)
I18L is a mechanism to create such an application that can be adapted languages and regions

Localizaion is abbreviated as l10N (10 letter between L and N) 
l10N is a mechanism to create such an application that can be adapted languages and regions by adding locale-specific 
text and components.

Culturally dependent data.................. info differ from one region to another
Messege,Dates,Times,Numbers,Currencies,Measurements,Phone Numbers,Postal Address,Lable on GUI Components etc...
 */
package internationalization_localization;

import java.util.Locale;

public class Internationalization_Localization {

    
    public static void main(String[] args) {
       Locale l=Locale.getDefault(); // Get default locale
        System.out.println("Countary Name="+l.getDisplayCountry());
        System.out.println("Language="+l.getDisplayLanguage());
        System.out.println("Name="+l.getDisplayName());
        System.out.println("Three letter of country name="+l.getISO3Country());
        System.out.println("Language short form="+l.getLanguage());
        System.out.println("Country name short form="+l.getCountry());
        
        
        System.out.println();
         Locale l1=new Locale("fr","fr"); // Get specific locale
        System.out.println("Countary Name="+l1.getDisplayCountry());
        System.out.println("Language="+l1.getDisplayLanguage());
        System.out.println("Name="+l1.getDisplayName());
        System.out.println("Three letter of country name="+l1.getISO3Country());
        System.out.println("Language short form="+l1.getLanguage());
        System.out.println("Country name short form="+l1.getCountry());
        


//print gujarati language in different languages
        
        System.out.println();
        Locale l2=new Locale("gu","IN");
        Locale l3=new Locale("fr","FR");
        Locale l4=new Locale("es","ES");
        System.out.println(l2.getDisplayLanguage());
        System.out.println(l2.getDisplayLanguage(l3));
        System.out.println(l2.getDisplayLanguage(l4));
        
        System.out.println();
        // displaying the display language of many locale
        
        Locale[] l5={new Locale("en","IN"),new Locale("es","ES")};
        for (int i = 0; i < l5.length; i++) {
            String Display=l5[i].getDisplayLanguage(l5[i]);
            System.out.println(l5[i].toString()+" : "+Display );
            
        }
    }
    
}
