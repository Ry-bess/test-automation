package com.blueprint.mapper;

import org.mapstruct.Mapper;

import com.blueprint.domain.Advisor;
import com.blueprint.dto.AdvisorDTO;

@Mapper(componentModel = "spring")
public interface AdvisorMapper {

    AdvisorDTO toDto(Advisor advisor);

    Advisor toModel(AdvisorDTO advisorDTO);
}
