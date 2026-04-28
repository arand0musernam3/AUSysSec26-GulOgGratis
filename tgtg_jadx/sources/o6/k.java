package o6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends t {
    @Override // o6.e
    public final void a(e eVar) {
        n6.a aVar = (n6.a) this.f32030b;
        int i11 = aVar.f30545x0;
        g gVar = this.f32036h;
        Iterator it = gVar.l.iterator();
        int i12 = 0;
        int i13 = -1;
        while (it.hasNext()) {
            int i14 = ((g) it.next()).f32009g;
            if (i13 == -1 || i14 < i13) {
                i13 = i14;
            }
            if (i12 < i14) {
                i12 = i14;
            }
        }
        if (i11 == 0 || i11 == 2) {
            gVar.d(i13 + aVar.f30547z0);
        } else {
            gVar.d(i12 + aVar.f30547z0);
        }
    }

    @Override // o6.t
    public final void d() {
        n6.g gVar = this.f32030b;
        if (gVar instanceof n6.a) {
            g gVar2 = this.f32036h;
            gVar2.f32004b = true;
            ArrayList arrayList = gVar2.l;
            n6.a aVar = (n6.a) gVar;
            int i11 = aVar.f30545x0;
            boolean z11 = aVar.f30546y0;
            int i12 = 0;
            if (i11 == 0) {
                gVar2.f32007e = f.LEFT;
                while (i12 < aVar.f30655w0) {
                    n6.g gVar3 = aVar.f30654v0[i12];
                    if (z11 || gVar3.f30593j0 != 8) {
                        g gVar4 = gVar3.f30580d.f32036h;
                        gVar4.f32013k.add(gVar2);
                        arrayList.add(gVar4);
                    }
                    i12++;
                }
                m(this.f32030b.f30580d.f32036h);
                m(this.f32030b.f30580d.f32037i);
                return;
            }
            if (i11 == 1) {
                gVar2.f32007e = f.RIGHT;
                while (i12 < aVar.f30655w0) {
                    n6.g gVar5 = aVar.f30654v0[i12];
                    if (z11 || gVar5.f30593j0 != 8) {
                        g gVar6 = gVar5.f30580d.f32037i;
                        gVar6.f32013k.add(gVar2);
                        arrayList.add(gVar6);
                    }
                    i12++;
                }
                m(this.f32030b.f30580d.f32036h);
                m(this.f32030b.f30580d.f32037i);
                return;
            }
            if (i11 == 2) {
                gVar2.f32007e = f.TOP;
                while (i12 < aVar.f30655w0) {
                    n6.g gVar7 = aVar.f30654v0[i12];
                    if (z11 || gVar7.f30593j0 != 8) {
                        g gVar8 = gVar7.f30582e.f32036h;
                        gVar8.f32013k.add(gVar2);
                        arrayList.add(gVar8);
                    }
                    i12++;
                }
                m(this.f32030b.f30582e.f32036h);
                m(this.f32030b.f30582e.f32037i);
                return;
            }
            if (i11 != 3) {
                return;
            }
            gVar2.f32007e = f.BOTTOM;
            while (i12 < aVar.f30655w0) {
                n6.g gVar9 = aVar.f30654v0[i12];
                if (z11 || gVar9.f30593j0 != 8) {
                    g gVar10 = gVar9.f30582e.f32037i;
                    gVar10.f32013k.add(gVar2);
                    arrayList.add(gVar10);
                }
                i12++;
            }
            m(this.f32030b.f30582e.f32036h);
            m(this.f32030b.f30582e.f32037i);
        }
    }

    @Override // o6.t
    public final void e() {
        n6.g gVar = this.f32030b;
        if (gVar instanceof n6.a) {
            int i11 = ((n6.a) gVar).f30545x0;
            g gVar2 = this.f32036h;
            if (i11 == 0 || i11 == 1) {
                gVar.f30577b0 = gVar2.f32009g;
            } else {
                gVar.f30579c0 = gVar2.f32009g;
            }
        }
    }

    @Override // o6.t
    public final void f() {
        this.f32031c = null;
        this.f32036h.c();
    }

    @Override // o6.t
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f32036h;
        gVar2.f32013k.add(gVar);
        gVar.l.add(gVar2);
    }
}
