package com.example.enoca.business.concretes;

import com.example.enoca.business.abstracts.EmployeeService;
import com.example.enoca.business.requests.employeeRequests.CreateEmployeeRequest;
import com.example.enoca.business.requests.employeeRequests.UpdateEmployeeRequest;
import com.example.enoca.business.responses.employeeResponses.*;
import com.example.enoca.core.utilities.exceptions.BusinessException;
import com.example.enoca.core.utilities.mapping.ModelMapperService;
import com.example.enoca.core.utilities.messages.BusinessMessage;
import com.example.enoca.core.utilities.result.DataResult;
import com.example.enoca.core.utilities.result.SuccessDataResult;
import com.example.enoca.dataAccess.EmployeeRepository;
import com.example.enoca.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class EmployeeManager implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<CreateEmployeeResponse> add(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = this.modelMapperService.forRequest().map(createEmployeeRequest, Employee.class);
        this.employeeRepository.save(employee);
        CreateEmployeeResponse createEmployeeResponse = this.modelMapperService.forResponse().map(employee, CreateEmployeeResponse.class);

        return new SuccessDataResult<>(createEmployeeResponse, BusinessMessage.GlobalMessages.DATA_ADDED_SUCCESSFULLY);
    }

    @Override
    public DataResult<UpdateEmployeeResponse> update(UpdateEmployeeRequest updateEmployeeRequest) {
        checkIfExistById(updateEmployeeRequest.getId());
        Employee employee = this.modelMapperService.forRequest().map(updateEmployeeRequest, Employee.class);
        this.employeeRepository.save(employee);
        UpdateEmployeeResponse updateEmployeeResponse = this.modelMapperService.forResponse().map(employee, UpdateEmployeeResponse.class);

        return new SuccessDataResult<>(updateEmployeeResponse, BusinessMessage.GlobalMessages.DATA_UPDATED_SUCCESSFULLY) ;
    }

    @Override
    public DataResult<DeleteEmployeeResponse> delete(int employeeId) {
        checkIfExistById(employeeId);
        Employee employee = this.employeeRepository.findById(employeeId).get();
        DeleteEmployeeResponse deleteEmployeeResponse = this.modelMapperService.forResponse().map(employee, DeleteEmployeeResponse.class);
        this.employeeRepository.delete(employee);

        return new SuccessDataResult<>(deleteEmployeeResponse,BusinessMessage.GlobalMessages.DATA_DELETED_SUCCESSFULLY);
    }

    @Override
    public DataResult<GetEmployeeResponse> getById(int employeeId) {
        checkIfExistById(employeeId);
        Employee employee = this.employeeRepository.findById(employeeId).get();
        GetEmployeeResponse getEmployeeResponse = this.modelMapperService.forResponse().map(employee, GetEmployeeResponse.class);

        return new SuccessDataResult<>(getEmployeeResponse, BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
    }

    @Override
    public DataResult<List<GetAllEmployeeResponse>> getAll() {
        List<Employee> employees = this.employeeRepository.findAll();
        List<GetAllEmployeeResponse> getAllEmployeeResponse = employees.stream().map(employee -> this.modelMapperService.forResponse().map(employee, GetAllEmployeeResponse.class)).collect(Collectors.toList());

        return new SuccessDataResult<>(getAllEmployeeResponse, BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
    }

    private void checkIfExistById(int employeeId){
        if (!this.employeeRepository.existsById(employeeId)){
            throw new BusinessException("ad" + employeeId);
        }
    }

}
