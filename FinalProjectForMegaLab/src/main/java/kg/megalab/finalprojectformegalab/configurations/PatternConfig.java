package kg.megalab.finalprojectformegalab.configurations;

import java.util.regex.Pattern;

public class PatternConfig {
    public static final Pattern
    ADMIN_NAME_PATTERN = Pattern.compile("^[A-Za-z]{4,20}$"),
    EMPLOYEE_NAME_PATTERN = Pattern.compile("^[A-Za-zA-Яа-я]{2,50}$"),
    PASSWORD_PATTERN=Pattern.compile("^(?=.*[A-Za-z\\d])(?=.*[^A-Za-z\\d]).{8,32}$"),
    PHONE_PATTERN= Pattern.compile("^\\+996\\d{9}$"),
    EMAIL_PATTERN= Pattern.compile("^[A-Za-z\\d+_.-]+@(.+)$"),
    ADDRESS_PATTERN= Pattern.compile("^[A-Za-zA-Яа-я\\d-.,]{4,32}");
}
