package edu.eurotrans.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class CompanyEmployeeDTO {

    private CompanyDTO companyDTO;

    private EmployeeDTO employeeDTO;
}
