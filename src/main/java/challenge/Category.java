package challenge;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<Category> categories = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    // 생성자
    public Category(String categoryName)
    {
        this.categoryName = categoryName;
    }

    // 상품 추가
    public void addProduct(Product product)
    {
        products.add(product);
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }
    public List<Product> getProduct()
    {
        return products;
    }


    public void addCategory(Category category) { categories.add(category);

    }
}
