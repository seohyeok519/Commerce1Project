package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private String password;
    CommerceSystem commerce;
    List<Product> products ;
    List<Category> categories;
    int select3;

    public void categorySystem(List<Category> categories) {
        this.categories = categories;
    }
    public  void productSystem(List<Product> products){
        this.products = products;
    }

    public Admin(String password) {
        this.password = password;
    }

    public boolean login(String inputPassword){
        return password.equals(inputPassword);
    }
    public void adminMenu() {
        Scanner scanner = new Scanner(System.in);
        int select;

        do {
            System.out.println("========== 관리자 메뉴 ==========");
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 수정");
            System.out.println("3. 상품 삭제");
            System.out.println("4. 전체 상품 목록");
            System.out.println("0. 관리자 메뉴 종료");
            System.out.print("메뉴를 선택하세요: ");

            select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("상품 추가");
                    for (int i = 0; i< categories.size(); i++){
                        Category ct =categories.get(i);
                        System.out.printf("%d. %-15s%n",i+1, ct.getCategoryName());
                    }
                    System.out.print("추가할 상품의 카테고리: ");
                    int select1 = scanner.nextInt();
                    Category ct = categories.get(select1 - 1);
                    switch (select1) {
                        case 1:
                        {
                            System.out.print("상품이름:");
                            String name = scanner.next();
                            System.out.print("가격:");
                            int price = scanner.nextInt();
                            System.out.print("상품 설명:");
                            String introduce = scanner.next();
                            System.out.print("상품 갯수");
                            int count = scanner.nextInt();

                            Product pd = new Product();
                            pd.setName(name);
                            pd.setPrice(price);
                            pd.setIntroduce(introduce);
                            pd.setCount(count);
                            System.out.printf("추가할 상품: %-15s | %,10d원 | %s |재고: %d%n", name, price, introduce, count);
                            System.out.print("위 정보로 추가하시겠습니까?(1.수락 2.거절): ");
                            do {
                                select3 = scanner.nextInt();
                                if (select3 == 1) {
                                    ct.addProduct(pd);
                                    System.out.println("추가되었습니다.");
                                } else if (select3 == 2) {
                                    System.out.println("취소되었습니다.");
                                }
                            } while ((select3 == 1) || (select3 == 2));
                            break;
                        }
                        case 2:
                        {
                            System.out.print("상품이름:");
                            String name = scanner.next();
                            System.out.print("가격:");
                            int price = scanner.nextInt();
                            System.out.print("상품 설명:");
                            String introduce = scanner.next();
                            System.out.print("상품 갯수");
                            int count = scanner.nextInt();

                            Product pd = new Product();
                            pd.setName(name);
                            pd.setPrice(price);
                            pd.setIntroduce(introduce);
                            pd.setCount(count);
                            System.out.printf("추가할 상품: %-15s | %,10d원 | %s |재고: %d%n", name, price, introduce, count);
                            System.out.print("위 정보로 추가하시겠습니까?(1.수락 2.거절): ");
                            do {
                                select3 = scanner.nextInt();
                                if (select3 == 1) {
                                    ct.addProduct(pd);
                                    System.out.println("추가되었습니다.");
                                } else if (select3 == 2) {
                                    System.out.println("취소되었습니다.");
                                }
                            } while ((select3 == 1) || (select3 == 2));
                            break;
                        }
                        case 3:
                        {
                            System.out.print("상품이름:");
                            String name = scanner.next();
                            System.out.print("가격:");
                            int price = scanner.nextInt();
                            System.out.print("상품 설명:");
                            String introduce = scanner.next();
                            System.out.print("상품 갯수");
                            int count = scanner.nextInt();

                            Product pd = new Product();
                            pd.setName(name);
                            pd.setPrice(price);
                            pd.setIntroduce(introduce);
                            pd.setCount(count);
                            System.out.printf("추가할 상품: %-15s | %,10d원 | %s |재고: %d%n", name, price, introduce, count);
                            System.out.print("위 정보로 추가하시겠습니까?(1.수락 2.거절): ");
                            do {
                                select3 = scanner.nextInt();
                                if (select3 == 1) {
                                    ct.addProduct(pd);
                                    System.out.println("추가되었습니다.");
                                } else if (select3 == 2) {
                                    System.out.println("취소되었습니다.");
                                }
                            } while ((select3 == 1) || (select3 == 2));
                            break;
                        }
                        default:
                            System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 2:
                    System.out.print("수정할 상품의 이름을 입력하세요:");
                    String newname = scanner.next();
                    if (newname.equals(pd.getName()) ){

                    }
                    break;
                case 3:
                    System.out.println("상품 삭제");
                    break;
                case 4:
                    System.out.println("전체 상품 목록");
                    for (int j = 0; j< products.size(); j++){
                        Product pd =products.get(j);
                        System.out.printf("%d. %-15s%n",j+1, pd.getName());
                    }
                    break;
                case 0:
                    System.out.println("관리자 메뉴를 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

        } while (select != 0);
    }

}
