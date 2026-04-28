package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f11652a;

    static {
        int i11 = p0.f11740a;
        f11652a = new h1(1);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void b(Object obj, Object obj2) {
        k1 k1Var = (k1) obj;
        r2 r2Var = k1Var.zzc;
        r2 r2Var2 = ((k1) obj2).zzc;
        r2 r2Var3 = r2.f11809f;
        if (!r2Var3.equals(r2Var2)) {
            if (r2Var3.equals(r2Var)) {
                int i11 = r2Var.f11810a + r2Var2.f11810a;
                int[] iArrCopyOf = Arrays.copyOf(r2Var.f11811b, i11);
                System.arraycopy(r2Var2.f11811b, 0, iArrCopyOf, r2Var.f11810a, r2Var2.f11810a);
                Object[] objArrCopyOf = Arrays.copyOf(r2Var.f11812c, i11);
                System.arraycopy(r2Var2.f11812c, 0, objArrCopyOf, r2Var.f11810a, r2Var2.f11810a);
                r2Var = new r2(i11, iArrCopyOf, objArrCopyOf, true);
            } else {
                r2Var.getClass();
                if (!r2Var2.equals(r2Var3)) {
                    if (!r2Var.f11814e) {
                        c50.w.d();
                        return;
                    }
                    int i12 = r2Var.f11810a + r2Var2.f11810a;
                    r2Var.e(i12);
                    System.arraycopy(r2Var2.f11811b, 0, r2Var.f11811b, r2Var.f11810a, r2Var2.f11810a);
                    System.arraycopy(r2Var2.f11812c, 0, r2Var.f11812c, r2Var.f11810a, r2Var2.f11810a);
                    r2Var.f11810a = i12;
                }
            }
        }
        k1Var.zzc = r2Var;
    }

    public static Object c(Object obj, int i11, t1 t1Var, k0 k0Var, Object obj2, h1 h1Var) {
        if (k0Var == null) {
            return obj2;
        }
        if (t1Var == null) {
            Iterator it = t1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!k0Var.a(iIntValue)) {
                    if (obj2 == null) {
                        h1Var.getClass();
                        obj2 = h1.f(obj);
                    }
                    h1Var.getClass();
                    ((r2) obj2).d(i11 << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = t1Var.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) t1Var.get(i13);
            int iIntValue2 = num.intValue();
            if (k0Var.a(iIntValue2)) {
                if (i13 != i12) {
                    t1Var.set(i12, num);
                }
                i12++;
            } else {
                if (obj2 == null) {
                    h1Var.getClass();
                    obj2 = h1.f(obj);
                }
                h1Var.getClass();
                ((r2) obj2).d(i11 << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i12 != size) {
            t1Var.subList(i12, size).clear();
        }
        return obj2;
    }

    public static void d(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                b1Var.i(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Double) list.get(i14)).getClass();
            i13 += 8;
        }
        b1Var.r(i13);
        while (i12 < list.size()) {
            b1Var.u(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    public static void e(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                b1Var.g(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Float) list.get(i14)).getClass();
            i13 += 4;
        }
        b1Var.r(i13);
        while (i12 < list.size()) {
            b1Var.s(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    public static void f(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof x1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.h(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int iB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iB += b1.b(((Long) list.get(i13)).longValue());
            }
            b1Var.r(iB);
            while (i12 < list.size()) {
                b1Var.t(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z11) {
            while (i12 < x1Var.f12027c) {
                b1Var.h(i11, x1Var.c(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int iB2 = 0;
        for (int i14 = 0; i14 < x1Var.f12027c; i14++) {
            iB2 += b1.b(x1Var.c(i14));
        }
        b1Var.r(iB2);
        while (i12 < x1Var.f12027c) {
            b1Var.t(x1Var.c(i12));
            i12++;
        }
    }

    public static void g(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof x1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.h(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int iB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iB += b1.b(((Long) list.get(i13)).longValue());
            }
            b1Var.r(iB);
            while (i12 < list.size()) {
                b1Var.t(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z11) {
            while (i12 < x1Var.f12027c) {
                b1Var.h(i11, x1Var.c(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int iB2 = 0;
        for (int i14 = 0; i14 < x1Var.f12027c; i14++) {
            iB2 += b1.b(x1Var.c(i14));
        }
        b1Var.r(iB2);
        while (i12 < x1Var.f12027c) {
            b1Var.t(x1Var.c(i12));
            i12++;
        }
    }

    public static void h(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof x1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    long jLongValue = ((Long) list.get(i12)).longValue();
                    b1Var.h(i11, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int iB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long jLongValue2 = ((Long) list.get(i13)).longValue();
                iB += b1.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            b1Var.r(iB);
            while (i12 < list.size()) {
                long jLongValue3 = ((Long) list.get(i12)).longValue();
                b1Var.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i12++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z11) {
            while (i12 < x1Var.f12027c) {
                long jC = x1Var.c(i12);
                b1Var.h(i11, (jC >> 63) ^ (jC + jC));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int iB2 = 0;
        for (int i14 = 0; i14 < x1Var.f12027c; i14++) {
            long jC2 = x1Var.c(i14);
            iB2 += b1.b((jC2 >> 63) ^ (jC2 + jC2));
        }
        b1Var.r(iB2);
        while (i12 < x1Var.f12027c) {
            long jC3 = x1Var.c(i12);
            b1Var.t((jC3 >> 63) ^ (jC3 + jC3));
            i12++;
        }
    }

    public static void i(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof x1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.i(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            b1Var.r(i13);
            while (i12 < list.size()) {
                b1Var.u(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z11) {
            while (i12 < x1Var.f12027c) {
                b1Var.i(i11, x1Var.c(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < x1Var.f12027c; i16++) {
            x1Var.c(i16);
            i15 += 8;
        }
        b1Var.r(i15);
        while (i12 < x1Var.f12027c) {
            b1Var.u(x1Var.c(i12));
            i12++;
        }
    }

    public static void j(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof x1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.i(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            b1Var.r(i13);
            while (i12 < list.size()) {
                b1Var.u(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z11) {
            while (i12 < x1Var.f12027c) {
                b1Var.i(i11, x1Var.c(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < x1Var.f12027c; i16++) {
            x1Var.c(i16);
            i15 += 8;
        }
        b1Var.r(i15);
        while (i12 < x1Var.f12027c) {
            b1Var.u(x1Var.c(i12));
            i12++;
        }
    }

    public static void k(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof l1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.e(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int iB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iB += b1.b(((Integer) list.get(i13)).intValue());
            }
            b1Var.r(iB);
            while (i12 < list.size()) {
                b1Var.q(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z11) {
            while (i12 < l1Var.f11583c) {
                b1Var.e(i11, l1Var.d(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int iB2 = 0;
        for (int i14 = 0; i14 < l1Var.f11583c; i14++) {
            iB2 += b1.b(l1Var.d(i14));
        }
        b1Var.r(iB2);
        while (i12 < l1Var.f11583c) {
            b1Var.q(l1Var.d(i12));
            i12++;
        }
    }

    public static void l(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof l1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.f(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int iA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iA += b1.a(((Integer) list.get(i13)).intValue());
            }
            b1Var.r(iA);
            while (i12 < list.size()) {
                b1Var.r(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z11) {
            while (i12 < l1Var.f11583c) {
                b1Var.f(i11, l1Var.d(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int iA2 = 0;
        for (int i14 = 0; i14 < l1Var.f11583c; i14++) {
            iA2 += b1.a(l1Var.d(i14));
        }
        b1Var.r(iA2);
        while (i12 < l1Var.f11583c) {
            b1Var.r(l1Var.d(i12));
            i12++;
        }
    }

    public static void m(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof l1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    int iIntValue = ((Integer) list.get(i12)).intValue();
                    b1Var.f(i11, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int iA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue2 = ((Integer) list.get(i13)).intValue();
                iA += b1.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            b1Var.r(iA);
            while (i12 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i12)).intValue();
                b1Var.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i12++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z11) {
            while (i12 < l1Var.f11583c) {
                int iD = l1Var.d(i12);
                b1Var.f(i11, (iD >> 31) ^ (iD + iD));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int iA2 = 0;
        for (int i14 = 0; i14 < l1Var.f11583c; i14++) {
            int iD2 = l1Var.d(i14);
            iA2 += b1.a((iD2 >> 31) ^ (iD2 + iD2));
        }
        b1Var.r(iA2);
        while (i12 < l1Var.f11583c) {
            int iD3 = l1Var.d(i12);
            b1Var.r((iD3 >> 31) ^ (iD3 + iD3));
            i12++;
        }
    }

    public static void n(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof l1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.g(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            b1Var.r(i13);
            while (i12 < list.size()) {
                b1Var.s(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z11) {
            while (i12 < l1Var.f11583c) {
                b1Var.g(i11, l1Var.d(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < l1Var.f11583c; i16++) {
            l1Var.d(i16);
            i15 += 4;
        }
        b1Var.r(i15);
        while (i12 < l1Var.f11583c) {
            b1Var.s(l1Var.d(i12));
            i12++;
        }
    }

    public static void o(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof l1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.g(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            b1Var.r(i13);
            while (i12 < list.size()) {
                b1Var.s(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z11) {
            while (i12 < l1Var.f11583c) {
                b1Var.g(i11, l1Var.d(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < l1Var.f11583c; i16++) {
            l1Var.d(i16);
            i15 += 4;
        }
        b1Var.r(i15);
        while (i12 < l1Var.f11583c) {
            b1Var.s(l1Var.d(i12));
            i12++;
        }
    }

    public static void p(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!(list instanceof l1)) {
            if (!z11) {
                while (i12 < list.size()) {
                    b1Var.e(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            b1Var.d(i11, 2);
            int iB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iB += b1.b(((Integer) list.get(i13)).intValue());
            }
            b1Var.r(iB);
            while (i12 < list.size()) {
                b1Var.q(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z11) {
            while (i12 < l1Var.f11583c) {
                b1Var.e(i11, l1Var.d(i12));
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int iB2 = 0;
        for (int i14 = 0; i14 < l1Var.f11583c; i14++) {
            iB2 += b1.b(l1Var.d(i14));
        }
        b1Var.r(iB2);
        while (i12 < l1Var.f11583c) {
            b1Var.q(l1Var.d(i12));
            i12++;
        }
    }

    public static void q(int i11, List list, s5 s5Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) s5Var.f11844b;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                b1Var.j(i11, ((Boolean) list.get(i12)).booleanValue());
                i12++;
            }
            return;
        }
        b1Var.d(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            i13++;
        }
        b1Var.r(i13);
        while (i12 < list.size()) {
            b1Var.p(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x1)) {
            int iB = 0;
            while (i11 < size) {
                iB += b1.b(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iB;
        }
        x1 x1Var = (x1) list;
        int iB2 = 0;
        while (i11 < size) {
            iB2 += b1.b(x1Var.c(i11));
            i11++;
        }
        return iB2;
    }

    public static int s(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x1)) {
            int iB = 0;
            while (i11 < size) {
                iB += b1.b(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iB;
        }
        x1 x1Var = (x1) list;
        int iB2 = 0;
        while (i11 < size) {
            iB2 += b1.b(x1Var.c(i11));
            i11++;
        }
        return iB2;
    }

    public static int t(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x1)) {
            int iB = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iB += b1.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return iB;
        }
        x1 x1Var = (x1) list;
        int iB2 = 0;
        while (i11 < size) {
            long jC = x1Var.c(i11);
            iB2 += b1.b((jC >> 63) ^ (jC + jC));
            i11++;
        }
        return iB2;
    }

    public static int u(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int iB = 0;
            while (i11 < size) {
                iB += b1.b(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iB;
        }
        l1 l1Var = (l1) list;
        int iB2 = 0;
        while (i11 < size) {
            iB2 += b1.b(l1Var.d(i11));
            i11++;
        }
        return iB2;
    }

    public static int v(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int iB = 0;
            while (i11 < size) {
                iB += b1.b(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iB;
        }
        l1 l1Var = (l1) list;
        int iB2 = 0;
        while (i11 < size) {
            iB2 += b1.b(l1Var.d(i11));
            i11++;
        }
        return iB2;
    }

    public static int w(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int iA = 0;
            while (i11 < size) {
                iA += b1.a(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iA;
        }
        l1 l1Var = (l1) list;
        int iA2 = 0;
        while (i11 < size) {
            iA2 += b1.a(l1Var.d(i11));
            i11++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int iA = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iA += b1.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return iA;
        }
        l1 l1Var = (l1) list;
        int iA2 = 0;
        while (i11 < size) {
            int iD = l1Var.d(i11);
            iA2 += b1.a((iD >> 31) ^ (iD + iD));
            i11++;
        }
        return iA2;
    }

    public static int y(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b1.a(i11 << 3) + 4) * size;
    }

    public static int z(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b1.a(i11 << 3) + 8) * size;
    }
}
