public class print_alphabet {
    public static void main(String[] args) {
        ft_alphabet();
        ft_rev_alphabet();
        ft_maff_alpha();
        ft_float_arr(8);
    }

    public static void ft_alphabet(){
        char alp = 'a';
        do {
            System.out.print(alp);
            alp++;
        }
        while (alp <= 'z');
        System.out.println();
    }

    public static void ft_rev_alphabet(){
        char alp = 'z';
        do {
            System.out.print(alp);
            alp--;
        }
        while (alp >= 'a');
        System.out.println();
    }

    public static void ft_maff_alpha(){
        char alp = 'a';
        while (alp <= 'z'){
            if (alp % 2 != 0)
                System.out.print(alp);
            else {
                System.out.print((char) (alp - 32));
            }
            alp++;
        };
        System.out.println();
    }
    public static void ft_float_arr(int size){
        float [] arr = new float[size];
        for (int i = 0; i < size; i++){
            arr[i] = i + (float) (i / 3.f);
        }
        System.out.println("float array:");
        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
    public static void ft_str(){
        String text = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text);
    }

}
