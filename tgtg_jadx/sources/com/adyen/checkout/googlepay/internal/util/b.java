package com.adyen.checkout.googlepay.internal.util;

import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.PaymentMethod;
import d10.c;
import d10.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements c, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GooglePayAvailabilityCheck f8828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentAvailableCallback f8829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod f8830c;

    public /* synthetic */ b(GooglePayAvailabilityCheck googlePayAvailabilityCheck, ComponentAvailableCallback componentAvailableCallback, PaymentMethod paymentMethod) {
        this.f8828a = googlePayAvailabilityCheck;
        this.f8829b = componentAvailableCallback;
        this.f8830c = paymentMethod;
    }

    @Override // d10.c
    public void onCanceled() {
        GooglePayAvailabilityCheck.isAvailable$lambda$2(this.f8828a, this.f8829b, this.f8830c);
    }

    @Override // d10.d
    public void onFailure(Exception exc) {
        GooglePayAvailabilityCheck.isAvailable$lambda$4(this.f8828a, this.f8829b, this.f8830c, exc);
    }
}
