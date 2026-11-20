package challenge;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    // 장바구니에 상품 추가
    public void addProduct(Product product) {
        for (CartItem item : items) {
            if (item.getProduct() == product) {
                item.addCount(1);
                return;
            }
        }

        items.add(new CartItem(product, 1));
    }
    // 장바구니 상품 제거
    public void removeProduct(Product product){
        for(CartItem item : items){
            if (item.getProduct() == product){
                items.remove(item);
                break;
            }
        }
    }

    // 장바구니 목록 조회
    public List<CartItem> getCartItems() {
        return new ArrayList<>(items);
    }

    // 장바구니 비우기
    public void clearCart() {
        items.clear();
    }

    // 장바구니가 비어 있는지 확인
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public int getTotalPrice() {
        int total = 0;

        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getCount();
        }
        System.out.printf("총 %d 원%n",total);
        return total;
    }

}
