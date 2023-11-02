package kg.megalab.finalprojectformegalab.services.validation.impl;

import kg.megalab.finalprojectformegalab.repositories.AdminRepo;
import kg.megalab.finalprojectformegalab.services.validation.ValidationUniqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidationUniqServiceImpl implements ValidationUniqService{
    private final AdminRepo adminRepo;

    @Override
    public boolean uniqValidateAdminName(String adminName){
        return adminRepo.findByAdminName(adminName).isEmpty();
    }

}
