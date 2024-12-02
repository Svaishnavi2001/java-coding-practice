package interview.collections_comparator;
import java.util.*;
/*
Problem
You are given a list of items for sale on the Amazon Great Indian Festival.
 Each item in the list consists of the following attributes: productid, productName,
 productPrice, productRating, productBrand, and productDiscount.
 Your task is to sort the items based on the user's requirements.
The user can choose to sort the list based on:

1. productPrice (Ascending order)
2. productRating (Descending Order)
3. productBrand (Alphabetic Order)
4. productDiscount (Descending Order)
All the values provided are completely unique

Input Format:
The first line contains an integer N, the number of products.

The next N lines contain the product details in the format: productid, productName, productPrice, productRating, productBrand, productDiscount.
The last line contains an integer representing the sorting criteria (1 to 4).

Output Format:
Print the sorted list of items in the same format.

Sample Inputs & Outputs
Sample Input 1:
5
101, iPhone15,60000, 4.5, Apple, 30
108, 523, 38000,4.8, Samsung, 60
121, IdeapadGaming, 55000,4.4, Lenovo, 40
140, NeckbandPro, 1700,4.7, CMF, 20
103, AndroidTV, 65000,4.1, Sony, 45
2

Sample output 1:
108, 523, 38000,4.8, Samsung, 60
140, NeckbandPro, 1700,4.7, CMF, 20
101, iPhone15,60000,4.5, Apple, 30
121, IdeapadGaming, 55000,4.4, Lenovo, 40
103, AndroidTV, 65000,4.1, Sony, 45

*/
class Product {
    int productId;
    String productName;
    double productPrice;
    double productRating;
    String productBrand;
    int productDiscount;

    public Product(int productId,String productName,double productPrice, double productRating, String productBrand, int productDiscount){
        this.productId=productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productBrand=productBrand;
        this.productDiscount = productDiscount;
    }
}

class ProductComparator implements Comparator<Product> {

    private int sortOption;

    public ProductComparator(int sortOption) {
        this.sortOption = sortOption;
    }

    @Override
    public int compare(Product p1, Product p2) {
        switch (sortOption) {
            case 1: //Sort by productPrice (Ascending order)
                return Double.compare(p1.productPrice, p2.productPrice);
            case 2://Sort by productRating (Descending order)
                return Double.compare(p2.productRating, p1.productRating);
            case 3:// Sort by productBrand (Alphabetic order)
                return p1.productBrand.compareTo(p2.productBrand);
            case 4:// Sort by productDiscount (Descending order)
                return Integer.compare(p2.productDiscount,p1.productDiscount);
            default:
                throw new IllegalArgumentException("Invalid sortoption");
        }
    }
}
public class ProductSorting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products?");
        // No. of products
        int n=scanner.nextInt();
        System.out.println("Specify your sorting option.");
        int sortOption=scanner.nextInt();
        // List of products
        List<Product> list =new ArrayList<>();

        // Reading prod details
        for(int i=0;i<n;i++) {
            System.out.println("Provide product data.");
            String s = scanner.nextLine();
            String[] strings = s.split(",");
            if (strings.length != 6) {
                continue;
            }
            int productId;
            int productDiscount;
            try {
                productId = Integer.parseInt(strings[0].trim());
                productDiscount = Integer.parseInt(strings[5].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid productId & productDiscount format for string s:" + s);
                continue;
            }
            String productName = strings[1].trim();
            double productPrice=Double.parseDouble(strings[2].trim());
            double productRating=Double.parseDouble(strings[3].trim()) ;
            String productBrand = strings[4].trim();

            list.add(new Product(productId, productName, productPrice, productRating, productBrand, productDiscount));
        }



        Collections.sort(list,new ProductComparator(sortOption));

        //printing sorted products
        for(Product product:list){
            System.out.println(product.productId+","+product.productName+","+product.productPrice+","+product.productRating+","+product.productBrand+","+product.productDiscount);
        }
    }
}