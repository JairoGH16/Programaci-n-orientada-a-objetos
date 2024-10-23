import Models.DocumentModel;

public class Main {
    public static void main(String[] args) {
        DocumentModel model = new DocumentModel();
        NotepadView view = new NotepadView();
        NotepadController controller = new NotepadController(model, view);
        controller.changeFontSize(18);

    }
}
//Made by Rafael Odio, Kenneth Araya and Jairo Gonzalez