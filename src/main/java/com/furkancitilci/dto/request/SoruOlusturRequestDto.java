package com.furkancitilci.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SoruOlusturRequestDto {

    String image;
    String type;
    String country;
    int yas;
    String dogrucevap;
    int puan;


}
