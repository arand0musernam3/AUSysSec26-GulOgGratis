package com.google.android.gms.oss.licenses.v2;

import ba0.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import o00.v1;
import v80.b0;
import x70.c;
import y70.a;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzf extends i implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ v1 zzc;
    final /* synthetic */ zzbg zzd;
    final /* synthetic */ b1 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(v1 v1Var, zzbg zzbgVar, b1 b1Var, c cVar) {
        super(2, cVar);
        this.zzc = v1Var;
        this.zzd = zzbgVar;
        this.zze = b1Var;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        return new zzf(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((b0) obj, (c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b1 b1Var;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzb == 0) {
            g.M(obj);
            v1 v1Var = this.zzc;
            if (v1Var != null) {
                b1 b1Var2 = this.zze;
                zzbg zzbgVar = this.zzd;
                this.zza = b1Var2;
                this.zzb = 1;
                obj = zzbgVar.zzc(v1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
                b1Var = b1Var2;
            }
            return Unit.f26487a;
        }
        b1Var = (b1) this.zza;
        g.M(obj);
        b1Var.setValue((String) obj);
        return Unit.f26487a;
    }
}
