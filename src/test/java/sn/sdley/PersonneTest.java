package sn.sdley;

import org.junit.jupiter.api.*;

public class PersonneTest {
    Personne personne;

    @BeforeEach
    public void setUp() {
        personne = new Personne("Samba", "25");
    }

    @AfterEach
    public void tearDown() {
        personne = null;
    }

    @Test
    @DisplayName("Test de la methode toString")
    public void testToString() {
        Assertions.assertEquals("Nom: Samba, Age: 25", personne.toString(),
                "La methode toString devrait retourner les objets au bon format !");
    }


}
