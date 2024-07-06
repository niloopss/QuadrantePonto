/**
 * Representa um ponto no plano cartesiano definido por suas coordenadas x e y.
 * @author Nivea Lins
 */
class Ponto {

    /**
     * Coordenada x do ponto.
     */
    private final int x;

    /**
     * Coordenada y do ponto.
     */
    private final int y;

    /**
     * Constrói um novo ponto com as coordenadas x e y especificadas.
     *
     * @param x Coordenada x do ponto.
     * @param y Coordenada y do ponto.
     */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retorna o quadrante em que o ponto se encontra no plano cartesiano.
     *
     * @return O quadrante do ponto:
     *         <ul>
     *         <li>0: Origem (0, 0)</li>
     *         <li>1: Segundo quadrante (x < 0, y > 0)</li>
     *         <li>2: Primeiro quadrante (x > 0, y > 0)</li>
     *         <li>3: Terceiro quadrante (x < 0, y < 0)</li>
     *         <li>4: Quarto quadrante (x > 0, y < 0)</li>
     *         </ul>
     */
    public int getQuadrante() {
        if (x == 0 && y == 0) {
            return 0; // Origem
        } else if (x < 0 && y > 0) {
            return 1; // Segundo quadrante
        } else if (x > 0 && y > 0) {
            return 2; // Primeiro quadrante
        } else if (x < 0 && y < 0) {
            return 3; // Terceiro quadrante
        } else {
            return 4; // Quarto quadrante
        }
    }
}
