package ke;

import android.graphics.Matrix;
import android.graphics.PointF;
import he.d0;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f26342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f26343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f26344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f26345e;
    public e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f26352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f26353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f26354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f26355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f26356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f26357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f26358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f26359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f26360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f26361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f26362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f26363x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f26341a = new Matrix();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26346f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26347g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26348h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f26349i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f26350j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26351k = true;

    public r(pe.d dVar) {
        n1.c cVar = dVar.f34722a;
        this.l = cVar == null ? null : cVar.g();
        pe.e eVar = dVar.f34723b;
        this.f26352m = eVar == null ? null : eVar.g();
        pe.a aVar = dVar.f34724c;
        this.f26353n = aVar == null ? null : aVar.g();
        pe.b bVar = dVar.f34725d;
        this.f26354o = bVar == null ? null : bVar.g();
        pe.b bVar2 = dVar.f34727f;
        this.f26356q = bVar2 == null ? null : bVar2.g();
        this.f26363x = dVar.f34733m;
        pe.b bVar3 = dVar.f34729h;
        this.f26358s = bVar3 == null ? null : bVar3.g();
        pe.b bVar4 = dVar.f34730i;
        this.f26359t = bVar4 == null ? null : bVar4.g();
        pe.b bVar5 = dVar.f34731j;
        this.f26360u = bVar5 == null ? null : bVar5.g();
        if (this.f26356q != null) {
            this.f26342b = new Matrix();
            this.f26343c = new Matrix();
            this.f26344d = new Matrix();
            this.f26345e = new float[9];
        } else {
            this.f26342b = null;
            this.f26343c = null;
            this.f26344d = null;
            this.f26345e = null;
        }
        pe.b bVar6 = dVar.f34728g;
        this.f26357r = bVar6 == null ? null : bVar6.g();
        pe.a aVar2 = dVar.f34726e;
        if (aVar2 != null) {
            this.f26355p = aVar2.g();
        }
        pe.b bVar7 = dVar.f34732k;
        if (bVar7 != null) {
            this.f26361v = bVar7.g();
        } else {
            this.f26361v = null;
        }
        pe.b bVar8 = dVar.l;
        if (bVar8 != null) {
            this.f26362w = bVar8.g();
        } else {
            this.f26362w = null;
        }
    }

    public final void a(re.b bVar) {
        bVar.f(this.f26355p);
        bVar.f(this.f26361v);
        bVar.f(this.f26362w);
        bVar.f(this.l);
        bVar.f(this.f26352m);
        bVar.f(this.f26353n);
        bVar.f(this.f26354o);
        bVar.f(this.f26356q);
        bVar.f(this.f26357r);
        bVar.f(this.f26358s);
        bVar.f(this.f26359t);
        bVar.f(this.f26360u);
    }

    public final void b(a aVar) {
        e eVar = this.f26355p;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f26361v;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f26362w;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.l;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f26352m;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f26353n;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f26354o;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.f26356q;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f26357r;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
        i iVar3 = this.f26358s;
        if (iVar3 != null) {
            iVar3.a(aVar);
            this.f26358s.a(new q(this, 0));
        }
        i iVar4 = this.f26359t;
        if (iVar4 != null) {
            iVar4.a(aVar);
            this.f26359t.a(new q(this, 1));
        }
        i iVar5 = this.f26360u;
        if (iVar5 != null) {
            iVar5.a(aVar);
            this.f26360u.a(new q(this, 2));
        }
    }

    public final boolean c(Object obj, ub.a aVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == d0.f21873a) {
            e eVar = this.l;
            if (eVar == null) {
                this.l = new s(new PointF(), aVar);
                return true;
            }
            eVar.k(aVar);
            return true;
        }
        if (obj == d0.f21874b) {
            e eVar2 = this.f26352m;
            if (eVar2 == null) {
                this.f26352m = new s(new PointF(), aVar);
                return true;
            }
            eVar2.k(aVar);
            return true;
        }
        if (obj == d0.f21875c) {
            e eVar3 = this.f26352m;
            if (eVar3 instanceof o) {
                ((o) eVar3).f26334m = aVar;
                return true;
            }
        }
        if (obj == d0.f21876d) {
            e eVar4 = this.f26352m;
            if (eVar4 instanceof o) {
                ((o) eVar4).f26335n = aVar;
                return true;
            }
        }
        if (obj == d0.f21882j) {
            e eVar5 = this.f26353n;
            if (eVar5 == null) {
                this.f26353n = new s(new we.c(), aVar);
                return true;
            }
            eVar5.k(aVar);
            return true;
        }
        if (obj == d0.f21883k) {
            e eVar6 = this.f26354o;
            if (eVar6 == null) {
                this.f26354o = new s(fValueOf2, aVar);
                return true;
            }
            eVar6.k(aVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.f26355p;
            if (eVar7 == null) {
                this.f26355p = new s(100, aVar);
                return true;
            }
            eVar7.k(aVar);
            return true;
        }
        if (obj == d0.A) {
            e eVar8 = this.f26361v;
            if (eVar8 == null) {
                this.f26361v = new s(fValueOf, aVar);
                return true;
            }
            eVar8.k(aVar);
            return true;
        }
        if (obj == d0.B) {
            e eVar9 = this.f26362w;
            if (eVar9 == null) {
                this.f26362w = new s(fValueOf, aVar);
                return true;
            }
            eVar9.k(aVar);
            return true;
        }
        if (obj == d0.f21886o) {
            if (this.f26356q == null) {
                this.f26356q = new i(Collections.singletonList(new we.a(fValueOf2)));
            }
            this.f26356q.k(aVar);
            return true;
        }
        if (obj == d0.f21887p) {
            if (this.f26357r == null) {
                this.f26357r = new i(Collections.singletonList(new we.a(fValueOf2)));
            }
            this.f26357r.k(aVar);
            return true;
        }
        if (obj == d0.l) {
            if (this.f26358s == null) {
                this.f26358s = new i(Collections.singletonList(new we.a(fValueOf2)));
            }
            this.f26358s.k(aVar);
            return true;
        }
        if (obj == d0.f21884m) {
            if (this.f26359t == null) {
                this.f26359t = new i(Collections.singletonList(new we.a(fValueOf2)));
            }
            this.f26359t.k(aVar);
            return true;
        }
        if (obj != d0.f21885n) {
            return false;
        }
        if (this.f26360u == null) {
            this.f26360u = new i(Collections.singletonList(new we.a(fValueOf2)));
        }
        this.f26360u.k(aVar);
        return true;
    }

    public final void d() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.f26345e[i11] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        PointF pointF;
        we.c cVar;
        PointF pointF2;
        Matrix matrix = this.f26341a;
        matrix.reset();
        i iVar3 = this.f26358s;
        if ((iVar3 == null || iVar3.m() == 0.0f) && (((iVar = this.f26359t) == null || iVar.m() == 0.0f) && ((iVar2 = this.f26360u) == null || iVar2.m() == 0.0f))) {
            e eVar = this.f26352m;
            if (eVar != null && (pointF2 = (PointF) eVar.f()) != null) {
                float f11 = pointF2.x;
                if (f11 != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f11, pointF2.y);
                }
            }
            if (!this.f26363x) {
                e eVar2 = this.f26354o;
                if (eVar2 != null) {
                    float fFloatValue = eVar2 instanceof s ? ((Float) eVar2.f()).floatValue() : ((i) eVar2).m();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (eVar != null) {
                float f12 = eVar.f26304d;
                PointF pointF3 = (PointF) eVar.f();
                float f13 = pointF3.x;
                float f14 = pointF3.y;
                eVar.j(1.0E-4f + f12);
                PointF pointF4 = (PointF) eVar.f();
                eVar.j(f12);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f14, pointF4.x - f13)));
            }
            if (this.f26356q != null) {
                float fCos = this.f26357r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.m()) + 90.0f));
                float fSin = this.f26357r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.m()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(r1.m()));
                d();
                float[] fArr = this.f26345e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f15 = -fSin;
                fArr[3] = f15;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f26342b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f26343c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f15;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f26344d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            e eVar3 = this.f26353n;
            if (eVar3 != null && (cVar = (we.c) eVar3.f()) != null) {
                float f16 = cVar.f43409a;
                if (f16 != 1.0f || cVar.f43410b != 1.0f) {
                    matrix.preScale(f16, cVar.f43410b);
                }
            }
            e eVar4 = this.l;
            if (eVar4 != null && (pointF = (PointF) eVar4.f()) != null) {
                float f17 = pointF.x;
                if (f17 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f17, -pointF.y);
                }
            }
        } else {
            i iVar4 = this.f26358s;
            float fM = iVar4 != null ? iVar4.m() : 0.0f;
            i iVar5 = this.f26359t;
            float fM2 = iVar5 != null ? iVar5.m() : 0.0f;
            i iVar6 = this.f26360u;
            float fM3 = iVar6 != null ? iVar6.m() : 0.0f;
            if (this.f26351k || fM != this.f26346f || fM2 != this.f26347g || fM3 != this.f26348h) {
                this.f26346f = fM;
                this.f26347g = fM2;
                this.f26348h = fM3;
                if (fM != 0.0f) {
                    this.f26349i = (float) Math.cos(Math.toRadians(fM));
                } else {
                    this.f26349i = 1.0f;
                }
                if (fM2 != 0.0f) {
                    this.f26350j = (float) Math.cos(Math.toRadians(fM2));
                } else {
                    this.f26350j = 1.0f;
                }
                this.f26351k = false;
            }
            e eVar5 = this.l;
            PointF pointF5 = eVar5 == null ? null : (PointF) eVar5.f();
            e eVar6 = this.f26352m;
            PointF pointF6 = eVar6 == null ? null : (PointF) eVar6.f();
            e eVar7 = this.f26353n;
            we.c cVar2 = eVar7 != null ? (we.c) eVar7.f() : null;
            float f18 = cVar2 != null ? cVar2.f43409a : 1.0f;
            float f19 = cVar2 != null ? cVar2.f43410b : 1.0f;
            float f20 = this.f26349i;
            float f21 = this.f26350j;
            matrix.reset();
            if (pointF6 != null) {
                float f22 = pointF6.x;
                if (f22 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f22, pointF6.y);
                }
            }
            if (fM3 != 0.0f) {
                matrix.preRotate(fM3);
            }
            if (fM2 != 0.0f) {
                matrix.preScale(f21, 1.0f);
            }
            if (fM != 0.0f) {
                matrix.preScale(1.0f, f20);
            }
            if (f18 != 1.0f || f19 != 1.0f) {
                matrix.preScale(f18, f19);
            }
            if (pointF5 != null) {
                float f23 = pointF5.x;
                if (f23 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f23, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f11) {
        e eVar = this.f26352m;
        PointF pointF = eVar == null ? null : (PointF) eVar.f();
        e eVar2 = this.f26353n;
        we.c cVar = eVar2 == null ? null : (we.c) eVar2.f();
        e eVar3 = this.l;
        PointF pointF2 = eVar3 != null ? (PointF) eVar3.f() : null;
        Matrix matrix = this.f26341a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f11, pointF.y * f11);
        }
        i iVar = this.f26358s;
        float fM = iVar != null ? iVar.m() * f11 : 0.0f;
        i iVar2 = this.f26359t;
        float fM2 = iVar2 != null ? iVar2.m() * f11 : 0.0f;
        i iVar3 = this.f26360u;
        float fM3 = iVar3 != null ? iVar3.m() * f11 : 0.0f;
        if (fM == 0.0f && fM2 == 0.0f && fM3 == 0.0f) {
            e eVar4 = this.f26354o;
            if (eVar4 != null) {
                matrix.preRotate(((Float) eVar4.f()).floatValue() * f11, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fM != 0.0f ? (float) Math.cos(Math.toRadians(fM)) : 1.0f;
            float fCos2 = fM2 != 0.0f ? (float) Math.cos(Math.toRadians(fM2)) : 1.0f;
            if (fM3 != 0.0f) {
                matrix.preRotate(fM3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fM2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fM != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (cVar != null) {
            double d3 = f11;
            matrix.preScale((float) Math.pow(cVar.f43409a, d3), (float) Math.pow(cVar.f43410b, d3));
        }
        return matrix;
    }
}
