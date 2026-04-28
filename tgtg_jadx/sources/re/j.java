package re;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.n1;
import he.d0;
import he.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qe.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b {
    public final je.d D;
    public final d E;
    public final ke.h F;

    public j(z zVar, h hVar, d dVar, he.k kVar) {
        super(zVar, hVar);
        this.E = dVar;
        je.d dVar2 = new je.d(zVar, this, new s(hVar.f37922a, "__container", false), kVar);
        this.D = dVar2;
        List list = Collections.EMPTY_LIST;
        dVar2.c(list, list);
        n1 n1Var = this.f37910p.f37944x;
        if (n1Var != null) {
            this.F = new ke.h(this, this, n1Var);
        }
    }

    @Override // re.b, je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        this.D.e(rectF, this.f37908n, z11);
    }

    @Override // re.b, oe.g
    public final void h(Object obj, ub.a aVar) {
        super.h(obj, aVar);
        PointF pointF = d0.f21873a;
        ke.h hVar = this.F;
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
        ke.h hVar = this.F;
        if (hVar != null) {
            aVar = hVar.b(matrix, i11);
        }
        this.D.b(canvas, matrix, i11, aVar);
    }

    @Override // re.b
    public final jb.b l() {
        jb.b bVar = this.f37910p.f37943w;
        return bVar != null ? bVar : this.E.f37910p.f37943w;
    }

    @Override // re.b
    public final void p(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        this.D.d(fVar, i11, arrayList, fVar2);
    }
}
