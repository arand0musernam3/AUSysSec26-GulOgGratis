package e0;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static void A(ha.c cVar, int i11, int i12, int i13, int i14) {
        cVar.m(i11);
        cVar.m(i12);
        cVar.m(i13);
        cVar.m(i14);
    }

    public static /* synthetic */ void B(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                i4.a.h();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
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

    public static void C(StringBuilder sb2, int i11, String str, int i12, String str2) {
        sb2.append(i11);
        sb2.append(str);
        sb2.append(i12);
        sb2.append(str2);
    }

    public static void D(m3.s sVar, boolean z11, boolean z12, boolean z13) {
        sVar.q(z11);
        sVar.q(z12);
        sVar.q(z13);
    }

    public static int a(float f11, float f12, float f13) {
        return Math.round((f11 + f12) * f13);
    }

    public static int b(int i11, int i12, long j9) {
        return (Long.hashCode(j9) + i11) * i12;
    }

    public static int c(List list, int i11, int i12) {
        return (list.hashCode() + i11) * i12;
    }

    public static long d(long j9) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j9;
    }

    public static ClassCastException e(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object f(kotlin.collections.o0 o0Var, Class cls, androidx.lifecycle.c1 c1Var, kotlin.collections.o0 o0Var2) {
        o0Var.getClass();
        return a.a.Q(c1Var, Reflection.getOrCreateKotlinClass(cls), o0Var2);
    }

    public static String g(char c3, String str, String str2) {
        return str + str2 + c3;
    }

    public static String h(int i11, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }

    public static String i(long j9, String str) {
        return str + j9;
    }

    public static String j(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, Throwable th2) {
        return str + th2 + str2;
    }

    public static String m(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String n(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static String q(Object[] objArr, int i11, Locale locale, String str, StringBuilder sb2) {
        sb2.append(String.format(locale, str, Arrays.copyOf(objArr, i11)));
        return sb2.toString();
    }

    public static StringBuilder r(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static ArrayList u(int i11, HashMap map, ArrayList arrayList, int i12, String str) {
        map.put(Integer.valueOf(i11), arrayList);
        ArrayList arrayList2 = new ArrayList(i12);
        arrayList2.add(str);
        return arrayList2;
    }

    public static NoWhenBranchMatchedException v(m3.s sVar, int i11, boolean z11) {
        sVar.a0(i11);
        sVar.q(z11);
        return new NoWhenBranchMatchedException();
    }

    public static m3.k1 w(boolean z11, m3.s sVar) {
        m3.k1 k1VarW = m3.i.w(Boolean.valueOf(z11));
        sVar.k0(k1VarW);
        return k1VarW;
    }

    public static s70.c x(g0.e eVar, int i11) {
        return s70.a.a(new ag.h(eVar, i11, 1));
    }

    public static void y(int i11, m3.s sVar, int i12, b5.g gVar) {
        sVar.k0(Integer.valueOf(i11));
        sVar.b(Integer.valueOf(i12), gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void z(f0.v0 v0Var) throws Exception {
        boolean zIsTerminated;
        if (v0Var instanceof AutoCloseable) {
            v0Var.close();
            return;
        }
        if (!(v0Var instanceof ExecutorService)) {
            i4.a.h();
            return;
        }
        ExecutorService executorService = (ExecutorService) v0Var;
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
}
