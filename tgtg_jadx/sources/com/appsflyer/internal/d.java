package com.appsflyer.internal;

import com.appsflyer.internal.AFa1tSDK;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9537b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f9536a = i11;
        this.f9537b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9536a) {
            case 0:
                return ((AFa1tSDK.AFa1ySDK) this.f9537b).getCurrencyIso4217Code();
            default:
                return ((AFc1cSDK) this.f9537b).o_();
        }
    }
}
