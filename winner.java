public class winner {

    bord b = new bord();
    private int winner;

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public void judge() {
        int[][] bord = b.getBord();
        for (int i = 0; i < 3; i++) {

            if (bord[i][0] == bord[i][1] && bord[i][0] == bord[i][2] && bord[i][0] != 0) {
                setWinner(bord[i][0]);
                return;
            }
            if (bord[0][i] == bord[1][i] && bord[0][i] == bord[2][i] && bord[0][i] != 0) {
                setWinner(bord[0][i]);
            }
        }
        if (bord[0][0] == bord[1][1] && bord[0][0] == bord[2][2] && bord[0][0] != 0) {
            setWinner(bord[0][0]);
        }
        if (bord[0][2] == bord[1][1] && bord[0][2] == bord[2][0] && bord[0][2] != 0) {
            setWinner(bord[0][2]);
        }
    }
}
