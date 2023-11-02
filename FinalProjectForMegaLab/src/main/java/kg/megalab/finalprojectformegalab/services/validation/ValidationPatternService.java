package kg.megalab.finalprojectformegalab.services.validation;

public interface ValidationPatternService {
    boolean adminNamePatternValidate(String adminName);

    boolean adminPasswordValidate(String adminPassword);
}
