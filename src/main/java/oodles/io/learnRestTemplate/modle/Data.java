package oodles.io.learnRestTemplate.modle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Document(value = "new_chat_room_details")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	@Id
	private int id;
	private String chatRoomId;
	private String chatRoomName;
	private String chatRoomImageLink;
	private String roomAccessKey;
	private int totalMembers;
	private List<Members> members;
	private Map<String, Object> lastMessageDetails;
	private long unreadCount;
	private LocalDateTime lastConversation;
	private LocalDateTime creationDate;
	private String chatRoomType;
	private boolean favorite;

	public Data(String chatRoomId, String chatRoomName, String chatRoomImageLink, String roomAccessKey,
			int totalMembers, List<Members> members, Map<String, Object> lastMessageDetails, long unreadCount,
			LocalDateTime lastConversation, LocalDateTime creationDate, String chatRoomType, boolean favorite) {
		super();
		this.chatRoomId = chatRoomId;
		this.chatRoomName = chatRoomName;
		this.chatRoomImageLink = chatRoomImageLink;
		this.roomAccessKey = roomAccessKey;
		this.totalMembers = totalMembers;
		this.members = members;
		this.lastMessageDetails = lastMessageDetails;
		this.unreadCount = unreadCount;
		this.lastConversation = lastConversation;
		this.creationDate = creationDate;
		this.chatRoomType = chatRoomType;
		this.favorite = favorite;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getChatRoomId() {
		return chatRoomId;
	}
	public void setChatRoomId(String chatRoomId) {
		this.chatRoomId = chatRoomId;
	}
	public String getChatRoomName() {
		return chatRoomName;
	}
	public void setChatRoomName(String chatRoomName) {
		this.chatRoomName = chatRoomName;
	}
	public String getChatRoomImageLink() {
		return chatRoomImageLink;
	}
	public void setChatRoomImageLink(String chatRoomImageLink) {
		this.chatRoomImageLink = chatRoomImageLink;
	}
	public String getRoomAccessKey() {
		return roomAccessKey;
	}
	public void setRoomAccessKey(String roomAccessKey) {
		this.roomAccessKey = roomAccessKey;
	}
	public int getTotalMembers() {
		return totalMembers;
	}
	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}
	public List<Members> getMembers() {
		return members;
	}
	public void setMembers(List<Members> members) {
		this.members = members;
	}
	public Map<String, Object> getLastMessageDetails() {
		return lastMessageDetails;
	}
	public void setLastMessageDetails(Map<String, Object> lastMessageDetails) {
		this.lastMessageDetails = lastMessageDetails;
	}
	public long getUnreadCount() {
		return unreadCount;
	}
	public void setUnreadCount(long unreadCount) {
		this.unreadCount = unreadCount;
	}
	public LocalDateTime getLastConversation() {
		return lastConversation;
	}
	public void setLastConversation(LocalDateTime lastConversation) {
		this.lastConversation = lastConversation;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public String getChatRoomType() {
		return chatRoomType;
	}
	public void setChatRoomType(String chatRoomType) {
		this.chatRoomType = chatRoomType;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean isFavorite) {
		this.favorite = isFavorite;
	}
	
	
}
