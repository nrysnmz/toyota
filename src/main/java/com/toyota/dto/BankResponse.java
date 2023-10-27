package com.toyota.dto;

import lombok.Data;

public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
