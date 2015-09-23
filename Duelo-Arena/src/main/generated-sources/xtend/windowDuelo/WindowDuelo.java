package windowDuelo;

import controladores.ControladorDenuncia;
import controladores.ControladorDuelo;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import windowDenuncia.WindowDenuncia;

@SuppressWarnings("all")
public class WindowDuelo extends TransactionalDialog<ControladorDuelo> {
  public WindowDuelo(final WindowOwner owner, final ControladorDuelo model) {
    super(owner, model);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
  
  public void createContents(final Panel panel) {
    this.setTitle("Duelo!");
    VerticalLayout _verticalLayout = new VerticalLayout();
    panel.setLayout(_verticalLayout);
    ColumnLayout _columnLayout = new ColumnLayout(2);
    panel.setLayout(_columnLayout);
    final Panel panelJugador1 = new Panel(panel);
    VerticalLayout _verticalLayout_1 = new VerticalLayout();
    panelJugador1.setLayout(_verticalLayout_1);
    Label _label = new Label(panelJugador1);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Nombre de Usuario");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(panelJugador1);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("nombre1");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    Label _label_2 = new Label(panelJugador1);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Personaje");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_2);
    Label _label_3 = new Label(panelJugador1);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("personaje1");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_3);
    Label _label_4 = new Label(panelJugador1);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Linea");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_4);
    Label _label_5 = new Label(panelJugador1);
    final Procedure1<Label> _function_5 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("linea1");
        Label _label = new Label(panelJugador1);
        final Procedure1<Label> _function = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.setText("puntaje");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
        Label _label_1 = new Label(panelJugador1);
        final Procedure1<Label> _function_1 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.<Object, ControlBuilder>bindValueToProperty("puntaje1");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
        final Panel panelJugador2 = new Panel(panel);
        VerticalLayout _verticalLayout = new VerticalLayout();
        panelJugador2.setLayout(_verticalLayout);
        Label _label_2 = new Label(panelJugador2);
        final Procedure1<Label> _function_2 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.setText("Nombre de Usuario");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_2);
        Label _label_3 = new Label(panelJugador2);
        final Procedure1<Label> _function_3 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.<Object, ControlBuilder>bindValueToProperty("nombre2");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_3);
        Label _label_4 = new Label(panelJugador2);
        final Procedure1<Label> _function_4 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.setText("Personaje");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_4);
        Label _label_5 = new Label(panelJugador2);
        final Procedure1<Label> _function_5 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.<Object, ControlBuilder>bindValueToProperty("personaje2");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_5);
        Label _label_6 = new Label(panelJugador2);
        final Procedure1<Label> _function_6 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.setText("Linea");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_6, _function_6);
        Label _label_7 = new Label(panelJugador2);
        final Procedure1<Label> _function_7 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.<Object, ControlBuilder>bindValueToProperty("linea2");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_7, _function_7);
        Label _label_8 = new Label(panelJugador2);
        final Procedure1<Label> _function_8 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.setText("puntaje");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_8, _function_8);
        Label _label_9 = new Label(panelJugador2);
        final Procedure1<Label> _function_9 = new Procedure1<Label>() {
          public void apply(final Label it) {
            it.<Object, ControlBuilder>bindValueToProperty("puntaje2");
          }
        };
        ObjectExtensions.<Label>operator_doubleArrow(_label_9, _function_9);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_5);
    Label _label_6 = new Label(panel);
    final Procedure1<Label> _function_6 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("ganador");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_6, _function_6);
    Label _label_7 = new Label(panel);
    final Procedure1<Label> _function_7 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("nombreGanador");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_7, _function_7);
    final Panel panelBotones = new Panel(panel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelBotones.setLayout(_horizontalLayout);
    Button _button = new Button(panelBotones);
    final Procedure1<Button> _function_8 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Denunciar");
        final Action _function = new Action() {
          public void execute() {
            WindowDuelo.this.comenzarDenuncia();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_8);
    Button _button_1 = new Button(panelBotones);
    final Procedure1<Button> _function_9 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Irse con Dignidad");
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_9);
    this.comenzarDuelo();
  }
  
  public String comenzarDuelo() {
    ControladorDuelo _modelObject = this.getModelObject();
    return _modelObject.comenzarDuelo();
  }
  
  public void comenzarDenuncia() {
    ControladorDuelo _modelObject = this.getModelObject();
    ControladorDenuncia _comenzarDenuncia = _modelObject.comenzarDenuncia();
    WindowDenuncia _windowDenuncia = new WindowDenuncia(this, _comenzarDenuncia);
    this.openDialog(_windowDenuncia);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    dialog.open();
  }
}
