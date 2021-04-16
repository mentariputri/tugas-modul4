package TUGAS_MODUL4;
public class No4  {
    public static void shellsort(int[] arr) {
            int n = arr.length;
            int C,M;
            int jarak, i, j, kondisi;
            boolean Sudah = true;
            int temp;
            C = 0;
            M = 0;
            jarak = n;//array length

            while (jarak >= 1) {//syarat jika jarak tidak memenui syarat maka akan dilanjut
                jarak = jarak/2;
                Sudah = true;//sudah ditemukan jarak
                while (Sudah) {//
                    Sudah = false;
                    for (j = 0; j < n - jarak; j++) {
                        i = j + jarak; //i=0+2=2
                        C++;
                        if (arr[j]> arr[i]) {
                            temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                            Sudah = true;
                        }}}
            }
    }
        public static void tampil(int data[]) {
            for(int i = 0; i<data.length; i++)
                System.out.print(data[i] + "");
            System.out.println();}

        public static void main(String[] args) {
            int A[]= { 25 , 7 , 9 , 13 , 3 };
            No4.tampil(A);
            No4.shellsort(A);
            No4.tampil(A);
            
            System.out.print("MENTARI PUTRI MEYRANITA");
        }
}
