package factory;

public class UiUxDeveloper extends Development{
    @Override
    protected void createDevelopment() {
        knowledges.add(new FrontEnd());
        knowledges.add(new Another());
    }
}
