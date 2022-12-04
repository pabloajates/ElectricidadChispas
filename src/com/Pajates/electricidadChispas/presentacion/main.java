package com.Pajates.electricidadChispas.presentacion;


import com.Pajates.electricidadChispas.Data.*;
import com.Pajates.electricidadChispas.Domain.models.*;
import com.Pajates.electricidadChispas.Domain.useCase.Clients.AddCustomerUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Clients.DeleteCustomerUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Clients.GetCustomersUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Clients.UpdateCustomerUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Invoice.AddInvoiceUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Invoice.DeleteInvoiceUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Invoice.GetInvoiceUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Invoice.UpdateInvoiceUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Items.AddItemUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Items.DeleteItemUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Items.GetItemUseCase;
import com.Pajates.electricidadChispas.Domain.useCase.Items.UpdateItemUseCase;
import java.util.List;
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
        producto.setIdProduct(sc.nextInt());
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
        producto1.setIdProduct(sc.nextInt());
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
        servicio.setIdService(sc.nextInt());
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
        service1.setIdService(sc.nextInt());
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


        //CASOS DE USO CLIENTES

        CustomerDataStore customerDataStore = new MemCustomerDataStore();

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomo);
        addCustomerUseCase.execute(sociedad);

        GetCustomersUseCase getCustomersUseCase = new GetCustomersUseCase(customerDataStore);
        List<Client> customers = getCustomersUseCase.execute();
        for (int i = 0; i < customers.size(); i++){
           // printClient(customers.get(i));
        }

        System.out.println("-------ELIMINANDO-------");

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute(autonomo);
        List<Client> customers2 = getCustomersUseCase.execute();
        for (int i = 0; i <customers2.size(); i++)
          // printClient(customers2.get(i));

            System.out.println("----- Modificando la Sociedad ------");

        sociedad.setEmail("0000000000");
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase(customerDataStore);
        updateCustomerUseCase.execute(sociedad);
        List<Client> customers3 = getCustomersUseCase.execute();
        for (int i = 0; i < customers3.size(); i++) {
           // printClient(customers3.get(i));
        }


        //CASOS DE USO PRODUCTOS SERVICIOS

        ItemDataStore itemDataStore = new MemItemDataStore();

        AddItemUseCase addItemUseCase = new AddItemUseCase(itemDataStore);
        addItemUseCase.execute(producto);
        addItemUseCase.execute(service1);

        GetItemUseCase getItemUseCase = new GetItemUseCase(itemDataStore);
        List<Products_Service> productsServices = getItemUseCase.execute();
        for (int i = 0; i < productsServices.size(); i++){
           // printProducts_Service(productsService.get(i));
        }

        System.out.println("-------ELIMINANDO-------");

        DeleteItemUseCase deleteItemUseCase = new DeleteItemUseCase(itemDataStore);
        deleteItemUseCase.execute(producto);
        List<Products_Service> productsServices1 = getItemUseCase.execute();
        for (int i = 0; i <productsServices1.size(); i++)
            //printProducts_Service(productsService1.get(i));


            System.out.println("----- Modificando el producto------");

        producto1.setPrice("560");
        UpdateItemUseCase updateItemUseCase = new UpdateItemUseCase(itemDataStore);
        updateItemUseCase.execute(producto1);
        List<Products_Service> productsServices2 = getItemUseCase.execute();
        for (int i = 0; i < productsServices2.size(); i++) {
            // printProducts_Services(productsService2.get(i));
        }


        //CASOS DE USO FACTURAS

        InvoiceDataStore invoiceDataStore = new MemInvoiceDataStore();
        AddInvoiceUseCase addInvoiceUseCase = new AddInvoiceUseCase(invoiceDataStore);
        addInvoiceUseCase.execute(factura1);

        GetInvoiceUseCase getInvoiceUseCase = new GetInvoiceUseCase(invoiceDataStore);
        List<Invoice> invoice = getInvoiceUseCase.execute();
        for (int i = 0; i < invoice.size(); i++){
            // printInvoice(invoice.get(i));
        }

        System.out.println("-------ELIMINANDO-------");

        DeleteInvoiceUseCase deleteInvoiceUseCase = new DeleteInvoiceUseCase(invoiceDataStore);
        deleteInvoiceUseCase.execute(factura1);
        List<Invoice> invoice1 = getInvoiceUseCase.execute();
        for (int i = 0; i <invoice1.size(); i++)
            System.out.println(invoice1.get(i));


            System.out.println("----- Modificando el producto------");

        factura1.setDate("20-2-2022");
        UpdateInvoiceUseCase updateInvoiceUseCase = new UpdateInvoiceUseCase(invoiceDataStore);
        updateInvoiceUseCase.execute(factura1);
        List<Invoice> invoice2 = getInvoiceUseCase.execute();
        for (int i = 0; i < invoice2.size(); i++) {
           // printInvoice(invoice2.get(i));
        }



        //Impresion factura
        System.out.println("Impresion de 1º factura");
        InvoicePrinter.print(factura);

        //Impresion factura2
        System.out.println("Impresion de 2º factura");
        InvoicePrinter.print(factura1);
    }
}
