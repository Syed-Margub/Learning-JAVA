import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args) {
        
    
    ArrayList<String> cityList=new ArrayList<>();

    //Add some cities in the list
    cityList.add("London");
    cityList.add("London");
   // cityList now contains [London]
   cityList.add("Denver");
   // cityList now contains [London, Denver]
   cityList.add("Paris");
   // cityList now contains [London, Denver, Paris]
   cityList.add("Miami");
  // cityList now contains [London, Denver, Paris, Miami]
   cityList.add("Seoul");
   cityList.add("Tokyo");

   System.out.println("List size? "+cityList.size());
   System.out.println("Is Miami in the list? "+cityList.contains("Miami"));
   System.out.println("The location of Denver in the list? "+cityList.indexOf("Denver"));
   System.out.println("Is the list empty? "+cityList.isEmpty());
   cityList.add(2, "Xian");
   //Remove a city from the list
   cityList.remove("Miami");

   //Remove a city at index 1
   cityList.remove(1);

   //Display the contents in the list
   System.out.println(cityList.toString());

   //Display the contents in the list in reverse order
   for(int i=cityList.size()-1;i>=0;i--){
    System.out.print(cityList.get(i)+" ");
    System.out.println();
   }

   
    }
}