package com.okliu.springboot.enums;

/**
 * ʹ��ö�ٱ������������ֵ�
 */
public enum ClassStateEnum {
	SUCCESS(1, "�½��ɹ�"), 
	FAILED(2, "�½�ʧ��");

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
