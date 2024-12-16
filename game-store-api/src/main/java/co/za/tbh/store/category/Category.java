package co.za.tbh.store.category;

import co.za.tbh.store.common.BaseEntity;
import co.za.tbh.store.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends BaseEntity {
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Game> games;
}
