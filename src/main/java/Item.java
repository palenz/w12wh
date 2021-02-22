public abstract class Item implements ISell{

    public int price;
    public int value;

    public Item(int value, int price){
        this.value = value;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public int calculateMarkup(){
        return price - value;
    }
}
