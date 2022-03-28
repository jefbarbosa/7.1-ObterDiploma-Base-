package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter @Setter
public class SubjectDTO {
    @Valid
    @Size(min = 2, max = 255)
    @NotNull
    String name;
    Double score;
}
