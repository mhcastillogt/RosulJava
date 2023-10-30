package TipoCambioRosul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gt.gob.banguat.variables.ws.TipoCambioSoap;

class TipoCambioSoapTest {

	@Test
	void testTipoCambioDia() {
		gt.gob.banguat.variables.ws.TipoCambioSoap servicio = new gt.gob.banguat.variables.ws.TipoCambio().getTipoCambioSoap();
		gt.gob.banguat.variables.ws.InfoVariable Resultado =servicio.tipoCambioDia();
		System.out.print(Resultado);
		assertTrue (1 == 1);
	}

}
