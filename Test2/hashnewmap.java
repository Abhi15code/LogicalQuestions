

import java.util.HashMap;
import java.util.Map;

public class hashnewmap {
    public static void main(String[] args) {
        String st = "Hello this is abhishek kumar from noida";
        Map< Integer , Character> customMap = new HashMap<>(10);

        for(int i = 1; i<=38;i++ ){
            customMap.put(i,st.charAt(i) );

        }
        

        
    }
}
