package g1;

import co.datadome.sdk.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.l;
import m0.m1;
import m0.p0;
import s0.p;
import s0.q;
import s0.y;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18096b;

    public g(List list) {
        this.f18095a = 3;
        this.f18096b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (!(pVar instanceof q)) {
                ((ArrayList) this.f18096b).add(pVar);
            }
        }
    }

    @Override // s0.p
    public void a(int i11) {
        switch (this.f18095a) {
            case 3:
                Iterator it = ((ArrayList) this.f18096b).iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(i11);
                }
                break;
        }
    }

    @Override // s0.p
    public void b(int i11, y yVar) {
        switch (this.f18095a) {
            case 0:
                h hVar = (h) ((WeakReference) this.f18096b).get();
                if (hVar != null) {
                    Iterator it = hVar.f18097a.iterator();
                    while (it.hasNext()) {
                        z1 z1Var = ((m1) it.next()).f28566p;
                        Iterator it2 = z1Var.f38494g.f38441d.iterator();
                        while (it2.hasNext()) {
                            ((p) it2.next()).b(i11, new x(yVar, z1Var.f38494g.f38442e, -1L));
                        }
                    }
                    return;
                }
                return;
            case 1:
                p0 p0Var = (p0) this.f18096b;
                synchronized (p0Var.f28574a) {
                    try {
                        if (p0Var.f28578e) {
                            return;
                        }
                        p0Var.f28582i.put(yVar.getTimestamp(), new y0.b(yVar));
                        p0Var.l();
                        return;
                    } finally {
                    }
                }
            case 2:
            default:
                return;
            case 3:
                Iterator it3 = ((ArrayList) this.f18096b).iterator();
                while (it3.hasNext()) {
                    ((p) it3.next()).b(i11, yVar);
                }
                return;
        }
    }

    @Override // s0.p
    public void c(int i11, ky.p pVar) {
        switch (this.f18095a) {
            case 3:
                Iterator it = ((ArrayList) this.f18096b).iterator();
                while (it.hasNext()) {
                    ((p) it.next()).c(i11, pVar);
                }
                break;
        }
    }

    @Override // s0.p
    public void d(int i11, int i12) {
        switch (this.f18095a) {
            case 2:
                w.b.U().execute(new b0.h(this, i12, 6));
                break;
            case 3:
                Iterator it = ((ArrayList) this.f18096b).iterator();
                while (it.hasNext()) {
                    ((p) it.next()).d(i11, i12);
                }
                break;
        }
    }

    @Override // s0.p
    public void e(int i11) {
        switch (this.f18095a) {
            case 2:
                w.b.U().execute(new l(this, 9));
                break;
            case 3:
                Iterator it = ((ArrayList) this.f18096b).iterator();
                while (it.hasNext()) {
                    ((p) it.next()).e(i11);
                }
                break;
        }
    }

    public g(h hVar) {
        this.f18095a = 0;
        this.f18096b = new WeakReference(hVar);
    }

    public /* synthetic */ g(Object obj, int i11) {
        this.f18095a = i11;
        this.f18096b = obj;
    }
}
