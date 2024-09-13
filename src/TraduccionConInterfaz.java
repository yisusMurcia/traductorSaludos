import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TraduccionConInterfaz {
    private JFrame frame;
    private JLabel resultadoLabel;
    private JComboBox<String> opcionesComboBox;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TraduccionConInterfaz();
            }
        });
    }

    public TraduccionConInterfaz() {
        frame = new JFrame("Traductor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel opcionesLabel = new JLabel("Seleccione una idioma:");
        frame.add(opcionesLabel);

        String[] opciones = {"Español", "Ingles", "Francés", "Alemán", "Italiano", "Portugués"};
        opcionesComboBox = new JComboBox<>(opciones);
        frame.add(opcionesComboBox);

        JButton traducirButton = new JButton("Traducir");
        traducirButton.addActionListener(new TraducirButtonListener());
        frame.add(traducirButton);

        resultadoLabel = new JLabel("Aquí aparece la traducción");
        frame.add(resultadoLabel);

        frame.pack(); // Asegurarnos de que todos los componentes se agreguen antes de hacer la ventana visible
        frame.setVisible(true);
    }

    private class TraducirButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String selectedOption = (String) opcionesComboBox.getSelectedItem();
            String idioma = null;
            switch (selectedOption) {
                case "Español":
                    idioma = "es";
                    break;
                case "Ingles":
                    idioma = "en";
                    break;
                case "Francés":
                    idioma = "fr";
                    break;
                case "Alemán":
                    idioma = "de";
                    break;
                case "Italiano":
                    idioma = "it";
                    break;
                case "Portugués":
                    idioma = "pt";
                    break;
            }

            switch (idioma) {
                case "es":
                    resultadoLabel.setText("Hola, ¿cómo estás?");
                    break;
                case "en":
                    resultadoLabel.setText("Hello, how are you?");
                    break;
                case "fr":
                    resultadoLabel.setText("Bonjour, comment vas-tu?");
                    break;
                case "de":
                    resultadoLabel.setText("Hallo, wie geht es dir?");
                    break;
                case "it":
                    resultadoLabel.setText("Ciao, come stai?");
                    break;
                case "pt":
                    resultadoLabel.setText("Olá, como você está?");
                    break;
                default:
                    resultadoLabel.setText("No tengo un saludo para ese idioma. Lo siento!");
            }
        }
    }
}