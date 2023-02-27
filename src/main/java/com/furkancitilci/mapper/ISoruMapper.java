package com.furkancitilci.mapper;

import com.furkancitilci.dto.request.SoruOlusturRequestDto;
import com.furkancitilci.repository.entity.Soru;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISoruMapper {

    ISoruMapper INSTANCE = Mappers.getMapper(ISoruMapper.class);
    Soru toSoruOlustur(final SoruOlusturRequestDto dto);
}
