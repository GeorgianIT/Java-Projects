import java.util.HashMap;
import java.util.Map;

class Main{
    public static void main(String[] args) {
        /*
        Key         :           Value
        "red"       :          "apple"
       "yellow"     :          "banana"
       "white"      :          "radish"
       "green"      :           "apple"

         */

        Map<String, String> fruits = new HashMap<>();
        fruits.put("red","apple");
        fruits.put("yellow","banana");
        fruits.put("white","radish");
        fruits.put("green","apple");

        /*
        fruits.containsKey("red");      // returns true if key is found
        fruits.containsValue("apple");  // returns true if value is fund
        fruits.size();                  // returns the size of the Map
        fruits.remove("red");           // Deletes the Entry whose key is "red"
        fruits.clear();
         */

        //System.out.println(fruits.get("red"));

//        for(Map.Entry pairEntry : fruits.entrySet()){
//            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
//        }

        for (Map.Entry pairEntry: fruits.entrySet()){
            if(pairEntry.getValue()=="apple"){
                System.out.println(pairEntry.getKey());
            }
        }

    }
}