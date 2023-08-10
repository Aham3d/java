public class operators {
    public static void main(String[] args) {
        int m = 10, n = 10;
        int res = m++ / (++n * n--) / --m;
        System.out.print(res);
    }
    
}


