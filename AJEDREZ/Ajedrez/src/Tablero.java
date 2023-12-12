public abstract class Tablero {
    int coordinacionTablero;

    Tablero(int coordinacionTablero) {
        this.coordinacionTablero = coordinacionTablero;
    }

    public abstract boolean tableroOcupado();

    public abstract Pieza obtenerPieza();

    public static final class TableroVacio extends Tablero {
        TableroVacio(int coordinar) {
            super(coordinar);
        }


        @Override
        public boolean tableroOcupado() {
            return false;
        }

        @Override
        public Pieza obtenerPieza() {
            return null;
        }
    }
}
