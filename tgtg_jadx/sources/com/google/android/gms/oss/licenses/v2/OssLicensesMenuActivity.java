package com.google.android.gms.oss.licenses.v2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.activity.r;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import b4.t;
import c5.d2;
import com.google.android.gms.oss.licenses.R;
import com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity;
import d2.m2;
import e.f;
import g3.la;
import g3.p0;
import g3.q7;
import i4.v;
import j5.a0;
import j5.b0;
import java.io.IOException;
import java.io.InputStream;
import k.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import m3.m;
import m3.n;
import m3.s;
import o00.r1;
import o00.s1;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u3.d;
import u3.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class OssLicensesMenuActivity extends h {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static String zza;

    public static final void setActivityTitle(@NonNull String str) {
        Companion.setActivityTitle(str);
    }

    public static final void setTheme(@Nullable p0 p0Var, @Nullable p0 p0Var2, @Nullable la laVar) {
        Companion.setTheme(p0Var, p0Var2, laVar);
    }

    private static final boolean zzb(Context context, String str) {
        InputStream inputStreamOpenRawResource = null;
        try {
            Resources resources = context.getResources();
            inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
            boolean z11 = inputStreamOpenRawResource.available() > 0;
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
            return z11;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        ActionBar supportActionBar;
        super.onCreate(bundle);
        r.a(this);
        final String stringExtra = zza;
        if (stringExtra == null) {
            stringExtra = getIntent().hasExtra(MessageBundle.TITLE_ENTRY) ? getIntent().getStringExtra(MessageBundle.TITLE_ENTRY) : null;
        }
        if (getSupportActionBar() != null && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.f();
        }
        final boolean z11 = false;
        if (zzb(this, "third_party_licenses") && zzb(this, "third_party_license_metadata")) {
            z11 = true;
        }
        f.a(this, new d(new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzaf
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                int i11 = iIntValue & 3;
                int i12 = iIntValue & 1;
                n nVar = (n) obj;
                OssLicensesMenuActivity.Companion companion = OssLicensesMenuActivity.Companion;
                s sVar = (s) nVar;
                if (sVar.R(i12, i11 != 2)) {
                    final boolean z12 = z11;
                    final String str = stringExtra;
                    zzax.zzb(false, false, e.e(-1968053328, sVar, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzac
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i13 = iIntValue2 & 3;
                            int i14 = iIntValue2 & 1;
                            n nVar2 = (n) obj3;
                            OssLicensesMenuActivity.Companion companion2 = OssLicensesMenuActivity.Companion;
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(i14, i13 != 2)) {
                                final long j9 = ((p0) sVar2.j(zzax.zza())).f19279n;
                                t tVarJ = d2.j(m2.f13850c, "LicenseTheme");
                                boolean zE = sVar2.e(j9);
                                Object objM = sVar2.M();
                                if (zE || objM == m.f29332a) {
                                    objM = new Function1() { // from class: com.google.android.gms.oss.licenses.v2.zzad
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            b0 b0Var = (b0) obj5;
                                            OssLicensesMenuActivity.Companion companion3 = OssLicensesMenuActivity.Companion;
                                            b0Var.getClass();
                                            long j11 = j9;
                                            KProperty[] kPropertyArr = s1.f31741a;
                                            b0Var.getClass();
                                            a0 a0Var = r1.f31738a;
                                            KProperty kProperty = s1.f31741a[0];
                                            b0Var.b(a0Var, new v(j11));
                                            return Unit.f26487a;
                                        }
                                    };
                                    sVar2.k0(objM);
                                }
                                final boolean z13 = z12;
                                final String str2 = str;
                                q7.a(j5.r.c(tVarJ, false, (Function1) objM), null, j9, 0L, 0.0f, 0.0f, null, e.e(-382829429, sVar2, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzae
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* synthetic */ Object invoke(Object obj5, Object obj6) {
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i15 = iIntValue3 & 3;
                                        int i16 = iIntValue3 & 1;
                                        n nVar3 = (n) obj5;
                                        OssLicensesMenuActivity.Companion companion3 = OssLicensesMenuActivity.Companion;
                                        s sVar3 = (s) nVar3;
                                        if (sVar3.R(i16, i15 != 2)) {
                                            zzar.zza(null, str2, z13, sVar3, 0, 1);
                                        } else {
                                            sVar3.U();
                                        }
                                        return Unit.f26487a;
                                    }
                                }), sVar2, 12582912, 122);
                            } else {
                                sVar2.U();
                            }
                            return Unit.f26487a;
                        }
                    }), sVar, MLKEMEngine.KyberPolyBytes, 3);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            }
        }, true, 546016281));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void setActivityTitle(@NonNull String str) {
            str.getClass();
            OssLicensesMenuActivity.zza = str;
        }

        public final void setTheme(@Nullable p0 p0Var, @Nullable p0 p0Var2, @Nullable la laVar) {
            zzas.zze(p0Var);
            zzas.zzd(p0Var2);
            zzas.zzf(laVar);
        }

        private Companion() {
            throw null;
        }
    }
}
