package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class mf extends bf implements df {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zzvr f11637g = new zzvr();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Exception f11638f;

    public mf(UUID uuid, String str, zzvr zzvrVar, xf xfVar) {
        super("<missing root>", uuid, str, xfVar);
        this.f11638f = zzvrVar;
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final Exception c() {
        return this.f11638f;
    }

    @Override // com.google.android.gms.internal.measurement.yf
    public final sf d() {
        return rf.f11834e;
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final nf m0(String str, sf sfVar, boolean z11, xf xfVar) {
        if (z11) {
            AtomicReference atomicReference = hf.f11474a;
        }
        return new nf(str, this, sfVar, z11, xfVar);
    }

    @Override // com.google.android.gms.internal.measurement.yf
    public final yf t0(String str, sf sfVar, xf xfVar) {
        AtomicReference atomicReference = hf.f11474a;
        return m0(str, sfVar, true, xfVar);
    }
}
