package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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

        products.add(pd1);
        products.add(pd2);
        products.add(pd3);
        products.add(pd4);
        CommerceSystem commerce = new CommerceSystem(products);
        commerce.start();


    }
}
