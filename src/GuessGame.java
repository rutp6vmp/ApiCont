public class GuessGame {
    public static void main(String[] args) throws Exception {
        int answer = (int) (Math.random() * 10);
        java.io.InputStreamReader reader = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader input = new java.io.BufferedReader(reader);
        int guess = -1;
        int i = 0;
        String s;

        while (answer != guess) {
            System.out.println();
            System.out.println("請輸入 0 - 9 的數字： ");
            s = input.readLine();
            char[] c = s.toCharArray();
            guess = (int) (c[0] - 48);
            i++;
        }
        System.out.printf("\n一共回答了 %d 次....\n\n", i);
    }
}
