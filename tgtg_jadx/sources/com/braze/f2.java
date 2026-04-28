package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9836c;

    public /* synthetic */ f2(int i11, long j9, String str) {
        this.f9834a = i11;
        this.f9835b = str;
        this.f9836c = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9834a) {
            case 0:
                return BrazeUser.f0(this.f9836c, this.f9835b);
            default:
                return com.braze.managers.y0.b(this.f9835b, this.f9836c);
        }
    }
}
