package iterator;

import java.util.List;

public class ListIterator implements Iterator {

    private BrowserHistory history;
    private int index;

    public ListIterator(BrowserHistory history) {
        this.history = history;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < history.getUrls().size());
    }

    @Override
    public String current() {
        return history.getUrls().get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
