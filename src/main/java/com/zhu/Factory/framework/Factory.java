package com.zhu.Factory.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 生产产品
    protected abstract Product createProduct(String owner);
    // 注册产品
    protected abstract void registerProduct(Product product);
}
