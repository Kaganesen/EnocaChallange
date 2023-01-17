package com.example.enoca.business.requests.companyRequests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
