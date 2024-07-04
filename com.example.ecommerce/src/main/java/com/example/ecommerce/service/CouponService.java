package com.example.ecommerce.service;

import com.example.ecommerce.entity.Coupon;

public interface CouponService {
    Coupon createCoupon(Coupon coupon);
    Coupon getCouponByCode(String code);
}
