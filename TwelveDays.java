import java.util.ArrayList;
public class TwelveDays{
    
    ArrayList<String> gifts=new ArrayList<String>();
    
    public TwelveDays(){
        gifts.add("1 partridge in a pear tree");
    }
    
    public void item(int i){
        System.out.println(gifts.get(i));
    }
}
    