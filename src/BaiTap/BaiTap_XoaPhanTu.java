package BaiTap;
import java.util.Scanner;
public class BaiTap_XoaPhanTu {
    public static void main(String[] args) {
        Scanner numBer = new Scanner(System.in);
        System.out.println("nhập số index");
        int num = numBer.nextInt();
        int[] listNumber = {1,2,3,4,5,6,7,8,9};
        int[] newListNumber = new int[listNumber.length-1];
        for (int i = 0; i < listNumber.length; i++) {
            if (num == listNumber[i]){
                System.out.println("vị trí index là: " + i);
                for (int j = i; j < listNumber.length - 1; j++) {
                    listNumber[j] = listNumber[j+1];
                }
            }
      }
        for (int i = 0; i < newListNumber.length; i++) {
          newListNumber[i] += listNumber[i];
      }
               for (int test: newListNumber) {
               System.out.println(test);
        }
    }
}
