package TUGAS_MODUL4;
public class No2 {
        public static void bubbleSort(int[] A) {
        int i = 1, j, n = A.length;
        int temp;
        while (i < n){
            j = n-1 ;
            while( j >= 1){
                if (A[j-1] > A[j]){
                    temp = A[j];
                    A[j]=A[j-1];
                    A[j-1] =temp;
                }
                j = j - 1;
            }
            i = 1 + i;
        }
    }
        public static void tampil(int data[]) {
    for (int i=0; i < data.length;i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}
public static void main(String args[]){
    int A[]= { 25 , 7 , 9 , 13 , 3 };
    No2.tampil(A);    //cara menamainya yaitu name class_name public static
    No2.bubbleSort(A);
    No2.tampil(A);
    
    System.out.print("MENTARI PUTRI MEYRANITA");
    
}
}
