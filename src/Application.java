import observer.IDE;
import programmers.Programmer;


public class Application {

    private static Application instance;

    private IDE jetBrains;
    private IDE visualStudio;

    private Application() {
        this.jetBrains = new IDE("intelliJIdea", "2023.0");
        this.visualStudio = new IDE("visualStudio", "1.50");
    }

    public static Application getInstance() {
        if (instance == null) {
            instance = new Application();
        }
        return instance;
    }

    public void addProgrammer(String ideName, Programmer programmer) {
        if (ideName.equals("intelliJIdea")) {
            jetBrains.addProgrammer(programmer);
        } else if (ideName.equals("visualStudio")) {
            visualStudio.addProgrammer(programmer);
        } else {
            throw new IllegalArgumentException("Invalid IDE name: " + ideName);
        }
    }
    public void removeProgrammer(String ideName, Programmer programmer) {
        if (ideName.equals("intelliJIdea")) {
            jetBrains.removeProgrammer(programmer);
        } else if (ideName.equals("visualStudio")) {
            visualStudio.removeProgrammer(programmer);
        } else {
            throw new IllegalArgumentException("Invalid IDE name: " + ideName);
        }
    }

    public void updateIDEVersion(String ideName, String newVersion) {
        if (ideName.equals("intelliJIdea")) {
            jetBrains.updateVersion(newVersion);
        } else if (ideName.equals("visualStudio")) {
            visualStudio.updateVersion(newVersion);
        } else {
            throw new IllegalArgumentException("Invalid IDE name: " + ideName);
        }
    }

    public void printProgrammerInfo(Programmer programmer) {
        System.out.println(programmer);
    }
}
