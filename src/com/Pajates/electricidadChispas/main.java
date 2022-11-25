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

        //Producto
        System.out.println("Productos");
        Product producto = new Product();
        System.out.println("Id:");
        producto.setIdProduct(sc.next());
        System.out.println("Nombre:");
        producto.setName(sc.next());
        System.out.println("Precio:");
        producto.setPrice(sc.next());
        System.out.println("Iva: ");
        producto.setIvaType(sc.next());

        //Servicios
        System.out.println("Servicios");
        Service service = new Service();
        System.out.println("Id:");
        producto.setIdProduct(sc.next());
        System.out.println("Nombre:");
        producto.setName(sc.next());
        System.out.println("Precio:");
        producto.setPrice(sc.next());
        System.out.println("Iva: ");
        producto.setIvaType(sc.next());
        System.out.println(" ");


        //factura autonomo
        System.out.println("Factura autonomo");
        Invoice factura = new Invoice();
        System.out.println("Id: ");
        factura.setIdInvoice(sc.nextInt());
        System.out.println("Fecha: ");
        factura.setDate(String.valueOf(sc.nextInt()));
        System.out.println("Cliente: ");
        factura.setClient(autonomo);
        factura.setProduct(producto);
        System.out.println("Base Imponible: ");
        factura.setBaseImponible(sc.nextLine());
        System.out.println("Total");
        factura.setTotal(sc.nextLine());
        System.out.println("");

        //factura sociedad
        System.out.println("Factura sociedad");
        Invoice factura1 = new Invoice();
        System.out.println("Id: ");
        factura1.setIdInvoice(sc.nextInt());
        System.out.println("Fecha: ");
        factura1.setDate(String.valueOf(sc.nextInt()));
        System.out.println("Cliente: ");
        factura1.setClient(autonomo);
        factura1.setProduct(producto);
        System.out.println("Base Imponible: ");
        factura1.setBaseImponible(sc.nextLine());
        System.out.println("Total");
        factura1.setTotal(sc.nextLine());
        System.out.println("");


        System.out.println("FACTURA-" +factura1.getIdInvoice());
        System.out.println("FECHA: " +factura1.getDate());
        System.out.println("CLIENTE:");
        System.out.println("cif/nif: " +factura1.getClient().getId());
        System.out.println("nombre: " +factura1.getClient().getName());
        System.out.println("direccion: " +factura1.getClient().getAddress());
        System.out.println("poblacion: " +factura1.getClient().getTown());
        System.out.println("provincia: " +factura1.getClient().getProvince());
        System.out.println("telefono: " +factura1.getClient().getPhone());
        System.out.println("email: " +factura1.getClient().getEmail());
        System.out.println("Producto:");
        System.out.println("codigo: " +factura1.getProduct().getId());
        System.out.println("nombre: " +factura1.getProduct().getName());
        System.out.println("precio: " +factura1.getProduct().getPrice());
        System.out.println("tipo IVA: " +factura1.getProduct().getIvaType());
        System.out.println("Servicio");
        System.out.println("codigo: " +factura1.getProduct().getId());
        System.out.println("nombre: " +factura1.getProduct().getName());
        System.out.println("precio: " +factura1.getProduct().getPrice());
        System.out.println("tipo IVA: " +factura1.getProduct().getIvaType());
        System.out.println("TOTAL:");
        System.out.println("Total: " +(factura1.getProduct().getPrice())+factura1.getProduct().getPrice());

    }
}
