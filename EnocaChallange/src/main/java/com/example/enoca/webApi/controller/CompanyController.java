package com.example.enoca.webApi.controller;

import com.example.enoca.business.abstracts.CompanyService;
import com.example.enoca.business.requests.companyRequests.CreateCompanyRequest;
import com.example.enoca.business.requests.companyRequests.UpdateCompanyRequest;
import com.example.enoca.business.responses.companyResponses.*;
import com.example.enoca.core.utilities.result.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/company")
@AllArgsConstructor

public class CompanyController {

    private final CompanyService companyService;

    @PostMapping()
    public DataResult<CreateCompanyResponse> add(@RequestBody @Valid CreateCompanyRequest createCompanyRequest){
        return this.companyService.add(createCompanyRequest);
    }

    @PutMapping()
    public DataResult<UpdateCompanyResponse> update(@RequestBody @Valid UpdateCompanyRequest updateCompanyRequest){
        return this.companyService.update(updateCompanyRequest);
    }

    @DeleteMapping("/{companyId}")
    public DataResult<DeleteCompanyResponse> delete(@PathVariable int companyId){
        return this.companyService.delete(companyId);
    }

    @GetMapping("/{companyId}")
    public DataResult<GetCompanyResponse> getById(@PathVariable int companyId){
        return this.companyService.getById(companyId);
    }

    @GetMapping("/getAll")
    public DataResult<List<GetAllCompanyResponse>> getAll(){
        return this.companyService.getAll();
    }

}
