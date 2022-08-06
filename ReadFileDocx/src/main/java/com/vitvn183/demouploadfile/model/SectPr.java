package com.vitvn183.demouploadfile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SectPr {

    @JsonProperty("w:cols")
    private Cols cols;

    @JsonProperty("w:pgSz")
    private PgSz pgSz;

    @JsonProperty("w:rsidRPr")
    private String rsidRPr;

    @JsonProperty("w:rsidR")
    private String rsidR;

    @JsonProperty("w:docGrid")
    private DocGrid docGrid;

    @JsonProperty("w:pgMar")
    private PgMar pgMar;

}
