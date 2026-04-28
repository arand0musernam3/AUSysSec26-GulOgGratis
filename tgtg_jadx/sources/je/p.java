package je;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import ax.g0;
import he.d0;
import he.z;
import java.util.ArrayList;
import java.util.List;
import qe.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements n, ke.a, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f25076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qe.m f25077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ke.i f25080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ke.e f25081k;
    public final ke.i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ke.i f25082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ke.i f25083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ke.i f25084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ke.i f25085p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25087r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25071a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f25072b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f25073c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f25074d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f25086q = new g0(1);

    public p(z zVar, re.b bVar, qe.n nVar) {
        this.f25076f = zVar;
        this.f25075e = nVar.f36984a;
        qe.m mVar = nVar.f36985b;
        this.f25077g = mVar;
        this.f25078h = nVar.f36993j;
        this.f25079i = nVar.f36994k;
        ke.i iVarG = nVar.f36986c.g();
        this.f25080j = iVarG;
        ke.e eVarG = nVar.f36987d.g();
        this.f25081k = eVarG;
        ke.i iVarG2 = nVar.f36988e.g();
        this.l = iVarG2;
        ke.i iVarG3 = nVar.f36990g.g();
        this.f25083n = iVarG3;
        ke.i iVarG4 = nVar.f36992i.g();
        this.f25085p = iVarG4;
        qe.m mVar2 = qe.m.STAR;
        if (mVar == mVar2) {
            this.f25082m = nVar.f36989f.g();
            this.f25084o = nVar.f36991h.g();
        } else {
            this.f25082m = null;
            this.f25084o = null;
        }
        bVar.f(iVarG);
        bVar.f(eVarG);
        bVar.f(iVarG2);
        bVar.f(iVarG3);
        bVar.f(iVarG4);
        if (mVar == mVar2) {
            bVar.f(this.f25082m);
            bVar.f(this.f25084o);
        }
        iVarG.a(this);
        eVarG.a(this);
        iVarG2.a(this);
        iVarG3.a(this);
        iVarG4.a(this);
        if (mVar == mVar2) {
            this.f25082m.a(this);
            this.f25084o.a(this);
        }
    }

    @Override // ke.a
    public final void a() {
        this.f25087r = false;
        this.f25076f.invalidateSelf();
    }

    @Override // je.c
    public final void c(List list, List list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i11 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f25126c == y.SIMULTANEOUSLY) {
                    this.f25086q.f4909a.add(vVar);
                    vVar.d(this);
                }
            }
            i11++;
        }
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
    }

    @Override // je.n
    public final Path g() {
        boolean z11;
        float f11;
        double d3;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        double d11;
        boolean z12 = this.f25087r;
        Path path = this.f25071a;
        if (z12) {
            return path;
        }
        path.reset();
        if (this.f25078h) {
            this.f25087r = true;
            return path;
        }
        int i12 = o.f25070a[this.f25077g.ordinal()];
        ke.e eVar = this.f25081k;
        ke.i iVar = this.f25083n;
        ke.i iVar2 = this.f25085p;
        ke.i iVar3 = this.l;
        ke.i iVar4 = this.f25080j;
        if (i12 == 1) {
            z11 = true;
            float fFloatValue = ((Float) iVar4.f()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.f()).floatValue() : 0.0d) - 90.0d);
            double d12 = fFloatValue;
            float f17 = (float) (6.283185307179586d / d12);
            if (this.f25079i) {
                f17 *= -1.0f;
            }
            float f18 = f17;
            float f19 = f18 / 2.0f;
            float f20 = fFloatValue - ((int) fFloatValue);
            if (f20 != 0.0f) {
                f11 = 2.0f;
                radians += (double) ((1.0f - f20) * f19);
            } else {
                f11 = 2.0f;
            }
            float fFloatValue2 = ((Float) iVar.f()).floatValue();
            float fFloatValue3 = ((Float) this.f25082m.f()).floatValue();
            ke.i iVar5 = this.f25084o;
            float fFloatValue4 = iVar5 != null ? ((Float) iVar5.f()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = iVar2 != null ? ((Float) iVar2.f()).floatValue() / 100.0f : 0.0f;
            if (f20 != 0.0f) {
                float fA = j4.s.a(fFloatValue2, fFloatValue3, f20, fFloatValue3);
                double d13 = fA;
                f14 = fA;
                float fCos = (float) (Math.cos(radians) * d13);
                float fSin = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos, fSin);
                d3 = radians + ((double) ((f18 * f20) / f11));
                f12 = fCos;
                f13 = fSin;
            } else {
                double d14 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d14);
                float fSin2 = (float) (Math.sin(radians) * d14);
                path.moveTo(fCos2, fSin2);
                d3 = radians + ((double) f19);
                f12 = fCos2;
                f13 = fSin2;
                f14 = 0.0f;
            }
            double dCeil = Math.ceil(d12) * 2.0d;
            double d15 = d3;
            int i13 = 0;
            boolean z13 = false;
            while (true) {
                double d16 = i13;
                if (d16 >= dCeil) {
                    break;
                }
                float f21 = z13 ? fFloatValue2 : fFloatValue3;
                float f22 = (f14 == 0.0f || d16 != dCeil - 2.0d) ? f19 : (f18 * f20) / f11;
                if (f14 != 0.0f && d16 == dCeil - 1.0d) {
                    f21 = f14;
                }
                double d17 = f21;
                float fCos3 = (float) (Math.cos(d15) * d17);
                float fSin3 = (float) (Math.sin(d15) * d17);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f15 = f20;
                    f16 = fCos3;
                } else {
                    f15 = f20;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f13, f12) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f23 = f12;
                    float f24 = f13;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f25 = z13 ? fFloatValue4 : fFloatValue5;
                    float f26 = z13 ? fFloatValue5 : fFloatValue4;
                    float f27 = (z13 ? fFloatValue3 : fFloatValue2) * f25 * 0.47829f;
                    float f28 = fCos4 * f27;
                    float f29 = f27 * fSin4;
                    float f31 = (z13 ? fFloatValue2 : fFloatValue3) * f26 * 0.47829f;
                    float f32 = fCos5 * f31;
                    float f33 = f31 * fSin5;
                    if (f20 != 0.0f) {
                        if (i13 == 0) {
                            f28 *= f15;
                            f29 *= f15;
                        } else if (d16 == dCeil - 1.0d) {
                            f32 *= f15;
                            f33 *= f15;
                        }
                    }
                    f16 = fCos3;
                    path = path2;
                    path.cubicTo(f23 - f28, f24 - f29, f32 + fCos3, fSin3 + f33, f16, fSin3);
                }
                d15 += (double) f22;
                z13 = !z13;
                i13++;
                f12 = f16;
                f13 = fSin3;
                f20 = f15;
                f11 = 2.0f;
            }
            PointF pointF = (PointF) eVar.f();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (i12 != 2) {
            z11 = true;
        } else {
            int iFloor = (int) Math.floor(((Float) iVar4.f()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.f()).floatValue() : 0.0d) - 90.0d);
            double d18 = iFloor;
            float fFloatValue6 = ((Float) iVar2.f()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) iVar.f()).floatValue();
            double d19 = fFloatValue7;
            z11 = true;
            float fCos6 = (float) (Math.cos(radians2) * d19);
            float fSin6 = (float) (Math.sin(radians2) * d19);
            path.moveTo(fCos6, fSin6);
            double d21 = (float) (6.283185307179586d / d18);
            double dCeil2 = Math.ceil(d18);
            double d22 = radians2 + d21;
            int i14 = 0;
            while (true) {
                double d23 = i14;
                if (d23 >= dCeil2) {
                    break;
                }
                double d24 = dCeil2;
                float fCos7 = (float) (Math.cos(d22) * d19);
                float fSin7 = (float) (Math.sin(d22) * d19);
                if (fFloatValue6 != 0.0f) {
                    i11 = i14;
                    Path path3 = path;
                    d11 = d19;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f34 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f35 = f34 * fCos8;
                    float f36 = f34 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f34;
                    float fSin9 = f34 * ((float) Math.sin(dAtan24));
                    if (d23 == d24 - 1.0d) {
                        Path path4 = this.f25072b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f37 = fCos6 - f35;
                        float f38 = fSin6 - f36;
                        float f39 = fCos7 + fCos9;
                        float f40 = fSin7 + fSin9;
                        path4.cubicTo(f37, f38, f39, f40, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f25073c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f25074d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f37, f38, f39, f40, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f41 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f35, fSin6 - f36, fCos7 + fCos9, f41, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i11 = i14;
                    d11 = d19;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d23 == d24 - 1.0d) {
                        i14 = i11 + 1;
                        dCeil2 = d24;
                        d19 = d11;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d22 += d21;
                i14 = i11 + 1;
                dCeil2 = d24;
                d19 = d11;
            }
            PointF pointF2 = (PointF) eVar.f();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f25086q.f(path);
        this.f25087r = z11;
        return path;
    }

    @Override // je.c
    public final String getName() {
        return this.f25075e;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        ke.i iVar;
        ke.i iVar2;
        if (obj == d0.f21892u) {
            this.f25080j.k(aVar);
            return;
        }
        if (obj == d0.f21893v) {
            this.l.k(aVar);
            return;
        }
        if (obj == d0.f21881i) {
            this.f25081k.k(aVar);
            return;
        }
        if (obj == d0.f21894w && (iVar2 = this.f25082m) != null) {
            iVar2.k(aVar);
            return;
        }
        if (obj == d0.f21895x) {
            this.f25083n.k(aVar);
            return;
        }
        if (obj == d0.f21896y && (iVar = this.f25084o) != null) {
            iVar.k(aVar);
        } else if (obj == d0.f21897z) {
            this.f25085p.k(aVar);
        }
    }
}
