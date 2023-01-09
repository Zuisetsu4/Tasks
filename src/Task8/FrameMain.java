package Task8;

import util.ArrayUtils;
import util.FileUtils;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrameMain extends JFrame {
    private JButton addColumnsButton;
    private JButton removeColumnsButton;
    private JButton loadArrayButton;
    private JButton saveArrayButton;
    private JTable Table;
    private JButton SortButton;
    private JPanel panelM;
    private JButton addStringsButton;
    private JButton removeStringsButton;
    private JTextField textField;


    public FrameMain() {
        setTitle("Task");
        setContentPane(panelM);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        ActionListener btnEvent = e -> {
            try {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                int response = fileChooser.showOpenDialog(null);
                if (response == JFileChooser.APPROVE_OPTION) {
                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    if (e.getSource() == loadArrayButton) {
                        tableFromFilePath(file.toString());
                    } else {
                        saveToFilePath(file.toString());
                    }
                }
            } catch (IOException exc) {
                JOptionPane.showMessageDialog(null, exc.toString());
            }
        };

        JButton[] filesButtons = new JButton[]{loadArrayButton, saveArrayButton};
        for (JButton button : filesButtons) {
            button.addActionListener(btnEvent);
        }


        loadArrayButton.addActionListener(e -> {
            try {
                int[][] arr = list2ToArray2(getList2FromTable());
                int RowIndex = Integer.parseInt(textField.getText());
                Sort.sort(arr, RowIndex);
                fillTableByList(arr2ToList2(arr));
            } catch (IllegalArgumentException exc) {
                JOptionPane.showMessageDialog(null, exc.toString());
            }
        });

        JButton[] changeTableButtons = {removeStringsButton, addStringsButton, addColumnsButton, removeColumnsButton};
        for (JButton btn : changeTableButtons) {
            btn.addActionListener(e -> {
                List<List<Integer>> list = getList2FromTable();
                TableModel tableModel;

                int columnCount;
                try {
                    columnCount = list.get(0).size();
                } catch (Exception exc) {
                    columnCount = 0;
                }

                if (e.getSource() == removeStringsButton) {
                    tableModel = new DefaultTableModel(list.size() - 1, columnCount);
                } else if (e.getSource() == addStringsButton) {
                    tableModel = new DefaultTableModel(list.size() + 1, columnCount);
                } else if (e.getSource() == removeColumnsButton) {
                    tableModel = new DefaultTableModel(list.size(), columnCount - 1);
                } else {
                    tableModel = new DefaultTableModel(list.size(), columnCount + 1);
                }


                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    for (int j = 0; j < tableModel.getColumnCount(); j++) {
                        if (i < list.size() && j < list.get(i).size()) {
                            tableModel.setValueAt(list.get(i).get(j), i, j);
                        } else {
                            tableModel.setValueAt(0, i, j);
                        }
                    }
                }
                Table.setModel(tableModel);
            });
        }
    }

    private void fillTableByList(List<List<Integer>> list) {
        if (list.size() > 0) {
            TableModel tableModel = new DefaultTableModel(list.size(), list.get(0).size());

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    tableModel.setValueAt(list.get(i).get(j), i, j);
                }
            }

            Table.setModel(tableModel);
        } else {
            Table.setModel(new DefaultTableModel());
        }
    }

    private void tableFromFilePath(String filePath) throws IOException {
        String text = FileUtils.readFromFile(Paths.get(filePath));
        int n = Integer.parseInt(Arrays.stream(text.split("\n")).toList().get(0));
        textField.setText(String.valueOf(n));
        text = text.substring(text.indexOf('\n') + 1);
        List<List<Integer>> list = ArrayUtils.getList2FromString(text);
        fillTableByList(list);
    }

    private void saveToFilePath(String filePath) throws IOException {
        FileUtils.writeStringToFile(Paths.get(filePath), ArrayUtils.getStringFromList2(getList2FromTable()));
    }

    private List<List<Integer>> getList2FromTable() {
        TableModel tableModel = Table.getModel();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                list.get(i).add((Integer) tableModel.getValueAt(i, j));
            }
        }
        return list;
    }

    public static int[][] list2ToArray2(List<List<Integer>> list) {
        if (list.size() == 0) {
            return new int[0][0];
        }
        int[][] arr = new int[list.size()][list.get(0).size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }
        return arr;
    }

    public static List<List<Integer>> arr2ToList2(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        if (arr.length == 0) {
            return list;
        }

        for (int i = 0; i < arr.length; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < arr[i].length; j++) {
                list.get(i).add(arr[i][j]);
            }
        }
        return list;
    }
}

