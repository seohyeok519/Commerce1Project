package step4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Product> products = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    public void productSystem(List<Product> products)
    {
        this.products = products;
    }
    public void categorySystem(List<Category> categories)
    {
        this.categories = categories;
    }



    public void start() {

        Scanner scanner = new Scanner(System.in);
        int select;
        int select2;
        do{
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i< categories.size(); i++){
                Category ct =categories.get(i);
                System.out.printf("%d. %-15s%n",i+1, ct.getCategoryName());
            }

            System.out.printf("0. %-15s | 프로그램 종료%n", "종료");
            select = scanner.nextInt();
            switch (select){
                case 1: {
                    System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
                    Category ct = categories.get(select - 1);
                    List<Product> products = ct.getProduct();
                    for (int j = 0; j < products.size(); j++) {
                        Product pd = products.get(j);
                        System.out.printf("%d. %-15s | %,10d원 | %s%n", j + 1, pd.getName(), pd.getPrice(), pd.getIntroduce());
                    }
                    System.out.printf("0. %-13s |%n", " 뒤로가기");
                    select2 = scanner.nextInt();
                    Product pd = products.get(select2);
                    if (select2 == 0){
                        continue;
                    }
                    System.out.printf("선택한 상품: %-15s | %,10d원 | %s |재고: %d%n", pd.getName(), pd.getPrice(), pd.getIntroduce(), pd.getCount());
                    break;
                }
                case  2: {
                    System.out.println("[ 실시간 커머스 플랫폼 - 의류 ]");
                    Category ct = categories.get(select - 1);
                    List<Product> products = ct.getProduct();
                    for (int j = 0; j < products.size(); j++) {
                        Product pd = products.get(j);
                        System.out.printf("%d. %-15s | %,10d원 | %s%n", j + 1, pd.getName(), pd.getPrice(), pd.getIntroduce());
                    }
                    System.out.printf("0. %-13s |%n", " 뒤로가기");
                    select2 = scanner.nextInt();
                    Product pd = products.get(select2);
                    if (select2 == 0){
                        continue;
                    }
                    System.out.printf("선택한 상품: %-133s | %,10d원 | %s |재고: %d%n", pd.getName(), pd.getPrice(), pd.getIntroduce(), pd.getCount());

                    break;
                }
                case 3:{
                    System.out.println("[ 실시간 커머스 플랫폼 - 식품 ]");
                    Category ct = categories.get(select - 1);
                    List<Product> products = ct.getProduct();
                    for (int j = 0; j < products.size(); j++) {
                        Product pd = products.get(j);
                        System.out.printf("%d. %-15s | %,10d원 | %s%n", j + 1, pd.getName(), pd.getPrice(), pd.getIntroduce());
                    }
                    System.out.printf("0. %-13s |%n", " 뒤로가기");
                    select2 = scanner.nextInt();
                    Product pd = products.get(select2);
                    if (select2 == 0){
                        continue;
                    }
                    System.out.printf("선택한 상품: %-15s | %,10d원 | %s |재고: %d%n", pd.getName(), pd.getPrice(), pd.getIntroduce(), pd.getCount());
                    break;
                }
                case  0:
                    System.out.println("종료");
                    break;

                default:
                    System.out.println("1,2,3,0 중 1개를 입력하세요");
                    break;
            }

        }while (!(select == 0));

    }
}
