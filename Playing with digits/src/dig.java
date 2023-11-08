import java.lang.Math;
public class dig {

    public static long digPow(int n, int p) {
        String nS = Integer.toString(n);
        int power = p;

        long result = 0;

        for(int i=0; i<nS.length(); i++ ){
            int number = Integer.parseInt(nS.substring(i,i+1));
            result += (long) Math.pow(number, power);
            power++;
        }
        if(result%n ==0){
            return result/n;
        }else {
            return -1;
        }
    }
}
