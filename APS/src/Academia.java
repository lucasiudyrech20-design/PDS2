import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class Academia extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textNome;
    private JTextField textTelefone;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Academia frame = new Academia();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Academia() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[116.00][116.00,grow][126.00][119.00]", "[][][][][][][][]"));

        JLabel lblNewLabel_4 = new JLabel("Cadastro de cliente - Academia Cleiton Racha");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
        contentPane.add(lblNewLabel_4, "cell 1 0 3 1");

        JLabel lblNewLabel = new JLabel("Nome");
        contentPane.add(lblNewLabel, "cell 0 1,alignx trailing");

        textNome = new JTextField();
        contentPane.add(textNome, "cell 1 1 3 1,growx");

        JLabel lblNewLabel_1 = new JLabel("Telefone");
        contentPane.add(lblNewLabel_1, "cell 0 2,alignx trailing");

        textTelefone = new JTextField();
        contentPane.add(textTelefone, "cell 1 2 3 1,growx");

        JLabel lblNewLabel_2 = new JLabel("Tipo de Plano:");
        contentPane.add(lblNewLabel_2, "cell 0 3,alignx trailing");
        
        // ComboBox:
        
        JComboBox<Plano>comboBoxPlano =new JComboBox<>(Plano.values());
        contentPane.add(comboBoxPlano, "cell 1 3 3 1,growx");

        JLabel lblNewLabel_3 = new JLabel("Duração:");
        contentPane.add(lblNewLabel_3, "cell 0 4,alignx trailing");

        JComboBox<Duracao> comboBoxDuracao = new JComboBox<>(Duracao.values());
        contentPane.add(comboBoxDuracao, "cell 1 4 3 1,growx");

        JLabel lblFrequncia = new JLabel("Frequência semanal:");
        contentPane.add(lblFrequncia, "cell 0 5,alignx trailing");

        JButton btnCalcular = new JButton("Calcular");
        
        JComboBox<Frequencia> comboBoxFreq = new JComboBox<>(Frequencia.values());
        contentPane.add(comboBoxFreq, "cell 1 5 3 1,growx");

        JLabel lblResultado = new JLabel("Valor final:");
        contentPane.add(lblResultado, "cell 2 7");

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (textNome.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Informe o nome!");
                    return;
                }

                if (textTelefone.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Informe o telefone!");
                    return;
                }

                
                Plano planosel = (Plano) comboBoxPlano.getSelectedItem();
                double valor = planosel.getMult();
                
                Duracao durasel = (Duracao) comboBoxDuracao.getSelectedItem();
                double dura = durasel.getMult();
                
                Frequencia freqsel = (Frequencia) comboBoxFreq.getSelectedItem();
                double freq = freqsel.getMult();

                // EXIBIR RESULTADO
                lblResultado.setText("Valor final: R$ " + String.format("%.2f", valor*dura*freq));
            }
        });

        contentPane.add(btnCalcular, "cell 1 7");
    }
}


