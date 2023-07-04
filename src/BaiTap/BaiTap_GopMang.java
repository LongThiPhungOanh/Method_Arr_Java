package BaiTap;

public class BaiTap_GopMang {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = new int[5];
        int[] total = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = i + 1;
        }
        for (int i = 0; i < list2.length; i++) {
            list2[i] = i + 6;
        }
            for (int j = 0; j < list1.length; j++) {
                total[j] = list1[j];
        }
            for (int i = 0; i < list2.length; i++) {
            total[(list1.length) + i] = list2[i];
        }
        for (int test: total) {
            System.out.println(test);
        }
    }
}
