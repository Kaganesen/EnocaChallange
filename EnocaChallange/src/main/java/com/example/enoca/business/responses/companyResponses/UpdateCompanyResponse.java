package com.example.enoca.business.responses.companyResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyResponse {

    private String id;
    private String companyName;
    private String taxNumber;
    private String phoneNumber;
    private String adress;
}
