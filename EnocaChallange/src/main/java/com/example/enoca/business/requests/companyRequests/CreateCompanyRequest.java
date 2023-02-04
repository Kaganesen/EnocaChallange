package com.example.enoca.business.requests.companyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyRequest {

    @NotNull
    private String companyName;

    @NotNull
    private String taxNumber;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String adress;
}
