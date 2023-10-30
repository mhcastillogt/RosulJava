package Principal;
import java.util.Scanner;

public class Principal {
	public static void main (String[] arg) {
		float Monto;
		String Fecha;
		Scanner Entrada = new Scanner(System.in);
		gt.gob.banguat.variables.ws.TipoCambioSoap servicio2 = new gt.gob.banguat.variables.ws.TipoCambio().getTipoCambioSoap();
		//float TasaCambio = servicio2.tipoCambioDia().getCambioDolar().getVarDolar().get(0).getReferencia();
		
		System.out.println("Ingrese Fecha de Tasa de Cambio (dd/mm/aaaa):");
		Fecha = Entrada.nextLine();
		
		System.out.println("Ingrese el Monto en Dolares:");
		Monto = Entrada.nextFloat();		
		
		float TasaCambio = servicio2.tipoCambioFechaInicial(Fecha).getVars().getVar().get(0).getVenta();
		
		
		System.out.println("Fecha de Tasa de Cambio: " + (Fecha));
		System.out.println("Tasa de Cambio: Q" + (TasaCambio));
		System.out.println("Total en Quetzales: Q" + (TasaCambio*Monto));		
	}
}
