import java.util.ArrayList;
public class TwelveDays{
    
    ArrayList<String> gifts=new ArrayList<String>();
    
    public TwelveDays(){
        gifts.add("1 partridge in a pear tree.");
        gifts.add("2 turtle doves and;");
        gifts.add("3 french hens;");
        gifts.add("4 calling birds;");
        gifts.add("5 golden rings;");
        gifts.add("6 geese a laying;");
        gifts.add("7 swans a swimming;");
        gifts.add("8 maids a milking;");
        gifts.add("9 ladies dancing;");
        gifts.add("10 lords a leaping;");
        gifts.add("11 pipers piping;");
        gifts.add("12 drummers drumming;");
    }
    
    public void item(int i){
        System.out.println(gifts.get(i-1));
    }
    
    public void header(int s){
        System.out.println();
        if(s==1){
            System.out.println("On the 1st day of Christmas my true love sent to me:");
        }
        if(s==2){
            System.out.println("On the 2nd day of Christmas my true love sent to me:");
        }
        if(s==3){
            System.out.println("On the 3rd day of Christmas my true love sent to me:");
        }
        if(4<=s){
            System.out.println("On the "+s+"th day of Christmas my true love sent to me:");
        }    
    }
    
    public void body(int b){
        int count=b-1;
        while(count>=0){
            System.out.println(gifts.get(count));
            count--;
        }
    }
    
    public void stanza(int s){
        header(s);
        body(s);
    }
    
    public void song(){
        int count=1;
        while(count<=12){
            stanza(count);
            count++;
        }
    }
        
    
}
    