package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	//solução MUITO RUIN validação no programa principal
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in: (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out: (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
		
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in: (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out: (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
	
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);
		}
		catch(ParseException e){
			System.out.println("Invalid date format!");
		}
		catch(DomainException e) {//captura exceção de argumento invalido e exibe a mensagem definida na classe reservation
			System.out.println("Error in reservation: "+ e.getMessage());
		}
		catch (RuntimeException e) {//trata qualque runtime exception que surgir fora do esperado 
			System.out.println("Unexpected error");
		}

		//23/09/2023
		//26/09/2023
		//24/09/2023
		//29/09/2023
		sc.close();
	}

}




