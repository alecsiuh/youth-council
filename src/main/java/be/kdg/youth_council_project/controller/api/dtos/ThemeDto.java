package be.kdg.youth_council_project.controller.api.dtos;


import javax.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ThemeDto {

    private Long id;
    private String name;


}
