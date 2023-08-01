package memento;

import java.util.Stack;

public class History {
    Stack<EditorState> editorStates = new Stack<>();

    public void push(EditorState editorState) {
        editorStates.push(editorState);
    }

    public EditorState pop() {
        return editorStates.pop();
    }

    public Stack<EditorState> getEditorStates() {
        return editorStates;
    }

    public void setEditorStates(Stack<EditorState> editorStates) {
        this.editorStates = editorStates;
    }
}
