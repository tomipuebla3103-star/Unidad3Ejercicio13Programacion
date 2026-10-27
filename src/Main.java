//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Prenda prenda = new Prenda("Remera", 15000);

    prenda.agregarStock("S", 10);
    prenda.agregarStock("M", 15);
    prenda.agregarStock("L", 20);
    prenda.agregarStock("XL", 8);

    prenda.vender("M", 3);
    prenda.vender("L", 25);
    prenda.vender("S", -2);
    prenda.agregarStock("XXL", 5);

    System.out.println();
    System.out.println("Stock talle S: " + prenda.consultarStock("S"));
    System.out.println("Stock talle M: " + prenda.consultarStock("M"));
    System.out.println("Stock talle L: " + prenda.consultarStock("L"));
    System.out.println("Stock talle XL: " + prenda.consultarStock("XL"));
}
