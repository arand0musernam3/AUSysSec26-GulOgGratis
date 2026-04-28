package b0;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.j f5092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z.j f5093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v80.q f5095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r80.b f5096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlin.collections.t f5097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f5099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f5100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f5101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f5102k;
    public e0.m1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e0.a f5103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e0.b f5104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0.d f5105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y2 f5106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r80.b f5107q;

    public c3(a0.j jVar, z.j jVar2) {
        jVar.getClass();
        this.f5092a = jVar;
        this.f5093b = jVar2;
        this.f5094c = new Object();
        this.f5096e = w.b.q(0);
        this.f5097f = new kotlin.collections.t();
        this.f5099h = new LinkedHashMap();
        this.f5100i = new LinkedHashMap();
        this.f5101j = new LinkedHashSet();
        this.f5102k = new LinkedHashSet();
        this.f5106p = new y2(this);
        this.f5107q = w.b.q(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, v80.q] */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, e0.i1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, v80.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r19) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c3.a(z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(i0.c cVar, Map map) {
        e0.a aVarD0;
        e0.b bVar;
        Object next;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        key.getClass();
        Object obj = null;
        Object obj2 = map != null ? map.get(key) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            List list = e0.a.f15305b;
            aVarD0 = m0.c.d0(iIntValue);
        } else {
            aVarD0 = null;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
        key2.getClass();
        Object obj3 = map != null ? map.get(key2) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it = e0.b.f15308b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((e0.b) next).f15309a == iIntValue2) {
                        break;
                    }
                }
            }
            bVar = (e0.b) next;
        } else {
            bVar = null;
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        key3.getClass();
        Object obj4 = map != null ? map.get(key3) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            Iterator it2 = e0.d.f15325b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((e0.d) next2).f15326a == iIntValue3) {
                    obj = next2;
                    break;
                }
            }
            obj = (e0.d) obj;
        }
        e0.d dVar = obj;
        boolean z11 = false;
        boolean z12 = (aVarD0 == null || Intrinsics.areEqual(aVarD0, this.f5103m)) ? false : true;
        boolean z13 = (bVar == null || Intrinsics.areEqual(bVar, this.f5104n)) ? false : true;
        if (dVar != 0 && !Intrinsics.areEqual(dVar, this.f5105o)) {
            z11 = true;
        }
        if (z12 || z13 || z11) {
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + aVarD0 + ", changed=" + z12 + "), AF(" + bVar + ", changed=" + z13 + "), AWB(" + dVar + ", changed=" + z11 + ')');
            }
            e0.k.a(cVar, aVarD0, bVar, dVar, null, null, null, 56);
            if (aVarD0 != null) {
                this.f5103m = aVarD0;
            }
            if (bVar != null) {
                this.f5104n = bVar;
            }
            if (dVar != 0) {
                this.f5105o = dVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, java.lang.Object, v80.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.LinkedHashMap r8, java.util.Map r9, java.util.Set r10, e0.m1 r11, java.util.Set r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c3.c(java.util.LinkedHashMap, java.util.Map, java.util.Set, e0.m1, java.util.Set, z70.c):java.lang.Object");
    }
}
