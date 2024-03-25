import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjercicioPreguntasRespuestas extends JFrame implements ActionListener {
    // Arreglos para almacenar preguntas y respuestas
    String[] preguntas = {"¿Cuál es la capital de Francia?", "¿Quién pintó la Mona Lisa?", "¿Cuántos continentes hay en el mundo?", "¿Quién escribió Don Quijote de la Mancha?", "¿Cuál es el río más largo del mundo?"};
    String[] respuestas = {"parís", "leonardo da vinci", "7", "miguel de cervantes", "amazonas"};

    // Componentes de la interfaz de usuario
    JLabel[] labels = new JLabel[5];
    JTextField[] textFields = new JTextField[5];
    JButton btnResponder;

    public EjercicioPreguntasRespuestas() {
        setTitle("Ejercicio Preguntas y Respuestas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Agregar etiquetas y campos de texto
        for (int i = 0; i < 5; i++) {
            labels[i] = new JLabel(preguntas[i]);
            add(labels[i]);
            textFields[i] = new JTextField();
            add(textFields[i]);
        }

        // Botón para responder
        btnResponder = new JButton("Responder");
        btnResponder.addActionListener(this);
        add(btnResponder);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnResponder) {
            // Verificar respuestas
            boolean respuestasCorrectas = true;
            for (int i = 0; i < 5; i++) {
                String respuestaUsuario = textFields[i].getText().toLowerCase();
                if (!respuestaUsuario.equals(respuestas[i])) {
                    respuestasCorrectas = false;
                    break;
                }
            }

            // Mostrar resultado en un cuadro de diálogo
            if (respuestasCorrectas) {
                JOptionPane.showMessageDialog(this, "¡Todas las respuestas son correctas!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                StringBuilder mensaje = new StringBuilder("Algunas respuestas son incorrectas:\n");
                for (int i = 0; i < 5; i++) {
                    String respuestaUsuario = textFields[i].getText().toLowerCase();
                    if (!respuestaUsuario.equals(respuestas[i])) {
                        mensaje.append("Pregunta: ").append(preguntas[i]).append("\nRespuesta esperada: ").append(respuestas[i]).append("\nTu respuesta: ").append(respuestaUsuario).append("\n\n");
                    }
                }
                JOptionPane.showMessageDialog(this, mensaje.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EjercicioPreguntasRespuestas());
    }
}