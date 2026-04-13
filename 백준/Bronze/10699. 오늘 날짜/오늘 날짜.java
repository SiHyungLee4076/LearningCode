import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(format.format(new Date()));
    }
}