package collections.equalss;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

    static class ProductCode {
        private final String code;
        private final String NameProduct;

        public ProductCode(String code, String NameProduct) {
            this.code = code;
            this.NameProduct = NameProduct;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof ProductCode)) return false;
            ProductCode other = (ProductCode) obj;
            return Objects.equals(code, other.code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(code);
        }

        @Override
        public String toString() {
            return "ProductCode{" +
                    "code='" + code + '\'' +
                    ", NameProduct='" + NameProduct + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<ProductCode> list = new ArrayList<>();
        list.add(new ProductCode("HA", "bánh my"));
        list.add(new ProductCode("SVfs", "CHUOI"));

        ProductCode key = new ProductCode("HA", "Bánh khoai");
        System.out.println("List Product: " + list);

        System.out.println("contains(key): " + list.contains(key));
        System.out.println("indexOf(key): " + list.indexOf(key));

        list.remove(key);
        System.out.println("After remove: " + list);
    }
}

