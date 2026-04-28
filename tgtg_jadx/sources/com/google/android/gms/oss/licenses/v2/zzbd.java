package com.google.android.gms.oss.licenses.v2;

import android.app.Application;
import ba0.g;
import com.google.android.gms.oss.licenses.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o00.v1;
import v80.b0;
import x70.c;
import y70.a;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbd extends i implements Function2 {
    final /* synthetic */ Application zza;
    final /* synthetic */ v1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(Application application, v1 v1Var, c cVar) {
        super(2, cVar);
        this.zza = application;
        this.zzb = v1Var;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        return new zzbd(this.zza, this.zzb, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((b0) obj, (c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        g.M(obj);
        Application application = this.zza;
        v1 v1Var = this.zzb;
        return pd.g.P(application, "third_party_licenses", v1Var.f31758b, v1Var.f31759c, R.raw.keep_third_party_licenses);
    }
}
