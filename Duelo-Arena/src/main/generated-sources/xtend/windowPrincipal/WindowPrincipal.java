package windowPrincipal;

import controladores.ControladorUsuario;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;

@SuppressWarnings("all")
public class WindowPrincipal extends TransactionalDialog<ControladorUsuario> {
  public WindowPrincipal(final WindowOwner owner, final ControladorUsuario model) {
    super(owner, model);
  }
  
  public void createContents(final Panel panel) {
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
    Label _label_1 = new Label(panel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        ControladorUsuario _modelObject = WindowPrincipal.this.getModelObject();
        String _string = _modelObject.toString();
        String _plus = ("Usuario: " + _string);
        it.setText(_plus);
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    Button _button = new Button(panel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Buscar Duelo");
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Label _label_2 = new Label(panel);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("");
        it.setWidth(400);
        it.setHeight(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_3);
    Label _label_3 = new Label(panel);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Perfil");
        it.setWidth(400);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_4);
    final Panel panelPerfil = new Panel(panel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelPerfil.setLayout(_horizontalLayout);
    Button _button_1 = new Button(panelPerfil);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Personajes");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_5);
    Button _button_2 = new Button(panelPerfil);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Estadisticas");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_6);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
}
