
package speciallowerboundcode1;
import java.util.*;

public class SpecialLowerBoundCode1 {
 public static <T> void accumulateItems(Holder<T> holder, List<? super T> destinationList) {
        // سحب العناصر من الهولدر
        T first = holder.getItem1();
        T second = holder.getItem2();

        // إضافتها للقائمة باستخدام خصائص Lower Bound
        destinationList.add(first);
        destinationList.add(second);
        
        System.out.println("تم بنجاح نقل العناصر إلى الوجهة!");
    }
  
    public static void main(String[] args) {
         // 1. إنشاء هولدر يحمل أرقاماً صحيحة (Integer)
        Holder<Integer> intHolder = new Holder<>(42, 100);

        // 2. إنشاء قائمة من نوع Number (وهي فئة فائقة لـ Integer) أو Object
        List<Number> numberList = new ArrayList<>();

        // 3. استدعاء الدالة المميزة
        accumulateItems(intHolder, numberList);

        // طباعة النتائج
        System.out.println("محتويات القائمة بعد التجميع: " + numberList);  
    }
    
}
