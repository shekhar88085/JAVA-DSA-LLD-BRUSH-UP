import java.time.format.SignStyle;

public class StringBuilderExample {
    public void run(){
        System.out.println("StringBuilder Examples");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" World");
        System.out.println(stringBuilder);

        //insert java
        stringBuilder.insert(6, "java ");
        System.out.println(stringBuilder);

        //delete java
        stringBuilder.delete(6, 11);
        System.out.println(stringBuilder);

        //reverse string
        //System.out.println(stringBuilder.reverse());

        //replace
        System.out.println(stringBuilder.replace(6, 11, "java"));

        // Performance test with String
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with String: " + (endTime - startTime) + "ms");

        // Performance test with StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + "ms");
    }
}
