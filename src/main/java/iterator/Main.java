package iterator;

public class Main {

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.push("google.com");
        browserHistory.push("stackoverflow.com");
        browserHistory.push("rizwan.io");

        Iterator iterator = browserHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

    }
}
