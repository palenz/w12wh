public abstract class Instruments extends Item implements IPlay{

    private String sound;

    public Instruments(int value, int price){
        super(value, price);
        this.sound = sound;
    }

    public String play(){
        return "none";
    }


}
