import java.lang.reflect.Field;

/**
 * @author Masonluo
 * @date 2020-09-29 15:48
 */
public class ThreadLocalTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<String> s1 = new ThreadLocal<>();
        ThreadLocal<String> s2 = new ThreadLocal<>();
        ThreadLocal<String> s3 = new ThreadLocal<>();
        s1.set("s1");
        s2.set("s2");
        s3.set("s3");
        Thread thread = Thread.currentThread();
        s3.remove();
        System.out.println(true);
    }


    private static void test(String s, boolean isGC) {
        try {
            new ThreadLocal<>().set(s);
            if (isGC) {
                System.gc();
            }
            Thread t = Thread.currentThread();
            Class<? extends Thread> clz = t.getClass();
            Field field = clz.getDeclaredField("threadLocals");
            field.setAccessible(true);
            Object threadLocalMap = field.get(t);
            // 获得的threadLocalMap
            Class<?> tlmClass = threadLocalMap.getClass();
            Field tableField = tlmClass.getDeclaredField("table");
            // 获取其中的table
            tableField.setAccessible(true);
            Object[] arr = (Object[]) tableField.get(threadLocalMap);
            for (Object o : arr) {
                if (o != null) {
                    Class<?> entryClass = o.getClass();
                    Field valueField = entryClass.getDeclaredField("value");
                    Field referenceField = entryClass.getSuperclass().getSuperclass().getDeclaredField("referent");
                    valueField.setAccessible(true);
                    referenceField.setAccessible(true);
                    System.out.println(String.format("弱引用key:%s,值:%s", referenceField.get(o), valueField.get(o)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
