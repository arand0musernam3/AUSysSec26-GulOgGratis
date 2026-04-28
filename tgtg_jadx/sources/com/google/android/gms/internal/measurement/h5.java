package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11456a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11457b;

    public h5(int i11) {
        this.f11457b = i11;
    }

    public static b5 c(b7 b7Var, List list) {
        fa.f(l5.FN.name(), list, 2);
        c5 c5VarE = ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(0));
        c5 c5VarE2 = ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(1));
        if (!(c5VarE2 instanceof n1)) {
            i4.a.f(e0.f.k("FN requires an ArrayValue of parameter names found ", c5VarE2.getClass().getCanonicalName()));
            return null;
        }
        List listN = ((n1) c5VarE2).n();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new b5(c5VarE.e(), (ArrayList) listN, arrayList, b7Var);
    }

    public static boolean d(c5 c5Var, c5 c5Var2) {
        if (c5Var instanceof y4) {
            c5Var = new f5(c5Var.e());
        }
        if (c5Var2 instanceof y4) {
            c5Var2 = new f5(c5Var2.e());
        }
        if ((c5Var instanceof f5) && (c5Var2 instanceof f5)) {
            return ((f5) c5Var).f11408a.compareTo(((f5) c5Var2).f11408a) < 0;
        }
        double dDoubleValue = c5Var.h().doubleValue();
        double dDoubleValue2 = c5Var2.h().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static c5 e(k5 k5Var, c5 c5Var, c5 c5Var2) {
        if (c5Var instanceof Iterable) {
            return g(k5Var, ((Iterable) c5Var).iterator(), c5Var2);
        }
        i4.a.f("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(c5 c5Var, c5 c5Var2) {
        if (c5Var.getClass().equals(c5Var2.getClass())) {
            if ((c5Var instanceof g5) || (c5Var instanceof a5)) {
                return true;
            }
            return c5Var instanceof i3 ? (Double.isNaN(c5Var.h().doubleValue()) || Double.isNaN(c5Var2.h().doubleValue()) || c5Var.h().doubleValue() != c5Var2.h().doubleValue()) ? false : true : c5Var instanceof f5 ? c5Var.e().equals(c5Var2.e()) : c5Var instanceof b2 ? c5Var.d().equals(c5Var2.d()) : c5Var == c5Var2;
        }
        if (((c5Var instanceof g5) || (c5Var instanceof a5)) && ((c5Var2 instanceof g5) || (c5Var2 instanceof a5))) {
            return true;
        }
        boolean z11 = c5Var instanceof i3;
        if (z11 && (c5Var2 instanceof f5)) {
            return f(c5Var, new i3(c5Var2.h()));
        }
        boolean z12 = c5Var instanceof f5;
        if (z12 && (c5Var2 instanceof i3)) {
            return f(new i3(c5Var.h()), c5Var2);
        }
        if (c5Var instanceof b2) {
            return f(new i3(c5Var.h()), c5Var2);
        }
        if (c5Var2 instanceof b2) {
            return f(c5Var, new i3(c5Var2.h()));
        }
        if ((z12 || z11) && (c5Var2 instanceof y4)) {
            return f(c5Var, new f5(c5Var2.e()));
        }
        if ((c5Var instanceof y4) && ((c5Var2 instanceof f5) || (c5Var2 instanceof i3))) {
            return f(new f5(c5Var.e()), c5Var2);
        }
        return false;
    }

    public static c5 g(k5 k5Var, Iterator it, c5 c5Var) {
        b7 b7VarD;
        if (it != null) {
            while (it.hasNext()) {
                c5 c5Var2 = (c5) it.next();
                switch (k5Var.f11562a) {
                    case 0:
                        b7VarD = k5Var.f11563b.d();
                        String str = k5Var.f11564c;
                        b7VarD.g(str, c5Var2);
                        ((HashMap) b7VarD.f11285e).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        b7VarD = k5Var.f11563b.d();
                        b7VarD.g(k5Var.f11564c, c5Var2);
                        break;
                    default:
                        b7VarD = k5Var.f11563b;
                        b7VarD.g(k5Var.f11564c, c5Var2);
                        break;
                }
                c5 c5VarC = b7VarD.c((n1) c5Var);
                if (c5VarC instanceof q2) {
                    q2 q2Var = (q2) c5VarC;
                    String str2 = q2Var.f11778b;
                    if ("break".equals(str2)) {
                        return c5.U;
                    }
                    if ("return".equals(str2)) {
                        return q2Var;
                    }
                }
            }
        }
        return c5.U;
    }

    public static boolean h(c5 c5Var, c5 c5Var2) {
        if (c5Var instanceof y4) {
            c5Var = new f5(c5Var.e());
        }
        if (c5Var2 instanceof y4) {
            c5Var2 = new f5(c5Var2.e());
        }
        return (((c5Var instanceof f5) && (c5Var2 instanceof f5)) || !(Double.isNaN(c5Var.h().doubleValue()) || Double.isNaN(c5Var2.h().doubleValue()))) && !d(c5Var2, c5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v328 */
    /* JADX WARN: Type inference failed for: r12v333 */
    /* JADX WARN: Type inference failed for: r12v354, types: [com.google.android.gms.internal.measurement.n1] */
    /* JADX WARN: Type inference failed for: r12v361, types: [com.google.android.gms.internal.measurement.z4] */
    /* JADX WARN: Type inference failed for: r12v399 */
    /* JADX WARN: Type inference failed for: r12v400 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.gms.internal.measurement.b7] */
    /* JADX WARN: Type inference failed for: r7v63, types: [com.google.android.gms.internal.measurement.c5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.c5 a(java.lang.String r12, com.google.android.gms.internal.measurement.b7 r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instruction units count: 3762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h5.a(java.lang.String, com.google.android.gms.internal.measurement.b7, java.util.ArrayList):com.google.android.gms.internal.measurement.c5");
    }

    public final void b(String str) {
        if (!this.f11456a.contains(fa.m(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
