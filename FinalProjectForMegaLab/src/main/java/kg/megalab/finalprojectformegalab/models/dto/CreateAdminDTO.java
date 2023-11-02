package kg.megalab.finalprojectformegalab.models.dto;

import lombok.Data;

@Data
public class CreateAdminDTO {
    private String adminName;
    private String password;
    private String passConfirm;
    private String personalNumber;
}
