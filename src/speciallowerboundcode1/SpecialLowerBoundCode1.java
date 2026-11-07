
package speciallowerboundcode1;
import java.util.*;

public class SpecialLowerBoundCode1 {
 public static <T extends Number> void accumulateItems(Holder<T> holder, List<? super T> destinationList) {
     
        T first = holder.getItem1();
        T second = holder.getItem2();

       
        destinationList.add(first);
        destinationList.add(second);

        System.out.println(holder);
        System.out.println(holder.calculatesum());
        System.out.println(holder.calclataverage());
        System.out.println("تم بنجاح نقل العناصر إلى الوجهة!");
    }
  
    public static void main(String[] args) {
         
        Holder<Integer> intHolder = new Holder<>(42, 100);

       
        List<Number> numberList = new ArrayList<>();

        accumulateItems(intHolder, numberList);

           Holder<Double> doubleHolder = new Holder<>(5.9, 44.9);
         accumulateItems(doubleHolder, numberList);
     
        System.out.println("محتويات القائمة بعد التجميع: " + numberList);  
    }
    
}
