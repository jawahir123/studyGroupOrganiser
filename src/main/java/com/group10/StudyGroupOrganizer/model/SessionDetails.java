package com.group10.StudyGroupOrganizer.model;

import jakarta.persistence.*;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "SessionTble")
@Data
public class SessionDetails {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
   @ManyToOne
   @JoinColumn(name = "id", nullable = false ,insertable = false,updatable = false)
   private Group groupId;
   private String sessionName;
   private Date sessionDate;
   private Date startDate;
   private Date endDate ;
   private String location;
   private String userCreated;

   public String getStartDateAsString() {
      if (startDate != null) {
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm");
         return formatter.format(startDate);
      }
      return ""; // Or return null if you prefer
   }
   public String getEndDateAsString() {
      if (startDate != null) {
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm");
         return formatter.format(endDate);
      }
      return ""; // Or return null if you prefer
   }

}
