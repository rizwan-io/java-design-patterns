package state;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser Tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase the content");
    }
}
