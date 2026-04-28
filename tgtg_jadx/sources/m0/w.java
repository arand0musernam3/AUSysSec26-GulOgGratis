package m0;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.te;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f28614s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseArray f28615t = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f28618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f28619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f28620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f28621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public te f28622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w.p f28623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w.v f28624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ub.a f28625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.firebase.messaging.a0 f28626k;
    public final u0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e6.l f28627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s0.m0 f28628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u70.t f28629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f28630p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f28632r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.p0 f28616a = new s0.p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28617b = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ListenableFuture f28631q = x0.i.f43629c;

    /* JADX WARN: Removed duplicated region for block: B:165:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0191  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x02a8 -> B:143:0x0295). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:139:0x0291
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.content.Context r10, i1.c r11) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.w.<init>(android.content.Context, i1.c):void");
    }

    public static void a(Integer num) {
        synchronized (f28614s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f28615t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(ic.a aVar) throws Throwable {
        if (o00.x0.y()) {
            int i11 = aVar != null ? aVar.f23773a : -1;
            if (Build.VERSION.SDK_INT >= 29) {
                b6.a.u(i11, o00.x0.G("CX:CameraProvider-RetryStatus"));
                return;
            }
            String strG = o00.x0.G("CX:CameraProvider-RetryStatus");
            try {
                if (o00.x0.f31773h == null) {
                    o00.x0.f31773h = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                Method method = o00.x0.f31773h;
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                method.invoke(null, Long.valueOf(o00.x0.f31769d), strG, Integer.valueOf(i11));
            } catch (Exception e5) {
                o00.x0.x("traceCounter", e5);
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = f28615t;
        if (sparseArray.size() == 0) {
            wd.a.f43385b = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            wd.a.f43385b = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            wd.a.f43385b = 4;
        } else if (sparseArray.get(5) != null) {
            wd.a.f43385b = 5;
        } else if (sparseArray.get(6) != null) {
            wd.a.f43385b = 6;
        }
    }
}
