package com.google.android.gms.oss.licenses;

import android.os.Build;
import androidx.activity.r;
import k.h;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zza {
    private static final boolean zza;

    static {
        zza = Build.VERSION.SDK_INT >= 27;
    }

    public static void zza(h hVar) {
        if (zza) {
            int i11 = r.f1751a;
            hVar.getClass();
            r.a(hVar);
            n.G(hVar.getWindow(), true);
        }
    }
}
