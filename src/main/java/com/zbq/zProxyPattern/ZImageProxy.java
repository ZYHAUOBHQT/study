package com.zbq.zProxyPattern;

public class ZImageProxy implements ZImage {
    private ZImage zImage;

    public ZImageProxy() {
        super();
    }

    public ZImageProxy(ZImage zImage) {
        super();
        this.zImage = zImage;
    }

    @Override
    public void load() {
        if (null == zImage) {
            zImage = new ZBackground();
        }
        zImage.load();
    }
}
