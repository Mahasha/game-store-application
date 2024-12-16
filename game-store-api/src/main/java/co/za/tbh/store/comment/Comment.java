package co.za.tbh.store.comment;

import co.za.tbh.store.common.BaseEntity;
import co.za.tbh.store.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment  extends BaseEntity {

    private String comment;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
}
