package com.meli.obterdiploma.model;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    @NotBlank(message = "O nome do aluno não pode ficar vazio.")
    @Size(min = 2)
    String studentName;

    String message;

    Double averageScore;
    List<SubjectDTO> subjects;
}
