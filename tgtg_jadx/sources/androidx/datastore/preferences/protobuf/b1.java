package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f2932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f2933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f2934c;

    static {
        Class<?> cls;
        Class<?> cls2;
        x0 x0Var = x0.f3059c;
        g1 g1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2932a = cls;
        try {
            x0 x0Var2 = x0.f3059c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                g1Var = (g1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2933b = g1Var;
        f2934c = new i1();
    }

    public static void A(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                long jLongValue = ((Long) list.get(i12)).longValue();
                lVar.E(i11, (jLongValue >> 63) ^ (jLongValue << 1));
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int iJ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long jLongValue2 = ((Long) list.get(i13)).longValue();
            iJ += l.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        lVar.D(iJ);
        while (i12 < list.size()) {
            long jLongValue3 = ((Long) list.get(i12)).longValue();
            lVar.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i12++;
        }
    }

    public static void B(int i11, List list, i0 i0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((l) i0Var.f2990a).z(i11, (String) list.get(i12));
        }
    }

    public static void C(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.C(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            i13 += l.i(((Integer) list.get(i14)).intValue());
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.D(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void D(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.E(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int iJ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iJ += l.j(((Long) list.get(i13)).longValue());
        }
        lVar.D(iJ);
        while (i12 < list.size()) {
            lVar.F(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iJ += l.j(((Integer) list.get(i11)).intValue());
        }
        return iJ;
    }

    public static int b(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h(i11) + 4) * size;
    }

    public static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h(i11) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iJ += l.j(((Integer) list.get(i11)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iJ += l.j(((Long) list.get(i11)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iIntValue = ((Integer) list.get(i12)).intValue();
            i11 += l.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i11;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long jLongValue = ((Long) list.get(i11)).longValue();
            iJ += l.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += l.i(((Integer) list.get(i12)).intValue());
        }
        return i11;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iJ += l.j(((Long) list.get(i11)).longValue());
        }
        return iJ;
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
    public static void k(g1 g1Var, Object obj, Object obj2) {
        ((i1) g1Var).getClass();
        z zVar = (z) obj;
        h1 h1Var = zVar.unknownFields;
        h1 h1Var2 = ((z) obj2).unknownFields;
        h1 h1Var3 = h1.f2981f;
        if (!h1Var3.equals(h1Var2)) {
            if (h1Var3.equals(h1Var)) {
                int i11 = h1Var.f2982a + h1Var2.f2982a;
                int[] iArrCopyOf = Arrays.copyOf(h1Var.f2983b, i11);
                System.arraycopy(h1Var2.f2983b, 0, iArrCopyOf, h1Var.f2982a, h1Var2.f2982a);
                Object[] objArrCopyOf = Arrays.copyOf(h1Var.f2984c, i11);
                System.arraycopy(h1Var2.f2984c, 0, objArrCopyOf, h1Var.f2982a, h1Var2.f2982a);
                h1Var = new h1(i11, iArrCopyOf, objArrCopyOf, true);
            } else {
                h1Var.getClass();
                if (!h1Var2.equals(h1Var3)) {
                    if (!h1Var.f2986e) {
                        c50.w.d();
                        return;
                    }
                    int i12 = h1Var.f2982a + h1Var2.f2982a;
                    h1Var.a(i12);
                    System.arraycopy(h1Var2.f2983b, 0, h1Var.f2983b, h1Var.f2982a, h1Var2.f2982a);
                    System.arraycopy(h1Var2.f2984c, 0, h1Var.f2984c, h1Var.f2982a, h1Var2.f2982a);
                    h1Var.f2982a = i12;
                }
            }
        }
        zVar.unknownFields = h1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.o(i11, ((Boolean) list.get(i12)).booleanValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            Logger logger = l.f3001f;
            i13++;
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.m(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    public static void n(int i11, List list, i0 i0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((l) i0Var.f2990a).p(i11, (f) list.get(i12));
        }
    }

    public static void o(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                double dDoubleValue = ((Double) list.get(i12)).doubleValue();
                lVar.getClass();
                lVar.t(i11, Double.doubleToRawLongBits(dDoubleValue));
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Double) list.get(i14)).getClass();
            Logger logger = l.f3001f;
            i13 += 8;
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.u(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    public static void p(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.v(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int iJ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iJ += l.j(((Integer) list.get(i13)).intValue());
        }
        lVar.D(iJ);
        while (i12 < list.size()) {
            lVar.w(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void q(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.r(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = l.f3001f;
            i13 += 4;
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.s(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void r(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.t(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = l.f3001f;
            i13 += 8;
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.u(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void s(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                float fFloatValue = ((Float) list.get(i12)).floatValue();
                lVar.getClass();
                lVar.r(i11, Float.floatToRawIntBits(fFloatValue));
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Float) list.get(i14)).getClass();
            Logger logger = l.f3001f;
            i13 += 4;
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.s(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    public static void t(int i11, List list, i0 i0Var, a1 a1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            i0Var.b(i11, list.get(i12), a1Var);
        }
    }

    public static void u(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.v(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int iJ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iJ += l.j(((Integer) list.get(i13)).intValue());
        }
        lVar.D(iJ);
        while (i12 < list.size()) {
            lVar.w(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void v(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.E(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int iJ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iJ += l.j(((Long) list.get(i13)).longValue());
        }
        lVar.D(iJ);
        while (i12 < list.size()) {
            lVar.F(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void w(int i11, List list, i0 i0Var, a1 a1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((l) i0Var.f2990a).y(i11, (a) list.get(i12), a1Var);
        }
    }

    public static void x(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.r(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = l.f3001f;
            i13 += 4;
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.s(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void y(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.t(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = l.f3001f;
            i13 += 8;
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            lVar.u(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void z(int i11, List list, i0 i0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) i0Var.f2990a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                lVar.C(i11, (iIntValue >> 31) ^ (iIntValue << 1));
                i12++;
            }
            return;
        }
        lVar.B(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            int iIntValue2 = ((Integer) list.get(i14)).intValue();
            i13 += l.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        lVar.D(i13);
        while (i12 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i12)).intValue();
            lVar.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i12++;
        }
    }

    public static Object j(Object obj, int i11, a0 a0Var, Object obj2, g1 g1Var) {
        return obj2;
    }
}
