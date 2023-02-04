package com.example.enoca.webApi.controller;

import com.example.enoca.business.abstracts.EmployeeService;
import com.example.enoca.business.requests.employeeRequests.CreateEmployeeRequest;
import com.example.enoca.business.requests.employeeRequests.UpdateEmployeeRequest;
import com.example.enoca.business.responses.employeeResponses.*;
import com.example.enoca.core.utilities.result.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor

public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping()
    public DataResult<CreateEmployeeResponse> add (@RequestBody @Valid CreateEmployeeRequest createEmployeeRequest){
        return this.employeeService.add(createEmployeeRequest);
    }

    @PutMapping()
    public DataResult<UpdateEmployeeResponse> update (@RequestBody @Valid UpdateEmployeeRequest updateEmployeeRequest){
        return this.employeeService.update(updateEmployeeRequest);
    }

    @DeleteMapping("/{employeeId}")
    public DataResult<DeleteEmployeeResponse> delete (@PathVariable int employeeId){
        return this.employeeService.delete(employeeId);
    }

    @GetMapping("/{employeeId}")
    public DataResult<GetEmployeeResponse> getById (@PathVariable int employeeId){
        return this.employeeService.getById(employeeId);
    }

    @GetMapping("/getAll")
    public DataResult<List<GetAllEmployeeResponse>> getAll (){
        return this.employeeService.getAll();
    }
}
