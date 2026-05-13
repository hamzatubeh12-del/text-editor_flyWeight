import java.util.HashMap;
import java.util.Map;

public class StyleFactory {
    private static final Map<String,charStyle> pool=new HashMap<>();
    public charStyle getStyle(String font , String color, int size, boolean bold){
        charStyle temp = new set_charStyle(font,size, color,bold);
        String k= temp.getkey();
        if(!pool.containsKey(k)){
            pool.put(k, new set_charStyle(font,size,color,bold));
        System.out.println("make new style;"+k);}
        else{
            System.out.println("reuse style: "+k);
        }
        return pool.get(k);
    }
public int poolSize(){
        return pool.size();
}
}
