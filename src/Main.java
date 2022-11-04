
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

        Bussiness empresa[] = {(new Bussiness("3-111-999999", "27834567")), (new Bussiness("1-0999-0222", "27842785"))};

        Applicant aplicante[] = {(new Applicant(1, "auta22", "123")), (new Applicant(2, "abdu99", "456")),
            (new Applicant(3, "marvin", "789")), (new Applicant(4, "florida", "135")), (new Applicant(5, "jacks", "246"))};

        Product inventario[] = new Product[3];
        Product arena = new Product("001", "Arena", 100.0, 40);
        Product piedraCuarta = new Product("002", "Piedra cuarta", 108.4, 15);
        Product polvoPiedra = new Product("003", "Polvo de piedra", 120.6, 0);
        inventario[0] = arena;
        inventario[1] = piedraCuarta;
        inventario[2] = polvoPiedra;

        Requests solicitud[] = {(new Requests()), (new Requests()), (new Requests())};
        Billing factura[] = {(new Billing()), (new Billing()), (new Billing())};

        int op1, op2, option2, option3, producto1Menu, producto2Menu, producto3Menu, metodoPago;
        double cantidadComprada1 = 0.0, cantidadComprada2 = 0.0, cantidadComprada3 = 0.0, precio1, precio2, precio3, precioTotal;
        String user, passw;
        boolean estado = true;

        do {
            option3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al sistema del tajo CEJOFATI\n" + "1. Iniciar sesion como cliente\n 2. Iniciar sesion como administrador\n 3. Salir"));
            switch (option3) {
                case 1:
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
                                            producto1Menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (producto1Menu) {
                                                case 1:
                                                    solicitud[0].tons = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de arena tiene un valor de 100 dolares"));
                                                    if (inventario[0].productInventary >= solicitud[0].tons) {
                                                        inventario[0].productInventary = inventario[0].productInventary - solicitud[0].tons;
                                                        cantidadComprada1 = cantidadComprada1 + solicitud[0].tons;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }

                                                    break;
                                                case 2:
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventario[0].productInventary + " toneladas de arena en el inventario");
                                                    break;
                                            }
                                        } while (producto1Menu != 3);
                                        break;
                                    case 2:
                                        do {
                                            producto2Menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (producto2Menu) {
                                                case 1:
                                                    solicitud[1].tons = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de piedra cuarta tiene un valor de 108.4 dolares"));
                                                    if (inventario[1].productInventary >= solicitud[1].tons) {
                                                        inventario[1].productInventary = inventario[1].productInventary - solicitud[1].tons;
                                                        cantidadComprada2 = cantidadComprada2 + solicitud[1].tons;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }
                                                    break;
                                                case 2:
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventario[1].productInventary + " toneladas de piedra cuarta en el inventario");
                                                    break;
                                            }
                                        } while (producto2Menu != 3);
                                        break;
                                    case 3:
                                        do {
                                            producto3Menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (producto3Menu) {
                                                case 1:
                                                    solicitud[2].tons = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de polvo de piedra tiene un valor de 120.6 dolares"));
                                                    if (inventario[2].productInventary >= solicitud[2].tons) {
                                                        inventario[2].productInventary = inventario[2].productInventary - solicitud[2].tons;
                                                        cantidadComprada3 = cantidadComprada3 + solicitud[2].tons;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }
                                                    break;
                                                case 2:
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventario[2].productInventary + " toneladas de piedra cuarta en el inventario");
                                                    break;
                                            }
                                        } while (producto3Menu != 3);
                                        break;
                                    case 4:
                                        JOptionPane.showMessageDialog(null, "En este momento tiene listo para comprar\n" + cantidadComprada1
                                                + " toneladas de arena\n" + cantidadComprada2 + " toneladas de piedra cuarta\n"
                                                + cantidadComprada3 + " toneladas de polvo de piedra");
                                        break;
                                    case 5:
//                                        factura[0].setBill(cantidadComprada1 * 100);
                                        precio1 = cantidadComprada1 * 100;
                                        precio2 = cantidadComprada2 * 108.4;
                                        precio3 = cantidadComprada3 * 120.6;
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
                                                        "Factura a nombre de: " + user + "  Fecha actual: ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
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
                                                        "Factura a nombre de: " + user + " Factura del dia ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
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

                case 2:
                    user = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
                    passw = JOptionPane.showInputDialog(null, "Digite su contraseña");
                    for (int i = 0; i < admi.length; i++) {
                        if (admi[i].username.equals(user) && admi[i].password.equals(passw)) {
                            JOptionPane.showMessageDialog(null, "Usuario de Administrador correcto");
                            estado = true;
                            do {
                                op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea Realizar\n"
                                        + "1. generar explosion\n 2. Salir"));
                                switch (op1) {
                                    case 1:
                                        do {
                                            op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea Realizar?\n"
                                                    + "1. Realizar la explosion\n 2. Ver estado de los cuadrantes \n 3. Salir"));
                                            switch (op2) {
                                                case 1:
                                                    inventario[0].productInventary = inventario[0].productInventary + 100;
                                                    inventario[1].productInventary = inventario[1].productInventary + 100;
                                                    inventario[2].productInventary = inventario[2].productInventary + 100;

                                                    JOptionPane.showMessageDialog(null, "Explosion realizada correctamente");
                                                    break;

                                                case 2:
                                                    Terrain.mostrarCuadrantes();
                                                    break;

                                            }
                                        } while (op2 != 3);
                                        break;
                                }
                            } while (op1 != 2);
                        }
                    }
                    break;

            }
        } while (option3 != 3);
    }
}