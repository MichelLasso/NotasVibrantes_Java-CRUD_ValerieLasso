/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajava;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class pruebaJava {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //datos
            clientes cliente1= new clientes(1, "Mario", "Lozano Perez", "mario23", "311234356");
            clientes cliente2= new clientes(2, "Ricardo", "Rojas Gelvez", "ricar1", "321234564");
            conciertos concierto1= new conciertos(1, "ACT: PROMISE", "TXT", "7 marzo 2025", "INCHEON", 193.000);
            conciertos concierto2= new conciertos(2, "OX1=LOVENSONG", "TXT", "8 marzo 2025", "LONDON", 300.000);
            conciertos concierto3 = new conciertos(3, "ACT PROMISE EP2", "TXT", "12 abril 2025", "OSAKA", 200.000);
            zonas zona1= new zonas(1, "Zona general", 500, 100.000);
            zonas zona2= new zonas(2, "Zona VIP", 50, 700.000);
            zonas zona3 = new zonas(3, "Zona pista", 100, 300.000);
            zonas zona4= new zonas(4, "Zona de gradas", 300, 100.000);
            ticket tike= new ticket(1, 1, 1, 1, 300.0, "14 enero 2025");
            
            //listas
            ArrayList<clientes> listClientes = new ArrayList<>();
            ArrayList<conciertos> listConciertos = new ArrayList<>();
            ArrayList<zonas> listZonas = new ArrayList<>();
            ArrayList<ticket> listTickets = new ArrayList<>();
            
            listConciertos.add(concierto1);
            listConciertos.add(concierto2);
            listConciertos.add(concierto3);
            listClientes.add(cliente1);
            listClientes.add(cliente2);
            listZonas.add(zona1);
            listZonas.add(zona2);
            listZonas.add(zona3);
            listZonas.add(zona4);
            listTickets.add(tike);
            System.out.println(concierto1);
            
            boolean menuPrincipal= true;
            while (menuPrincipal) {                
                System.out.println("----");
                System.out.println("Notas Vibrantes");
                System.out.println("----");
                System.out.println("1. Productora");
                System.out.println("2. Cliente");
                int opcionPrinciapal= scanner.nextInt();
                
                boolean menuProductora= true;
                while (menuProductora) {                    
                    
                    if (opcionPrinciapal==1) {
                        System.out.println("----");
                        System.out.println("Menu productora");
                        System.out.println("----");
                        System.out.println("1. Ver conciertos");
                        System.out.println("2. Listar los tickets vendidos de un concierto especifico");
                        System.out.println("3. Mostrar los conciertos de un cliente en especifico");
                        System.out.println("4. Ver tickets por cliente");
                        System.out.println("5. Registrar cliente");
                        System.out.println("6. Salir");
                        int opcionMenu= scanner.nextInt();
                        
                        if (opcionMenu==1) {
                            System.out.println("----");
                            System.out.println("Ver conciertos");
                            System.out.println("----");
                            for (conciertos con: listConciertos) {
                                System.out.println("--Concierto ID -> " + con.id + "--");
                                System.out.println("| Nombre del concierto: "+ con.nombre);
                                System.out.println("| Artista: " + con.artista);
                                System.out.println("| Fecha: " + con.fecha);
                                System.out.println("| Lugar: " + con.lugar);
                                System.out.println("| precio de compra: " + con.precioBase);
                            }
                            Thread.sleep(3000);
                            menuProductora=true;
                        } else if (opcionMenu==2) {
                            System.out.println("----");
                            System.out.println("Listar los tickets vendidos de un concierto especifico");
                            System.out.println("----");
                            
                            System.out.println("Ingrese el id del concierto: ");
                            int concierto= scanner.nextInt();
                            
                            for (conciertos c : listConciertos) {
                                if (c.id==concierto) {
                                    for (ticket t: listTickets) {
                                        if (t.id_concierto==c.id) {
                                            System.out.println("----");
                                            System.out.println("--TICKETS ID-->" + t.id);
                                            System.out.println("| Fecha compra :" + t.fechaCompra);
                                            System.out.println("| Zona :" + t.id_zona);
                                            System.out.println("| Precio Pagado : " + t.precioFinal);
                                            System.out.println("| Nombre del concierto: " + c.nombre);
                                            System.out.println("| ID del concierto: " + c.id);
                                            System.out.println("----");
                                        }
                                    }
                                }
                            }
                            Thread.sleep(3000);
                            menuProductora=true;
                        } else if(opcionMenu==3){
                            System.out.println("----");
                            System.out.println("Mostrar los conciertos de un cliente en especifico");
                            System.out.println("-----");
                            
                            System.out.println("Ingrese el ID del cliente: ");
                            int cliente= scanner.nextInt();
                            
                            for (ticket t : listTickets) {
                                if (t.id_cliente==cliente) {
                                    for (conciertos c : listConciertos) {
                                        if (t.id_concierto==c.id) {
                                            System.out.println("--Concierto ID -> " + c.id + "--");
                                            System.out.println("| Nombre del concierto: "+ c.nombre);
                                            System.out.println("| Artista: " + c.artista);
                                            System.out.println("| Fecha: " + c.fecha);
                                            System.out.println("| Lugar: " + c.lugar);
                                            System.out.println("| precio de compra: " + c.precioBase);
                                            for (clientes cl: listClientes) {
                                                if (cl.id==t.id_cliente) {
                                                    System.out.println("| Nombre del cliente: " + cl.nombre + cl.apellido);
                                                    System.out.println("| ID del cliente" + cl.id);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            
                            Thread.sleep(3000);
                            menuProductora=true;
                        } else if(opcionMenu==4){
                            System.out.println("----");
                            System.out.println("Ver tickets por cliente");
                            System.out.println("-----");
                            
                            System.out.println("Ingrese el ID del cliente: ");
                            int cliente= scanner.nextInt();
                            
                            for (ticket t : listTickets) {
                                if (t.id_cliente==cliente) {
                                    
                                    System.out.println("----");
                                        System.out.println("--TICKETS ID-->" + t.id + "--");
                                        System.out.println("| Fecha compra :" + t.fechaCompra);
                                        System.out.println("| Zona :" + t.id_zona);
                                        System.out.println("| Precio Pagado : " + t.precioFinal);
                                        for (conciertos c : listConciertos) {
                                            if (t.id_concierto==c.id) {
                                                System.out.println("| Nombre del concierto : " + c.nombre);
                                                System.out.println("| Artista : " + c.artista);
                                                System.out.println("| Lugar : " + c.lugar);
                                            }
                                        }
                                        for (clientes cl: listClientes) {
                                            if (cl.id==t.id_cliente) {
                                                System.out.println("| Nombre del cliente: " + cl.nombre + cl.apellido);
                                                System.out.println("| ID del cliente" + cl.id);
                                                System.out.println("----");
                                            }
                                        }
                                } 
                            }
                            Thread.sleep(3000);
                            menuProductora=true;
                        }   else if(opcionMenu==5){
                            System.out.println("----");
                            System.out.println("Ver tickets por cliente");
                            System.out.println("-----");
                            
                            System.out.println("Ingrese el identificador del cliente: ");
                            int cliente= scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Ingrese el nombre del cliente");
                            String name= scanner.nextLine();
                            System.out.println("Ingrese el apellido del cliente");
                            String apellido= scanner.nextLine();
                            System.out.println("Ingrese el correo del cliente");
                            String correo= scanner.nextLine();
                            System.out.println("Ingrese el teléfono del cliente");
                            String tel= scanner.nextLine();
                            
                            clientes clienteNew= new clientes(cliente, name, apellido, correo, tel);
                            listClientes.add(clienteNew);
                            System.out.println("----");
                            System.out.println(listClientes);
                            System.out.println("----");
                            
                            Thread.sleep(5000);
                            menuPrincipal=true;
                        } else if(opcionMenu==6){
                            System.out.println("----");
                            System.out.println("SALIENDO ....");
                            System.out.println("----");
                            Thread.sleep(3000);
                            menuPrincipal=true;
                        }
                    } else if(opcionPrinciapal==2){
                        System.out.println("----");
                        System.out.println("Menu clientes");
                        System.out.println("----");
                        System.out.println("1. Comprar ticket");
                        System.out.println("2. Cancelar ticket");
                        System.out.println("3. Ver tickets comprados");
                        System.out.println("4. Salir");
                        int opcionCliente= scanner.nextInt();
                        
                        if (opcionCliente==1) {
                            System.out.println("----");
                            System.out.println("Comprar tickets");
                            System.out.println("----");
                            System.out.println("Ingrese su id: ");
                            int idCliente= scanner.nextInt();
                            
                            for (clientes clien: listClientes) {
                                if (clien.id==idCliente) {
                                    System.out.println("----");
                                    System.out.println("-- Bienvenido " + clien.nombre + clien.apellido+ "--");
                                    System.out.println("----");
                                    System.out.println("Conciertos Disponibles ---->");
                                    //mostrar los conciertos
                                    for (conciertos con: listConciertos) {
                                        System.out.println("--Concierto ID -> " + con.id + "--");
                                        System.out.println("| Nombre del concierto: "+ con.nombre);
                                        System.out.println("| Artista: " + con.artista);
                                        System.out.println("| Fecha: " + con.fecha);
                                        System.out.println("| Lugar: " + con.lugar);
                                        System.out.println("| precio de compra: " + con.precioBase);
                                    }
                                        System.out.println("----");
                                        System.out.println("Ingres el ID del concierto: ");
                                        System.out.println("----");
                                        int clienteComprar= scanner.nextInt();
                                        
                                    for (conciertos con: listConciertos) {
                                        if (con.id==clienteComprar) {
                                            System.out.println("----");
                                            System.out.println("El concierto a comprar es->");
                                            System.out.println("| Nombre del concierto: "+ con.nombre);
                                            System.out.println("| precio de compra: " + con.precioBase);
                                            System.out.println("----");
                                            System.out.println("--- Zonas ---");
                                            for (zonas zon: listZonas) {
                                                System.out.println("---"+ zon.nombreZona + "---");
                                                System.out.println("| ID: " + zon.id);
                                                System.out.println("| Capacidad: " + zon.capacidad);
                                                System.out.println("| Precio de zona: " + zon.precioAdicional);
                                                System.out.println("----");
                                            }
                                            for (zonas zon: listZonas) {
                                                System.out.println("Ingrese el ID de la zona que deseas: ");
                                                int idZona= scanner.nextInt();
                                                if (zon.id==idZona) {
                                                    System.out.println("Ingrese la cantidad de tickets que desea comprar: ");
                                                    int cantTickets=scanner.nextInt();
                                                    
                                                    //calcular precios 
                                                    double precioTickets= con.precioBase * cantTickets;
                                                    double precioZona= zon.precioAdicional * cantTickets;
                                                    double totaalPago= precioTickets + precioZona;
                                                    System.out.println("----");
                                                    System.out.println("CONFIRMAR COMPRA");
                                                    System.out.println("----");
                                                    System.out.println("--Concierto ID -> " + con.id + "--");
                                                    System.out.println("| Nombre del concierto: "+ con.nombre);
                                                    System.out.println("| Artista: " + con.artista);
                                                    System.out.println("| Fecha: " + con.fecha);
                                                    System.out.println("| Lugar: " + con.lugar);
                                                    System.out.println("| Precio de zona individual: " + zon.precioAdicional);
                                                    System.out.println("| precio ticket individual: " + con.precioBase);
                                                    System.out.println("----");
                                                    System.out.println("-Varios Tickets-->");
                                                    System.out.println("| precio total de tickets: " + precioTickets + " Cantidad: " + cantTickets);
                                                    System.out.println("| precio total de zona: " + precioZona + " Cantidad: " + cantTickets);
                                                    System.out.println("-----");
                                                    System.out.println("TOTAL DE LA COMPRA");
                                                    System.out.println("| Precio total: " + totaalPago);
                                                    System.out.println("-----");
                                                    System.out.println("Confirma tu compra");
                                                    System.out.println("1. Comprar");
                                                    System.out.println("2. Cancelar");
                                                    int confirmar= scanner.nextInt();
                                                    
                                                    if (confirmar==1) {
                                                        if (cantTickets>1) {
                                                            for (int i = 0; i < cantTickets; i++) {
                                                                //fecha
                                                                LocalDateTime fecha = LocalDateTime.now();
                                                                DateTimeFormatter fechaF= DateTimeFormatter.ofPattern("yyyy-MM-dd HH: mm: ss");
                                                                String fechaCompra= fecha.format(fechaF);
                                                                ticket ticket2= new ticket(i+1, clien.id, con.id, zon.id, totaalPago, fechaCompra );
                                                                listTickets.add(ticket2);
                                                            }
                                                            System.out.println("----");
                                                            System.out.println("Compra realizada :))");
                                                            System.out.println("----");
                                                            System.out.println(listTickets);
                                                            break;
                                                        } else {
                                                            for (ticket tic: listTickets) {
                                                                //sumar id
                                                                int idNuevo =tic.id + 1;
                                                                //fecha
                                                                LocalDateTime fecha = LocalDateTime.now();
                                                                DateTimeFormatter fechaF= DateTimeFormatter.ofPattern("yyyy-MM-dd HH: mm: ss");
                                                                String fechaCompra= fecha.format(fechaF);
                                                                ticket ticket2= new ticket(idNuevo, clien.id, con.id, zon.id, totaalPago, fechaCompra );
                                                                
                                                            }
                                                            System.out.println("----");
                                                            System.out.println("Compra realizada :))");
                                                            System.out.println("----");
                                                            System.out.println(listTickets);
                                                            break;
                                                        }
                                                        
                                                    } else {
                                                        System.out.println("----");
                                                        System.out.println("Ticket cancelado con éxito :)");
                                                        System.out.println("----");
                                                        break;
                                                       
                                                    }
                                                } else {
                                                    System.out.println("ERROR: la zona no existe");
                                                    break;
                                                }
                                            }   
                                            
                                        }
                                    }
                                    
                                    
                                    
                                } else {
                                    break;
                                }
                            }
                            System.out.println("Por favor espere un momento, volverá al menú inicial :)");
                            Thread.sleep(3000);
                            menuPrincipal=true;
                        } else if (opcionCliente==2) {
                            System.out.println("----");
                            System.out.println("Cancelar tickets");
                            System.out.println("----");
                            System.out.println("Ingrese su id: ");
                            int idCliente= scanner.nextInt();
                            
                            for (clientes clien: listClientes) {
                                if (clien.id==idCliente) {
                                    System.out.println("----");
                                    System.out.println("-- Bienvenido " + clien.nombre + clien.apellido+ "--");
                                    System.out.println("----");
                                    
                                    for (ticket t : listTickets) {
                                        if (clien.id==t.id_cliente) {
                                            System.out.println("----");
                                            System.out.println("--TICKETS ID-->" + t.id + "--");
                                            System.out.println("| Fecha compra :" + t.fechaCompra);
                                            System.out.println("| Zona :" + t.id_zona);
                                            System.out.println("| Precio Pagado : " + t.precioFinal);
                                            System.out.println("----");
                                        }
                                    }
                                    
                                    System.out.println("Ingresa el id del ticket que deseas cancelar: ");
                                    int cancelarT = scanner.nextInt();
                                    
                                    for (ticket ti: listTickets) {
                                        if (ti.id==cancelarT) {
                                            int idNew= ti.id -1;
                                            listTickets.remove(idNew);
                                            System.out.println("Tickect cancelado con éxito :)");
                                            System.out.println(listTickets);
                                        }
                                        break;
                                    }
                                }
                            }
                            System.out.println("Por favor espere un momento, volverá al menú inicial :)");
                            Thread.sleep(3000);
                            menuPrincipal=true;
                        } else if (opcionCliente==3) {
                            System.out.println("----");
                            System.out.println("Tickets Comprados");
                            System.out.println("----");
                            System.out.println("Ingrese su id: ");
                            int idCliente= scanner.nextInt();
                            
                            for (clientes clien: listClientes) {
                                if (clien.id==idCliente) {
                                    System.out.println("----");
                                    System.out.println("-- Bienvenido " + clien.nombre + clien.apellido+ "--");
                                    System.out.println("----");
                                    
                                    for (ticket t : listTickets) {
                                        if (clien.id==t.id_cliente) {
                                            System.out.println("----");
                                            System.out.println("--TICKETS ID-->" + t.id + "--");
                                            System.out.println("| Fecha compra :" + t.fechaCompra);
                                            System.out.println("| Zona :" + t.id_zona);
                                            System.out.println("| Precio Pagado : " + t.precioFinal);
                                            for (conciertos c : listConciertos) {
                                                if (t.id_concierto==c.id) {
                                                    System.out.println("| Nombre del concierto : " + c.nombre);
                                                    System.out.println("| Artista : " + c.artista);
                                                    System.out.println("| Lugar : " + c.lugar);
                                                }
                                            }
                                            System.out.println("----");
                                        }
                                    }
                                }
                            }
                            Thread.sleep(3000);
                            menuPrincipal=true;
                        }else if(opcionCliente==4){
                            System.out.println("SALIENDO...");
                            Thread.sleep(3000);
                            menuPrincipal=true;
                            break;
                        } else {
                            System.out.println("ERROR : verifique el número ingresado");
                            System.out.println("Por favor espere un momento, volverá al menú inicial :)");
                            Thread.sleep(2000);
                            menuProductora=true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados :)");
        } finally {
            scanner.close();
        }
    }
    
}

