package Task8;

import util.ArrayUtils;
import util.JTableUtils;
import util.SwingUtils;

import javax.swing.*;

public class FrameMain extends JFrame {
    private JPanel jPanel;
    private JButton loadButton;
    private JButton sortButton;
    private JButton saveButton;
    private JTable table1;
    private JTable table2;
    private final JFileChooser inputFileChooser, outputFileChooser;



    public FrameMain(String[] args) {
        setTitle("Task8");
        setContentPane(jPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        inputFileChooser = new JFileChooser();
        outputFileChooser = new JFileChooser();

        JTableUtils.initJTableForArray(table1, 50, false, false, true, true);
        JTableUtils.initJTableForArray(table2, 50, false, false, true, true);
        loadButton.addActionListener(e -> {
            try {
                if (inputFileChooser.showOpenDialog(jPanel) == JFileChooser.APPROVE_OPTION) {
                    int[][] source = ArrayUtils.readIntArray2FromFile(inputFileChooser.getSelectedFile().getPath());
                    JTableUtils.writeArrayToJTable(table1, source);
                }
            } catch (Exception err) {
                SwingUtils.showErrorMessageBox(err);
            }

        });

        sortButton.addActionListener(e -> {
            try {
                int[][] data = JTableUtils.readIntMatrixFromJTable(table1);
                int rowIndex = data[0][0];
                Sort.sort(data, rowIndex);
                data[0] = new int[]{rowIndex};
                JTableUtils.writeArrayToJTable(table2, data);
            } catch (Exception err) {
                SwingUtils.showErrorMessageBox(err);
            }
        });

        saveButton.addActionListener(e -> {
            try {
                if (outputFileChooser.showSaveDialog(jPanel) == JFileChooser.APPROVE_OPTION) {
                    int[][] results = JTableUtils.readIntMatrixFromJTable(table2);
                    String file = outputFileChooser.getSelectedFile().getPath();
                    ArrayUtils.writeArrayToFile(file, results);
                }
            } catch (Exception err) {
                SwingUtils.showErrorMessageBox(err);
            }

        });
    }
}