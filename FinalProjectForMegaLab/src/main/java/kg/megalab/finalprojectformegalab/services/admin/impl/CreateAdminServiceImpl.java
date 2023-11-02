package kg.megalab.finalprojectformegalab.services.admin.impl;

import kg.megalab.finalprojectformegalab.configurations.MapperConfig;
import kg.megalab.finalprojectformegalab.models.dto.CreateAdminDTO;
import kg.megalab.finalprojectformegalab.models.entities.Admin;
import kg.megalab.finalprojectformegalab.repositories.AdminRepo;
import kg.megalab.finalprojectformegalab.services.admin.CreateAdminService;
import kg.megalab.finalprojectformegalab.services.validation.ValidationPatternService;
import kg.megalab.finalprojectformegalab.services.validation.ValidationUniqService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static kg.megalab.finalprojectformegalab.models.enums.Role.*;
import static org.springframework.http.HttpStatus.*;
import static org.springframework.http.ResponseEntity.*;

@Service
@RequiredArgsConstructor
public class CreateAdminServiceImpl implements CreateAdminService {
    private final ValidationPatternService validationPatternService;
    private final ValidationUniqService validationUniqService;
    private final AdminRepo adminRepo;
    private final MapperConfig mapper;
    @Override
    public ResponseEntity<String> create(CreateAdminDTO createAdminDTO) {
        if (!validationPatternService.adminNamePatternValidate(createAdminDTO.getAdminName())){
            return status(NOT_ACCEPTABLE).body("Invalid login pattern");
        }
        if(!validationPatternService.adminPasswordValidate(createAdminDTO.getPassword())){
            return status(NOT_ACCEPTABLE).body("invalid password pattern");
        }
        if(!createAdminDTO.getPassword().equals(createAdminDTO.getPassConfirm())){
            return status(NOT_ACCEPTABLE).body("password dont match");
        }
        if(createAdminDTO.getPersonalNumber().isBlank()){
            return status(NOT_ACCEPTABLE).body("personal number can not be empty");
        }
        if(!validationUniqService.uniqValidateAdminName(createAdminDTO.getAdminName())){
            return status(CONFLICT).body("this login is already used");
        }
        Admin admin = mapper.getMapper().map(createAdminDTO, Admin.class);
        admin.setRole(ADMIN);
        adminRepo.save(admin);
        return status(CREATED).body("create admin success");
    }

}