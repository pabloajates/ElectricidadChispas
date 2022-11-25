package com.Pajates.electricidadChispas;

public class InvoicePrinter {

    public static void print(Invoice factura1) {

        System.out.println("Nº factura" + factura1.getIdInvoice());
        System.out.println("Fecha: " + factura1.getDate());
        System.out.println("CLIENTE");
        System.out.println("cif/nif: " + factura1.getClient().getId());
        System.out.println("nombre: " + factura1.getClient().getName());
        System.out.println("direccion: " + factura1.getClient().getAddress());
        System.out.println("poblacion: " + factura1.getClient().getTown());
        System.out.println("provincia: " + factura1.getClient().getProvince());
        System.out.println("telefono: " + factura1.getClient().getPhone());
        System.out.println("email: " + factura1.getClient().getEmail());
        System.out.println("Producto");
        System.out.println("codigo: " + factura1.getProductsService().getId());
        System.out.println("nombre: " + factura1.getProductsService().getName());
        System.out.println("precio: " + factura1.getProductsService().getPrice());
        System.out.println("tipo IVA: " + factura1.getProductsService().getIvaType());
        System.out.println("Servicio");
        System.out.println("codigo: " + factura1.getProductsService().getId());
        System.out.println("nombre: " + factura1.getProductsService().getName());
        System.out.println("precio: " + factura1.getProductsService().getPrice());
        System.out.println("tipo IVA: " + factura1.getProductsService().getIvaType());
        System.out.println(" ");
        System.out.println("Total: " + (factura1.getProductsService().getPrice()) + factura1.getProductsService().getPrice());
    }
    public static void print1 (Invoice factura) {

        System.out.println("Nº factura" + factura.getIdInvoice());
        System.out.println("Fecha: " + factura.getDate());
        System.out.println("CLIENTE");
        System.out.println("cif/nif: " + factura.getClient().getId());
        System.out.println("nombre: " + factura.getClient().getName());
        System.out.println("direccion: " + factura.getClient().getAddress());
        System.out.println("poblacion: " + factura.getClient().getTown());
        System.out.println("provincia: " + factura.getClient().getProvince());
        System.out.println("telefono: " + factura.getClient().getPhone());
        System.out.println("email: " + factura.getClient().getEmail());
        System.out.println("Producto");
        System.out.println("codigo: " + factura.getProductsService().getId());
        System.out.println("nombre: " + factura.getProductsService().getName());
        System.out.println("precio: " + factura.getProductsService().getPrice());
        System.out.println("tipo IVA: " + factura.getProductsService().getIvaType());
        System.out.println("Servicio");
        System.out.println("codigo: " + factura.getProductsService().getId());
        System.out.println("nombre: " + factura.getProductsService().getName());
        System.out.println("precio: " + factura.getProductsService().getPrice());
        System.out.println("tipo IVA: " + factura.getProductsService().getIvaType());
        System.out.println(" ");
        System.out.println("Total: " + (factura.getProductsService().getPrice()) + factura.getProductsService().getPrice());

    }
}
