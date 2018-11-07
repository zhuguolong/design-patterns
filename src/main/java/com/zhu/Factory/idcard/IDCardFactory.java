package com.zhu.Factory.idcard;

import com.zhu.Factory.framework.Factory;
import com.zhu.Factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owner = new ArrayList();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owner.add(((IDCard) product).getOwner());
    }
}
