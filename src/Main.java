
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Admin admi[] = {(new Admin("Fabricio", "999")), (new Admin("Cesar", "222")),
            (new Admin("Tiffany", "888")), (new Admin("Jorshua", "555"))};

        PhysicalPerson persona[] = {(new PhysicalPerson("88889999", "Autanacia Flores Picado", "Parrita", "608630986")),
            new PhysicalPerson("76340943", "Jamal Abdulrrama Lopez Ruiz", "El Cairo", "9084202456"),
            new PhysicalPerson("62359090", "Christian Marciano Bejarano Palacios", "La Casona", "902450567")};

        Bussiness empresa[] = {(new Bussiness("27834567", "Florida SA")), (new Bussiness("27842785", "Jacks")), (new Bussiness("27109238", "Durex"))};

        Applicant aplicante[] = {(new Applicant(1, "auta22", "123")), (new Applicant(2, "abdu99", "456")),
            (new Applicant(3, "marvin", "789")), (new Applicant(4, "florida", "135")), (new Applicant(5, "jacks", "246"))};

        Product inventario[] = new Product[3];
        Product arena = new Product("001", "Arena", 100.0);
        Product piedraCuarta = new Product("002", "Piedra cuarta", 108.4);
        Product polvoPiedra = new Product("003", "Polvo de piedra", 120.6);
        inventario[0] = arena;
        inventario[1] = piedraCuarta;
        inventario[2] = polvoPiedra;

        int option, option2, producto1, producto2, producto3, metodoPago;
        double solicitud1, solicitud2, solicitud3, cantidadComprada1 = 0.0, cantidadComprada2 = 0.0, cantidadComprada3 = 0.0, precio1, precio2, precio3, precioTotal;

        String user, passw;
        boolean estado = true;
        int op1 = 0;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al sistema del tajo CEJOFATI\n"
                    + "1. Iniciar sesion como administrador\n 2. Inicar sesión como usuario\n 3. Salir"));

            switch (option) {
                case 1:
                    user = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
                    passw = JOptionPane.showInputDialog(null, "Digite su contraseña");
                    for (int i = 0; i < admi.length; i++) {
                        if (admi[i].username.equals(user) && admi[i].password.equals(passw)) {
                            JOptionPane.showMessageDialog(null, "Usuario de Administrador correcto");
                            estado = true;
                            do {
                                op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea Realizar\n"
                                        + "1. crear usuario\n 2. generar explosion \n 3. Salir"));
                                switch (option) {
                                    case 1:

                                        break;
                                    case 2:
                                        ArrayList productosSolic= new ArrayList<Product>();

       
       
       Product p1=new Product("Arena", 400.000, 0);
       Product p2=new Product("Roca", 300.000, 0);
       Product p3=new Product("Piebra1", 100.000, 0);
       Product p4=new Product("Prieba2", 300.000, 0);
       
       Explotions.cargarCuadrante(p1, p2, p3, p4);
       Explotions.mostrarCuadrantes();


       productosSolic.add(new Product("Arena", 100.0, 0));
       productosSolic.add(new Product("Roca", 100.0, 0));
       
       
       Requests s1 = new Requests(productosSolic);
       
       s1.tramitarSolicitud();
       
       Explotions.mostrarCuadrantes();

                                        break;
                                }
                            } while (option != 3);
                        }
                    }
                    break;
                
                case 2:
                    user = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
                    passw = JOptionPane.showInputDialog(null, "Digite su contraseña");
                    for (int i = 0; i < aplicante.length; i++) {
                        if (aplicante[i].username.equals(user) && aplicante[i].password.equals(passw)) {
                            JOptionPane.showMessageDialog(null, "Usuario correcto, ingreso al sistema exitoso");
                            estado = true;
                            do {
                                option2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido " + user + ", que producto desea comprar?\n"
                                        + "1. Arena\n 2. Pierda cuarta\n 3. Polvo de piedra\n 4. consultar estado de la compra\n 5. Finalizar la compra\n 6. cerrar sesion"));
                                System.out.println(option2);
                                switch (option2) {
                                    case 1:
                                        do {
                                            producto1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (producto1) {
                                                case 1:
                                                    solicitud1 = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de arena tiene un valor de 100 dolares"));
                                                    if (inventario[0].productInventary >= solicitud1) {
                                                        inventario[0].productInventary = inventario[0].productInventary - solicitud1;
                                                        cantidadComprada1 = cantidadComprada1 + solicitud1;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }

                                                    break;
                                                case 2:
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventario[0].productInventary + " toneladas de arena en el inventario");
                                                    break;
                                            }
                                        } while (producto1 != 3);
                                    case 2:
                                        do {
                                            producto2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (producto2) {
                                                case 1:
                                                    solicitud2 = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de piedra cuarta tiene un valor de 108.4 dolares"));
                                                    if (inventario[1].productInventary >= solicitud2) {
                                                        inventario[1].productInventary = inventario[1].productInventary - solicitud2;
                                                        cantidadComprada2 = cantidadComprada2 + solicitud2;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }
                                                    break;
                                                case 2:
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventario[1].productInventary + " toneladas de piedra cuarta en el inventario");
                                                    break;
                                            }
                                        } while (producto2 != 3);

                                    case 3:
                                        do {
                                            producto3 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (producto3) {
                                                case 1:
                                                    solicitud3 = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de polvo de piedra tiene un valor de 120.6 dolares"));
                                                    if (inventario[2].productInventary >= solicitud3) {
                                                        inventario[2].productInventary = inventario[2].productInventary - solicitud3;
                                                        cantidadComprada3 = cantidadComprada3 + solicitud3;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }
                                                    break;
                                                case 2:
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventario[3].productInventary + " toneladas de piedra cuarta en el inventario");
                                                    break;
                                            }
                                        } while (producto3 != 3);

                                    case 4:
                                        JOptionPane.showMessageDialog(null, "En este momento tiene listo para comprar\n" + cantidadComprada1
                                                + " toneladas de arena\n" + cantidadComprada2 + " toneladas de piedra cuarta\n"
                                                + cantidadComprada3 + " toneladas de polvo de piedra");
                                        break;

                                    case 5:
                                        precio1 = cantidadComprada1 * 100;
                                        precio2 = cantidadComprada3 * 108.4;
                                        precio3 = cantidadComprada2 * 120.6;
                                        precioTotal = precio1 + precio2 + precio3;
                                        metodoPago = Integer.parseInt(JOptionPane.showInputDialog(null, "Como desea hacer el pago\n 1. Efectivo\n 2. SINPE\n 3. Tarjeta\n 4. Credit"));
                                        switch (metodoPago) {
                                            case 1:
                                                int pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + cantidadComprada1 + " Toneladas " + "  Precio: " + precio1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + cantidadComprada2 + " Toneladas " + "  Precio: " + precio2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + cantidadComprada3 + " Toneladas " + "  Precio: " + precio3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.CASH + "   El total a pagar seria de: " + precioTotal + " Dolares\n" + "¿Desea finalizar la compra?",
                                                        "Factura a nombre de: " + user, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                                if (pagarFactura == 0) {
                                                    JOptionPane.showMessageDialog(null, "Gracias por su compra y su preferencia");
                                                    System.exit(0);
                                                }
                                                break;
                                            case 2:
                                                pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + cantidadComprada1 + " Toneladas " + "  Precio: " + precio1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + cantidadComprada2 + " Toneladas " + "  Precio: " + precio2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + cantidadComprada3 + " Toneladas " + "  Precio: " + precio3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.SINPE + "   El total a pagar seria de: " + precioTotal + " Dolares\n" + "¿Desea finalizar la compra?",
                                                        "Factura a nombre de: " + user, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                                if (pagarFactura == 0) {
                                                    JOptionPane.showMessageDialog(null, "Gracias por su compra y su preferencia");
                                                    System.exit(0);
                                                }
                                                break;
                                            case 3:
                                                pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + cantidadComprada1 + " Toneladas " + "  Precio: " + precio1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + cantidadComprada2 + " Toneladas " + "  Precio: " + precio2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + cantidadComprada3 + " Toneladas " + "  Precio: " + precio3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.CARD + "   El total a pagar seria de: " + precioTotal + " Dolares\n" + "¿Desea finalizar la compra?",
                                                        "Factura a nombre de: " + user, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                                if (pagarFactura == 0) {
                                                    JOptionPane.showMessageDialog(null, "Gracias por su compra y su preferencia");
                                                    System.exit(0);
                                                }
                                                break;
                                            case 4:
                                                pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + cantidadComprada1 + " Toneladas " + "  Precio: " + precio1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + cantidadComprada2 + " Toneladas " + "  Precio: " + precio2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + cantidadComprada3 + " Toneladas " + "  Precio: " + precio3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.CREDIT + "   El total a pagar seria de: " + precioTotal + " Dolares\n" + "¿Desea finalizar la compra?",
                                                        "Factura a nombre de: " + user, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                                if (pagarFactura == 0) {
                                                    JOptionPane.showMessageDialog(null, "Gracias por su compra y su preferencia, esperamos que pague.\n No sea moroso");
                                                    System.exit(0);
                                                }
                                                break;
                                        }
                                        break;
                                }

                            } while (option2 != 6);

                            if (estado == false) {
                                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectas");
                            }
                        }
                    }
                    break;
            }
        } while (option != 3);
    }
}
