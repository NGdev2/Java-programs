import java.util.Random;
import java.util.Scanner;

public class Smiley {
    public static void main(String[] args) {
        String arrOfSmiley [] = new String[] {
                "¯\\_(ツ)_/¯ ", "(* ^ ω ^)", "(^人^)", "(´ ∀ *)", "(✯◡✯)", "(´｡• ω •｡)", "(◕‿◕)",
                "＼(≧▽≦)／", "٩(｡•́‿•̀｡)۶", "＼(￣▽￣)／", "(╯✧▽✧)╯",
                "(ﾉ´ヮ)ﾉ*: ･ﾟ", "(^˵◕ω◕˵^)", "(▽◕ ᴥ ◕▽)", "V●ᴥ●V",
                "U^ｪ^U", "(⌐■_■)", "(❍ᴥ❍ʋ)", "ヾ(⌐■_■)ノ♪",
                "༼ つ ಥ_ಥ ༽つ", "(｡◕‿‿◕｡)", " (✿◠‿◠)", "ヾ(｡♥‿♥｡)", "ଘ(੭ˊ꒳\u200Bˋ)੭✧"
        };
        String arrOfScowl [] = new String[] {
            "┌(ಠ_ಠ)┘", "•_•)", "ლ(ಠ益ಠლ)", "๏̯͡๏", "‿︵‿ヽ(°□° )ノ︵‿︵",
            "/╲/\\╭[☉﹏☉]╮/\\╱\\", "/╲/\\╭(ఠఠ益ఠఠ)╮/\\╱\\", "(⊙_⊙)", "〜(＞＜)〜", "(・人・)",
            "(‡▼益▼)", "٩(ఠ益ఠ)۶", "(；⌣ ̀ _ ⌣ ́)", "(」°ロ°)」", "(︶︹︺)", "﴾͡๏̯͡๏﴿"
        };
//        System.out.println(arrOfSmiley.length);
//        System.out.println(arrOfScowl.length);

        Scanner str = new Scanner(System.in);
        int nb = Integer.parseInt(str.nextLine());
//        int rand_nb = (int) (Math.random() * arrOfScowl.length);
        if (nb == 8294400)
        {
            System.out.println("We're in UltraHD Morty! ＼(＾▽＾)／ヽ(˘◡˘)");
        }
        else if (nb % 100 == 0){
            System.out.println("Congratulations!! Jackpot! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
        }
        else if (nb < 0){
            System.out.println("less then 0! " + arrOfScowl[(int) (Math.random() * arrOfScowl.length)]);
        }
        else if (nb > 0){
            System.out.println("WOH! " + arrOfSmiley[(int) (Math.random() * arrOfSmiley.length)]);
        }
    }
}
