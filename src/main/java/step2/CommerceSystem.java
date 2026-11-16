package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    List<Product> products;
    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        for (int i = 0; i< products.size(); i++){
            Product pd = products.get(i);
            System.out.printf("%d. %-15s | %,10d원 | %s%n",i+1,pd.name,pd.price,pd.introduce);
        }
        System.out.printf("0. %-15s | 프로그램 종료%n", "종료");
        int exit = scanner.nextInt();
        if (exit == 0){
            System.out.println("종료");
        }
    }
}
