package com.blueprint.mapper;

import org.mapstruct.Mapper;

import com.blueprint.domain.Address;
import com.blueprint.dto.AddressDTO;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDTO toDto(Address address);

    Address toModel(AddressDTO addressDTO);
}
