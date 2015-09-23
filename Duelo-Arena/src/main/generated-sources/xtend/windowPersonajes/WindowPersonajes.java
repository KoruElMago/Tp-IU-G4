package windowPersonajes;

import controladores.ControladorPersonaje;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class WindowPersonajes extends TransactionalDialog<ControladorPersonaje> {
  public WindowPersonajes(final WindowOwner owner, final ControladorPersonaje model) {
    super(owner, model);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
  
  public void createContents(final Panel mainPanel) {
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Personajes");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Selector<ControladorPersonaje> _selector = new Selector<ControladorPersonaje>(mainPanel);
    final Procedure1<Selector<ControladorPersonaje>> _function_1 = new Procedure1<Selector<ControladorPersonaje>>() {
      public void apply(final Selector<ControladorPersonaje> it) {
        it.allowNull(false);
        it.bindItemsToProperty("personajes");
        it.<Object, ControlBuilder>bindValueToProperty("unPersonaje");
      }
    };
    ObjectExtensions.<Selector<ControladorPersonaje>>operator_doubleArrow(_selector, _function_1);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Nombre:");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_2);
    Label _label_2 = new Label(mainPanel);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("nombre");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_3);
    Label _label_3 = new Label(mainPanel);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Rol Ideal:");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_4);
    Label _label_4 = new Label(mainPanel);
    final Procedure1<Label> _function_5 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("rolIdeal");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_5);
    Label _label_5 = new Label(mainPanel);
    final Procedure1<Label> _function_6 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Fortalezas: ");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_6);
    Label _label_6 = new Label(mainPanel);
    final Procedure1<Label> _function_7 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Debilidades: ");
        it.setWidth(400);
        it.setHeight(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_6, _function_7);
  }
}
