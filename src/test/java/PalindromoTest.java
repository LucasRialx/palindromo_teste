import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {
    @Test
    void deveRetornarTrueParaPalindromoSimples() {
        assertTrue(ValidadorPalindromo.isPalindromo("osso"));
        assertTrue(ValidadorPalindromo.isPalindromo("civic"));
    }

    @Test
    void deveRetornarTrueParaFrasePalindroma() {
        assertTrue(ValidadorPalindromo.isPalindromo("Madam, in Eden, I’m Adam"));
        assertTrue(ValidadorPalindromo.isPalindromo("A man a plan a canal Panama"));
    }

    @Test
    void deveRetornarFalseParaNaoPalindromo() {
        assertFalse(ValidadorPalindromo.isPalindromo("Cachorro"));
        assertFalse(ValidadorPalindromo.isPalindromo("palindromo"));
    }
}
