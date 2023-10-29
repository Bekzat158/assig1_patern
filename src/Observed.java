public interface Observed {
    public void addObserver(Observer department);
    public void removeObserver(Observer department);
    public void notifyObservers();
}
