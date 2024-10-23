import Models.DocumentModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Font;

public class NotepadController {

    private DocumentModel documentModel;
    private NotepadView notepadView;

    public NotepadController(DocumentModel model, NotepadView view) {
        this.documentModel = model;
        this.notepadView = view;

        this.notepadView.getSaveMenuItem().addActionListener(new SaveAction());
        this.notepadView.getLoadMenuItem().addActionListener(new LoadAction());
        this.notepadView.getExitMenuItem().addActionListener(e -> System.exit(0));
        this.notepadView.getGrowFontItem().addActionListener(new growFont());
        this.notepadView.getShrinkFontItem().addActionListener(new shrinkFont());

        notepadView.getTextArea().setText(documentModel.getText());
    }

    // Save action listener
    private class SaveAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
                    writer.write(notepadView.getTextArea().getText());
                    documentModel.setText(notepadView.getTextArea().getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private class LoadAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    documentModel.setText(sb.toString());
                    notepadView.getTextArea().setText(documentModel.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void changeFontSize(int newSize) {
        SettingsManager settings = SettingsManager.getInstance();
        settings.setFontSize(newSize);
        notepadView.getTextArea().setFont(new Font(settings.getFontFamily(), Font.PLAIN, newSize));
    }

    private class growFont implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            changeFontSize(notepadView.getTextArea().getFont().getSize() + 4);
        }
    }

    private class shrinkFont implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            changeFontSize(notepadView.getTextArea().getFont().getSize() - 4);
        }
    }
}
