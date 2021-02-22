public class OndesMartenot extends Instruments{

    private String sound;
    private int year;

    public OndesMartenot(int value, int price, int year){
        super(value, price);
        this.year = year;
        this.sound = "uuuuuuuuu";
    }

    public String getSound() {
        return sound;
    }

    public int getYear() {
        return year;
    }


    public String play(){
        return sound;
    }

    public String play(Instruments instrument) {
        return null;
    }

}
