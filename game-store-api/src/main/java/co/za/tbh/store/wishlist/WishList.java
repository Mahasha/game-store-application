package co.za.tbh.store.wishlist;

import co.za.tbh.store.common.BaseEntity;
import co.za.tbh.store.game.Game;
import co.za.tbh.store.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
public class WishList extends BaseEntity {
    private String name;

    @OneToOne
    private User user;
    @ManyToMany(mappedBy = "wishlists", fetch = FetchType.EAGER)
    private List<Game> games;
}
