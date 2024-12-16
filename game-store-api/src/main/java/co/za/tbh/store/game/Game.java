package co.za.tbh.store.game;

import co.za.tbh.store.category.Category;
import co.za.tbh.store.comment.Comment;
import co.za.tbh.store.common.BaseEntity;
import co.za.tbh.store.wishlist.WishList;
import jakarta.persistence.*;
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
public class Game extends BaseEntity {

    private String title;
    @Enumerated(EnumType.STRING)
    private SupportedPlatforms supportedPlatforms;
    private String coverPicture;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany(mappedBy = "game")
    private List<Comment> comments;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_wishlist",
            joinColumns = {
                    @JoinColumn(name = "game_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "wishlist_id")
            }
    )
    private List<WishList> wishlists;

    public void addWishlist(WishList wishlist) {
        // this.wishlists.add(wishlist);
        // wishlist.getGames().add(this);
    }

    public void removeWishlist(WishList wishlist) {
        // this.wishlists.remove(wishlist);
        // wishlist.getGames().remove(this);
    }
}
