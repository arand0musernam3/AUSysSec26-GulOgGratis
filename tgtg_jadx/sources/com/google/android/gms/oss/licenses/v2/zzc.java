package com.google.android.gms.oss.licenses.v2;

import com.google.android.gms.oss.licenses.R;
import g3.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import o30.f0;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzc implements Function2 {
    static final /* synthetic */ zzc zza = new zzc();

    private /* synthetic */ zzc() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        int i11 = iIntValue & 3;
        int i12 = iIntValue & 1;
        n nVar = (n) obj;
        int i13 = zzd.zza;
        s sVar = (s) nVar;
        if (sVar.R(i12, i11 != 2)) {
            i2.b(e.x(), f0.U(sVar, R.string.back_button_content_description), null, 0L, sVar, 0, 12);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
