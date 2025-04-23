import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {
    @Test
    void deveRetornarTrueParaPalindromoSimples() {
        assertTrue(ValidadorPalindromo.isPalindromo("arara"));
        assertTrue(ValidadorPalindromo.isPalindromo("osso"));
    }

    @Test
    void deveRetornarTrueParaFrasePalindroma() {
        assertTrue(ValidadorPalindromo.isPalindromo("A base do teto desaba"));
        assertTrue(ValidadorPalindromo.isPalindromo("Anotaram a data da maratona"));
    }

    @Test
    void deveRetornarFalseParaNaoPalindromo() {
        assertFalse(ValidadorPalindromo.isPalindromo("ana"));
        assertFalse(ValidadorPalindromo.isPalindromo("palindromo"));
    }
}
