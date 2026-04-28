package y00;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f45102b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f45103c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f45104d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f45105a;

    public r0(f1 f1Var) {
        this.f45105a = f1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.i0.h(atomicReference);
        com.google.android.gms.common.internal.i0.b(strArr.length == strArr2.length);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (Objects.equals(str, strArr[i11])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i11];
                        if (str2 == null) {
                            str2 = strArr2[i11] + "(" + strArr[i11] + ")";
                            strArr3[i11] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f45105a.a() ? str : g(str, c2.f44652f, c2.f44647a, f45102b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f45105a.a() ? str : g(str, c2.f44655i, c2.f44654h, f45103c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f45105a.a() ? str : str.startsWith("_exp_") ? w.a0.p("experiment_id(", str, ")") : g(str, c2.f44658m, c2.l, f45104d);
    }

    public final String d(u uVar) {
        f1 f1Var = this.f45105a;
        if (!f1Var.a()) {
            return uVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(uVar.f45197c);
        sb2.append(",name=");
        sb2.append(a(uVar.f45195a));
        sb2.append(",params=");
        t tVar = uVar.f45196b;
        sb2.append(tVar == null ? null : !f1Var.a() ? tVar.f45137a.toString() : e(tVar.h()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f45105a.a()) {
            return bundle.toString();
        }
        StringBuilder sbO = b3.i.o("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbO.length() != 8) {
                sbO.append(", ");
            }
            sbO.append(b(str));
            sbO.append("=");
            Object obj = bundle.get(str);
            sbO.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbO.append("}]");
        return sbO.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbO = b3.i.o("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbO.length() != 1) {
                    sbO.append(", ");
                }
                sbO.append(strE);
            }
        }
        sbO.append("]");
        return sbO.toString();
    }
}
