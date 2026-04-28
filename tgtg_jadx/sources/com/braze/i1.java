package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9861c;

    public /* synthetic */ i1(int i11, long j9, long j11) {
        this.f9859a = i11;
        this.f9860b = j9;
        this.f9861c = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9859a) {
            case 0:
                return Braze._init_$lambda$28(this.f9860b, this.f9861c);
            default:
                return com.braze.triggers.managers.c.a(this.f9860b, this.f9861c);
        }
    }
}
