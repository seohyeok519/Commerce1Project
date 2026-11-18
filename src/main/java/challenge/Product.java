package challenge;

public class Product {
    private String name;
    private int price;
    private String introduce;
    private int count;

    public String getName(){
        return name;
    }
    public  int getPrice(){
        return price;
    }
    public  String getIntroduce(){
        return introduce;
    }
    public  int getCount(){
        return count;
    }

    public void setName(String name){
        this.name = name;
    }

    public  void setPrice(int price){
        this.price = price;
    }

    public void setIntroduce(String introduce){
        this.introduce = introduce;
    }

    public  void setCount(int count){
        this.count = count;
    }
}
