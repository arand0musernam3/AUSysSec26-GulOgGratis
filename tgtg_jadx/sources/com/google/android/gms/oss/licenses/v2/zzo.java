package com.google.android.gms.oss.licenses.v2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzo implements Function0 {
    final /* synthetic */ Function1 zza;
    final /* synthetic */ int zzb;

    public zzo(Function1 function1, int i11) {
        this.zza = function1;
        this.zzb = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.zza.invoke(Integer.valueOf(this.zzb));
        return Unit.f26487a;
    }
}
