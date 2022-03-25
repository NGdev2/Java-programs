package calculator;

import java.util.Scanner;


public class Ports {
    public static void main(String[] args) {
        while(true)
            recurce();
    }
    public static void recurce(){
        Scanner scan_str = new Scanner(System.in);
        int inp_nb = Integer.parseInt(scan_str.nextLine());
//        System.out.println(inp_nb);
        switch (inp_nb) {
            case 0:
                System.out.println("port " + 0 + " reserved");
                break;
            case 17:
                System.out.println("port " + 17 + " User Datagram Protocol(UDP)");
                break;
            case 21:
                System.out.println("port " + 21 + " File Transfer Protocol(FTP)");
                break;
            case 22:
                System.out.println("port " + 22 + " The Secure Shell (SSH) Protocol");
                break;
            case 25:
                System.out.println("port " + 25 + " Simple Mail Transfer Protocol");
                break;
            case 53:
                System.out.println("port " + 53 + " port 53 is used to serve DNS queries");
                break;
            case 80:
                System.out.println("port " + 80 + " is port for HyperText Transfer Protocol(HTTP)");
                break;
            case 666:
                System.out.println("I'm Doomguy in the Hell and I'm killing all the devil. TelePort connection " + 666 + " is my last chance to return to the earth.");
                break;
            case 2041:
                System.out.println("port " + 2041 + " TCP Mail.ru Агент communication protocol");
                break;
            case 2042:
                System.out.println("port " + 2042 + " TCP Mail.ru Агент communication protocol");
                break;
            case 3074:
                System.out.println("port " + 3074 + " official port dor xBox Live");
                break;
            case 7777:
                System.out.println("port " + 7777 + "Port for Terraria, SAMP and Game port for Unreal Engine based games (Lineage, Unreal Tournament, etc) (default)");
                break;
            case 20014:
                System.out.println("port " + 20014 + " WOT");
                break;
            case 8080:
                System.out.println("Port " + 666 + " official alternative HTTP port. It's port is used to run the web server as an non-root user.");
                break;
            default:
                System.out.println("Who am I? Genius, Billionaire, Playboy, Philanthropist");
        }
    }
}

//        String a = "764";
//        int int_a = Integer.parseInt(a);
//        System.out.println(a);
//        System.out.println(int_a);
//    }
//}
