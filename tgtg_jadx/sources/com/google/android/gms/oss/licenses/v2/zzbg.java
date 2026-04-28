package com.google.android.gms.oss.licenses.v2;

import android.app.Application;
import androidx.lifecycle.b;
import androidx.lifecycle.m1;
import org.jetbrains.annotations.NotNull;
import v80.f0;
import y80.a2;
import y80.f1;
import y80.h1;
import y80.r;
import y80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbg extends b {

    @NotNull
    private final f1 zza;

    @NotNull
    private final y1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbg(@NotNull Application application) {
        super(application);
        application.getClass();
        a2 a2VarC = r.c(zzba.zza);
        this.zza = a2VarC;
        this.zzb = new h1(a2VarC);
    }

    @NotNull
    public final y1 zza() {
        return this.zzb;
    }

    public final void zzb() {
        if (((a2) this.zza).getValue() instanceof zzaz) {
            return;
        }
        f0.B(m1.d(this), null, null, new zzbf(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull o00.v1 r7, @org.jetbrains.annotations.NotNull x70.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.oss.licenses.v2.zzbc
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.oss.licenses.v2.zzbc r0 = (com.google.android.gms.oss.licenses.v2.zzbc) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.gms.oss.licenses.v2.zzbc r0 = new com.google.android.gms.oss.licenses.v2.zzbc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r8)
            goto L46
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L2e:
            ba0.g.M(r8)
            android.app.Application r8 = r6.getApplication()
            kotlin.coroutines.CoroutineContext r2 = o00.o1.f31726b
            com.google.android.gms.oss.licenses.v2.zzbd r4 = new com.google.android.gms.oss.licenses.v2.zzbd
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.zzc = r3
            java.lang.Object r8 = v80.f0.K(r2, r4, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.oss.licenses.v2.zzbg.zzc(o00.v1, x70.c):java.lang.Object");
    }
}
