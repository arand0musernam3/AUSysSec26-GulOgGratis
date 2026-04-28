package com.google.android.gms.oss.licenses.v2;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements Function1 {
    final /* synthetic */ List zza;

    public zzp(List list) {
        this.zza = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.zza.get(((Number) obj).intValue());
        return null;
    }
}
