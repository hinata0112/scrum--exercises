import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bord b = new bord();
        winner w = new winner();
        choiceCom c = new choiceCom();

        int count = 0;
        int tmp;
        String column;
        String row;
        String[] coordinate = new String[2];

        while(w.getWinner() == 0 && count < 5){
            b.printBord();
            System.out.println("〇を置く位置を入力してください。例：A1");

            while(true){
                coordinate = sc.nextLine().split("");

                int num = b.updateBord(coordinate[0], coordinate[1], 1);
                if(num == 1){
                    break;
                }
                if(num == -1){
                    System.out.println("適切な座標を入力してください。");
                }else{
                    System.out.println("すでに埋まっているマスです。");
                }
            }

            w.judge();

            while(true && w.getWinner() == 0 && count != 4){
                tmp = c.choiceCom();
                if(tmp == 0){
                    column = "A";
                }else if(tmp == 1){
                    column = "B";
                }else{
                    column = "C";
                }


                row = c.choiceCom() + 1 + "";
                int num = b.updateBord(column, row, 2);

                if(num == 1){
                    break;
                }
            }

            w.judge();
            count++;
        }

        b.printBord();

        if(w.getWinner() == 1){
            System.out.println("あなたの勝ちです。");
        }else if(w.getWinner() == 2){
            System.out.println("コンピュータの勝ちです。");
        }else{
            System.out.println("引き分けです。");
        }

    }
}