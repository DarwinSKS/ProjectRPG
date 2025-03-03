package GestionJoueur.Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import GestionJoueur.Classes;

public class TestClasses {

    @Test
    public void testSelectionnerGuerrier(){
        Classes classes = new Classes();
        classes.selectionnerClasse("Guerrier");
        assertEquals("Guerrier", classes.getNom());
        assertEquals(150, classes.getPv());
        assertEquals(50, classes.getPm());
        assertEquals(15, classes.getForce());
        assertEquals(5, classes.getIntelligence());
        assertEquals(12, classes.getDef());
        assertEquals(6, classes.getResMagique());
        assertEquals(8, classes.getAgilite());
        assertEquals(5, classes.getChance());
        assertEquals(10, classes.getEnd());
        assertEquals(4, classes.getEsprit());
    }

    @Test
    public void testSelectionnerVoleur(){
        Classes classes = new Classes();
        classes.selectionnerClasse("Voleur");
        assertEquals("Voleur", classes.getNom());
        assertEquals(110, classes.getPv());
        assertEquals(70, classes.getPm());
        assertEquals(10, classes.getForce());
        assertEquals(7, classes.getIntelligence());
        assertEquals(8, classes.getDef());
        assertEquals(7, classes.getResMagique());
        assertEquals(15, classes.getAgilite());
        assertEquals(12, classes.getChance());
        assertEquals(7, classes.getEnd());
        assertEquals(6, classes.getEsprit());
    }

    @Test
    public void testSelectionnerMage(){
        Classes classes = new Classes();
        classes.selectionnerClasse("Mage");
        assertEquals("Mage", classes.getNom());
        assertEquals(90, classes.getPv());
        assertEquals(150, classes.getPm());
        assertEquals(4, classes.getForce());
        assertEquals(15, classes.getIntelligence());
        assertEquals(5, classes.getDef());
        assertEquals(12, classes.getResMagique());
        assertEquals(7, classes.getAgilite());
        assertEquals(6, classes.getChance());
        assertEquals(5, classes.getEnd());
        assertEquals(10, classes.getEsprit());
    }

    @Test
    public void testSelectionnerErreur(){
        Classes classes = new Classes();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> classes.selectionnerClasse("Test"));
        assertEquals("Classe inconnue : Test", exception.getMessage());
    }

    @Test
    public void testAfficherClasses() {
        Classes classes = new Classes();
        String expected = "Guerrier\nMage\nVoleur\n";
        assertEquals(expected, classes.afficherClasses());
    }

}
