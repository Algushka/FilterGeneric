import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//
public class Main {
    public static void main(String[] args) {

        List<Product> goodList = new ArrayList<>();

        goodList.add(new Product("Nikon", 8, 13, 34));
        goodList.add(new Product("Kate", 3, 3600, 35672));
        goodList.add(new Product("Max", 9, 13, 367));
        goodList.add(new Product("Nik", 10, 9088, 3));
        System.out.println(goodList);


        /*анонимный класс фильтр значений*/

        Filter<Product> filterPriceMore100 = new Filter<Product>() {
            @Override
            public boolean test(Product p) {
                if (p.getPrice() > 100) return true;
                return false;
            }
        };
        //+++++++++++++++++++++++++++++++++++++++++++++
        List <Product> sortedList = sort(goodList, filterPriceMore100);
        System.out.println("Цены >100" + sortedList);
    }

    public static List <Product> sort (List<Product> list, Filter<Product> filter) {
        List <Product> sortedList = new ArrayList<>();
        for (Product element: list) {
            if (filter.test(element)) {sortedList.add(element);}


        }
        return sortedList;
    }

}






