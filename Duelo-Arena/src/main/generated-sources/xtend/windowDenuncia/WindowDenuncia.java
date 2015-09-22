package windowDenuncia;

import Jugador.Jugador;
import controladores.ControladorDenuncia;
import controladores.ControladorJugador;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

@SuppressWarnings("all")
public class WindowDenuncia extends MainWindow<ControladorDenuncia> {
  public WindowDenuncia(final ControladorJugador denunciado, final ControladorJugador denunciante) {
    super(new ControladorDenuncia(denunciado, denunciante));
  }
  
  public void createContents(final Panel panel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method cancel is undefined for the type WindowDenuncia");
  }
  
  public static void main(final String[] args) {
    Jugador jug1 = new Jugador("magow");
    Jugador jug2 = new Jugador("pablinguis");
    ControladorJugador _controladorJugador = new ControladorJugador(jug1);
    ControladorJugador _controladorJugador_1 = new ControladorJugador(jug2);
    WindowDenuncia _windowDenuncia = new WindowDenuncia(_controladorJugador, _controladorJugador_1);
    _windowDenuncia.startApplication();
  }
}
