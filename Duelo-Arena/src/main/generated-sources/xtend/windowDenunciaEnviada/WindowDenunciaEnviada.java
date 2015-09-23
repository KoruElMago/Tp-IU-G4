package windowDenunciaEnviada;

import controladores.ControladorDenunciaEnviada;
import java.awt.Color;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class WindowDenunciaEnviada extends TransactionalDialog<ControladorDenunciaEnviada> {
  public WindowDenunciaEnviada(final WindowOwner owner, final ControladorDenunciaEnviada model) {
    super(owner, model);
  }
  
  public void createContents(final Panel panel) {
    Label _label = new Label(panel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("tituloParaDenuncia");
        it.setBackground(Color.BLACK);
        it.setWidth(400);
        it.setHeight(50);
        it.setFontSize(20);
        it.setForeground(Color.WHITE);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(panel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("detalles");
        it.setFontSize(18);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    Button _button = new Button(panel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            WindowDenunciaEnviada.this.cancel();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
}
