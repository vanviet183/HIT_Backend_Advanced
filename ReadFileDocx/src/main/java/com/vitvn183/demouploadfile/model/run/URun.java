package com.vitvn183.demouploadfile.model.run;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vitvn183.demouploadfile.model.rPr.SzCs;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class URun {

    @JsonProperty("w:val")
    private String u;
}
