package com.zbq001_JavaBasics.CabiAhBg_ProxyPattern_20180716;

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
