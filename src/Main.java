
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Tiffany Hernandez
Jorshua Solorzano
Cesar Perez
Fabricio Castro
*/
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
       //Arreglo para guardar los datos de los administradores 
        Admin admi[] = {(new Admin("Fabricio", "999")), (new Admin("Cesar", "222")),
            (new Admin("Tiffany", "888")), (new Admin("Jorshua", "555"))};
       //Arreglo para guardar los datos de las nuevas personas 
        PhysicalPerson persona[] = {(new PhysicalPerson("88889999", "Autanacia Flores Picado", "Parrita", "608630986")),
            new PhysicalPerson("76340943", "Jamal Abdulrrama Lopez Ruiz", "El Cairo", "9084202456"),
            new PhysicalPerson("62359090", "Christian Marciano Bejarano Palacios", "La Casona", "902450567")};
        
        //Arreglo para guardar los datos de las empresas
        Bussiness empresa[] = {(new Bussiness("3-111-999999", "27834567")), (new Bussiness("1-0999-0222", "27842785"))};
        
        //Arreglo para guardar los datos de los usuarios apara accesar al sistema
        Applicant aplicante[] = {(new Applicant(1, "auta22", "123")), (new Applicant(2, "abdu99", "456")),
            (new Applicant(3, "marvin", "789")), (new Applicant(4, "florida", "135")), (new Applicant(5, "jacks", "246"))};
       
        //Arreglo para guardar los datos de los productos disponibles
        Product inventary[] = new Product[3];
        Product sand = new Product("001", "Arena", 100.0, 0);
        Product fourthStone = new Product("002", "Piedra cuarta", 108.4, 0);
        Product stoneDust = new Product("003", "Polvo de piedra", 120.6, 0);
        inventary[0] = sand;
        inventary[1] = fourthStone;
        inventary[2] = stoneDust;

        Requests solicitud[] = {(new Requests()), (new Requests()), (new Requests())};
        Billing factura[] = {(new Billing()), (new Billing()), (new Billing())};
       
        //Declaración de variables
        int option, option1, option2, option3, product1, product2, product3, billingMethods;
        double purchasedAmount1 = 0.0, purchasedAmount2 = 0.0, purchasedAmount3 = 0.0, price1, price2, price3, totalPrice;
        String user, passw;
        boolean state = true;

        do {
            //Menú principal
            option3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al sistema del tajo CEJOFATI\n" + "1. Iniciar sesion como cliente\n 2. Iniciar sesion como administrador\n 3. Salir"));
            switch (option3) {
                
                case 1:
                    //Iniciar sesion como usuario
                    user = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
                    passw = JOptionPane.showInputDialog(null, "Digite su contraseña");
                    //Va a verificar si los datos ingresados son iguales a los que ya están registrados 
                    for (int i = 0; i < aplicante.length; i++) {
                        if (aplicante[i].username.equals(user) && aplicante[i].password.equals(passw)) {
                            JOptionPane.showMessageDialog(null, "Usuario correcto, ingreso al sistema exitoso");
                            state = true;
                            do {
                                //Menu para hacer la solicitud de los pedidos
                                option2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido " + user + ", que producto desea comprar?\n"
                                        + "1. Arena\n 2. Pierda cuarta\n 3. Polvo de piedra\n 4. consultar estado de la compra\n 5. Finalizar la compra\n 6. cerrar sesion"));
                                System.out.println(option2);
                                switch (option2) {
                                    case 1:
                                        //Menu para hacer el pedido de sand
                                        do {
                                            product1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (product1) {
                                                case 1:
                                                    
                                                    solicitud[0].tons = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de arena tiene un valor de 100 dolares"));
                                                    if (inventary[0].productInventary >= solicitud[0].tons) {
                                                        inventary[0].productInventary = inventary[0].productInventary - solicitud[0].tons;
                                                        purchasedAmount1 = purchasedAmount1 + solicitud[0].tons;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }

                                                    break;
                                                case 2:
                                                    //Se muestra el total de sand que queda en el inventary
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventary[0].productInventary + " toneladas de arena en el inventario");
                                                    break;
                                            }
                                        } while (product1 != 3);
                                        break;
                                    case 2:
                                        //Menu para hacer el pedido de piedra cuarta
                                        do {
                                            product2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (product2) {
                                                //Proceso para hacer el pedido de piedra cuarta
                                                case 1:
                                                    solicitud[1].tons = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de piedra cuarta tiene un valor de 108.4 dolares"));
                                                    if (inventary[1].productInventary >= solicitud[1].tons) {
                                                        inventary[1].productInventary = inventary[1].productInventary - solicitud[1].tons;
                                                        purchasedAmount2 = purchasedAmount2 + solicitud[1].tons;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }
                                                    break;
                                                case 2:
                                                    //Se muestra el total de piedra cuarta que queda en el inventary
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventary[1].productInventary + " toneladas de piedra cuarta en el inventario");
                                                    break;
                                            }
                                        } while (product2 != 3);
                                        break;
                                    case 3:
                                        //Menu para hacer el pedido de polvo de piedra
                                        do {
                                            product3 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Comprar material\n 2. Consultar cantidad de material disponible\n 3. Volver"));
                                            switch (product3) {
                                                //Proceso para hacer el pedido de polvo de piedra
                                                case 1:
                                                    solicitud[2].tons = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuantas toneladas desea?\n Cada tonelada de polvo de piedra tiene un valor de 120.6 dolares"));
                                                    if (inventary[2].productInventary >= solicitud[2].tons) {
                                                        inventary[2].productInventary = inventary[2].productInventary - solicitud[2].tons;
                                                        purchasedAmount3 = purchasedAmount3 + solicitud[2].tons;
                                                        JOptionPane.showMessageDialog(null, "Producto agragado correctamente");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Lo sentimos, pero en este momento no contamos con la cantidad necesaria para el pedido");
                                                    }
                                                    break;
                                                case 2:
                                                    //Se muestra el total de polvo de piedra que queda en el inventary
                                                    JOptionPane.showMessageDialog(null, "Queda un total de " + inventary[2].productInventary + " toneladas de piedra cuarta en el inventario");
                                                    break;
                                            }
                                        } while (product3 != 3);
                                        break;
                                    case 4:
                                         //Se muestran los productos que el username ha solicitado
                                        JOptionPane.showMessageDialog(null, "En este momento tiene listo para comprar\n" + purchasedAmount1
                                                + " toneladas de arena\n" + purchasedAmount2 + " toneladas de piedra cuarta\n"
                                                + purchasedAmount3 + " toneladas de polvo de piedra");
                                        break;
                                    case 5:
//                                       //Metodo de pago y facturacion
                                        price1 = purchasedAmount1 * 100;
                                        price2 = purchasedAmount2 * 108.4;
                                        price3 = purchasedAmount3 * 120.6;
                                        totalPrice = price1 + price2 + price3;
                                        billingMethods = Integer.parseInt(JOptionPane.showInputDialog(null, "Como desea hacer el pago\n 1. Efectivo\n 2. SINPE\n 3. Tarjeta\n 4. Credit"));
                                        switch (billingMethods) {
                                            case 1:
                                                //Para pagar con efectivo
                                                int pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + purchasedAmount1 + " Toneladas " + "  Precio: " + price1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + purchasedAmount2 + " Toneladas " + "  Precio: " + price2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + purchasedAmount3 + " Toneladas " + "  Precio: " + price3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.CASH + "   El total a pagar seria de: " + totalPrice + " Dolares\n" + "¿Desea finalizar la compra?",
                                                        "Factura a nombre de: " + user, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                                if (pagarFactura == 0) {
                                                    JOptionPane.showMessageDialog(null, "Gracias por su compra y su preferencia");
                                                    System.exit(0);
                                                }
                                                break;
                                            case 2:
                                                //Para pagar por sinpe
                                                pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + purchasedAmount1 + " Toneladas " + "  Precio: " + price1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + purchasedAmount2 + " Toneladas " + "  Precio: " + price2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + purchasedAmount3 + " Toneladas " + "  Precio: " + price3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.SINPE + "   El total a pagar seria de: " + totalPrice + " Dolares\n" + "¿Desea finalizar la compra?",
                                                        "Factura a nombre de: " + user + "  Fecha actual: ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                                if (pagarFactura == 0) {
                                                    JOptionPane.showMessageDialog(null, "Gracias por su compra y su preferencia");
                                                    System.exit(0);
                                                }
                                                break;
                                            case 3:
                                                //Para pagar con tarjeta
                                                pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + purchasedAmount1 + " Toneladas " + "  Precio: " + price1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + purchasedAmount2 + " Toneladas " + "  Precio: " + price2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + purchasedAmount3 + " Toneladas " + "  Precio: " + price3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.CARD + "   El total a pagar seria de: " + totalPrice + " Dolares\n" + "¿Desea finalizar la compra?",
                                                        "Factura a nombre de: " + user + " Factura del dia ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                                if (pagarFactura == 0) {
                                                    JOptionPane.showMessageDialog(null, "Gracias por su compra y su preferencia");
                                                    System.exit(0);
                                                }
                                                break;
                                            case 4:
                                                //Si se va a dar un credito por la compra
                                                pagarFactura = JOptionPane.showConfirmDialog(null, "Producto: Arena " + "  Cantidad: " + purchasedAmount1 + " Toneladas " + "  Precio: " + price1 + " Dolares\n"
                                                        + "Producto: piedra caurta " + "  Cantidad: " + purchasedAmount2 + " Toneladas " + "  Precio: " + price2 + " Dolares\n"
                                                        + "Producto: polvo de piedra " + "  Cantidad: " + purchasedAmount3 + " Toneladas " + "  Precio: " + price3 + " Dolares\n"
                                                        + "Metodo de pago: " + BillingMethods.CREDIT + "   El total a pagar seria de: " + totalPrice + " Dolares\n" + "¿Desea finalizar la compra?",
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

                            if (state == false) {
                                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectas");
                            }
                        }
                    }
                    break;

                case 2:
                    //Inicio de sesion para los administradores
                    user = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
                    passw = JOptionPane.showInputDialog(null, "Digite su contraseña");
                    //Va a verificar si los datos ingresados son iguales a los que ya están registrados 
                    for (int i = 0; i < admi.length; i++) {
                        if (admi[i].username.equals(user) && admi[i].password.equals(passw)) {
                            JOptionPane.showMessageDialog(null, "Usuario de Administrador correcto");
                            state = true;
                            do {
                                //Menú para las funciones del administrador
                                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea realizar\n"
                                        + "1. Generar explosión\n 2. Mostrar usuarios registrados\n 3.Salir"));
                                switch (option) {
                                    case 1:
                                        do {
                                            //Generar la explosion
                                            option1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea Realizar?\n"
                                                    + "1. Realizar la explosion\n 2. Ver estado de los cuadrantes \n 3. Salir"));
                                            switch (option1) {
                                                case 1:
                                                    inventary[0].productInventary = inventary[0].productInventary + 100;
                                                    inventary[1].productInventary = inventary[1].productInventary + 100;
                                                    inventary[2].productInventary = inventary[2].productInventary + 100;
                                                    JOptionPane.showMessageDialog(null, "Explosion realizada correctamente\nInventario actualizado");
                                                    break;

                                                case 2:
                                                    //Mostrar el estado de los cuadrantes
                                                    Terrain.mostrarCuadrantes();
                                                    break;

                                            } 
                                        } while (option1 != 3);
                                        break;
                                        case 2:
                                    JOptionPane.showMessageDialog(null, aplicante);
                                    break;
                                }
                            } while (option != 2);
                        }
                    }
                    break;

            }
        } while (option3 != 3);
    }
}