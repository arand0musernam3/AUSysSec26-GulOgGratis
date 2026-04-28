package com.google.android.gms.oss.licenses.v2;

import android.content.Context;
import android.util.TypedValue;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import i4.g0;
import m3.d3;
import m3.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzax {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final u1 zzb = new d3(zzau.zza);

    @NotNull
    private static final u1 zzc = new d3(zzav.zza);

    @NotNull
    public static final u1 zza() {
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0144 A[PHI: r2
      0x0144: PHI (r2v20 g3.p0) = (r2v10 g3.p0), (r2v21 g3.p0) binds: [B:41:0x0155, B:34:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void zzb(boolean r109, boolean r110, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2 r111, @org.jetbrains.annotations.Nullable m3.n r112, final int r113, int r114) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.oss.licenses.v2.zzax.zzb(boolean, boolean, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    private static final long zzc(Context context, String str, long j9) {
        int identifier = context.getResources().getIdentifier(str, "attr", context.getPackageName());
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(str, "attr", AnalyticsPlatformParams.channel);
        }
        if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
                return g0.c(typedValue.data);
            }
        }
        return j9;
    }
}
