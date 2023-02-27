package com.furkancitilci.mapper;

import com.furkancitilci.dto.request.RegisterRequestDto;
import com.furkancitilci.dto.response.OyuncuControllerResponseDto;
import com.furkancitilci.repository.entity.Oyuncu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IOyuncuMapper {


    IOyuncuMapper INSTANCE = Mappers.getMapper(IOyuncuMapper.class);

    Oyuncu toOyuncu(final RegisterRequestDto dto);
    OyuncuControllerResponseDto oyuncuControllerResponseDto(final Oyuncu oyuncu);
}
