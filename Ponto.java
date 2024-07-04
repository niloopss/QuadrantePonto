class Ponto {
    private final int x;
    private final int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getQuadrante() {
        if (x == 0 && y == 0) {
            return 0;
        } else if (x < 0 && y > 0) {
            return 1;
        } else if (x > 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
