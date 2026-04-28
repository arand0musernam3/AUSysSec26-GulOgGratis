package com.google.android.gms.oss.licenses.v2;

import ba0.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import y70.a;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzah extends i implements Function2 {
    final /* synthetic */ zzbg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzbg zzbgVar, c cVar) {
        super(2, cVar);
        this.zza = zzbgVar;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        return new zzah(this.zza, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((b0) obj, (c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        g.M(obj);
        this.zza.zzb();
        return Unit.f26487a;
    }
}
