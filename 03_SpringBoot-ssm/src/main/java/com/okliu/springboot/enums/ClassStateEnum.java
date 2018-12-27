package com.okliu.springboot.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum ClassStateEnum {
	SUCCESS(1, "新建成功"), 
	FAILED(2, "新建失败");

	private int state;

	private String stateInfo;

	private ClassStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static ClassStateEnum stateOf(int index) {
		for (ClassStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "{state:"+state+",stateInfo:"+stateInfo+"}";
	}
}
