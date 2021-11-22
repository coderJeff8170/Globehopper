package com.cognixia.app.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "POST")
public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String createdBy;
        private String imageUrl;
        private String message;
        private Date createdOn;

	public Post(Integer id, String createdBy, String imageUrl, String message, Date createdOn) {
			super();
			this.id = id;
			this.createdBy = createdBy;
			this.imageUrl = imageUrl;
			this.message = message;
			this.createdOn = createdOn;
		}
	public int getIdNumber() {
        return id;
    }
    public void setIdNumber(int idNumber) {
        this.id = idNumber;
    }
    public String getUserName() {
        return createdBy;
    }
    public void setUserName(String userName) {
        this.createdBy = userName;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getCreatedDate() {
        return createdOn;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdOn = createdDate;
    }
}
