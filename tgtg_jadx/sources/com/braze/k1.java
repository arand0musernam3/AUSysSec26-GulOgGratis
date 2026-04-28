package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f9893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.managers.a f9894c;

    public /* synthetic */ k1(Braze braze, com.braze.managers.a aVar, int i11) {
        this.f9892a = i11;
        this.f9893b = braze;
        this.f9894c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9892a) {
            case 0:
                return Braze.closeSession$lambda$43(this.f9893b, this.f9894c);
            default:
                return Braze.openSession$lambda$40(this.f9893b, this.f9894c);
        }
    }
}
