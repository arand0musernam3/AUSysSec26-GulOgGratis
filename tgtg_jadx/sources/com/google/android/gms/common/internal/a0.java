package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11093a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f11094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11095c;

    public a0(oz.m mVar, BasePendingResult basePendingResult) {
        this.f11094b = basePendingResult;
        Objects.requireNonNull(mVar);
        this.f11095c = mVar;
    }

    public final void a(Status status) {
        com.google.android.gms.common.api.p pVar;
        switch (this.f11093a) {
            case 0:
                if (!status.d()) {
                    ((d10.g) this.f11095c).a(i0.l(status));
                    return;
                }
                BasePendingResult basePendingResult = this.f11094b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                i0.j("Result has already been consumed.", !basePendingResult.f11077g);
                try {
                    if (!basePendingResult.f11072b.await(0L, timeUnit)) {
                        basePendingResult.c(Status.f11057h);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.c(Status.f11055f);
                }
                i0.j("Result is not ready.", basePendingResult.d());
                synchronized (basePendingResult.f11071a) {
                    i0.j("Result has already been consumed.", !basePendingResult.f11077g);
                    i0.j("Result is not ready.", basePendingResult.d());
                    pVar = basePendingResult.f11075e;
                    basePendingResult.f11075e = null;
                    basePendingResult.f11077g = true;
                    break;
                }
                if (basePendingResult.f11074d.getAndSet(null) != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return;
                } else {
                    i0.h(pVar);
                    ((d10.g) this.f11095c).b(null);
                    return;
                }
            default:
                ((Map) ((oz.m) this.f11095c).f33836b).remove(this.f11094b);
                return;
        }
    }

    public a0(BasePendingResult basePendingResult, d10.g gVar, r40.d dVar) {
        this.f11094b = basePendingResult;
        this.f11095c = gVar;
    }
}
