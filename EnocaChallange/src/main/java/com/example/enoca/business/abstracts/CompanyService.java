package com.example.enoca.business.abstracts;

import com.example.enoca.business.requests.companyRequests.CreateCompanyRequest;
import com.example.enoca.business.requests.companyRequests.UpdateCompanyRequest;
import com.example.enoca.business.responses.companyResponses.*;
import com.example.enoca.core.utilities.result.DataResult;

import java.util.List;

public interface CompanyService {

    DataResult<CreateCompanyResponse> add (CreateCompanyRequest createCompanyRequest);

    DataResult<UpdateCompanyResponse> update (UpdateCompanyRequest updateCompanyRequest);

    DataResult<DeleteCompanyResponse> delete (int companyId);

    DataResult<GetCompanyResponse> getById (int companyId);

    DataResult<List<GetAllCompanyResponse>> getAll ();










}
