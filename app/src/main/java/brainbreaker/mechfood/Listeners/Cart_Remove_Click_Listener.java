package brainbreaker.mechfood.Listeners;

import brainbreaker.mechfood.Models.CartProduct;
import brainbreaker.mechfood.Models.Product;

/**
 * Created by brainbreaker on 18/2/16.
 */
public interface Cart_Remove_Click_Listener {
    // TODO: Update argument type and name
    void onCartRemoveClick(CartProduct item, Integer position);
}
