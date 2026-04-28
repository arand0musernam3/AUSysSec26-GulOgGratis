package je;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import he.d0;
import he.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements e, n, j, ke.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f25099a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f25100b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f25101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.b f25102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ke.i f25105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ke.i f25106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ke.r f25107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f25108j;

    public r(z zVar, re.b bVar, qe.o oVar) {
        this.f25101c = zVar;
        this.f25102d = bVar;
        this.f25103e = (String) oVar.f36996b;
        this.f25104f = oVar.f36998d;
        ke.i iVarG = oVar.f36997c.g();
        this.f25105g = iVarG;
        bVar.f(iVarG);
        iVarG.a(this);
        ke.i iVarG2 = ((pe.b) oVar.f36999e).g();
        this.f25106h = iVarG2;
        bVar.f(iVarG2);
        iVarG2.a(this);
        pe.d dVar = (pe.d) oVar.f37000f;
        dVar.getClass();
        ke.r rVar = new ke.r(dVar);
        this.f25107i = rVar;
        rVar.a(bVar);
        rVar.b(this);
    }

    @Override // ke.a
    public final void a() {
        this.f25101c.invalidateSelf();
    }

    @Override // je.e
    public final void b(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        float fFloatValue = ((Float) this.f25105g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f25106h.f()).floatValue();
        ke.r rVar = this.f25107i;
        float fFloatValue3 = ((Float) rVar.f26361v.f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) rVar.f26362w.f()).floatValue() / 100.0f;
        for (int i12 = ((int) fFloatValue) - 1; i12 >= 0; i12--) {
            Matrix matrix2 = this.f25099a;
            matrix2.set(matrix);
            float f11 = i12;
            matrix2.preConcat(rVar.f(f11 + fFloatValue2));
            this.f25108j.b(canvas, matrix2, (int) (ve.g.f(fFloatValue3, fFloatValue4, f11 / fFloatValue) * i11), aVar);
        }
    }

    @Override // je.c
    public final void c(List list, List list2) {
        this.f25108j.c(list, list2);
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
        for (int i12 = 0; i12 < this.f25108j.f25013i.size(); i12++) {
            c cVar = (c) this.f25108j.f25013i.get(i12);
            if (cVar instanceof k) {
                ve.g.g(fVar, i11, arrayList, fVar2, (k) cVar);
            }
        }
    }

    @Override // je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f25108j.e(rectF, matrix, z11);
    }

    @Override // je.j
    public final void f(ListIterator listIterator) {
        if (this.f25108j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f25108j = new d(this.f25101c, this.f25102d, "Repeater", this.f25104f, arrayList, null);
    }

    @Override // je.n
    public final Path g() {
        Path pathG = this.f25108j.g();
        Path path = this.f25100b;
        path.reset();
        float fFloatValue = ((Float) this.f25105g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f25106h.f()).floatValue();
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrixF = this.f25107i.f(i11 + fFloatValue2);
            Matrix matrix = this.f25099a;
            matrix.set(matrixF);
            path.addPath(pathG, matrix);
        }
        return path;
    }

    @Override // je.c
    public final String getName() {
        return this.f25103e;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        if (this.f25107i.c(obj, aVar)) {
            return;
        }
        if (obj == d0.f21890s) {
            this.f25105g.k(aVar);
        } else if (obj == d0.f21891t) {
            this.f25106h.k(aVar);
        }
    }
}
