package com.okliu.springboot.enums;

/**
 * ʹ��ö�ٱ������������ֵ�
 */
public enum AppointStateEnum {
	/** ԤԼ�ɹ� */
	SUCCESS(1, "ԤԼ�ɹ�"), 
	/** ��治�� */
	NO_NUMBER(0, "��治��"), 
	/** �ظ�ԤԼ */
	REPEAT_APPOINT(-1, "�ظ�ԤԼ"), 
	/** ϵͳ�쳣 */
	INNER_ERROR(-2, "ϵͳ�쳣");

	private int state;

	private String stateInfo;

	private AppointStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static AppointStateEnum stateOf(int index) {
		for (AppointStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
