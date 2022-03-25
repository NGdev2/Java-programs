public class calculator {
//    public class Main {
//        public Main() {
//        }

    public static void main(String[] var0) {
        if (var0.length != 3) {
            System.out.println("need 3 argc!");
        } else {
            float var1 = Float.valueOf(var0[0]);
            String var2 = var0[1];
            float var3 = Float.valueOf(var0[2]);
            if (var2.equals("+")) {
                System.out.println(var1 + var3);
            } else if (var2.equals("/")) {
                System.out.println(var1 / var3);
            } else if (var2.equals("%")) {
                System.out.println(var1 % var3);
            } else if (var2.equals("-")) {
                System.out.println(var1 - var3);
            } else if (var2.equals("*")) {
                System.out.println(var1 * var3);
            } else if (var2.equals("^")) {
                System.out.println(Math.pow((double) var1, (double) var3));
            } else {
                System.out.println("Not a operator");
            }

        }
    }
}

