package com.example.ddcore.commons;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Condition {
    private String key;
    private String value;
    private String operator;
}
