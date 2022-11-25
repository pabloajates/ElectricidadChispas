package com.Pajates.electricidadChispas;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Autonomo
        Autonomus autonomo = new Autonomus();
        autonomo.setDni("1");
        autonomo.setName("Pablo");
        autonomo.setSurname("Perez");
        autonomo.setAddress("calle guapo");
        autonomo.setEmail("hola@gmail.com");
        autonomo.setTown("avila");
        autonomo.setProvince("avila");
        autonomo.setPhone("734752959");

        System.out.println(autonomo.getId());
        System.out.println(autonomo.getName());
        System.out.println(autonomo.getAddress());
        System.out.println(autonomo.getTown());
        System.out.println(autonomo.getEmail());
        System.out.println(autonomo.getProvince());
        System.out.println(autonomo.getPhone());

        //Sociedad
        Society sociedad = new Society();
        sociedad.setCif("");
        sociedad.setEnterpriseName("");
        sociedad.setAddress("");
        sociedad.setEmail("");
        sociedad.setTown("");
        sociedad.setProvince("");
        sociedad.setPhone("");

        System.out.println(sociedad.getId());
        System.out.println(sociedad.getName());
        System.out.println(sociedad.getAddress());
        System.out.println(sociedad.getTown());
        System.out.println(sociedad.getEmail());
        System.out.println(sociedad.getProvince());
        System.out.println(sociedad.getPhone());


        //Producto
        Product producto = new Product();
        producto.setIdProduct("");
        producto.setName("");
        producto.setPrice("");
        producto.setIvaType("");

        System.out.println(producto.getId());
        System.out.println(producto.getName());
        System.out.println(producto.getPrice());
        System.out.println(producto.getIvaType());


        //Servicios
        Service service = new Service();
        service.setIdService("");
        service.setName(autonomo);
        service.setPrice("");
        service.setIvaType("");

        System.out.println(service.getId());
        System.out.println(service.getName());
        System.out.println(service.getPrice());
        System.out.println(service.getIvaType());


        //factura autonomo
        Invoice factura = new Invoice();
        factura.setIdInvoice(1);
        factura.setDate("");
        factura.setClient(autonomo);
        factura.setProduct(producto);
        factura.setService(service);
        factura.setBaseImponible(entrada.nextLine());
        factura.setTotal(entrada.nextLine());

        //factura sociedad
        Invoice factura1 = new Invoice();
        factura1.setIdInvoice(1);
        factura1.setDate("");
        factura1.setClient(sociedad);
        factura1.setProduct(producto);
        factura1.setService(service);
        factura1.setBaseImponible(entrada.nextLine());
        factura1.setTotal(entrada.nextLine());


        System.out.println("Id factura: " + factura1.getIdInvoice());
        System.out.println("Fecha factura: " + factura1.getDate());
        System.out.println("CLIENTE: ");
        System.out.println("cif/nif: " + factura1.getClient() +getI);
        System.out.println("nombre: " + factura1.getClient().getName());
        System.out.println("direccion: " + factura1.getClient().getAddress());
        System.out.println("poblacion: " + factura1.getClient().getTown());
        System.out.println("provincia: " + factura1.getClient().getProvince());
        System.out.println("email: " + factura1.getClient().getEmail());
        System.out.println("VENTA: ");
        System.out.println("codigo: " + factura1.getProduct().getId());
        System.out.println("nombre: " + factura1.getProduct().getName());
        System.out.println("precio: " + factura1.getProduct().getPrecio());
        System.out.println("tipo IVA: " + factura1.getProduct().getIva());
        System.out.println("--------------");
        System.out.println("codigo: " + factura1.getService().getId());
        System.out.println("nombre: " + factura1.getService().getName());
        System.out.println("precio: " + factura1.getService().getPrecio());
        System.out.println("tipo IVA: " + factura1.getService().getIva());
        System.out.println("TOTAL: ");
        System.out.println("Total: " + (factura1.getProduct().getPrecio())+factura1.getService().getPrecio());

    }
}
