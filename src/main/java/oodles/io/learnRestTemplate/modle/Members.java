package oodles.io.learnRestTemplate.modle;

import java.time.LocalDateTime;
import java.util.Objects;

import lombok.Data;
@Data
public class Members {

	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Members(Long userId, boolean isCreator, LocalDateTime lastSeen) {
		super();
		this.userId = userId;
		this.isCreator = isCreator;
		this.lastSeen = lastSeen;
	}

	private Long userId;
	private boolean isCreator;
	private LocalDateTime lastSeen;
	
	
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public boolean isCreator() {
		return isCreator;
	}

	public void setCreator(boolean isCreator) {
		this.isCreator = isCreator;
	}

	public LocalDateTime getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(LocalDateTime lastSeen) {
		this.lastSeen = lastSeen;
	}

	public Members(Long userId, boolean isCreator) {
		this.userId = userId;
		this.isCreator = isCreator;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		return isCreator == other.isCreator && Objects.equals(lastSeen, other.lastSeen)
				&& Objects.equals(userId, other.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isCreator, lastSeen, userId);
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", isCreator=" + isCreator + ", lastSeen=" + lastSeen + "]";
	}
	

}
