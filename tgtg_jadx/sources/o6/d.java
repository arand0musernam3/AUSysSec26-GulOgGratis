package o6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f32002k;
    public int l;

    public d(n6.g gVar, int i11) {
        n6.g gVar2;
        super(gVar);
        ArrayList<t> arrayList = new ArrayList();
        this.f32002k = arrayList;
        this.f32034f = i11;
        n6.g gVar3 = this.f32030b;
        n6.g gVarO = gVar3.o(i11);
        while (true) {
            gVar2 = gVar3;
            gVar3 = gVarO;
            if (gVar3 == null) {
                break;
            } else {
                gVarO = gVar3.o(this.f32034f);
            }
        }
        this.f32030b = gVar2;
        int i12 = this.f32034f;
        arrayList.add(i12 == 0 ? gVar2.f30580d : i12 == 1 ? gVar2.f30582e : null);
        n6.g gVarN = gVar2.n(this.f32034f);
        while (gVarN != null) {
            int i13 = this.f32034f;
            arrayList.add(i13 == 0 ? gVarN.f30580d : i13 == 1 ? gVarN.f30582e : null);
            gVarN = gVarN.n(this.f32034f);
        }
        for (t tVar : arrayList) {
            int i14 = this.f32034f;
            if (i14 == 0) {
                tVar.f32030b.f30576b = this;
            } else if (i14 == 1) {
                tVar.f32030b.f30578c = this;
            }
        }
        if (this.f32034f == 0 && ((n6.h) this.f32030b.W).A0 && arrayList.size() > 1) {
            this.f32030b = ((t) j4.s.d(1, arrayList)).f32030b;
        }
        int i15 = this.f32034f;
        n6.g gVar4 = this.f32030b;
        this.l = i15 == 0 ? gVar4.f30598m0 : gVar4.f30600n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // o6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(o6.e r27) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.d.a(o6.e):void");
    }

    @Override // o6.t
    public final void d() {
        ArrayList arrayList = this.f32002k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((t) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        n6.g gVar = ((t) arrayList.get(0)).f32030b;
        n6.g gVar2 = ((t) arrayList.get(size - 1)).f32030b;
        int i11 = this.f32034f;
        g gVar3 = this.f32037i;
        g gVar4 = this.f32036h;
        if (i11 == 0) {
            n6.d dVar = gVar.K;
            n6.d dVar2 = gVar2.M;
            g gVarI = t.i(dVar, 0);
            int iE = dVar.e();
            n6.g gVarM = m();
            if (gVarM != null) {
                iE = gVarM.K.e();
            }
            if (gVarI != null) {
                t.b(gVar4, gVarI, iE);
            }
            g gVarI2 = t.i(dVar2, 0);
            int iE2 = dVar2.e();
            n6.g gVarN = n();
            if (gVarN != null) {
                iE2 = gVarN.M.e();
            }
            if (gVarI2 != null) {
                t.b(gVar3, gVarI2, -iE2);
            }
        } else {
            n6.d dVar3 = gVar.L;
            n6.d dVar4 = gVar2.N;
            g gVarI3 = t.i(dVar3, 1);
            int iE3 = dVar3.e();
            n6.g gVarM2 = m();
            if (gVarM2 != null) {
                iE3 = gVarM2.L.e();
            }
            if (gVarI3 != null) {
                t.b(gVar4, gVarI3, iE3);
            }
            g gVarI4 = t.i(dVar4, 1);
            int iE4 = dVar4.e();
            n6.g gVarN2 = n();
            if (gVarN2 != null) {
                iE4 = gVarN2.N.e();
            }
            if (gVarI4 != null) {
                t.b(gVar3, gVarI4, -iE4);
            }
        }
        gVar4.f32003a = this;
        gVar3.f32003a = this;
    }

    @Override // o6.t
    public final void e() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f32002k;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i11)).e();
            i11++;
        }
    }

    @Override // o6.t
    public final void f() {
        this.f32031c = null;
        Iterator it = this.f32002k.iterator();
        while (it.hasNext()) {
            ((t) it.next()).f();
        }
    }

    @Override // o6.t
    public final long j() {
        ArrayList arrayList = this.f32002k;
        int size = arrayList.size();
        long j9 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            t tVar = (t) arrayList.get(i11);
            j9 = ((long) tVar.f32037i.f32008f) + tVar.j() + j9 + ((long) tVar.f32036h.f32008f);
        }
        return j9;
    }

    @Override // o6.t
    public final boolean k() {
        ArrayList arrayList = this.f32002k;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!((t) arrayList.get(i11)).k()) {
                return false;
            }
        }
        return true;
    }

    public final n6.g m() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f32002k;
            if (i11 >= arrayList.size()) {
                return null;
            }
            n6.g gVar = ((t) arrayList.get(i11)).f32030b;
            if (gVar.f30593j0 != 8) {
                return gVar;
            }
            i11++;
        }
    }

    public final n6.g n() {
        ArrayList arrayList = this.f32002k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n6.g gVar = ((t) arrayList.get(size)).f32030b;
            if (gVar.f30593j0 != 8) {
                return gVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f32034f == 0 ? "horizontal : " : "vertical : ");
        for (t tVar : this.f32002k) {
            sb2.append("<");
            sb2.append(tVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
