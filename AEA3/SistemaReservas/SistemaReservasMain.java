package AEA3.SistemaReservas;

import java.util.Scanner;

public class SistemaReservasMain{
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        
  
        Allotjament[] hotel = new Allotjament[4];
        hotel[0] = new Habitacio("Habitació 101", 3, 3);
        hotel[1] = new Apartament("Apartament Blue", 4, 2, true);
        hotel[2] = new CasaRural("Masia Verda", 6, true, false);
        hotel[3] = new Habitacio("Habitació 202", 1, 1);
        
        Allotjament[] hotelComplet = new Allotjament[5];
        System.arraycopy(hotel, 0, hotelComplet, 0, hotel.length);
        hotelComplet[4] = new CasaRural("Can Soler", 8, true, true);

        int opcio = 0;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");
            
            if (teclat.hasNextInt()) {
                opcio = teclat.nextInt();
                teclat.nextLine(); 
                
                switch (opcio) {
                    case 1:
                        for (Allotjament a : hotelComplet) {
                            if (a.isDisponible()) {
                                System.out.println(a.mostrarInformacio());
                            }
                        }
                        break;
                        
                    case 2:
                        System.out.print("Introdueix el nom de l'allotjament a reservar: ");
                        String nomReserva = teclat.nextLine();
                        boolean trobatReserva = false;
                        
                        for (Allotjament a : hotelComplet) {
                            if (a.getNom().equalsIgnoreCase(nomReserva)) {
                                trobatReserva = true;
                                if (a.reservar()) {
                                    System.out.println("Reservat correctament.");
                                } else {
                                    System.out.println("L'allotjament ja està reservat.");
                                }
                                break;
                            }
                        }
                        if (!trobatReserva) {
                            System.out.println("No s'ha trobat cap allotjament amb aquest nom.");
                        }
                        break;
                        
                    case 3:
                        System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
                        String nomAlliberar = teclat.nextLine();
                        boolean trobatAlliberar = false;
                        
                        for (Allotjament a : hotelComplet) {
                            if (a.getNom().equalsIgnoreCase(nomAlliberar)) {
                                trobatAlliberar = true;
                                a.alliberar();
                                System.out.println("Alliberat correctament.");
                                break;
                            }
                        }
                        if (!trobatAlliberar) {
                            System.out.println("No s'ha trobat cap allotjament amb aquest nom.");
                        }
                        break;
                        
                    case 4:
                        break; 
                        
                    default:
                        System.out.println("Opció no vàlida.");
                }
            } else {
                System.out.println("Si us plau, introdueix un número.");
                teclat.next(); 
            }
            
        } while (opcio != 4);
        
    }
}