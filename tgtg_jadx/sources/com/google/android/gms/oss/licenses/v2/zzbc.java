package com.google.android.gms.oss.licenses.v2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbc extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbg zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbg zzbgVar, x70.c cVar) {
        super(cVar);
        this.zzb = zzbgVar;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzc(null, this);
    }
}
