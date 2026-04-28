package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class nf extends ef implements df {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Exception f11671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11672h;

    /* JADX WARN: Multi-variable type inference failed */
    public nf(String str, df dfVar, sf sfVar, boolean z11, xf xfVar) {
        super("<missing root>:".concat(str), (bf) dfVar, sf.a(sfVar, rf.f11835f), xfVar);
        this.f11671g = dfVar.c();
        this.f11672h = z11;
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final Exception c() {
        return this.f11671g;
    }

    @Override // com.google.android.gms.internal.measurement.yf
    public final sf l() {
        return rf.f11834e;
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final nf m0(String str, sf sfVar, boolean z11, xf xfVar) {
        boolean z12 = this.f11672h;
        if (z11 && !z12) {
            AtomicReference atomicReference = hf.f11474a;
        }
        boolean z13 = true;
        if ((!z11 || z12) && !z12) {
            z13 = false;
        }
        return new nf(str, this, sfVar, z13, xfVar);
    }

    @Override // com.google.android.gms.internal.measurement.yf
    public final yf t0(String str, sf sfVar, xf xfVar) {
        AtomicReference atomicReference = hf.f11474a;
        return m0(str, sfVar, true, xfVar);
    }

    public nf(UUID uuid, String str, String str2, sf sfVar, zzvr zzvrVar, xf xfVar) {
        super("<missing root>:".concat(str2), uuid, str, sf.a(sfVar, rf.f11835f), xfVar);
        this.f11671g = zzvrVar;
        this.f11672h = false;
    }
}
