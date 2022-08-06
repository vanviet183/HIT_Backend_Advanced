package com.vitvn183.demouploadfile.model.pPr;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vitvn183.demouploadfile.model.rPr.RPr;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PPr {

    @JsonProperty("w:rPr")
    private RPr rPr;
}
