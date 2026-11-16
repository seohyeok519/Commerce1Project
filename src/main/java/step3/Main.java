package step3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommerceSystem commerce = new CommerceSystem();
        List<Product> products = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Category electronics = new Category("전자제품");
        Category clothes = new Category("의류");
        Category food = new Category("식품");
        categories.add(electronics);
        categories.add(clothes);
        categories.add(food);

        Product pd1= new Product();
        pd1.name ="Galaxy S25 ";
        pd1.price =1200000;
        pd1.introduce = "최신 안드로이드 스마트폰";
        pd1.count = 50;

        Product pd2 = new Product();
        pd2.name ="iphone 16 ";
        pd2.price =1350000;
        pd2.introduce = "APPLE의 최신 스마트폰";
        pd2.count = 50;

        Product pd3= new Product();
        pd3.name ="MacBook Pro ";
        pd3.price =2400000;
        pd3.introduce = "M3 칩셋이 탑재된 노트북";
        pd3.count = 50;

        Product pd4= new Product();
        pd4.name ="AirPods Pro ";
        pd4.price =350000;
        pd4.introduce = "노이즈 캔슬링 무선 이어폰";
        pd4.count = 50;

        Product pd5 = new Product();
        pd5.name = "유니클X 반팔티";
        pd5.price = 80000;
        pd5.introduce = "유니클X 반팔티 입니다.";
        pd5.count = 15;

        Product pd6 = new Product();
        pd6.name = "유니클X 반팔티";
        pd6.price = 80000;
        pd6.introduce = "유니클X 긴팔티 입니다.";
        pd6.count = 15;

        Product pd7 = new Product();
        pd7.name = "유니클X 반바지";
        pd7.price = 80000;
        pd7.introduce = "유니클X 반바지 입니다.";
        pd7.count = 15;

        Product pd8 = new Product();
        pd8.name = "유니클X 긴바지";
        pd8.price = 80000;
        pd8.introduce = "유니클X 긴바지 입니다.";
        pd8.count = 15;

        electronics.addProduct(pd1);
        electronics.addProduct(pd2);
        electronics.addProduct(pd3);
        electronics.addProduct(pd4);
        clothes.addProduct(pd5);
        clothes.addProduct(pd6);
        clothes.addProduct(pd7);
        clothes.addProduct(pd8);

        commerce.categorySystem(categories);

        commerce.start();





    }
}
