package i0;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import e0.j0;
import e0.n1;
import g3.q9;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.collections.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f22660f = kotlin.collections.d0.h(2, 4, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f22661g = kotlin.collections.d0.h(2, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f22662h = kotlin.collections.d0.h(2, 6, 4, 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f22663i = kotlin.collections.c0.c(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f22664j = kotlin.collections.c0.c(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List f22665k = kotlin.collections.d0.h(4, 5);
    public static final List l = kotlin.collections.d0.h(2, 4, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f22666m = kotlin.collections.d0.h(2, 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map f22667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map f22668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map f22669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f22670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v80.q f22671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List f22672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f22673t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List f22674u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Map f22675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f22676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q9 f22677x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f22678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.v f22679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f22680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f22681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v80.q f22682e;

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        f22667n = w0.b(new Pair(key, 1));
        f22668o = w0.b(new Pair(key, 2));
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        f22669p = w0.b(new Pair(key2, 1));
        f22670q = x0.e(new Pair(key, 1), new Pair(key2, 1));
        f22671r = v80.f0.a(new n1(4, null));
        f22672s = kotlin.collections.d0.h(0, 1, 2, 4);
        List listH = kotlin.collections.d0.h(0, 3, 1, 2, 6);
        f22673t = listH;
        f22674u = kotlin.collections.d0.h(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        w0.b(new Pair(key3, bool));
        x0.e(new Pair(key, 2), new Pair(key3, bool));
        w0.b(new Pair(key3, Boolean.FALSE));
        f22675v = w0.b(new Pair(key2, 2));
        f22676w = x0.e(new Pair(key, 2), new Pair(key2, 2));
        Map mapB = w0.b(new Pair(CaptureResult.CONTROL_AF_STATE, listH));
        mapB.getClass();
        f22677x = new q9(mapB, 21);
    }

    public h(v vVar, e0.v vVar2, y yVar, z zVar) {
        vVar.getClass();
        vVar2.getClass();
        yVar.getClass();
        zVar.getClass();
        this.f22678a = vVar;
        this.f22679b = vVar2;
        this.f22680c = yVar;
        this.f22681d = zVar;
    }

    public static v80.q b(h hVar, e0.a aVar, e0.b bVar, e0.d dVar, j0 j0Var, List list, List list2, List list3, int i11) {
        e0.b bVar2 = (i11 & 2) != 0 ? null : bVar;
        e0.d dVar2 = (i11 & 4) != 0 ? null : dVar;
        j0 j0Var2 = (i11 & 8) != 0 ? null : j0Var;
        List list4 = (i11 & 16) != 0 ? null : list;
        List list5 = (i11 & 32) != 0 ? null : list2;
        List list6 = (i11 & 64) != 0 ? null : list3;
        if (hVar.f22678a.f22741c.g() == null) {
            y.b(hVar.f22680c, aVar, bVar2, dVar2, j0Var2, list4, list5, list6, null, null, null, 896);
            hVar.f22678a.f(hVar.f22680c.a());
            return f22671r;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aVar != null) {
            int i12 = aVar.f15306a;
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            key.getClass();
        }
        if (bVar2 != null) {
            int i13 = bVar2.f15309a;
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            key2.getClass();
        }
        if (dVar2 != null) {
            int i14 = dVar2.f15326a;
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            key3.getClass();
        }
        if (j0Var2 != null) {
            int i15 = j0Var2.f15362a;
            CaptureResult.Key key4 = CaptureResult.FLASH_MODE;
            key4.getClass();
        }
        a0 a0Var = new a0(x0.k(linkedHashMap));
        z zVar = hVar.f22681d;
        zVar.getClass();
        zVar.f22752a.add(a0Var);
        y.b(hVar.f22680c, aVar, bVar2, dVar2, j0Var2, list4, list5, list6, null, null, null, 896);
        hVar.f22678a.f(hVar.f22680c.a());
        v80.q qVar = a0Var.f22574d;
        synchronized (hVar) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + hVar.f22682e);
                v80.q qVar2 = hVar.f22682e;
                if (qVar2 != null) {
                    CancellationException cancellationException = new CancellationException("A newer call for 3A state update initiated.");
                    cancellationException.initCause(null);
                    qVar2.a(cancellationException);
                }
                hVar.f22682e = qVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(e0.t0 r26, b0.q r27, int r28, java.lang.Long r29, java.lang.Long r30, z70.c r31) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a(e0.t0, b0.q, int, java.lang.Long, java.lang.Long, z70.c):java.lang.Object");
    }
}
