package com.corp.jr.util.enums;

import org.beetl.sql.annotation.entity.EnumValue;

/**
 * 描述:数据是否有效
 *
 * @author : lijiazhi
 */

public enum GeneralStateEnum {
	/**
	 * 启用
	 */
	ENABLE("S1"),
	/**
	 * 禁用
	 */
	DISABLE("S0");

	@EnumValue
	private String value;

	GeneralStateEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static GeneralStateEnum getEnum(String value) {
		for (GeneralStateEnum stateEnum : GeneralStateEnum.values()) {
			if (stateEnum.value == value) {
				return stateEnum;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
}
