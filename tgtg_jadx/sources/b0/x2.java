package b0;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements o2 {
    public static final v80.q l = v80.f0.a(new e0.n1(4, null));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v80.q f5490m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.a f5491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f5492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.j f5493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70.a f5494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3 f5495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.z f5496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f5497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u70.t f5498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u70.t f5499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u70.t f5500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f5501k;

    static {
        v80.q qVar = new v80.q();
        qVar.a(null);
        f5490m = qVar;
    }

    public x2(t70.a aVar, t70.a aVar2, a0.j jVar, t70.a aVar3, k3 k3Var, m0.z zVar) {
        aVar.getClass();
        aVar2.getClass();
        jVar.getClass();
        aVar3.getClass();
        k3Var.getClass();
        this.f5491a = aVar;
        this.f5492b = aVar2;
        this.f5493c = jVar;
        this.f5494d = aVar3;
        this.f5495e = k3Var;
        this.f5496f = zVar;
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i11 = 0;
        this.f5498h = u70.l.b(new Function0(this) { // from class: b0.p2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f5365b;

            {
                this.f5365b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return (o) this.f5365b.f5491a.get();
                    case 1:
                        return (i3) this.f5365b.f5494d.get();
                    default:
                        return (c3) this.f5365b.f5492b.get();
                }
            }
        });
        final int i12 = 1;
        this.f5499i = u70.l.b(new Function0(this) { // from class: b0.p2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f5365b;

            {
                this.f5365b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return (o) this.f5365b.f5491a.get();
                    case 1:
                        return (i3) this.f5365b.f5494d.get();
                    default:
                        return (c3) this.f5365b.f5492b.get();
                }
            }
        });
        final int i13 = 2;
        this.f5500j = u70.l.b(new Function0(this) { // from class: b0.p2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f5365b;

            {
                this.f5365b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return (o) this.f5365b.f5491a.get();
                    case 1:
                        return (i3) this.f5365b.f5494d.get();
                    default:
                        return (c3) this.f5365b.f5492b.get();
                }
            }
        });
        this.f5501k = new LinkedHashMap();
    }

    public static final Object l(x2 x2Var, n2 n2Var, Map map, s0.t0 t0Var, z70.i iVar) {
        LinkedHashMap linkedHashMap = x2Var.f5501k;
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + n2Var + "] values = " + map + ", optionPriority = " + t0Var);
        }
        Object q2Var = linkedHashMap.get(n2Var);
        if (q2Var == null) {
            q2Var = new q2((a) null, (LinkedHashMap) null, (e0.m1) null, 15);
            linkedHashMap.put(n2Var, q2Var);
        }
        q2 q2Var2 = (q2) q2Var;
        a aVar = new a(0);
        aVar.c(q2Var2.f5373a.f5038b);
        map.getClass();
        t0Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            aVar.f5038b.x(y9.w.m(key), t0Var, entry.getValue());
        }
        linkedHashMap.put(n2Var, new q2(aVar, kotlin.collections.x0.m(q2Var2.f5374b), CollectionsKt.u0(q2Var2.f5375c), q2Var2.f5376d));
        return x2Var.p(n(linkedHashMap), null, iVar);
    }

    public static ArrayList m(int i11, String str) {
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            v80.q qVar = new v80.q();
            qVar.h0(new ImageCaptureException(2, str, null));
            arrayList.add(qVar);
        }
        return arrayList;
    }

    public static q2 n(LinkedHashMap linkedHashMap) {
        q2 q2Var = new q2((a) null, (LinkedHashMap) null, new e0.m1(1), 7);
        Iterator<E> it = n2.a().iterator();
        while (it.hasNext()) {
            q2 q2Var2 = (q2) linkedHashMap.get((n2) it.next());
            if (q2Var2 != null) {
                q2Var.f5373a.c(q2Var2.f5373a.f5038b);
                q2Var.f5374b.putAll(q2Var2.f5374b);
                q2Var.f5375c.addAll(q2Var2.f5375c);
                e0.m1 m1Var = q2Var2.f5376d;
                if (m1Var != null) {
                    q2Var.f5376d = new e0.m1(m1Var.f15368a);
                }
            }
        }
        return q2Var;
    }

    @Override // b0.o2
    public final Object a(z70.i iVar) {
        i3 i3Var = (i3) this.f5499i.getValue();
        i3Var.getClass();
        return i3.c(i3Var, iVar);
    }

    @Override // b0.o2
    public final v80.i0 b() {
        v80.q qVarO = this.f5497g ? null : o(new a3.c2(this, null, 3));
        return qVarO == null ? l : qVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.o2
    public final v80.i0 c(b bVar, Map map) {
        map.getClass();
        v80.q qVarO = null;
        Object[] objArr = 0;
        if (!this.f5497g) {
            qVarO = o(new aa.t(this, bVar, map, objArr == true ? 1 : 0, 2));
        }
        return qVarO == null ? f5490m : qVarO;
    }

    @Override // b0.o2
    public final void close() {
        this.f5497g = true;
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        c3 c3Var = (c3) this.f5500j.getValue();
        synchronized (c3Var.f5094c) {
            try {
                if (c3Var.f5098g) {
                    c3Var.f5098g = false;
                    v80.q qVar = c3Var.f5095d;
                    if (qVar != null) {
                        qVar.h0(new CancellationException("UseCaseCameraState closed"));
                    }
                    c3Var.f5095d = null;
                }
                while (!c3Var.f5097f.isEmpty()) {
                    ((z2) c3Var.f5097f.removeFirst()).f5534b.h0(new CancellationException("UseCaseCameraState closed"));
                    c3Var.f5107q.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.o2
    public final List d(ArrayList arrayList, int i11, int i12, int i13) {
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        Object[] objArr = 0;
        if (this.f5497g) {
            arrayList2 = arrayList;
        } else {
            int size = arrayList.size();
            arrayList2 = arrayList;
            s2 s2Var = new s2(this, arrayList2, i11, i12, i13, null);
            k3 k3Var = this.f5495e;
            k3Var.getClass();
            v80.d0 d0Var = Intrinsics.areEqual(k3Var.f5268d.get(), Boolean.TRUE) ? v80.d0.UNDISPATCHED : v80.d0.DEFAULT;
            ArrayList arrayList4 = new ArrayList(size);
            for (int i14 = 0; i14 < size; i14++) {
                arrayList4.add(new v80.q());
            }
            v80.f0.B(k3Var.f5270f, null, d0Var, new a3.x(s2Var, arrayList4, objArr == true ? 1 : 0, 16), 1);
            arrayList3 = arrayList4;
        }
        return arrayList3 == null ? m(arrayList2.size(), "Capture request is cancelled on closed CameraGraph") : arrayList3;
    }

    @Override // b0.o2
    public final v80.i0 e(int i11) {
        v80.q qVarO = this.f5497g ? null : o(new u2(this, i11, null));
        return qVarO == null ? l : qVarO;
    }

    @Override // b0.o2
    public final v80.i0 f(Map map, n2 n2Var, s0.t0 t0Var) {
        n2Var.getClass();
        t0Var.getClass();
        if (this.f5497g) {
            return f5490m;
        }
        if (Intrinsics.areEqual(this.f5495e.f5268d.get(), Boolean.TRUE)) {
            return v80.f0.f(this.f5495e.f5270f, null, v80.d0.UNDISPATCHED, new al.n(this, n2Var, map, t0Var, (x70.c) null), 1);
        }
        org.bouncycastle.jce.provider.a.s(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    @Override // b0.o2
    public final v80.i0 g(LinkedHashSet linkedHashSet, boolean z11) {
        v80.q qVarO = this.f5497g ? null : o(new w2(linkedHashSet, z11, this, null));
        return qVarO == null ? f5490m : qVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.o2
    public final v80.i0 h() {
        v80.q qVarO = this.f5497g ? null : o(new r2((Object) this, (x70.c) (0 == true ? 1 : 0), 0));
        return qVarO == null ? l : qVarO;
    }

    @Override // b0.o2
    public final v80.i0 i(Map map, n2 n2Var, s0.t0 t0Var) {
        map.getClass();
        n2Var.getClass();
        t0Var.getClass();
        v80.q qVarO = !this.f5497g ? o(new t2(this, n2Var, map, t0Var, null)) : null;
        return qVarO == null ? f5490m : qVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.o2
    public final v80.i0 j(List list, n2 n2Var) {
        list.getClass();
        n2Var.getClass();
        v80.q qVarO = null;
        Object[] objArr = 0;
        if (!this.f5497g) {
            qVarO = o(new aa.t(this, n2Var, list, objArr == true ? 1 : 0, 1));
        }
        return qVarO == null ? f5490m : qVarO;
    }

    public final v80.q o(Function1 function1) {
        k3 k3Var = this.f5495e;
        k3Var.getClass();
        v80.d0 d0Var = Intrinsics.areEqual(k3Var.f5268d.get(), Boolean.TRUE) ? v80.d0.UNDISPATCHED : v80.d0.DEFAULT;
        v80.q qVar = new v80.q();
        v80.f0.B(k3Var.f5270f, null, d0Var, new a3.x(function1, qVar, (x70.c) null), 1);
        return qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(b0.q2 r11, java.util.LinkedHashSet r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x2.p(b0.q2, java.util.LinkedHashSet, z70.c):java.lang.Object");
    }
}
