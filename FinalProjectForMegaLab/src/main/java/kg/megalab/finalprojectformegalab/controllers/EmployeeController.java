package kg.megalab.finalprojectformegalab.controllers;

import kg.megalab.finalprojectformegalab.models.dto.CreateEmplDTO;
import kg.megalab.finalprojectformegalab.models.dto.EditEmplDTO;
import kg.megalab.finalprojectformegalab.models.dto.SearchEmplDTO;
import kg.megalab.finalprojectformegalab.services.employee.CreateEmplService;
import kg.megalab.finalprojectformegalab.services.employee.EditEmplService;
import kg.megalab.finalprojectformegalab.services.employee.SearchEmplService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("Employee")
public class EmployeeController {

    private final CreateEmplService createEmplService;
    private final EditEmplService editEmplService;
    private final SearchEmplService searchEmplService;

    @RequestMapping("/create")
    public ResponseEntity<?>createEmployee(@RequestBody CreateEmplDTO createEmplDTO){
        return createEmplService.create(createEmplDTO);
    }
    @RequestMapping("/edit")
    public ResponseEntity<?>editEmployee(@RequestBody EditEmplDTO editEmplDTO){
        return editEmplService.editEmpl(editEmplDTO);
    }
    @RequestMapping("search")
    public ResponseEntity<?>searchEmployee(@RequestParam SearchEmplDTO searchField){
        return searchEmplService.searchEmployee(searchField);
    }
}
