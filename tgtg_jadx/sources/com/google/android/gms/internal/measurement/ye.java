package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ye implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12070d;

    public ye(y00.m3 m3Var, AtomicReference atomicReference, y00.t4 t4Var) {
        this.f12067a = 11;
        this.f12068b = atomicReference;
        this.f12069c = t4Var;
        Objects.requireNonNull(m3Var);
        this.f12070d = m3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0312  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ye.run():void");
    }

    public /* synthetic */ ye(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f12067a = i11;
        this.f12070d = obj;
        this.f12068b = obj2;
        this.f12069c = obj3;
    }

    public /* synthetic */ ye(Object obj, Object obj2, Object obj3, int i11) {
        this.f12067a = i11;
        this.f12068b = obj;
        this.f12069c = obj2;
        this.f12070d = obj3;
    }

    public /* synthetic */ ye() {
        this.f12067a = 1;
    }
}
