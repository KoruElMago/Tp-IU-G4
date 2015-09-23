package windowDuelo;

import controladores.ControladorDuelo;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.ControlBuilder;

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
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_5);
    final Panel panelJugador2 = new Panel(panel);
    VerticalLayout _verticalLayout_2 = new VerticalLayout();
    panelJugador2.setLayout(_verticalLayout_2);
    Label _label_6 = new Label(panelJugador2);
    final Procedure1<Label> _function_6 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Nombre de Usuario");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_6, _function_6);
    Label _label_7 = new Label(panelJugador2);
    final Procedure1<Label> _function_7 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("nombre2");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_7, _function_7);
    Label _label_8 = new Label(panelJugador2);
    final Procedure1<Label> _function_8 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Personaje");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_8, _function_8);
    Label _label_9 = new Label(panelJugador2);
    final Procedure1<Label> _function_9 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("personaje2");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_9, _function_9);
    Label _label_10 = new Label(panelJugador2);
    final Procedure1<Label> _function_10 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Linea");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_10, _function_10);
    Label _label_11 = new Label(panelJugador2);
    final Procedure1<Label> _function_11 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("linea2");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_11, _function_11);
  }
}
