package w;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.fragment.app.Fragment;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import m3.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a0 implements e6.j {
    public static void A(Integer num, s1.l lVar, g9.l lVar2) {
        num.getClass();
        lVar.getClass();
        lVar2.getClass();
    }

    public static void B(Object obj, String str, String str2) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Class.forName(str).getField(str2).get(obj);
    }

    public static void C(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static int D(int i11, int i12, int i13, int i14, int i15) {
        return (i11 * i12) + i13 + i14 + i15;
    }

    public static int a() {
        return new Random().nextInt();
    }

    public static int b(int i11) {
        return new Random().nextInt(i11);
    }

    public static int c(int i11, int i12, int i13) {
        int i14 = (i11 * i12) + i13;
        return i14 * i14;
    }

    public static int d(int i11, int i12, int i13, int i14) {
        return ((i11 - i12) - i13) % i14;
    }

    public static int e(int i11, int i12, int i13, int i14, int i15) {
        int i16 = (i11 * i12) + i13;
        return (i16 * i16 * i14) + i15;
    }

    public static int f(Map map, int i11, int i12) {
        return (map.hashCode() + i11) * i12;
    }

    public static b2.l g(m3.s sVar) {
        b2.l lVar = new b2.l();
        sVar.k0(lVar);
        return lVar;
    }

    public static DeviceParameterResult.Success.BooleanValue h(Boolean bool) {
        return DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(bool.booleanValue()));
    }

    public static Object i(String str, String str2, Class[] clsArr, Object obj, Object[] objArr) {
        return Class.forName(str).getDeclaredMethod(str2, clsArr).invoke(obj, objArr);
    }

    public static String j(long j9, String str, StringBuilder sb2) {
        sb2.append(j9);
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(Class cls, String str) {
        return str + cls;
    }

    public static String l(String str, int i11, char c3) {
        return str + i11 + c3;
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String n(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String r(StringBuilder sb2, long j9, char c3) {
        sb2.append(j9);
        sb2.append(c3);
        return sb2.toString();
    }

    public static h1 s(int i11, m3.s sVar) {
        h1 h1Var = new h1(i11);
        sVar.k0(h1Var);
        return h1Var;
    }

    public static s70.c t(a0.a aVar, a0.c cVar, int i11) {
        return s70.a.a(new a0.b(aVar, cVar, i11, 0));
    }

    public static s70.c u(ag.i iVar, int i11) {
        return s70.a.a(new ag.h(iVar, i11, 0));
    }

    public static s70.c v(ag.i iVar, ag.c cVar, ag.k kVar, int i11) {
        return s70.a.a(new a0.d(iVar, cVar, kVar, i11, 1));
    }

    public static void w(int i11, Function2 function2, m3.s sVar, boolean z11) {
        function2.invoke(sVar, Integer.valueOf(i11));
        sVar.q(z11);
    }

    public static void x(int i11, Function2 function2, m3.s sVar, boolean z11, boolean z12) {
        function2.invoke(sVar, Integer.valueOf(i11));
        sVar.q(z11);
        sVar.q(z12);
    }

    public static void y(int i11, m3.s sVar, b5.g gVar, m3.s sVar2, b5.d dVar) {
        m3.i.v(sVar, Integer.valueOf(i11), gVar);
        m3.i.z(sVar2, dVar);
    }

    public static /* synthetic */ void z(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                i4.a.h();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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
