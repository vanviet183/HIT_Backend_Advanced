package com.vitvn183.demouploadfile.model.rPr;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.vitvn183.demouploadfile.model.run.URun;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RPr {

    @JsonProperty("w:u")
    private URun uRun;

    @JsonProperty("w:bCs")
    private String bCs;

    @JsonProperty("w:i")
    private String i;

    @JsonProperty("w:b")
    private String b;

    @JsonProperty("w:iCs")
    private String iCs;

    @JsonProperty("w:strike")
    private String strike;

    @JsonProperty("w:color")
    private JsonNode color;


    @JsonProperty("w:szCs")
    private SzCs szCs;

    @JsonProperty("w:sz")
    private Sz sz;
}
