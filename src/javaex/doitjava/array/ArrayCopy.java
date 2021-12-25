package javaex.doitjava.array;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1,2,3,4,5};

        System.arraycopy(array1, 0, array2, 1, 4);
        for (int j : array2) {
            System.out.println(j);
        }

        // for문으로 객체 요소 출력
//        for(int i= 0; i<array2.length; i++){
//            System.out.println(array2[i]);
//        }
    }
}
