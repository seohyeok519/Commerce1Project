package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Product> products = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    private Cart cart = new Cart();
    private Admin admin = new Admin("qwer1234");
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
        int select3;
        int select4;
        do{
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i< categories.size(); i++){
                Category ct =categories.get(i);
                System.out.printf("%d. %-15s%n",i+1, ct.getCategoryName());
            }

            System.out.printf("0. %-15s | 프로그램 종료%n", "종료");
            System.out.println("[ 주문 관리 ]");
            System.out.println("4. 장바구니 확인 | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. 주문 취소 | 진행중인 주문을 취소합니다.");
            System.out.println("6. 관리자 모드");
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
                        break;
                    }
                    System.out.printf("선택한 상품: %-15s | %,10d원 | %s |재고: %d%n", pd.getName(), pd.getPrice(), pd.getIntroduce(), pd.getCount());
                    System.out.print("이 상품을 장바구니에 넣으시겠습니까? 1. 수락 2. 거절");
                    select3 = scanner.nextInt();
                    if (select3 == 1){
                        cart.addProduct(pd);
                        System.out.println("추가 되었습니다.");
                    } else if (select3 == 2) {
                        System.out.println("취소 됬습니다.");
                    }
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
                    System.out.print("이 상품을 장바구니에 넣으시겠습니까? 1. 수락 2. 거절");
                    select3 = scanner.nextInt();
                    if (select3 == 1){
                        cart.addProduct(pd);
                        System.out.println("추가 되었습니다.");
                    } else if (select3 == 2) {
                        System.out.println("취소 됬습니다.");
                    }

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
                    System.out.print("이 상품을 장바구니에 넣으시겠습니까? 1. 수락 2. 거절");
                    select3 = scanner.nextInt();
                    if (select3 == 1){
                        cart.addProduct(pd);
                        System.out.println("추가 되었습니다.");
                    } else if (select3 == 2) {
                        System.out.println("취소 됬습니다.");
                    }
                    break;
                }
                case 4:
                    System.out.println("장바구니");
                    for (CartItem item : cart.getCartItems()) {
                        System.out.println(
                                item.getProduct().getName() + " | " +
                                        item.getProduct().getPrice() + "원 | " +
                                        item.getProduct().getIntroduce() + " | 수량: " +
                                        item.getCount() + "개"
                        );
                    }
                    System.out.print("결재 하시겠습니까?(1:수락 2:거절)");
                    select4 = scanner.nextInt();
                    if (select4 == 1){
                        System.out.println("총 주문 금액");
                        cart.getTotalPrice();
                    } else if (select4 == 2) {
                        System.out.println("취소");
                    }


                    break;
                case 5:
                    System.out.println("장바구니를 비웁니다.");
                    cart.clearCart();

                    break;
                case 6:
                    System.out.print("비밀번홀를 입력하세요");
                    String pw= scanner.next();
                    admin.login(pw);
                    int a=3;
                    for (int op= 0; op<3;){
                        if (admin.login(pw)==true){
                            admin.categorySystem(categories);
                            admin.productSystem(products);
                            admin.adminMenu();
                            break;

                        }else if (admin.login(pw)==false){
                            op++;
                            a--;
                            if (op ==3){
                                System.out.println("로그인 실패");
                                System.exit(0);
                                break;
                            }
                            System.out.printf("로그인 실패 다시 입력하세요(남은 기회 :%d회):",a);
                            pw = scanner.next();
                        }
                        System.out.println();
                    }


                    break;
                case  0:
                    System.out.println("종료");
                    break;

                default:
                    System.out.println("1,2,3,4,5,0 중 1개를 입력하세요");
                    break;
            }

        }while (!(select == 0));

    }
}
