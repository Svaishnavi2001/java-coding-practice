package interview.collections_comparator;
import java.util.*;

/*
You are given a table of customer transactions in CSV format. Each
row contains the customer ID, customer name, product name, and
product price. Your task is to sort the customers based on the
number of products they have purchased. If two customers have
purchased the same number of products, sort them based on the
total price of all their purchases in descending order. The output
should be the customer ID, customer name, and the total price of all
the products they have purchased, sorted as described above.

Input Format:
Multiple lines of input, where each line represents a transaction in the following format:
Customer ID, Customer Name, Product Name, Product Price. The input ends when there are no
more lines to read.

Output Format:
The output should be sorted and each line should contain: Customer ID, Customer Name,
Total Price

Sample Inputs & Outputs
Sample Input 1
101, Alex, Mobile, 25000
102, Bob, Laptop, 50000
103, Clark, Ipad, 30000
101, Alex, Oven, 10000
102, Bob, Fridge, 5000

Sample Output 1
102, Bob, 55000
101, Alex, 35000
103, Clark, 30000
*/

public class Customer {
    int customerId;
    String customerName;
    int totalProducts;
    double totalPrice;

    public Customer(int customerId,String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.totalProducts = 0;
        this.totalPrice = 0.0;
    }
    public void addPurchase(double price){
            totalProducts++;
            totalPrice=totalPrice+price;
    }
}
class CustomerComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2){
        int productCountComparison=Integer.compare(c2.totalProducts,c1.totalProducts);
        if(productCountComparison==0){
            return Double.compare(c2.totalPrice,c1.totalPrice);
        }
        return productCountComparison;
    }
}
class CustomerSorting{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Map<Integer,Customer> map=new HashMap<>();

        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.isEmpty()){
                break;
            }
            String []strings=s.split(",");
            if(strings.length!=4){
                System.out.println("Invalid input format:"+s);
                continue;
            }
            int customerId= Integer.parseInt(strings[0].trim());
            String customerName=strings[1].trim();
            double productPrice=Double.parseDouble(strings[3].trim());

            Customer customer = map.get(customerId);
            if(customer==null){
                customer= new Customer(customerId,customerName);
                map.put(customerId, customer);
            }

            customer.addPurchase(productPrice);
        }

        List<Customer> list=new ArrayList<>(map.values());
        Collections.sort(list, new CustomerComparator());

        for(Customer customer: list){
            System.out.println(customer.customerId+" "+customer.customerName+" "+customer.totalPrice);
        }
        sc.close();
    }
}
