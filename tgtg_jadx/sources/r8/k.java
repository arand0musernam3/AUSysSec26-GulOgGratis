package r8;

import b4.q;
import d2.m2;
import i4.v;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import m3.s;
import o30.f0;
import q90.p0;
import s0.c2;
import s0.d2;
import s0.e2;
import s0.g2;
import s0.i2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void A(p0 p0Var) throws Exception {
        boolean zIsTerminated;
        if (p0Var instanceof AutoCloseable) {
            p0Var.close();
            return;
        }
        if (!(p0Var instanceof ExecutorService)) {
            i4.a.h();
            return;
        }
        ExecutorService executorService = (ExecutorService) p0Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z11 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z11) {
                    executorService.shutdownNow();
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public static void B(d2 d2Var, i2 i2Var, g2 g2Var, e2 e2Var, c2 c2Var) {
        d2Var.a(i2Var);
        d2Var.a(l50.a.n(g2Var, e2Var, c2Var));
    }

    public static void C(g2 g2Var, e2 e2Var, d2 d2Var, g2 g2Var2, e2 e2Var2) {
        c2 c2Var = i2.f38344e;
        d2Var.a(l50.a.n(g2Var, e2Var, c2Var));
        d2Var.a(l50.a.n(g2Var2, e2Var2, c2Var));
    }

    public static boolean D(KClass kClass, Class cls, KClass kClass2) {
        kClass.getClass();
        return Intrinsics.areEqual(kClass2, Reflection.getOrCreateKotlinClass(cls));
    }

    public static int a(int i11, float f11, int i12) {
        return (Float.hashCode(f11) + i11) * i12;
    }

    public static int b(int i11, int i12, int i13) {
        return (Integer.hashCode(i11) + i12) * i13;
    }

    public static int c(int i11, int i12, int i13, int i14) {
        return ((i11 + i12) - i13) % i14;
    }

    public static int d(int i11, int i12, Function1 function1) {
        return (function1.hashCode() + i11) * i12;
    }

    public static int e(int i11, int i12, boolean z11) {
        return (Boolean.hashCode(z11) + i11) * i12;
    }

    public static String f(float f11, int i11, q qVar, s sVar, s sVar2) {
        d2.c.f(m2.m(qVar, f11), sVar);
        return f0.U(sVar2, i11);
    }

    public static String g(int i11, int i12, String str, String str2, String str3) {
        return str + i11 + str2 + i12 + str3;
    }

    public static String h(int i11, String str, String str2) {
        return str + i11 + str2;
    }

    public static String i(int i11, String str, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(Exception exc, StringBuilder sb2) {
        sb2.append(exc.getMessage());
        return sb2.toString();
    }

    public static String k(String str, int i11, int i12, String str2) {
        return str + i11 + str2 + i12;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb2, float f11, char c3) {
        sb2.append(f11);
        sb2.append(c3);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, int i11, char c3) {
        sb2.append(i11);
        sb2.append(c3);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, boolean z11, char c3) {
        sb2.append(z11);
        sb2.append(c3);
        return sb2.toString();
    }

    public static StringBuilder r(int i11, int i12, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i12);
        sb2.append(str3);
        return sb2;
    }

    public static d2 s(ArrayList arrayList, d2 d2Var) {
        arrayList.add(d2Var);
        return new d2();
    }

    public static void t(float f11, int i11, q qVar, s sVar, s sVar2) {
        sVar.a0(i11);
        d2.c.f(m2.m(qVar, f11), sVar2);
    }

    public static void u(float f11, String str, StringBuilder sb2) {
        sb2.append((Object) z5.f.d(f11));
        sb2.append(str);
    }

    public static void v(int i11, int i12, int i13, int i14, int i15) {
        u4.c.a(i11);
        u4.c.a(i12);
        u4.c.a(i13);
        u4.c.a(i14);
        u4.c.a(i15);
    }

    public static void w(int i11, u3.d dVar, s sVar, boolean z11) {
        dVar.invoke(sVar, Integer.valueOf(i11));
        sVar.q(z11);
    }

    public static void x(long j9, String str, StringBuilder sb2) {
        sb2.append((Object) v.i(j9));
        sb2.append(str);
    }

    public static void y(j30.g gVar, long j9) {
        gVar.i().o();
        gVar.B(j9);
    }

    public static void z(StringBuilder sb2, String str, String str2, boolean z11, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(z11);
        sb2.append(str3);
    }
}
