package sets_maps_programs;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        allSubStrings(s);
    }
        private static void allSubStrings (String s){

            for (int size = s.length(); size>=1; size--) {
                for(int i=0;i<=s.length()-size;i++) {
                    String t = "";
                    for (int j = i; j < size + i; j++) {
                        t = t + s.charAt(j);
                    }
                    System.out.println(t);

                }
                }


            }
        }
















//        int n=sc.nextInt();
//        int []ar=new int[n];
//        for(int i=0;i<ar.length;i++){
//            ar[i]=sc.nextInt();
//        }
//        allSubArrays(ar);
//    }
//
//    private static void allSubArrays(int[] ar) {
//
//        for(int size=1;size<=ar.length;size++){
//
//            for(int i=0;i<=ar.length-size;i++) {
//                for (int j = i; j < size + i; j++) {
//                    System.out.print(ar[j] + " ");
//                }
//
//                System.out.println();
//            }
//        }


