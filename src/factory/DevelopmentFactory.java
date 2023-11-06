package factory;

public class DevelopmentFactory {
    public static Development createDevelopment(DevelopmentCode developmentCode){
        switch (developmentCode){
            case WEB -> {
                return new WebDevelopment();
            }
            case UxUI -> {
                return new UiUxDeveloper();
            }
            case DATABASE -> {
                return new DatabaseDeveloper();
            }
            default -> {
                return null;
            }
        }
    }
}
