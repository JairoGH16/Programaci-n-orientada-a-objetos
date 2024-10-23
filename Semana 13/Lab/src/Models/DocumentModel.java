package Models;

public class DocumentModel {
    private StringBuilder text;

    public DocumentModel() {
        text = new StringBuilder();
    }

    public String getText() {
        return text.toString();
    }

    public void setText(String newText) {
        this.text = new StringBuilder(newText);
    }
}
