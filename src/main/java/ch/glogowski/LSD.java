package ch.glogowski;

public class LSD {
        public static long lsd(int m, int n){
            int l;
            while(n > 0){
                l = m%n;
                m = n;
                n = l;
            }
            return m;
        }

        public static void main(String[] args){
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            long res = lsd(m,n);
            String result = String.format("The largest shared Divisor of %d and %d is %d.",m,n,res);
            System.out.println(result);
        }
}
