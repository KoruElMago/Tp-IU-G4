package windowBuscadorDuelo;

import controladores.ControladorBuscadorDuelo;
import controladores.ControladorDuelo;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import windowDuelo.WindowDuelo;

@SuppressWarnings("all")
public class WindowBuscadorDuelo extends TransactionalDialog<ControladorBuscadorDuelo> {
  public WindowBuscadorDuelo(final WindowOwner owner, final ControladorBuscadorDuelo model) {
    super(owner, model);
  }
  
  public void createContents(final Panel panel) {
    Label _label = new Label(panel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("textoAMostrar");
        it.setText("Se ha encontr");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(panel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("¿Aceptas?");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    Button _button = new Button(panel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        final Action _function = new Action() {
          public void execute() {
            WindowBuscadorDuelo.this.cancel();
          }
        };
        it.onClick(_function);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Button _button_1 = new Button(panel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            WindowBuscadorDuelo.this.aceptarDuelo();
          }
        };
        it.onClick(_function);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
  }
  
  public void aceptarDuelo() {
    ControladorBuscadorDuelo _modelObject = this.getModelObject();
    ControladorDuelo _aceptarDuelo = _modelObject.aceptarDuelo();
    WindowDuelo _windowDuelo = new WindowDuelo(this, _aceptarDuelo);
    this.openDialog(_windowDuelo);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    final Action _function = new Action() {
      public void execute() {
        ControladorBuscadorDuelo _modelObject = WindowBuscadorDuelo.this.getModelObject();
        _modelObject.aceptarDuelo();
      }
    };
    dialog.onAccept(_function);
    dialog.open();
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
}
