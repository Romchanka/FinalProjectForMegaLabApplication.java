package kg.megalab.finalprojectformegalab.services.validation.impl;

import kg.megalab.finalprojectformegalab.services.validation.ValidationPatternService;
import org.springframework.stereotype.Service;

import static kg.megalab.finalprojectformegalab.configurations.PatternConfig.*;
@Service
public class ValidationPatternServiceImpl implements ValidationPatternService {
    @Override
    public boolean adminNamePatternValidate(String adminName){
        return ADMIN_NAME_PATTERN.matcher(adminName).matches();
    }
    @Override
    public boolean adminPasswordValidate(String adminPassword){
        return PASSWORD_PATTERN.matcher(adminPassword).matches();
    }
}
