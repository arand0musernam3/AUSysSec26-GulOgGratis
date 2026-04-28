package je;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import he.d0;
import q1.z;
import qe.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public ke.s A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f25054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f25055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f25056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f25057t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f25058u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final qe.f f25059v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f25060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ke.j f25061x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ke.j f25062y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ke.j f25063z;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(he.z zVar, re.b bVar, qe.e eVar) {
        Paint.Join join;
        Paint.Join join2;
        qe.v vVar = eVar.f36972h;
        vVar.getClass();
        int i11 = qe.u.f37018a[vVar.ordinal()];
        Paint.Cap cap = i11 != 1 ? i11 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        w wVar = eVar.f36973i;
        wVar.getClass();
        int i12 = qe.u.f37019b[wVar.ordinal()];
        if (i12 == 1) {
            join = Paint.Join.BEVEL;
        } else if (i12 == 2) {
            join = Paint.Join.MITER;
        } else {
            if (i12 != 3) {
                join2 = null;
                super(zVar, bVar, cap, join2, eVar.f36974j, eVar.f36968d, eVar.f36971g, eVar.f36975k, eVar.l);
                this.f25056s = new z((Object) null);
                this.f25057t = new z((Object) null);
                this.f25058u = new RectF();
                this.f25054q = eVar.f36965a;
                this.f25059v = eVar.f36966b;
                this.f25055r = eVar.f36976m;
                this.f25060w = (int) (zVar.f21981a.b() / 32.0f);
                ke.e eVarG = eVar.f36967c.g();
                this.f25061x = (ke.j) eVarG;
                eVarG.a(this);
                bVar.f(eVarG);
                ke.e eVarG2 = eVar.f36969e.g();
                this.f25062y = (ke.j) eVarG2;
                eVarG2.a(this);
                bVar.f(eVarG2);
                ke.e eVarG3 = eVar.f36970f.g();
                this.f25063z = (ke.j) eVarG3;
                eVarG3.a(this);
                bVar.f(eVarG3);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(zVar, bVar, cap, join2, eVar.f36974j, eVar.f36968d, eVar.f36971g, eVar.f36975k, eVar.l);
        this.f25056s = new z((Object) null);
        this.f25057t = new z((Object) null);
        this.f25058u = new RectF();
        this.f25054q = eVar.f36965a;
        this.f25059v = eVar.f36966b;
        this.f25055r = eVar.f36976m;
        this.f25060w = (int) (zVar.f21981a.b() / 32.0f);
        ke.e eVarG4 = eVar.f36967c.g();
        this.f25061x = (ke.j) eVarG4;
        eVarG4.a(this);
        bVar.f(eVarG4);
        ke.e eVarG22 = eVar.f36969e.g();
        this.f25062y = (ke.j) eVarG22;
        eVarG22.a(this);
        bVar.f(eVarG22);
        ke.e eVarG32 = eVar.f36970f.g();
        this.f25063z = (ke.j) eVarG32;
        eVarG32.a(this);
        bVar.f(eVarG32);
    }

    @Override // je.b, je.e
    public final void b(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f25055r) {
            return;
        }
        e(this.f25058u, matrix, false);
        qe.f fVar = this.f25059v;
        qe.f fVar2 = qe.f.LINEAR;
        ke.j jVar = this.f25061x;
        ke.j jVar2 = this.f25063z;
        ke.j jVar3 = this.f25062y;
        if (fVar == fVar2) {
            long jI = i();
            z zVar = this.f25056s;
            shader = (LinearGradient) zVar.b(jI);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.f();
                PointF pointF2 = (PointF) jVar2.f();
                qe.c cVar = (qe.c) jVar.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f36956b), cVar.f36955a, Shader.TileMode.CLAMP);
                zVar.h(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            z zVar2 = this.f25057t;
            shader = (RadialGradient) zVar2.b(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.f();
                PointF pointF4 = (PointF) jVar2.f();
                qe.c cVar2 = (qe.c) jVar.f();
                int[] iArrF = f(cVar2.f36956b);
                float[] fArr = cVar2.f36955a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrF, fArr, Shader.TileMode.CLAMP);
                zVar2.h(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        this.f24998i.setShader(shader);
        super.b(canvas, matrix, i11, aVar);
    }

    public final int[] f(int[] iArr) {
        ke.s sVar = this.A;
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
        return this.f25054q;
    }

    @Override // je.b, oe.g
    public final void h(Object obj, ub.a aVar) {
        super.h(obj, aVar);
        if (obj == d0.J) {
            ke.s sVar = this.A;
            re.b bVar = this.f24995f;
            if (sVar != null) {
                bVar.o(sVar);
            }
            ke.s sVar2 = new ke.s(null, aVar);
            this.A = sVar2;
            sVar2.a(this);
            bVar.f(this.A);
        }
    }

    public final int i() {
        float f11 = this.f25062y.f26304d;
        float f12 = this.f25060w;
        int iRound = Math.round(f11 * f12);
        int iRound2 = Math.round(this.f25063z.f26304d * f12);
        int iRound3 = Math.round(this.f25061x.f26304d * f12);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }
}
