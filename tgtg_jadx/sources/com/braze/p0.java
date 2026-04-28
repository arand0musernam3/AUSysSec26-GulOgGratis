package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10316d;

    public /* synthetic */ p0(com.braze.requests.framework.h hVar, long j9, Object obj, int i11) {
        this.f10313a = i11;
        this.f10315c = hVar;
        this.f10314b = j9;
        this.f10316d = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10313a) {
            case 0:
                return Braze.logPushDelivery$lambda$194((Braze) this.f10315c, (String) this.f10316d, this.f10314b);
            case 1:
                return com.braze.requests.framework.e.a((com.braze.requests.framework.h) this.f10315c, this.f10314b, (com.braze.models.response.d) this.f10316d);
            case 2:
                return com.braze.requests.framework.e.a((com.braze.requests.framework.g) this.f10315c, (com.braze.requests.framework.h) this.f10316d, this.f10314b);
            case 3:
                return com.braze.requests.framework.h.a((com.braze.requests.framework.h) this.f10315c, (com.braze.requests.framework.i) this.f10316d, this.f10314b);
            default:
                return com.braze.requests.framework.queue.c.a((com.braze.requests.framework.h) this.f10315c, this.f10314b, (com.braze.requests.framework.h) this.f10316d);
        }
    }

    public /* synthetic */ p0(Object obj, Object obj2, long j9, int i11) {
        this.f10313a = i11;
        this.f10315c = obj;
        this.f10316d = obj2;
        this.f10314b = j9;
    }
}
