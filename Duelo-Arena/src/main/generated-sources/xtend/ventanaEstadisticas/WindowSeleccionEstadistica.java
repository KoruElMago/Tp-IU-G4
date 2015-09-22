package ventanaEstadisticas;

import Jugador.Estadisticas;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import controladores.ControladorEstadisticas;
import controladores.ControladorJugador;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import ventanaEstadisticas.WindowEstadistica;

@SuppressWarnings("all")
public class WindowSeleccionEstadistica extends MainWindow<ControladorJugador> {
  public WindowSeleccionEstadistica(final ControladorJugador model) {
    super(model);
  }
  
  public void createContents(final Panel mainPanel) {
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Seleccione Personaje");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Selector<ControladorJugador> _selector = new Selector<ControladorJugador>(mainPanel);
    final Procedure1<Selector<ControladorJugador>> _function_1 = new Procedure1<Selector<ControladorJugador>>() {
      public void apply(final Selector<ControladorJugador> it) {
        it.allowNull(false);
        it.bindItemsToProperty("nombreEstadisticas");
        it.<Object, ControlBuilder>bindValueToProperty("nombrePersonaje");
      }
    };
    ObjectExtensions.<Selector<ControladorJugador>>operator_doubleArrow(_selector, _function_1);
    final Panel panelOpciones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelOpciones.setLayout(_horizontalLayout);
    Button _button = new Button(panelOpciones);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Ver Estadistica");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            WindowSeleccionEstadistica.this.abrirEstadistica();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cerrar");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            WindowSeleccionEstadistica.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    final Action _function = new Action() {
      public void execute() {
        ControladorJugador _modelObject = WindowSeleccionEstadistica.this.getModelObject();
        _modelObject.seleccionar();
      }
    };
    dialog.onAccept(_function);
    dialog.open();
  }
  
  public void abrirEstadistica() {
    ControladorJugador _modelObject = this.getModelObject();
    ControladorEstadisticas _seleccionar = _modelObject.seleccionar();
    WindowEstadistica _windowEstadistica = new WindowEstadistica(this, _seleccionar);
    this.openDialog(_windowEstadistica);
  }
  
  public static void main(final String[] args) {
    ArrayList<String> fort = new ArrayList<String>();
    ArrayList<String> deb = new ArrayList<String>();
    final Jugador jugador = new Jugador("TeemoTiamat");
    final List<Estadisticas> statics = jugador.getEstadisticas();
    Personaje _personaje = new Personaje("Amumu", Linea.Bottom, fort, deb);
    Estadisticas _estadisticas = new Estadisticas(_personaje);
    statics.add(_estadisticas);
    Personaje _personaje_1 = new Personaje("Ashe", Linea.Bottom, fort, deb);
    Estadisticas _estadisticas_1 = new Estadisticas(_personaje_1);
    statics.add(_estadisticas_1);
    jugador.setEstadisticas(statics);
    ControladorJugador _controladorJugador = new ControladorJugador(jugador);
    WindowSeleccionEstadistica _windowSeleccionEstadistica = new WindowSeleccionEstadistica(_controladorJugador);
    _windowSeleccionEstadistica.startApplication();
  }
}
