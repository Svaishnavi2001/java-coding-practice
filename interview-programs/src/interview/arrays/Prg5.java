package interview.arrays;

public class Prg5 {
    public static void main(String[] args) {
        int []arr={1,1,2,3,4,4,5};

        int count=1;
        for(int i=0;i< arr.length-1;i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            }
            else {
                System.out.println(arr[i] + " " + count);
                count = 1;
            }
        }
            System.out.println(arr[arr.length-1]+" "+count);

        }
    }

