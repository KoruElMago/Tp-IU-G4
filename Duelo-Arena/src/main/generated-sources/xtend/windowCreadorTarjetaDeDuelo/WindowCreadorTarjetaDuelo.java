package windowCreadorTarjetaDeDuelo;

import controladores.ControladorDuelo;
import controladores.ControladorTarjetaDuelo;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import windowDuelo.WindowDuelo;

@SuppressWarnings("all")
public class WindowCreadorTarjetaDuelo extends TransactionalDialog<ControladorTarjetaDuelo> {
  public WindowCreadorTarjetaDuelo(final WindowOwner owner, final ControladorTarjetaDuelo model) {
    super(owner, model);
  }
  
  public void createContents(final Panel panel) {
    this.setTitle("Duelo de leyendas");
    VerticalLayout _verticalLayout = new VerticalLayout();
    panel.setLayout(_verticalLayout);
    Label _label = new Label(panel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Arma Tu Jugada ");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    final Panel panelSelector = new Panel(panel);
    VerticalLayout _verticalLayout_1 = new VerticalLayout();
    panelSelector.setLayout(_verticalLayout_1);
    Label _label_1 = new Label(panel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Elige tu personaje");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    Selector<ControladorTarjetaDuelo> _selector = new Selector<ControladorTarjetaDuelo>(panel);
    final Procedure1<Selector<ControladorTarjetaDuelo>> _function_2 = new Procedure1<Selector<ControladorTarjetaDuelo>>() {
      public void apply(final Selector<ControladorTarjetaDuelo> it) {
        it.allowNull(false);
        it.bindItemsToProperty("personajes");
        it.<Object, ControlBuilder>bindValueToProperty("personajeElegido");
      }
    };
    ObjectExtensions.<Selector<ControladorTarjetaDuelo>>operator_doubleArrow(_selector, _function_2);
    Label _label_2 = new Label(panel);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Elige tu rol");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_3);
    Selector<ControladorTarjetaDuelo> _selector_1 = new Selector<ControladorTarjetaDuelo>(panel);
    final Procedure1<Selector<ControladorTarjetaDuelo>> _function_4 = new Procedure1<Selector<ControladorTarjetaDuelo>>() {
      public void apply(final Selector<ControladorTarjetaDuelo> it) {
        it.allowNull(false);
        it.bindItemsToProperty("lineas");
        it.<Object, ControlBuilder>bindValueToProperty("lineaElegida");
      }
    };
    ObjectExtensions.<Selector<ControladorTarjetaDuelo>>operator_doubleArrow(_selector_1, _function_4);
    final Panel panelBotones = new Panel(panel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelBotones.setLayout(_horizontalLayout);
    Button _button = new Button(panelBotones);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("BuscarDuelo");
        final Action _function = new Action() {
          public void execute() {
            WindowCreadorTarjetaDuelo.this.buscarDuelo();
          }
        };
        it.onClick(_function);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_5);
    Button _button_1 = new Button(panelBotones);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        final Action _function = new Action() {
          public void execute() {
            WindowCreadorTarjetaDuelo.this.cancel();
          }
        };
        it.onClick(_function);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_6);
  }
  
  public void buscarDuelo() {
    ControladorTarjetaDuelo _modelObject = this.getModelObject();
    ControladorDuelo _buscarDuelo = _modelObject.buscarDuelo();
    WindowDuelo _windowDuelo = new WindowDuelo(this, _buscarDuelo);
    this.openDialog(_windowDuelo);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    final Action _function = new Action() {
      public void execute() {
        ControladorTarjetaDuelo _modelObject = WindowCreadorTarjetaDuelo.this.getModelObject();
        _modelObject.buscarDuelo();
      }
    };
    dialog.onAccept(_function);
    dialog.open();
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
