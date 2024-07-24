package com.gym.gymlifestyle.dtos.responses;

import com.gym.gymlifestyle.enums.Muscle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseResponseDTO {

    private UUID id;
    private String name;
    private String description;
    private Muscle bodyPart;
    private boolean machine;
    private String urlVideo;

}
