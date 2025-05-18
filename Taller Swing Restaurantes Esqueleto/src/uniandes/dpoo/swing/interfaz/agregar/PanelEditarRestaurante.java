package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	setLayout(new GridLayout(3, 1));
    	
        // Crea el campo para el nombre con una etiqueta al frente
    	JPanel panelNombres = new JPanel(new FlowLayout());
    	JLabel nombre = new JLabel("Nombre");
    	txtNombre = new JTextField(20);
    	panelNombres.add(nombre);
    	panelNombres.add(txtNombre);

        // Crea el selector para la calificación con una etiqueta al frente
    	JPanel panelCalificaciones = new JPanel(new FlowLayout());
    	JLabel calificacion = new JLabel("Calificacion");
    	cbbCalificacion = new JComboBox<String>();
    	for (int i = 1; i <= 5; i++) {
            cbbCalificacion.addItem(String.valueOf(i));
        }
    	panelCalificaciones.add(calificacion);
    	panelCalificaciones.add(cbbCalificacion);

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        JPanel panelVisitado = new JPanel(new FlowLayout());
    	JLabel visitado = new JLabel("Visitado");
    	cbbVisitado = new JComboBox<String>();
    	cbbVisitado.addItem("Sí");
        cbbVisitado.addItem("No");
    	panelVisitado.add(visitado);
    	panelVisitado.add(cbbVisitado);

        // Agregar todos los elementos al panel
    	add(panelNombres);
    	add(panelCalificaciones);
    	add(panelVisitado);
     
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        return cbbVisitado.getSelectedItem().equals("Sí");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText();
    }
}
