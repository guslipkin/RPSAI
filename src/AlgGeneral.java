import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gus Lipkin on 3/27/2016.
 */
public class AlgGeneral {

    public ArrayList history;
    public ArrayList winHistory;
    public ArrayList algResults;

    public AlgGeneral() {

        history = new ArrayList<>();
        winHistory = new ArrayList<>();
        algResults = new ArrayList<>();

        int x = 0;
        while (x < 5) {
            algResults.add(-1);
            x += 1;
        }
    }

    public void algChooser() {

        history.add(history.get((Integer)(algResults.get(0))));
    }
}
