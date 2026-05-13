public class set_charStyle implements charStyle{
    private String font;
    private int size;
    private String color;
    private boolean bold;
 public set_charStyle(String font ,int size , String color , boolean bold){
     this.bold=bold;
     this.color=color;
     this.font=font;
     this.size=size;
 }
    @Override
    public void render(char c, int pos) {
System.out.println("char '"+c+"' at pos"+pos+" |||| font= "+font+" size="+size+" color="+color+" bold="+bold);
    }
    @Override
    public String getkey() {
        return font+" "+size+" "+color+" "+bold;
    }
}
