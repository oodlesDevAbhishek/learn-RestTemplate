package oodles.io.learnRestTemplate.modle;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatRoomResponse{
	public ChatRoomResponse(Data data, String message, boolean isSuccess, Long timestemp) {
		super();
		this.data = data;
		this.message = message;
		this.isSuccess = isSuccess;
		this.timestemp = timestemp;
	}
	public ChatRoomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ChatRoomResponse [data=" + data + ", message=" + message + ", isSuccess=" + isSuccess + ", timestemp="
				+ timestemp + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Long getTimestemp() {
		return timestemp;
	}
	public void setTimestemp(Long timestemp) {
		this.timestemp = timestemp;
	}
	private Data data;
	private String message;
	private boolean isSuccess;
	private Long timestemp;

}