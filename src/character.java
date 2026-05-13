public class character {
    private final char value;
    private final int pos;

    // Reference to shared flyweight
    private final charStyle style;

    public character(char value, int pos, charStyle style) {
        this.value= value;
        this.pos= pos;
        this.style= style;
    }

    public void render() {
        style.render(value, pos);
    }
}
