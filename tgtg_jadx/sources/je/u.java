package je;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import he.d0;
import he.z;
import qe.w;
import qe.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final re.b f25119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f25120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f25121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ke.f f25122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ke.s f25123u;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(z zVar, re.b bVar, x xVar) {
        qe.v vVar = xVar.f37026g;
        vVar.getClass();
        int i11 = qe.u.f37018a[vVar.ordinal()];
        Paint.Cap cap = i11 != 1 ? i11 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        w wVar = xVar.f37027h;
        wVar.getClass();
        int i12 = qe.u.f37019b[wVar.ordinal()];
        super(zVar, bVar, cap, i12 != 1 ? i12 != 2 ? i12 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, xVar.f37028i, xVar.f37024e, xVar.f37025f, xVar.f37022c, xVar.f37021b);
        this.f25119q = bVar;
        this.f25120r = xVar.f37020a;
        this.f25121s = xVar.f37029j;
        ke.e eVarG = xVar.f37023d.g();
        this.f25122t = (ke.f) eVarG;
        eVarG.a(this);
        bVar.f(eVarG);
    }

    @Override // je.b, je.e
    public final void b(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        if (this.f25121s) {
            return;
        }
        ke.f fVar = this.f25122t;
        int iM = fVar.m(fVar.b(), fVar.d());
        ie.a aVar2 = this.f24998i;
        aVar2.setColor(iM);
        ke.s sVar = this.f25123u;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.f());
        }
        super.b(canvas, matrix, i11, aVar);
    }

    @Override // je.c
    public final String getName() {
        return this.f25120r;
    }

    @Override // je.b, oe.g
    public final void h(Object obj, ub.a aVar) {
        super.h(obj, aVar);
        PointF pointF = d0.f21873a;
        ke.f fVar = this.f25122t;
        if (obj == 2) {
            fVar.k(aVar);
            return;
        }
        if (obj == d0.I) {
            ke.s sVar = this.f25123u;
            re.b bVar = this.f25119q;
            if (sVar != null) {
                bVar.o(sVar);
            }
            ke.s sVar2 = new ke.s(null, aVar);
            this.f25123u = sVar2;
            sVar2.a(this);
            bVar.f(fVar);
        }
    }
}
