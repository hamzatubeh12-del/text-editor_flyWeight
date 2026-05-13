import java.util.ArrayList;
import java.util.List;

public class Doc {
    private List<character> chars=new ArrayList<>();
    private  StyleFactory factory=new StyleFactory();

    public void add(char value, int pos, String font, int size, String color, boolean bold){
        charStyle style= factory.getStyle(font,color,size,bold);
        chars.add(new character(value,pos,style));
    }
    public void render(){
        for (character c : chars) {
            c.render();
        }}
    public void printStats() {
        System.out.println("Memory stats");
        System.out.println("all characters : " + chars.size());
        System.out.println("Unique styles    : " + factory.poolSize());
        System.out.println("Objects saved    : " + (chars.size() - factory.poolSize()));
    }
}

