import javax.swing.*;
import java.awt.*;

public class NotepadView extends JFrame {

    private JTextArea textArea;
    private JMenuItem saveMenuItem;
    private JMenuItem loadMenuItem;
    private JMenuItem exitMenuItem;
    private JMenuItem growFontItem;
    private JMenuItem shrinkFontItem;

    public NotepadView() {
        setTitle("MVC Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        applyFontSettings();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        saveMenuItem = new JMenuItem("Save");
        loadMenuItem = new JMenuItem("Load");
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(saveMenuItem);
        fileMenu.add(loadMenuItem);
        fileMenu.add(exitMenuItem);

        growFontItem = new JMenuItem("grow font");
        shrinkFontItem = new JMenuItem("shrink font");
        editMenu.add(growFontItem);
        editMenu.add(shrinkFontItem);

        setVisible(true);
    }

    private void applyFontSettings() {
        SettingsManager settings = SettingsManager.getInstance();
        Font font = new Font(settings.getFontFamily(), Font.PLAIN, settings.getFontSize());
        textArea.setFont(font);
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JMenuItem getSaveMenuItem() {
        return saveMenuItem;
    }

    public JMenuItem getLoadMenuItem() {
        return loadMenuItem;
    }

    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    public JMenuItem getGrowFontItem() {
        return growFontItem;
    }

    public JMenuItem getShrinkFontItem() {
        return shrinkFontItem;
    }
}
