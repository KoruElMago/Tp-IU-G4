package ventanaEstadisticas;

import controladores.ControladorEstadisticas;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class WindowEstadistica extends TransactionalDialog<ControladorEstadisticas> {
  public WindowEstadistica(final WindowOwner owner, final ControladorEstadisticas model) {
    super(owner, model);
  }
  
  public void createContents(final Panel mainPanel) {
    final Panel panelPersonaje = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelPersonaje.setLayout(_horizontalLayout);
    Label _label = new Label(panelPersonaje);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Personaje:");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(panelPersonaje);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("nombre");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    final Panel panelPartidas = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_1 = new HorizontalLayout();
    panelPartidas.setLayout(_horizontalLayout_1);
    Label _label_2 = new Label(panelPartidas);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("cantidad de Duelos: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_2);
    Label _label_3 = new Label(panelPartidas);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("vecesQueInicio");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_3);
    final Panel panelKills = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_2 = new HorizontalLayout();
    panelKills.setLayout(_horizontalLayout_2);
    Label _label_4 = new Label(panelKills);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Kills: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_4);
    Label _label_5 = new Label(panelKills);
    final Procedure1<Label> _function_5 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("kills");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_5);
    final Panel panelDeads = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_3 = new HorizontalLayout();
    panelDeads.setLayout(_horizontalLayout_3);
    Label _label_6 = new Label(panelDeads);
    final Procedure1<Label> _function_6 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Deads: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_6, _function_6);
    Label _label_7 = new Label(panelDeads);
    final Procedure1<Label> _function_7 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("deads");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_7, _function_7);
    final Panel panelAssist = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_4 = new HorizontalLayout();
    panelAssist.setLayout(_horizontalLayout_4);
    Label _label_8 = new Label(panelAssist);
    final Procedure1<Label> _function_8 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Assists: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_8, _function_8);
    Label _label_9 = new Label(panelAssist);
    final Procedure1<Label> _function_9 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("assist");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_9, _function_9);
    final Panel panelVictorias = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_5 = new HorizontalLayout();
    panelVictorias.setLayout(_horizontalLayout_5);
    Label _label_10 = new Label(panelVictorias);
    final Procedure1<Label> _function_10 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Victorias: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_10, _function_10);
    Label _label_11 = new Label(panelVictorias);
    final Procedure1<Label> _function_11 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("victorias");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_11, _function_11);
    final Panel panelMejorLinea = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_6 = new HorizontalLayout();
    panelMejorLinea.setLayout(_horizontalLayout_6);
    Label _label_12 = new Label(panelMejorLinea);
    final Procedure1<Label> _function_12 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Mejor Linea: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_12, _function_12);
    Label _label_13 = new Label(panelMejorLinea);
    final Procedure1<Label> _function_13 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("mejorLinea");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_13, _function_13);
    final Panel panelUbicaciones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_7 = new HorizontalLayout();
    panelUbicaciones.setLayout(_horizontalLayout_7);
    Label _label_14 = new Label(panelUbicaciones);
    final Procedure1<Label> _function_14 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Ubicaciones: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_14, _function_14);
    List<Object> _list = new List<Object>(panelUbicaciones);
    final Procedure1<List<Object>> _function_15 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.<Object, ControlBuilder>bindValueToProperty("ubicaciones");
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function_15);
    final Panel panelCalificacion = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout_8 = new HorizontalLayout();
    panelCalificacion.setLayout(_horizontalLayout_8);
    Label _label_15 = new Label(panelCalificacion);
    final Procedure1<Label> _function_16 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Calificacion: ");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_15, _function_16);
    Label _label_16 = new Label(panelCalificacion);
    final Procedure1<Label> _function_17 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("calificacionEnDuelo");
        it.setFontSize(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_16, _function_17);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_18 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Volver");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            WindowEstadistica.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_18);
  }
  
  public static Object main(final String[] args) {
    return null;
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
}
