public class Synthesizer extends Instruments {

    private String brand;
    private String sound;

    public Synthesizer (int value, int price, String brand){
        super(value, price);
        this.brand = brand;
        this.sound = "brrrrr";
    }

    public String getSound() {
        return sound;
    }

    public String getBrand() {
        return brand;
    }

    public String play(){
        return sound;
    }


}
