public class bord {
    private static int[][] bord = new int[3][3];

    public bord(){
        this.bord = bord;
    }

    public int[][] getBord() {
        return bord;
    }

    public void setBord(int[][] bord) {
        this.bord = bord;
    }

    public int updateBord(String column, String row, int player){
        int[][] bord = getBord();
        int x = 0;
        int y = 0;

        switch (column){
            case "A":
                y = 0;
                break;
            case "B":
                y = 1;
                break;
            case "C":
                y = 2;
                break;
            default:
                return -1;
        }

        x = Integer.parseInt(row) - 1;
        if(x < 0 || x > 2){
            return -1;
        }

        if(bord[x][y] == 0){
            bord[x][y] = player;
            setBord(bord);
            return 1;
        }

        return -2;
    }

    public void printBord(){
        int[][] bord = getBord();

        System.out.println("  A  B  C");
        for(int i = 0; i < 3; i++){

            System.out.print(i + 1 + " ");

            for(int j = 0; j < 3; j++){

                if(bord[i][j] == 1){
                    System.out.print("〇 ");
                }else if(bord[i][j] == 2){
                    System.out.print("☓ ");
                }else{
                    System.out.print("・ ");
                }
            }
            System.out.println();
        }
    }


}
