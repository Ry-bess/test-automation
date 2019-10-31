package com.blueprint.dto;

import com.blueprint.enumeration.AddressTypeEnum;
import com.blueprint.enumeration.CountryEnum;

import lombok.Data;

@Data
public class AddressDTO {

    private Long addressID;

    private CountryEnum country;

    private String state;

    private String street;

    private String city;

    private int number;

    private String zip;

    private Boolean active;

    private AddressTypeEnum type;

    @Override
    public String toString() {

	StringBuffer stringBuffer = new StringBuffer();
	stringBuffer.append("Address:");
	stringBuffer.append(this.street);
	stringBuffer.append(", Number:");
	stringBuffer.append(this.number);
	stringBuffer.append(", City:");
	stringBuffer.append(this.city);
	stringBuffer.append(", State:");
	stringBuffer.append(this.state);
	stringBuffer.append(", Postal Code:");
	stringBuffer.append(this.zip);

	return stringBuffer.toString();
    }
}
