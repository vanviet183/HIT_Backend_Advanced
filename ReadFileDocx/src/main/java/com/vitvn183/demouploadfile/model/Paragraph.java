package com.vitvn183.demouploadfile.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.vitvn183.demouploadfile.model.pPr.PPr;
import com.vitvn183.demouploadfile.model.run.Run;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONArray;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter
public class Paragraph {

    @JsonProperty("w14:paraId")
    private String paraId;

    @JsonProperty("w14:textId")
    private String textId;

    @JsonProperty("w:pPr")
    private PPr pPr;

    @JsonProperty("w:rsidR")
    private String rsidR;

    @JsonProperty("w:rsidRPr")
    private String rsidRPr;

    @JsonProperty("w:rsidP")
    private String rsidP;

    @JsonProperty("w:rsidRDefault")
    private String rsidRDefault;

    @JsonProperty("w:r")
    JsonNode runs;


}
