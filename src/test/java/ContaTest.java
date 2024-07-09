import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import transferencia.Cliente;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente xuxa;
    Cliente Mai;
    Conta contaXuxa;
    Conta contaMai;

    @BeforeEach
    void setUp() {

        xuxa = new Cliente("xuxa", "21456987540", "246985231");
        Mai = new Cliente("Mai", "56954724563", "456321458");

        contaXuxa = new Conta ( "2222", "54451", 10.000, xuxa );
        contaMai = new Conta("2220", "65612", 15.000, Mai );

    }

    @Test

    public void realizarTransacao() {

        contaXuxa.realizarTransferencia(1.000,contaMai);
        assertEquals(9.000,contaXuxa.getSaldo());
        assertEquals(16.000,contaMai.getSaldo());
    }

    @Test
    public void validarTransferenciaInvalida() {
        boolean resultado = contaXuxa.realizarTransferencia(11.000,contaMai);
        assertFalse(resultado);
    }
}