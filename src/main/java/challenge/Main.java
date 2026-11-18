package challenge;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       CommerceSystem commerce = new CommerceSystem();
        List<Product> products = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        Admin pw = new Admin("qwer1234");

        Scanner scanner = new Scanner(System.in);
        Category electronics = new Category("전자제품");
        Category clothes = new Category("의류");
        Category food = new Category("식품");

        categories.add(electronics);
        categories.add(clothes);
        categories.add(food);

        Product pd1= new Product();
        pd1.setName("Galaxy S25 ");
        pd1.setPrice(1200000);
        pd1.setIntroduce("최신 안드로이드 스마트폰");
        pd1.setCount(50);

        Product pd2 = new Product();
        pd2.setName("iphone 16 ");
        pd2.setPrice(1350000);
        pd2.setIntroduce("APPLE의 최신 스마트폰");
        pd2.setCount(50);

        Product pd3= new Product();
        pd3.setName("MacBook Pro ");
        pd3.setPrice(2400000);
        pd3.setIntroduce("M3 칩셋이 탑재된 노트북");
        pd3.setCount(50);

        Product pd4= new Product();
        pd4.setName( "AirPods Pro ");
        pd4.setPrice(350000);
        pd4.setIntroduce("노이즈 캔슬링 무선 이어폰");
        pd4.setCount(50);

        Product pd5 = new Product();
        pd5.setName("유니클X 반팔티");
        pd5.setPrice(80000);
        pd5.setIntroduce("유니클X 반팔티 입니다.");
        pd5.setCount(15);

        Product pd6 = new Product();
        pd6.setName("유니클X 반팔티");
        pd6.setPrice(80000);
        pd6.setIntroduce("유니클X 긴팔티 입니다.");
        pd6.setCount(15);

        Product pd7 = new Product();
        pd7.setName("유니클X 반바지");
        pd7.setPrice(80000);
        pd7.setIntroduce("유니클X 반바지 입니다.");
        pd7.setCount(15);
        pd7.setCount(15);

        Product pd8 = new Product();
        pd8.setName("유니클X 긴바지");
        pd8.setPrice(80000);
        pd8.setIntroduce( "유니클X 긴바지 입니다.");
        pd8.setCount(15);

        Product pd9 = new Product();
        pd9.setName("과일");
        pd9.setPrice(8000);
        pd9.setIntroduce( "과일 입니다.");
        pd9.setCount(15);

        Product pd10 = new Product();
        pd10.setName("고기");
        pd10.setPrice(30000);
        pd10.setIntroduce( "고기 입니다.");
        pd10.setCount(15);

        Product pd11 = new Product();
        pd11.setName("채소");
        pd11.setPrice(3000);
        pd11.setIntroduce( "채소 입니다.");
        pd11.setCount(15);

        Product pd12 = new Product();
        pd12.setName("유재품");
        pd12.setPrice(3000);
        pd12.setIntroduce( "유제품 입니다.");
        pd12.setCount(15);

        electronics.addProduct(pd1);
        electronics.addProduct(pd2);
        electronics.addProduct(pd3);
        electronics.addProduct(pd4);
        clothes.addProduct(pd5);
        clothes.addProduct(pd6);
        clothes.addProduct(pd7);
        clothes.addProduct(pd8);
        food.addProduct(pd9);
        food.addProduct(pd10);
        food.addProduct(pd11);
        food.addProduct(pd12);

        commerce.categorySystem(categories);

        commerce.start();

    }

}
