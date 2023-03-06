public class Task2 {
    public static void main(String[] args) {
        int N = 1000;
        for (int i = 2; i <= N; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;                               
                }
            }
            if(count<2){
                System.out.println(i);
            }
        }
    }
}
