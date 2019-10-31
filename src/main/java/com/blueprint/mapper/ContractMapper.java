package com.blueprint.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.blueprint.domain.Contract;
import com.blueprint.dto.ContractDTO;

@Mapper(componentModel = "spring", uses = {SubscriberMapper.class})
public interface ContractMapper {

    ContractDTO toDto(Contract contract);

    Contract toModel(ContractDTO contractDTO);

    List<ContractDTO> toDto(List<Contract> contracts);

}
