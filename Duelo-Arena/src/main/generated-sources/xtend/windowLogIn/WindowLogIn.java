package windowLogIn;

import Core.DueloEntreLeyendas;
import controladores.ControladorDueloEntreLeyendas;
import controladores.ControladorUsuario;
import java.awt.Color;
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
    boolean _esUsuario = _modelObject.esUsuario();
    if (_esUsuario) {
      ControladorDueloEntreLeyendas _modelObject_1 = this.getModelObject();
      boolean _esContraseña = _modelObject_1.esContraseña();
      if (_esContraseña) {
        this.logueandoUsuario();
        ControladorDueloEntreLeyendas _modelObject_2 = this.getModelObject();
        _modelObject_2.setNombreUsuario("");
        ControladorDueloEntreLeyendas _modelObject_3 = this.getModelObject();
        _modelObject_3.setContraseñaUsuario("");
      } else {
        ControladorDueloEntreLeyendas _modelObject_4 = this.getModelObject();
        _modelObject_4.setMensajeLogIn("Contraseña Incorrecta. Vuelva a intentar");
        ControladorDueloEntreLeyendas _modelObject_5 = this.getModelObject();
        _modelObject_5.setNombreUsuario("");
        ControladorDueloEntreLeyendas _modelObject_6 = this.getModelObject();
        _modelObject_6.setContraseñaUsuario("");
      }
    } else {
      ControladorDueloEntreLeyendas _modelObject_7 = this.getModelObject();
      _modelObject_7.setMensajeLogIn("Usuario Inexistente");
      ControladorDueloEntreLeyendas _modelObject_8 = this.getModelObject();
      _modelObject_8.setNombreUsuario("");
      ControladorDueloEntreLeyendas _modelObject_9 = this.getModelObject();
      _modelObject_9.setContraseñaUsuario("");
    }
  }
  
  public void logueandoUsuario() {
    ControladorDueloEntreLeyendas _modelObject = this.getModelObject();
    ControladorUsuario _loguear = _modelObject.loguear();
    WindowPrincipal _windowPrincipal = new WindowPrincipal(this, _loguear);
    this.openDialog(_windowPrincipal);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    final Action _function = new Action() {
      public void execute() {
        ControladorDueloEntreLeyendas _modelObject = WindowLogIn.this.getModelObject();
        _modelObject.loguear();
      }
    };
    dialog.onAccept(_function);
    dialog.open();
  }
  
  public String registrarUsuario() {
    ControladorDueloEntreLeyendas _modelObject = this.getModelObject();
    return _modelObject.registrarUsuario();
  }
  
  public static void main(final String[] args) {
    final DueloEntreLeyendas del = new DueloEntreLeyendas();
    final Usuario user = new Usuario("unUsuario", "abc123");
    List<Usuario> _usuarios = del.getUsuarios();
    _usuarios.add(user);
    ControladorDueloEntreLeyendas _controladorDueloEntreLeyendas = new ControladorDueloEntreLeyendas(del);
    WindowLogIn _windowLogIn = new WindowLogIn(_controladorDueloEntreLeyendas);
    _windowLogIn.startApplication();
  }
}
