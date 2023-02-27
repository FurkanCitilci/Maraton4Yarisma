package com.furkancitilci.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OyuncuControllerResponseDto {

    String name;
    String avatar;
    Long id;
}
