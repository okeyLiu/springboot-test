package com.okliu.springboot.entity;

public class AppointmentKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.book_id
	 * @mbg.generated  Wed Dec 19 17:55:42 CST 2018
	 */
	private Long bookId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.student_id
	 * @mbg.generated  Wed Dec 19 17:55:42 CST 2018
	 */
	private Long studentId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.book_id
	 * @return  the value of appointment.book_id
	 * @mbg.generated  Wed Dec 19 17:55:42 CST 2018
	 */
	public Long getBookId() {
		return bookId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.book_id
	 * @param bookId  the value for appointment.book_id
	 * @mbg.generated  Wed Dec 19 17:55:42 CST 2018
	 */
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.student_id
	 * @return  the value of appointment.student_id
	 * @mbg.generated  Wed Dec 19 17:55:42 CST 2018
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.student_id
	 * @param studentId  the value for appointment.student_id
	 * @mbg.generated  Wed Dec 19 17:55:42 CST 2018
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
}