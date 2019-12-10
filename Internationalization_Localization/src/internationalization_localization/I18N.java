/*
I18N Date:
We can internationalize the date by using the getDateInstance() method of the DateFormat class.
It receives Locale Object as a parameter and returns the instance of the DateFormat class

I18N Time:
We can internationalize the date by using the getTimeInstance() method of the DateFormat class.
It receives Locale Object as a parameter and returns the instance of the DateFormat class

I18N Number:
The NumberFormat class is used to format the number according to the specific locale.
To get instance of NumberFormat class,we need to call either getInstance() or getNumberInstance() methods

I18N Currency:
The NumberFormat class is used to format the number according to the specific locale.
To get instance of NumberFormat class,we need to call  getCurrencyInstance() method



Methods of DateFormat class
DateFormat getDateInstance(int Style,Locale locale) // style can be DEFAULT,SHORT,LONG
format(Date date)
 */
package internationalization_localization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class I18N {
    public static void main(String[] args) {
        print(Locale.US);
        print(Locale.UK);
        print(Locale.FRANCE);
    }
    static void print(Locale locale){
        // Date
        System.out.println();
        DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        Date Currentdate=new Date();
        String date=df.format(Currentdate);
        System.out.println(date+" "+locale);
        
        //Time
        DateFormat df1=DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        Date Currentdate1=new Date();
        String time=df1.format(Currentdate1);
        System.out.println(time+" "+locale);
        
        // Number
        double dbl=0.225;
        NumberFormat nf=NumberFormat.getNumberInstance(locale);
        String Number=nf.format(dbl);
        System.out.println(Number+" for the locale "+locale);
        
        // Currency
        double dbl1=0.225;
        NumberFormat nf1=NumberFormat.getCurrencyInstance(locale);
        String Currency=nf1.format(dbl1);
        System.out.println(Currency+" for the locale "+locale);
        
    }
}
