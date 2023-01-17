package com.example.enoca.business.abstracts;

import com.example.enoca.business.requests.employeeRequests.CreateEmployeeRequest;
import com.example.enoca.business.requests.employeeRequests.UpdateEmployeeRequest;
import com.example.enoca.business.responses.employeeResponses.*;
import com.example.enoca.core.utilities.result.DataResult;

import java.util.List;

public interface EmployeeService {

    DataResult<CreateEmployeeResponse> add (CreateEmployeeRequest createEmployeeRequest);

    DataResult<UpdateEmployeeResponse> update (UpdateEmployeeRequest updateEmployeeRequest);

    DataResult<DeleteEmployeeResponse> delete (int employeeId);

    DataResult<GetEmployeeResponse> getById (int employeeId);

    DataResult<List<GetAllEmployeeResponse>> getAll ();
}
