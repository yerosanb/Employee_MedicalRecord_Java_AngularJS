package org.ab.admin.model;

import org.ab.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollateralTypeModel extends BaseModel{
	private String collateralType;
	private Long status;

}
