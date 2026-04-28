package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AFh1kSDK extends AFh1sSDK {
    private final boolean copy;
    private final boolean copydefault;

    public AFh1kSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copydefault = bool != null ? bool.booleanValue() : true;
        this.copy = true;
    }

    public AFh1kSDK() {
        this(null, null, null);
    }
}
