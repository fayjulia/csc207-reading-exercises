public class Box<T> {
    private int<T> value;
    public Box(T value) { this.value = value; }
    public int getValue() { return value; }
    public void setValue(T value) { this.value = value; }
}
