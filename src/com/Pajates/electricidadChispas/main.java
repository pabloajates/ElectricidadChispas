package com.Pajates.electricidadChispas;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Autonomo
        System.out.println("Autonomo");
        Autonomus autonomo = new Autonomus();
        System.out.println("Dni: ");
        autonomo.setDni(sc.next());
        System.out.println("Nombre: ");
        autonomo.setName(sc.next());
        System.out.println("Apellidos: ");
        autonomo.setSurname(sc.next());
        System.out.println("Direccion postal: ");
        autonomo.setAddress(sc.next());
        System.out.println("Poblacion: ");
        autonomo.setTown(sc.next());
        System.out.println("Provincia: ");
        autonomo.setProvince(sc.next());
        System.out.println("Email: ");
        autonomo.setEmail(sc.next());
        System.out.println("Telefono: ");
        autonomo.setPhone(sc.next());
        System.out.println(" ");

        //Sociedad
        System.out.println("Sociedades");
        Society sociedad = new Society();
        System.out.println("Cif:");
        sociedad.setCif(sc.next());
        System.out.println("Nombre:");
        sociedad.setEnterpriseName(sc.next());
        System.out.println("Direccion postal:");
        sociedad.setAddress(sc.next());
        System.out.println("Poblacion:");
        sociedad.setTown(sc.next());
        System.out.println("Provincia:");
        sociedad.setProvince(sc.next());
        System.out.println("Email:");
        sociedad.setEmail(sc.next());
        System.out.println("Telefono:");
        sociedad.setPhone(sc.next());
        System.out.println(" ");

        //Producto1
        System.out.println("Primer producto");
        Product producto = new Product();
        System.out.println("Id:");
        producto.setIdProduct(sc.next());
        System.out.println("Nombre:");
        producto.setName(sc.next());
        System.out.println("Precio:");
        producto.setPrice(sc.next());
        System.out.println("Iva: ");
        producto.setIvaType(sc.next());
        System.out.println(" ");

        //Producto2
        System.out.println("Segundo productos");
        Product producto1 = new Product();
        System.out.println("Id:");
        producto1.setIdProduct(sc.next());
        System.out.println("Nombre:");
        producto1.setName(sc.next());
        System.out.println("Precio:");
        producto1.setPrice(sc.next());
        System.out.println("Iva: ");
        producto1.setIvaType(sc.next());
        System.out.println(" ");

        //Servicios1
        System.out.println("Primer servicio");
        Service servicio = new Service();
        System.out.println("Id:");
        servicio.setIdService(sc.next());
        System.out.println("Nombre:");
        servicio.setName(sc.next());
        System.out.println("Precio:");
        servicio.setPrice(sc.next());
        System.out.println("Iva: ");
        servicio.setIvaType(sc.next());
        System.out.println(" ");

        //Servicios2
        System.out.println("Segundo servicios");
        Service service1 = new Service();
        System.out.println("Id:");
        service1.setIdService(sc.next());
        System.out.println("Nombre:");
        service1.setName(sc.next());
        System.out.println("Precio:");
        service1.setPrice(sc.next());
        System.out.println("Iva: ");
        service1.setIvaType(sc.next());
        System.out.println(" ");


        //factura autonomo
        System.out.println("Factura autonomo");
        Invoice factura = new Invoice();
        System.out.println("Id: ");
        factura.setIdInvoice(sc.nextInt());
        System.out.println("Fecha: ");
        factura.setDate(sc.nextLine());
        System.out.println("Cliente: ");
        factura.setClient(autonomo);
        factura.setProducto(producto);
        factura.setServicio(service1);
        System.out.println("Base Imponible: ");
        System.out.println("Total");
        System.out.println(" ");

        //factura sociedad
        System.out.println("Factura sociedad");
        Invoice factura1 = new Invoice();
        System.out.println("Id: ");
        factura1.setIdInvoice(sc.nextInt());
        System.out.println("Fecha: ");
        factura1.setDate(sc.nextLine());
        System.out.println("Cliente: ");
        factura1.setClient(autonomo);
        factura1.setProducto(producto);
        factura1.setServicio(servicio);
        System.out.println("Base Imponible: " +producto1.getPrice() +" + "+servicio.getPrice());
        System.out.println("Total: " +producto.getPrice() +" + " +service1.getPrice() +" + IVA = " );
        System.out.println(" ");


        //Impresion factura
        System.out.println("Impresion de 1º factura");
        InvoicePrinter.print(factura);

        //Impresion factura2
        System.out.println("Impresion de 2º factura");
        InvoicePrinter.print(factura1);
    }
}
