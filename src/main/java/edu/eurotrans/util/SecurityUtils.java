package edu.eurotrans.util;

import edu.eurotrans.dao.entity.EmployeeEntity;
import edu.eurotrans.dao.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecurityUtils {

    private final EmployeeService employeeService;

    public EmployeeEntity getCurrentEmployee() {
        var principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return employeeService.getByEmail(principal.getUsername());
    }
}
