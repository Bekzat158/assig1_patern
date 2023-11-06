package factory;

public class DatabaseDeveloper extends Development{
    @Override
    protected void createDevelopment() {
    knowledges.add(new Another());
    knowledges.add(new BackEnd());
    }
}
