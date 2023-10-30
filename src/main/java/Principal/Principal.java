package Principal;
import java.util.Scanner;

public class Principal {
	public static void main (String[] arg) {
		float Monto;
		Scanner Entrada = new Scanner(System.in);
		gt.gob.banguat.variables.ws.TipoCambioSoap servicio2 = new gt.gob.banguat.variables.ws.TipoCambio().getTipoCambioSoap();
		float TasaCambio = servicio2.tipoCambioDia().getCambioDolar().getVarDolar().get(0).getReferencia();
		
		System.out.println("Ingrese el Monto en Dolares:");
		Monto = Entrada.nextFloat();
		System.out.println("Tasa de Cambio: " + (TasaCambio));
		System.out.println("Total en Quetzales: " + (TasaCambio*Monto));
		
		
	}
}
