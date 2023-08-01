package memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        System.out.println(editor.getContent());

        history.pop();
        editor.restore(history.getEditorStates().peek());
        System.out.println(editor.getContent());

        history.pop();
        editor.restore(history.getEditorStates().peek());
        System.out.println(editor.getContent());



    }
}
