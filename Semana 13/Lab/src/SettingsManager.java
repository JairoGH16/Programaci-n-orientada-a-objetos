public class SettingsManager {

    private static SettingsManager instance;

    private String fontFamily;
    private int fontSize;

    private SettingsManager() {
        // Set default settings
        fontFamily = "Arial";
        fontSize = 14;
    }

    public static SettingsManager getInstance() {
        if (instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
