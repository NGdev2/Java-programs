public class RE_date {
    public static void main(String[] args) {
        int [] arr = new int[9];
        arr[0] = 1996;
        arr[1] = 1998;
        arr[2] = 1999;
        arr[3] = 2005;
        arr[4] = 2009;
        arr[5] = 2012;
        arr[6] = 2017;

        for (int i = 0; i < 7; i++){
            System.out.println("Resident evil " + (i+1) + " was released in " + arr[i]);
        }
    }
}
