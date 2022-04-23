package com.coupon.calculation.controller.service.intf;


import com.coupon.calculation.api.beans.ShoppingCart;
import com.coupon.calculation.api.beans.SimulationOrder;
import com.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface CouponCalculationService {

    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
