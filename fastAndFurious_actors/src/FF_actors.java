public class FF_actors {
    public static void main(String[] args) {
        String[][] actorNamesGroupedByChapters = new String[][] {
                { "Vin Diesel", "Paul Walker","Michelle Rodriguez","Jordana Brewster" },
                { "Paul Walker", "Tyrese Gibson", "Cole Hauser", "Eva Mendes" }
        };
        String[] chapterNames = { "Chapter 1.", "Chapter 2." };

        for (int i = 0; i < chapterNames.length; i++){
            System.out.println(chapterNames[i] + " Actors:");
            for (int j = 0; j < actorNamesGroupedByChapters[i].length; j++){
                System.out.print(actorNamesGroupedByChapters[i][j] + ";");
            }
         System.out.println();
        }
    }
}




//        String[][] arr = new String[][] {
//                { "Chapter 1." },
//                { "Vin Diesel", "Paul Walker","Michelle Rodriguez","Jordana Brewster" },
//                { "Chapter 2." },
//                { "Paul Walker", "Tyrese Gibson", "Cole Hauser", "Eva Mendes" }
//        };
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i][0] + " Actors:");
//            i++;
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + ";");
//            }
//            System.out.println();
//        }




        //        String [][][] arr = new String[][][]{
//                {{"Chapter 1."}},
//                {{"Vin Diesel"},{"Paul Walker"},{"Michelle Rodriguez"},{"Jordana Brewster"}},
//                {{"Chapter 2."}},
//                {{"Paul Walker"},{"Tyrese Gibson"}, {"Cole Hauser"}, {"Eva Mendes"}}
//        };
//        int a = arr[0].length, b = arr[1].length; //a - часть b - актеры c - c (fly)
//        System.out.println(arr[0][0].length);
////        for (int i = 0; i < a; i++){
////            System.out.println(arr[i][0][0] + " Actors:");
////            for (int j = 0; j < a; j++){
////                System.out.print(arr[i][j][0] + ";");
////            }
////        }
//

