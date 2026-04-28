package re;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.constraintlayout.widget.z;
import androidx.lifecycle.n1;
import he.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public ke.e D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final ve.j I;
    public final z J;
    public float K;
    public boolean L;
    public final ke.h M;

    public d(he.z zVar, h hVar, List list, he.k kVar) {
        b bVar;
        b jVar;
        super(zVar, hVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new ve.j();
        this.J = new z();
        this.L = true;
        pe.b bVar2 = hVar.f37939s;
        if (bVar2 != null) {
            ke.i iVarG = bVar2.g();
            this.D = iVarG;
            f(iVarG);
            this.D.a(this);
        } else {
            this.D = null;
        }
        q1.z zVar2 = new q1.z(kVar.f21935j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                for (int i11 = 0; i11 < zVar2.j(); i11++) {
                    b bVar4 = (b) zVar2.b(zVar2.f(i11));
                    if (bVar4 != null && (bVar = (b) zVar2.b(bVar4.f37910p.f37927f)) != null) {
                        bVar4.f37914t = bVar;
                    }
                }
                n1 n1Var = this.f37910p.f37944x;
                if (n1Var != null) {
                    this.M = new ke.h(this, this, n1Var);
                    return;
                }
                return;
            }
            h hVar2 = (h) list.get(size);
            switch (a.f37894a[hVar2.f37926e.ordinal()]) {
                case 1:
                    jVar = new j(zVar, hVar2, this, kVar);
                    break;
                case 2:
                    jVar = new d(zVar, hVar2, (List) kVar.f21928c.get(hVar2.f37928g), kVar);
                    break;
                case 3:
                    jVar = new k(zVar, hVar2);
                    break;
                case 4:
                    jVar = new e(zVar, hVar2);
                    break;
                case 5:
                    jVar = new i(zVar, hVar2);
                    break;
                case 6:
                    jVar = new n(zVar, hVar2);
                    break;
                default:
                    ve.c.b("Unknown layer type " + hVar2.f37926e);
                    jVar = null;
                    break;
            }
            if (jVar != null) {
                zVar2.h(jVar.f37910p.f37925d, jVar);
                if (bVar3 != null) {
                    bVar3.f37913s = jVar;
                    bVar3 = null;
                } else {
                    this.E.add(0, jVar);
                    int i12 = c.f37921a[hVar2.f37941u.ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        bVar3 = jVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // re.b, je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).e(rectF2, this.f37908n, true);
            rectF.union(rectF2);
        }
    }

    @Override // re.b, oe.g
    public final void h(Object obj, ub.a aVar) {
        super.h(obj, aVar);
        if (obj == d0.C) {
            s sVar = new s(null, aVar);
            this.D = sVar;
            sVar.a(this);
            f(this.D);
            return;
        }
        ke.h hVar = this.M;
        if (obj == 5 && hVar != null) {
            hVar.f26313c.k(aVar);
            return;
        }
        if (obj == d0.E && hVar != null) {
            hVar.c(aVar);
            return;
        }
        if (obj == d0.F && hVar != null) {
            hVar.f26315e.k(aVar);
            return;
        }
        if (obj == d0.G && hVar != null) {
            hVar.f26316f.k(aVar);
        } else {
            if (obj != d0.H || hVar == null) {
                return;
            }
            hVar.f26317g.k(aVar);
        }
    }

    @Override // re.b
    public final void k(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        Canvas canvasE;
        he.a aVar2 = he.e.f21898a;
        boolean z11 = false;
        ke.h hVar = this.M;
        boolean z12 = (aVar == null && hVar == null) ? false : true;
        he.z zVar = this.f37909o;
        boolean z13 = zVar.f21999t;
        ArrayList<b> arrayList = this.E;
        if ((z13 && arrayList.size() > 1 && i11 != 255) || (z12 && zVar.f22000u)) {
            z11 = true;
        }
        int i12 = z11 ? 255 : i11;
        if (hVar != null) {
            aVar = hVar.b(matrix, i12);
        }
        boolean z14 = this.L;
        h hVar2 = this.f37910p;
        RectF rectF = this.G;
        if (z14 || !"__container".equals(hVar2.f37924c)) {
            rectF.set(0.0f, 0.0f, hVar2.f37935o, hVar2.f37936p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (b bVar : arrayList) {
                RectF rectF2 = this.H;
                bVar.e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        ve.j jVar = this.I;
        if (z11) {
            z zVar2 = this.J;
            zVar2.f2543c = null;
            zVar2.f2542b = i11;
            if (aVar != null) {
                if (Color.alpha(aVar.f42244d) > 0) {
                    zVar2.f2543c = aVar;
                } else {
                    zVar2.f2543c = null;
                }
                aVar = null;
            }
            canvasE = jVar.e(canvas, rectF, zVar2);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).b(canvasE, matrix, i12, aVar);
            }
        }
        if (z11) {
            jVar.c();
        }
        canvas.restore();
        he.a aVar3 = he.e.f21898a;
    }

    @Override // re.b
    public final void p(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i12 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i12)).d(fVar, i11, arrayList, fVar2);
            i12++;
        }
    }

    @Override // re.b
    public final void q(boolean z11) {
        super.q(z11);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((b) it.next()).q(z11);
        }
    }

    @Override // re.b
    public final void r(float f11) {
        he.a aVar = he.e.f21898a;
        this.K = f11;
        super.r(f11);
        ke.e eVar = this.D;
        h hVar = this.f37910p;
        if (eVar != null) {
            he.k kVar = this.f37909o.f21981a;
            f11 = ((((Float) eVar.f()).floatValue() * hVar.f37923b.f21938n) - hVar.f37923b.l) / ((kVar.f21937m - kVar.l) + 0.01f);
        }
        if (this.D == null) {
            float f12 = hVar.f37934n;
            he.k kVar2 = hVar.f37923b;
            f11 -= f12 / (kVar2.f21937m - kVar2.l);
        }
        if (hVar.f37933m != 0.0f && !"__container".equals(hVar.f37924c)) {
            f11 /= hVar.f37933m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).r(f11);
        }
        he.a aVar2 = he.e.f21898a;
    }
}
