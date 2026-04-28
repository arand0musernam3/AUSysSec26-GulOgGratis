package je;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import he.d0;
import java.util.ArrayList;
import java.util.List;
import q1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e, ke.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.b f25037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f25038d = new z((Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f25039e = new z((Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f25040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ie.a f25041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f25042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f25043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe.f f25044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ke.j f25045k;
    public final ke.f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ke.j f25046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ke.j f25047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ke.s f25048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ke.s f25049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final he.z f25050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f25051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ke.e f25052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f25053t;

    public h(he.z zVar, he.k kVar, re.b bVar, qe.d dVar) {
        Path path = new Path();
        this.f25040f = path;
        this.f25041g = new ie.a(1, 0);
        this.f25042h = new RectF();
        this.f25043i = new ArrayList();
        this.f25053t = 0.0f;
        this.f25037c = bVar;
        this.f25035a = dVar.f36963g;
        this.f25036b = dVar.f36964h;
        this.f25050q = zVar;
        this.f25044j = dVar.f36957a;
        path.setFillType(dVar.f36958b);
        this.f25051r = (int) (kVar.b() / 32.0f);
        ke.e eVarG = dVar.f36959c.g();
        this.f25045k = (ke.j) eVarG;
        eVarG.a(this);
        bVar.f(eVarG);
        ke.e eVarG2 = dVar.f36960d.g();
        this.l = (ke.f) eVarG2;
        eVarG2.a(this);
        bVar.f(eVarG2);
        ke.e eVarG3 = dVar.f36961e.g();
        this.f25046m = (ke.j) eVarG3;
        eVarG3.a(this);
        bVar.f(eVarG3);
        ke.e eVarG4 = dVar.f36962f.g();
        this.f25047n = (ke.j) eVarG4;
        eVarG4.a(this);
        bVar.f(eVarG4);
        if (bVar.l() != null) {
            ke.i iVarG = ((pe.b) bVar.l().f24851a).g();
            this.f25052s = iVarG;
            iVarG.a(this);
            bVar.f(this.f25052s);
        }
    }

    @Override // ke.a
    public final void a() {
        this.f25050q.invalidateSelf();
    }

    @Override // je.e
    public final void b(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f25036b) {
            return;
        }
        he.a aVar2 = he.e.f21898a;
        Path path = this.f25040f;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f25043i;
            if (i12 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i12)).g(), matrix);
            i12++;
        }
        path.computeBounds(this.f25042h, false);
        qe.f fVar = this.f25044j;
        qe.f fVar2 = qe.f.LINEAR;
        ke.j jVar = this.f25045k;
        ke.j jVar2 = this.f25047n;
        ke.j jVar3 = this.f25046m;
        if (fVar == fVar2) {
            long jI = i();
            z zVar = this.f25038d;
            linearGradient = (LinearGradient) zVar.b(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) jVar3.f();
                PointF pointF2 = (PointF) jVar2.f();
                qe.c cVar = (qe.c) jVar.f();
                int[] iArrF = f(cVar.f36956b);
                float[] fArr2 = cVar.f36955a;
                if (iArrF.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrF[0], iArrF[0]};
                } else {
                    iArr2 = iArrF;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                zVar.h(jI, linearGradient);
            }
        } else {
            long jI2 = i();
            z zVar2 = this.f25039e;
            RadialGradient radialGradient = (RadialGradient) zVar2.b(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.f();
                PointF pointF4 = (PointF) jVar2.f();
                qe.c cVar2 = (qe.c) jVar.f();
                int[] iArrF2 = f(cVar2.f36956b);
                float[] fArr3 = cVar2.f36955a;
                if (iArrF2.length < 2) {
                    iArr = new int[]{iArrF2[0], iArrF2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrF2;
                }
                float f11 = pointF3.x;
                float f12 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f11, pointF4.y - f12);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f11, f12, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                zVar2.h(jI2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        ie.a aVar3 = this.f25041g;
        aVar3.setShader(linearGradient);
        ke.s sVar = this.f25048o;
        if (sVar != null) {
            aVar3.setColorFilter((ColorFilter) sVar.f());
        }
        ke.e eVar = this.f25052s;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.f()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar3.setMaskFilter(null);
            } else if (fFloatValue != this.f25053t) {
                aVar3.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f25053t = fFloatValue;
        }
        float fIntValue = ((Integer) this.l.f()).intValue() / 100.0f;
        aVar3.setAlpha(ve.g.c((int) (i11 * fIntValue)));
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), aVar3);
        }
        canvas.drawPath(path, aVar3);
        he.a aVar4 = he.e.f21898a;
    }

    @Override // je.c
    public final void c(List list, List list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = (c) list2.get(i11);
            if (cVar instanceof n) {
                this.f25043i.add((n) cVar);
            }
        }
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
    }

    @Override // je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Path path = this.f25040f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f25043i;
            if (i11 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i11)).g(), matrix);
                i11++;
            }
        }
    }

    public final int[] f(int[] iArr) {
        ke.s sVar = this.f25049p;
        if (sVar != null) {
            Integer[] numArr = (Integer[]) sVar.f();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    @Override // je.c
    public final String getName() {
        return this.f25035a;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        PointF pointF = d0.f21873a;
        if (obj == 4) {
            this.l.k(aVar);
            return;
        }
        ColorFilter colorFilter = d0.I;
        re.b bVar = this.f25037c;
        if (obj == colorFilter) {
            ke.s sVar = this.f25048o;
            if (sVar != null) {
                bVar.o(sVar);
            }
            ke.s sVar2 = new ke.s(null, aVar);
            this.f25048o = sVar2;
            sVar2.a(this);
            bVar.f(this.f25048o);
            return;
        }
        if (obj == d0.J) {
            ke.s sVar3 = this.f25049p;
            if (sVar3 != null) {
                bVar.o(sVar3);
            }
            this.f25038d.a();
            this.f25039e.a();
            ke.s sVar4 = new ke.s(null, aVar);
            this.f25049p = sVar4;
            sVar4.a(this);
            bVar.f(this.f25049p);
            return;
        }
        if (obj == d0.f21877e) {
            ke.e eVar = this.f25052s;
            if (eVar != null) {
                eVar.k(aVar);
                return;
            }
            ke.s sVar5 = new ke.s(null, aVar);
            this.f25052s = sVar5;
            sVar5.a(this);
            bVar.f(this.f25052s);
        }
    }

    public final int i() {
        float f11 = this.f25046m.f26304d;
        float f12 = this.f25051r;
        int iRound = Math.round(f11 * f12);
        int iRound2 = Math.round(this.f25047n.f26304d * f12);
        int iRound3 = Math.round(this.f25045k.f26304d * f12);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }
}
