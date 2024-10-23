import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ClubDeportivoTest {

    @BeforeEach
    void setUp(){
        ClubDeportivo club1 = new ClubDeportivo("Temuco");
        Entrenador entrenadorEquipo1 = new Entrenador("david","poca","futbol");
        Equipo equipo1 = new Equipo("dep temuco","futbol",entrenadorEquipo1);
    }
    @Test
    void agregarEquipo() {
        assertTrue(ClubDeportivo);
    }

    @Test
    void buscarEquipo() {
    }
}