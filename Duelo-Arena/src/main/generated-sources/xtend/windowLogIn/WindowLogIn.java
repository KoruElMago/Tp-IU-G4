package windowLogIn;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.actions.MessageSend;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

@SuppressWarnings("all")
public class WindowLogIn extends MainWindow<Object> {
  public WindowLogIn(final Object model) {
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
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_4);
    final Panel panelBotones = new Panel(panel);
    HorizontalLayout _horizontalLayout_2 = new HorizontalLayout();
    panelBotones.setLayout(_horizontalLayout_2);
    ColumnLayout _columnLayout = new ColumnLayout(2);
    panelBotones.setLayout(_columnLayout);
    Button _button = new Button(panelBotones);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Log In");
        Object _modelObject = WindowLogIn.this.getModelObject();
        MessageSend _messageSend = new MessageSend(_modelObject, "convertir");
        it.onClick(_messageSend);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_5);
    Button _button_1 = new Button(panelBotones);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Registrarse");
        Object _modelObject = WindowLogIn.this.getModelObject();
        MessageSend _messageSend = new MessageSend(_modelObject, "registrarse");
        it.onClick(_messageSend);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_6);
  }
  
  public static void main(final String[] args) {
    WindowLogIn _windowLogIn = new WindowLogIn(String.class);
    _windowLogIn.startApplication();
  }
}
