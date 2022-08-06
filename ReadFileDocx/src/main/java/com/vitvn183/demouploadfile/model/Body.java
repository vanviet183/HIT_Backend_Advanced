package com.vitvn183.demouploadfile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Body {

    @JsonProperty("w:sectPr")
    private SectPr sectPr;

    @JsonProperty("w:p")
    private List<Paragraph> paragraphs;
}
