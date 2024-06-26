package ptithcm.DAO;

import java.util.List;

import ptithcm.entity.Cart;
import ptithcm.entity.Coupon;

public interface ICartDAO {

	boolean insertCart(Cart cart);

	boolean deleteCart(Cart cart);

	boolean updateCart(Cart cart);

	Coupon getCoupon(String coupon);

	int updateQuantity(int productId, int quantity);

	Cart getCart(int accountId, int productId);

	List<Cart> getCart(int accountId);

	int removeCart(int accountId);

	int updateCoupon(String coupon, int amount);

}
