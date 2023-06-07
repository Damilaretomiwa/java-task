package DiaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private final String password;
    private int gistCounter = 0;
    List<Gist> gists = new ArrayList<>();

    public Diary(String userName, String password) {

        this.password = password;

    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordIsCorrect = password.equals(this.password);
        if (passwordIsCorrect) unlockDiary();
        if (passwordIsCorrect) unlockDiary();

    }

    private void unlockDiary() {
        isLocked = false;

    }

    public void lock() {
        isLocked = true;
    }

    public void addGist(String title, String body) {
        Gist newGist = new Gist(title, body);
        gists.add(newGist);
        gistCounter++;
    }

    public int countGists() {
        return gistCounter;
    }

    public Gist findGistByTitle(String title) {
        for (Gist gist : gists) {
            if (gist.getTitle().equals(title))
                return gist;
        }
        return null;


    }
}


