package basic.ex.item;

class Item {
    private int id;
    private String name;
    private int price;

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d",id,name,price);
    }
}
