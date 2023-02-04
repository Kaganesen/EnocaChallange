package com.example.enoca.business.requests.companyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCompanyRequest {

    @NotNull
    @Min(1)
    private int id;
    @NotNull
    private String companyName;
    @NotNull
    private String taxNumber;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String adress;

}
