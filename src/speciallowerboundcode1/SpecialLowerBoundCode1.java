
package speciallowerboundcode1;
import java.util.*;

public class SpecialLowerBoundCode1 {
 public static <T> void accumulateItems(Holder<T> holder, List<? super T> destinationList) {
     
        T first = holder.getItem1();
        T second = holder.getItem2();

       
        destinationList.add(first);
        destinationList.add(second);
        
        System.out.println("تم بنجاح نقل العناصر إلى الوجهة!");
    }
  
    public static void main(String[] args) {
         
        Holder<Integer> intHolder = new Holder<>(42, 100);

       
        List<Number> numberList = new ArrayList<>();

        accumulateItems(intHolder, numberList);

          
        System.out.println("محتويات القائمة بعد التجميع: " + numberList);  
    }
    
}
