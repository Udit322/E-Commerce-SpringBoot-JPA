
package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Coupon;
import com.example.ecommerce.repository.CouponRepository;
import com.example.ecommerce.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Override
    public Coupon createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @Override
    public Coupon getCouponByCode(String code) {
        return couponRepository.findByCode(code);
    }
}
