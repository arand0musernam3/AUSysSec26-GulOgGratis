package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f11159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(f fVar, int i11, Bundle bundle) {
        super(fVar, i11, bundle);
        this.f11159g = fVar;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final boolean a() {
        this.f11159g.zzc.c(pz.b.f35642f);
        return true;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final void b(pz.b bVar) {
        f fVar = this.f11159g;
        if (fVar.enableLocalFallback() && fVar.zzg()) {
            fVar.zzf(16);
        } else {
            fVar.zzc.c(bVar);
            fVar.onConnectionFailed(bVar);
        }
    }
}
