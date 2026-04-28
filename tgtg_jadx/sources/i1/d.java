package i1;

import android.content.Context;
import android.os.Trace;
import b0.e3;
import com.braze.h2;
import com.google.android.gms.internal.measurement.te;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import m0.o;
import m0.p;
import m0.r;
import m0.s;
import m0.w;
import o00.x0;
import s0.b0;
import s0.c0;
import s0.g0;
import s0.i0;
import s0.j0;
import s0.k;
import s0.l0;
import s0.m0;
import s0.p0;
import s0.z0;
import w.j;
import x0.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0.d f22762b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f22764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f22765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f22766f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22761a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListenableFuture f22763c = i.f43629c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f22767g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f22768h = new HashSet();

    public static final b0 a(d dVar, s sVar) {
        Iterator it = sVar.f28589a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            k kVar = o.f28571a;
            if (!Intrinsics.areEqual(kVar, kVar)) {
                synchronized (z0.f38485a) {
                }
                dVar.f22766f.getClass();
            }
        }
        return c0.f38306a;
    }

    public static final void b(d dVar, int i11) {
        p0 p0Var;
        w wVar = dVar.f22764d;
        if (wVar != null) {
            wVar.getClass();
            te teVar = wVar.f28622g;
            if (teVar == null) {
                h2.b("CameraX not initialized yet.");
                return;
            }
            w.e eVar = (w.e) teVar.f11898f;
            synchronized (eVar.f42668b) {
                eVar.f42672f = i11;
                p0Var = eVar.f42669c;
            }
            if (p0Var == null) {
                return;
            }
            boolean z11 = i11 == 2;
            eVar.f42673g = z11;
            if (!z11) {
                eVar.f42670d = n0.f26529a;
            }
            Iterator it = p0Var.c().iterator();
            it.getClass();
            while (it.hasNext()) {
                i0 i0Var = (i0) it.next();
                j jVar = i0Var instanceof j ? (j) i0Var : null;
                if (jVar != null) {
                    if (i11 == 1) {
                        e3 e3Var = jVar.f42697a;
                        synchronized (e3Var.f5157k) {
                            e3Var.f5160o = true;
                        }
                    } else if (i11 != 2) {
                        continue;
                    } else {
                        e3 e3Var2 = jVar.f42697a;
                        synchronized (e3Var2.f5157k) {
                            e3Var2.f5160o = false;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x0074, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:5:0x003d, B:7:0x0050, B:9:0x005c, B:11:0x0060, B:17:0x006e, B:18:0x0071, B:22:0x0077), top: B:73:0x003d, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r18v1, types: [s0.c, s0.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i1.b c(i1.d r16, androidx.lifecycle.LifecycleOwner r17, m0.s r18, df.g r19) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.d.c(i1.d, androidx.lifecycle.LifecycleOwner, m0.s, df.g):i1.b");
    }

    public final s0.c d(s sVar) {
        Object cVar;
        sVar.getClass();
        Trace.beginSection(x0.G("CX:getCameraInfo"));
        try {
            w wVar = this.f22764d;
            wVar.getClass();
            g0 g0VarQ = sVar.c(wVar.f28616a.c()).q();
            g0VarQ.getClass();
            b0 b0VarA = a(this, sVar);
            String strD = g0VarQ.d();
            strD.getClass();
            p pVarN = w0.e.n(strD, null, b0VarA.f38284a);
            synchronized (this.f22761a) {
                cVar = this.f22767g.get(pVarN);
                if (cVar == null) {
                    cVar = new s0.c(g0VarQ, b0VarA);
                    this.f22767g.put(pVarN, cVar);
                }
            }
            return (s0.c) cVar;
        } finally {
            Trace.endSection();
        }
    }

    public final void e(w wVar, Context context) {
        m0 m0Var;
        synchronized (this.f22761a) {
            this.f22764d = wVar;
            this.f22766f = context;
            if (wVar != null && (m0Var = wVar.f28628n) != null) {
                w0.c cVarU = w.b.U();
                cVarU.getClass();
                m0Var.f38398n.add(new l0(this, cVarU));
                cVarU.execute(new j0(m0Var, this));
            }
        }
    }

    public final void f() {
        Trace.beginSection(x0.G("CX:unbindAll"));
        try {
            a.a.t();
            b(this, 0);
            g gVar = this.f22765e;
            gVar.getClass();
            gVar.j(this.f22768h);
        } finally {
            Trace.endSection();
        }
    }
}
