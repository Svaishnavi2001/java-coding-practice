package interview.collections_comparator;
import java.util.*;

/*Problem
Given a list of students along with their company name, role, and salary package,
sort them based on the following criteria:
  (1) Sort primarily by company name in alphabetical order,
  (2) If multiple students are placed in the same company, sort by name alphabetically,
  (3) If multiple students are in the same company and role, sort them by their package
      in descending order.

Input Format:
Each line contains the student's name, company, and package, all space-separated.
The input ends after all student details are provided.

Sample Inputs & Outputs:
Sample Input 1
harsh, infosys, 800000
kevin, tcs, 400000
akhil, sunbase, 500000
anil, google, 700000
clark, infosys, 400000
morgan, tcs, 1200000

Sample Output 1
anil, google, 700000
clark, infosys, 400000
harsh, infosys, 800000
akhil, sunbase, 500000
kevin, tcs, 400000
morgan, tcs, 1200000
 */

class Student{
    String name;
    String company;
    int salary;

    public Student(String name, String  company, int salary){
        this.name=name;
        this.company=company;
        this.salary=salary;
    }
}
class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int compareCompany = s1.company.compareTo(s2.company);
        if (compareCompany != 0) {
            return compareCompany;
        }
        int compareName = s1.name.compareTo(s2.name);
        if(compareName!=0){
            return compareName;
        }

        return Integer.compare(s2.salary, s1.salary);
    }
}
public class StudentSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            String[] strings = s.split(",");
            if (strings.length != 3) {
               // System.out.println("Invalid input format. Expected: Name, Company, Salary");
                continue;
            }
                String name = strings[0].trim();
                String company = strings[1].trim();
                int salary;
                try{
                 salary = Integer.parseInt(strings[2].trim());

            } catch (NumberFormatException e) {
                System.out.println("Invalid salary format for string s:"+s);
                continue;
            }

            list.add(new Student(name, company, salary));
        }
            Collections.sort(list, new StudentComparator());
            for (Student student : list) {
                System.out.println(student.name + " " + student.company + " " + student.salary);
            }
           sc.close();
        }
    }

