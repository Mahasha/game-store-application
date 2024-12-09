package co.za.tbh.store.notification;

import co.za.tbh.store.common.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notification extends BaseEntity {
    private String message;
    private String receiver;
    private NotificationLevel level;
    private NotificationStatus status;
}
