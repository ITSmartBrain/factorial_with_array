public class Main {

    public static void main(String[] args) {
        System.out.println(getFact(1));
        System.out.println(getFact(2));
        System.out.println(getFact(2));
        System.out.println(getFact(3));
        System.out.println(getFact(4)); //4 * 3* 2* 1 = 120
        System.out.println(getFact(5)); //120 * 5 = 600
        System.out.println(getFact(7)); //7*6*120 =
        //arr[6] = 600
        //arr[7] = 5040

    }
    static int[] arr = new int[100];
    public static int getFact(int f){
        if(f == 0 || f == 1) {
            arr[f] = 1;
            return 1;
        }
        if (arr[f] > 0) return arr[f];
        int source = f;
        int res = f--;
        while(f>1) {
            if (arr[f] > 0) {
                res*=arr[f];
                break;
            }
            else {
                res *= f--;
            }
        }
        arr[source] = res;
        return res;

    }

}
