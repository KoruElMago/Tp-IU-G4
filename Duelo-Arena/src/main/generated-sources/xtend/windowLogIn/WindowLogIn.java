package windowLogIn;

import Core.DueloEntreLeyendas;
import Jugador.Estadisticas;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import TarjetaDeDuelo.TarjetaDeDuelo;
import controladores.ControladorDueloEntreLeyendas;
import controladores.ControladorUsuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import usuario.Usuario;
import windowPrincipal.WindowPrincipal;

@SuppressWarnings("all")
public class WindowLogIn extends MainWindow<ControladorDueloEntreLeyendas> {
  public WindowLogIn(final ControladorDueloEntreLeyendas model) {
    super(model);
  }
  
  public void createContents(final Panel panel) {
    this.setTitle("Duelo de leyendas");
    VerticalLayout _verticalLayout = new VerticalLayout();
    panel.setLayout(_verticalLayout);
    Label _label = new Label(panel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Duelo de leyendas");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    final Panel panelUsuario = new Panel(panel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelUsuario.setLayout(_horizontalLayout);
    Label _label_1 = new Label(panelUsuario);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Nombre de Usuario");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    TextBox _textBox = new TextBox(panelUsuario);
    final Procedure1<TextBox> _function_2 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.<Object, ControlBuilder>bindValueToProperty("nombreUsuario");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_2);
    final Panel panelContraseña = new Panel(panel);
    HorizontalLayout _horizontalLayout_1 = new HorizontalLayout();
    panelContraseña.setLayout(_horizontalLayout_1);
    Label _label_2 = new Label(panelContraseña);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Contraseña");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_3);
    TextBox _textBox_1 = new TextBox(panelContraseña);
    final Procedure1<TextBox> _function_4 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.setWidth(200);
        it.<Object, ControlBuilder>bindValueToProperty("contraseñaUsuario");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_4);
    Label _label_3 = new Label(panel);
    final Procedure1<Label> _function_5 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(200);
        it.setForeground(Color.RED);
        it.<Object, ControlBuilder>bindValueToProperty("mensajeLogIn");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_5);
    final Panel panelBotones = new Panel(panel);
    HorizontalLayout _horizontalLayout_2 = new HorizontalLayout();
    panelBotones.setLayout(_horizontalLayout_2);
    ColumnLayout _columnLayout = new ColumnLayout(2);
    panelBotones.setLayout(_columnLayout);
    Button _button = new Button(panelBotones);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Log In");
        final Action _function = new Action() {
          public void execute() {
            WindowLogIn.this.loguearUsuario();
          }
        };
        it.onClick(_function);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_6);
    Button _button_1 = new Button(panelBotones);
    final Procedure1<Button> _function_7 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Registrarse");
        final Action _function = new Action() {
          public void execute() {
            WindowLogIn.this.registrarUsuario();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_7);
  }
  
  public void loguearUsuario() {
    ControladorDueloEntreLeyendas _modelObject = this.getModelObject();
    boolean _puedoLoguear = _modelObject.puedoLoguear();
    if (_puedoLoguear) {
      ControladorDueloEntreLeyendas _modelObject_1 = this.getModelObject();
      ControladorUsuario _loguear = _modelObject_1.loguear();
      WindowPrincipal _windowPrincipal = new WindowPrincipal(this, _loguear);
      this.openDialog(_windowPrincipal);
    }
  }
  
  public void openDialog(final Dialog<?> dialog) {
    dialog.open();
  }
  
  public String registrarUsuario() {
    ControladorDueloEntreLeyendas _modelObject = this.getModelObject();
    return _modelObject.registrarUsuario();
  }
  
  public static void main(final String[] args) {
    final DueloEntreLeyendas del = new DueloEntreLeyendas();
    final Usuario user = new Usuario("unUsuario", "abc123");
    ArrayList<String> _arrayList = new ArrayList<String>();
    ArrayList<String> _arrayList_1 = new ArrayList<String>();
    final Personaje ashe = new Personaje("Ashe", Linea.Bottom, _arrayList, _arrayList_1);
    ArrayList<String> _arrayList_2 = new ArrayList<String>();
    ArrayList<String> _arrayList_3 = new ArrayList<String>();
    final Personaje amumu = new Personaje("Amumu", Linea.Jungle, _arrayList_2, _arrayList_3);
    ArrayList<String> _arrayList_4 = new ArrayList<String>();
    ArrayList<String> _arrayList_5 = new ArrayList<String>();
    final Personaje orianna = new Personaje("Orianna", Linea.Mid, _arrayList_4, _arrayList_5);
    ArrayList<String> _arrayList_6 = new ArrayList<String>();
    ArrayList<String> _arrayList_7 = new ArrayList<String>();
    final Personaje annie = new Personaje("Annie", Linea.Mid, _arrayList_6, _arrayList_7);
    ArrayList<String> _arrayList_8 = new ArrayList<String>();
    ArrayList<String> _arrayList_9 = new ArrayList<String>();
    final Personaje raven = new Personaje("Raven", Linea.Top, _arrayList_8, _arrayList_9);
    List<Personaje> _personajes = del.getPersonajes();
    _personajes.add(ashe);
    List<Personaje> _personajes_1 = del.getPersonajes();
    _personajes_1.add(amumu);
    List<Personaje> _personajes_2 = del.getPersonajes();
    _personajes_2.add(orianna);
    List<Personaje> _personajes_3 = del.getPersonajes();
    _personajes_3.add(annie);
    List<Personaje> _personajes_4 = del.getPersonajes();
    _personajes_4.add(raven);
    final Estadisticas est1 = new Estadisticas(ashe);
    final Estadisticas est2 = new Estadisticas(amumu);
    final Estadisticas est3 = new Estadisticas(orianna);
    final Estadisticas est4 = new Estadisticas(annie);
    final Estadisticas est5 = new Estadisticas(raven);
    Jugador _jugador = user.getJugador();
    List<Estadisticas> _estadisticas = _jugador.getEstadisticas();
    _estadisticas.add(est1);
    Jugador _jugador_1 = user.getJugador();
    List<Estadisticas> _estadisticas_1 = _jugador_1.getEstadisticas();
    _estadisticas_1.add(est2);
    Jugador _jugador_2 = user.getJugador();
    List<Estadisticas> _estadisticas_2 = _jugador_2.getEstadisticas();
    _estadisticas_2.add(est3);
    Jugador _jugador_3 = user.getJugador();
    List<Estadisticas> _estadisticas_3 = _jugador_3.getEstadisticas();
    _estadisticas_3.add(est4);
    Jugador _jugador_4 = user.getJugador();
    List<Estadisticas> _estadisticas_4 = _jugador_4.getEstadisticas();
    _estadisticas_4.add(est5);
    List<Usuario> _usuarios = del.getUsuarios();
    _usuarios.add(user);
    final Usuario user2 = new Usuario("usuario2", "123");
    Jugador _jugador_5 = user2.getJugador();
    List<Estadisticas> _estadisticas_5 = _jugador_5.getEstadisticas();
    _estadisticas_5.add(est1);
    Jugador _jugador_6 = user2.getJugador();
    List<Estadisticas> _estadisticas_6 = _jugador_6.getEstadisticas();
    _estadisticas_6.add(est2);
    Jugador _jugador_7 = user2.getJugador();
    List<Estadisticas> _estadisticas_7 = _jugador_7.getEstadisticas();
    _estadisticas_7.add(est3);
    Jugador _jugador_8 = user2.getJugador();
    List<Estadisticas> _estadisticas_8 = _jugador_8.getEstadisticas();
    _estadisticas_8.add(est4);
    Jugador _jugador_9 = user2.getJugador();
    List<Estadisticas> _estadisticas_9 = _jugador_9.getEstadisticas();
    _estadisticas_9.add(est5);
    final Usuario user3 = new Usuario("usuario3", "123");
    Jugador _jugador_10 = user3.getJugador();
    List<Estadisticas> _estadisticas_10 = _jugador_10.getEstadisticas();
    _estadisticas_10.add(est1);
    Jugador _jugador_11 = user3.getJugador();
    List<Estadisticas> _estadisticas_11 = _jugador_11.getEstadisticas();
    _estadisticas_11.add(est2);
    Jugador _jugador_12 = user3.getJugador();
    List<Estadisticas> _estadisticas_12 = _jugador_12.getEstadisticas();
    _estadisticas_12.add(est3);
    Jugador _jugador_13 = user3.getJugador();
    List<Estadisticas> _estadisticas_13 = _jugador_13.getEstadisticas();
    _estadisticas_13.add(est4);
    Jugador _jugador_14 = user3.getJugador();
    List<Estadisticas> _estadisticas_14 = _jugador_14.getEstadisticas();
    _estadisticas_14.add(est5);
    Jugador _jugador_15 = user.getJugador();
    final TarjetaDeDuelo t1 = new TarjetaDeDuelo(amumu, _jugador_15, Linea.Bottom);
    Jugador _jugador_16 = user2.getJugador();
    final TarjetaDeDuelo t2 = new TarjetaDeDuelo(ashe, _jugador_16, Linea.Mid);
    List<TarjetaDeDuelo> _buscadores = del.getBuscadores();
    _buscadores.add(t1);
    List<TarjetaDeDuelo> _buscadores_1 = del.getBuscadores();
    _buscadores_1.add(t2);
    ControladorDueloEntreLeyendas _controladorDueloEntreLeyendas = new ControladorDueloEntreLeyendas(del);
    WindowLogIn _windowLogIn = new WindowLogIn(_controladorDueloEntreLeyendas);
    _windowLogIn.startApplication();
  }
}
