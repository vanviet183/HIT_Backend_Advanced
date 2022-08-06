package com.vitvn183.demouploadfile.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@FieldDefaults(level = AccessLevel.PRIVATE)
public class DocumentObj {

    @JsonProperty("w:document")
    private DocumentProperties documentProperties;

}
