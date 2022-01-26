package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	//solução MUITO RUIN validação no programa principal
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in: (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out: (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		if(!checkOut.after(checkIn)) {//se o valor do checkout não for depois do checkin faça...
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in: (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out: (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			String error= reservation.updateDates(checkIn, checkOut);
			if(error!=null) {//se o valor retornado não for nulo significa que houve algum erro...
				System.out.println("Error in reservation: "+ error);
			}
			else { //senao apenas mostre os dados  do reservation
			System.out.println("Reservation: "+ reservation);
			}
		}
		//23/09/2023
		//26/09/2023
		//24/09/2023
		//29/09/2023
		sc.close();
	}

}




