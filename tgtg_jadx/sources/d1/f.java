package d1;

import android.os.Trace;
import androidx.lifecycle.n1;
import c1.n;
import java.util.List;
import java.util.Map;
import kotlin.collections.n0;
import m5.h;
import m5.k0;
import m5.u0;
import s0.i0;
import z3.g;
import z3.l;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13695g;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f13689a = i11;
        this.f13690b = obj;
        this.f13691c = obj2;
        this.f13692d = obj3;
        this.f13693e = obj4;
        this.f13694f = obj5;
        this.f13695g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z3.c cVarC;
        switch (this.f13689a) {
            case 0:
                ((n1) this.f13690b).k((i0) this.f13691c, (i0) this.f13692d, (n) this.f13693e, (n) this.f13694f, (Map.Entry) this.f13695g);
                return;
            default:
                u0 u0Var = (u0) this.f13690b;
                m mVar = (m) this.f13691c;
                List list = (List) this.f13692d;
                h hVar = (h) this.f13693e;
                z5.c cVar = (z5.c) this.f13694f;
                q5.h hVar2 = (q5.h) this.f13695g;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    g gVarJ = l.j();
                    z3.c cVar2 = gVarJ instanceof z3.c ? (z3.c) gVarJ : null;
                    if (cVar2 == null || (cVarC = cVar2.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        g gVarJ2 = cVarC.j();
                        try {
                            u0 u0VarK = k0.k(u0Var, mVar);
                            if (list == null) {
                                list = n0.f26529a;
                            }
                            new n1(hVar, u0VarK, list, cVar, hVar2).c();
                            g.q(gVarJ2);
                            cVarC.w().b();
                            return;
                        } catch (Throwable th2) {
                            g.q(gVarJ2);
                            throw th2;
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
        }
    }
}
