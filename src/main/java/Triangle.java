public class Triangle extends Instruments{

    private int size;
    public String sound;

    public Triangle (int value, int price, int size){
        super(value, price);
        this.size = size;
        this.sound = "tinnnn";
    }

    public int getSize() {
        return size;
    }

    public String play(){
        return sound;
    }





}
