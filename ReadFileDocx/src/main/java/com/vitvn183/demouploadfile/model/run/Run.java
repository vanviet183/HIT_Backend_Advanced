package com.vitvn183.demouploadfile.model.run;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.vitvn183.demouploadfile.model.RunTObject;
import com.vitvn183.demouploadfile.model.RunTText;
import com.vitvn183.demouploadfile.model.TRun;
import com.vitvn183.demouploadfile.model.rPr.RPr;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Run {

    @JsonProperty("w:t")
    private String text;

    @JsonProperty("w:t")
    private JsonNode jsonNode;

    @JsonProperty("w:rsidRPr")
    private String rsidRPr;

    @JsonProperty("w:rPr")
    private RPr rPr;

    @JsonProperty("w:rsidR")
    private String rsidR;
}
