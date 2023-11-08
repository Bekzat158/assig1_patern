package factory;

public class WebDevelopment extends Development {
    @Override
    protected void createDevelopment() {
        knowledges.add(new FrontEnd());
        knowledges.add(new BackEnd());
    }
}
