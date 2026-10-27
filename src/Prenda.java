public class Prenda {
    private String modelo;
    private double precio;
    private int[] stock;

    public Prenda(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
        stock = new int[4];
    }

    private int buscarTalle(String talle) {
        if (talle.equals("S")) {
            return 0;
        } else if (talle.equals("M")) {
            return 1;
        } else if (talle.equals("L")) {
            return 2;
        } else if (talle.equals("XL")) {
            return 3;
        } else {
            return -1;
        }
    }

    public int consultarStock(String talle) {
        int posicion = buscarTalle(talle);

        if (posicion != -1) {
            return stock[posicion];
        } else {
            return -1;
        }
    }

    public void agregarStock(String talle, int cantidad) {
        int posicion = buscarTalle(talle);

        if (posicion != -1 && cantidad > 0) {
            stock[posicion] = stock[posicion] + cantidad;
            System.out.println("Stock agregado correctamente");
        } else {
            System.out.println("Talle o cantidad invalida");
        }
    }

    public void vender(String talle, int cantidad) {
        int posicion = buscarTalle(talle);

        if (posicion != -1 && cantidad > 0 && stock[posicion] >= cantidad) {
            stock[posicion] = stock[posicion] - cantidad;
            System.out.println("Venta realizada correctamente");
        } else {
            System.out.println("Venta rechazada");
        }
    }
}
