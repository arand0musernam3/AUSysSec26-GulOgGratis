package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class jd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f11520d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa f11521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f11522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11523c;

    public jd(oa oaVar, String str) {
        this.f11521a = oaVar;
        this.f11523c = str;
        Context context = oaVar.f11702b;
        Pattern pattern = ae.f11256a;
        zw.q2 q2Var = new zw.q2(context);
        q2Var.s0("phenotype");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4);
        sb2.append(ExpiryDateInput.SEPARATOR);
        sb2.append(str);
        sb2.append(".pb");
        q2Var.t0(sb2.toString());
        this.f11522b = q2Var.u0();
    }

    public final ae.c a() {
        String strSubstring;
        int i11;
        ac acVar;
        ac acVar2;
        String str;
        String str2 = this.f11523c;
        oa oaVar = this.f11521a;
        j30.l lVar = oaVar.f11706f;
        if (!fa.s(oaVar.f11702b)) {
            return new ae.c(ld.A(), new androidx.recyclerview.widget.r1(3, 17));
        }
        if (f11520d == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f11520d = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    f11520d = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    f11520d = Boolean.FALSE;
                }
            }
        }
        if (f11520d.booleanValue()) {
            return new ae.c(ld.A(), new androidx.recyclerview.widget.r1(3, 18));
        }
        hd hdVarB = oaVar.f11707g.b();
        u0 u0Var = hdVarB.f11464c;
        l0 l0Var = l0.FILE;
        q1.e eVar = ma.f11632a;
        int iIndexOf = str2.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str2.substring(0, iIndexOf);
        } else {
            if (str2.contains("@")) {
                i4.a.f("Invalid package name: ".concat(str2));
                return null;
            }
            strSubstring = str2;
        }
        l0Var.getClass();
        if (!hdVarB.f11469h) {
            i11 = 14;
        } else if (!hdVarB.f11462a || !hdVarB.f11463b.contains(l0Var)) {
            i11 = 3;
        } else if (u0Var.c() != 0) {
            List list = hdVarB.f11467f;
            i11 = (list.isEmpty() || list.contains(strSubstring)) ? hdVarB.f11468g.contains(strSubstring) ? 6 : 0 : 5;
        } else {
            i11 = 4;
        }
        if (i11 != 0) {
            acVar2 = new ac(null, new androidx.recyclerview.widget.r1(i11));
        } else {
            try {
                str = hdVarB.f11466e;
            } catch (Exception e5) {
                h.h(Level.WARNING, oaVar.a(), e5, "Failed to read shared file for %s", str2);
                acVar = new ac(nb.f11663c, new androidx.recyclerview.widget.r1(3, 10));
                acVar2 = acVar;
            }
            if (str.isEmpty()) {
                j30.h hVar = (j30.h) oaVar.f11708h.get();
                if (hVar.b()) {
                    str = ((ApplicationInfo) hVar.a()).dataDir;
                } else {
                    h.h(Level.WARNING, oaVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                    acVar = new ac(nb.f11663c, new androidx.recyclerview.widget.r1(3, 7));
                    acVar2 = acVar;
                }
            }
            String str3 = File.separator;
            String str4 = hdVarB.f11465d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb2.append(str);
            sb2.append(str3);
            sb2.append(str4);
            String string = sb2.toString();
            a8.h hVar2 = new a8.h(u0Var, str2);
            Uri.Builder builderScheme = new Uri.Builder().scheme("file");
            String string2 = hVar2.B().toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
            sb3.append(str3);
            sb3.append(string);
            sb3.append(str3);
            sb3.append(string2);
            Uri uriBuild = builderScheme.appendEncodedPath(sb3.toString()).build();
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
            try {
                try {
                    acVar2 = new ac((nb) ((wd) lVar.get()).a(uriBuild, new a1.b(hdVarB.f11472k.t(), 2)), new androidx.recyclerview.widget.r1(5, 2));
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (zzaeh e11) {
                h.h(Level.SEVERE, oaVar.a(), e11, "Failed to parse snapshot from shared storage for %s", str2);
                acVar2 = new ac(null, new androidx.recyclerview.widget.r1(9));
            } catch (FileNotFoundException unused2) {
                h.h(Level.INFO, oaVar.a(), null, "Shared storage file not found for %s", str2);
                acVar2 = new ac(null, new androidx.recyclerview.widget.r1(8));
            }
        }
        androidx.recyclerview.widget.r1 r1Var = acVar2.f11254b;
        nb nbVar = acVar2.f11253a;
        if (nbVar != null) {
            return new ae.c(nbVar, r1Var);
        }
        int i12 = r1Var.f3901b;
        try {
            wd wdVar = (wd) lVar.get();
            Uri uri = this.f11522b;
            h2 h2Var = (h2) ld.A().s(7);
            c1 c1Var = c1.f11297a;
            int i13 = p0.f11740a;
            c1 c1Var2 = c1.f11298b;
            InputStream inputStreamD = gg.d(wdVar.b(uri));
            try {
                k1 k1VarA = ((j1) h2Var).a(inputStreamD, c1Var2);
                if (inputStreamD != null) {
                    inputStreamD.close();
                }
                return new ae.c((ld) k1VarA, new androidx.recyclerview.widget.r1(4, i12));
            } catch (Throwable th2) {
                if (inputStreamD != null) {
                    try {
                        inputStreamD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException unused3) {
            h.h(Level.INFO, oaVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str2);
            return b() ? new ae.c(nb.f11663c, new androidx.recyclerview.widget.r1(3, 16)) : new ae.c(ld.A(), new androidx.recyclerview.widget.r1(3, 11));
        }
    }

    public final boolean b() {
        od odVar = this.f11521a.f11707g;
        l0 l0Var = l0.FILE;
        qb qbVarC = odVar.c();
        return qbVarC.v() && ((AbstractCollection) qbVarC.A()).contains(l0Var);
    }
}
