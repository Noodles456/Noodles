package com.fbw.OneBoot.dto;

import lombok.Data;

import java.util.List;
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
