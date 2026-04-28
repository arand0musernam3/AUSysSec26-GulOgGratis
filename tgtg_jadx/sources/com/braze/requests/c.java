package com.braze.requests;

import com.adyen.checkout.components.core.PaymentMethodTypes;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum c {
    SESSION_START("ss"),
    DUST_INITIATED("di"),
    CLIENT_INITIATED("ci"),
    UNKNOWN(PaymentMethodTypes.UNKNOWN);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10370a;

    c(String str) {
        this.f10370a = str;
    }
}
