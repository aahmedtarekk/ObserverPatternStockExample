public class Investor implements Observer{

    private String name;
    public Investor(String name){
        this.name=name;
    }
    @Override
    public void update(int price) {
        System.out.println(name + " witnessed Price: " + price + "$");
    }
}
