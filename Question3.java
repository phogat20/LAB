import java.util.HashMap;
import java.util.Map;

class Question3
{
    public static void main(String[] arg)
    {
        Map<String,String> bookMap = new HashMap<String,String>();
      
        // enter name/url pair
        bookMap.put("50 shades of blue", "Chetan");
        bookMap.put("java  advance", "sumit");
        bookMap.put(" shades of people", "ashish");
        bookMap.put("marine life", "rakhi");
          
        // using keySet() for iteration over keys
        for (String name : bookMap.keySet()) 
            System.out.println("key: " + name);
          
        // using values() for iteration over values
        for (String author : bookMap.values()) 
            System.out.println("value: " + author);

     
    }
}
