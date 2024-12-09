package co.za.tbh.store.game;

import co.za.tbh.store.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Game extends BaseEntity {
    private String title;
    @Enumerated(EnumType.STRING)
    private SupportedPlatforms supportedPlatforms;
    private String coverPicture;
}
