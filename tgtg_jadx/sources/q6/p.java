package q6;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public m[] A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f36277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36278c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xz.b[] f36285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i6.b f36286k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f36289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f36290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f36291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f36292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f36293s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f36298x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f36299y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap f36300z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f36276a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36279d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36280e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f36281f = new a0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f36282g = new a0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f36283h = new n();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f36284i = new n();
    public float l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f36287m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f36288n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f36294t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f36295u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f36296v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f36297w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public p(View view) {
        this.f36277b = view;
        this.f36278c = view.getId();
        view.getLayoutParams();
    }

    public static void f(Rect rect, Rect rect2, int i11, int i12, int i13) {
        if (i11 == 1) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i13 - ((rect.height() + i14) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 == 2) {
            int i15 = rect.left + rect.right;
            rect2.left = i12 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 == 3) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i16 / 2);
            rect2.top = i13 - ((rect.height() + i16) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 != 4) {
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = i12 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i17 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f11, float[] fArr) {
        float f12 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f36288n;
            if (f13 != 1.0d) {
                float f14 = this.f36287m;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f14) * f13, 1.0f);
                }
            }
        }
        i6.e eVar = this.f36281f.f36062a;
        float f15 = Float.NaN;
        for (a0 a0Var : this.f36295u) {
            i6.e eVar2 = a0Var.f36062a;
            if (eVar2 != null) {
                float f16 = a0Var.f36064c;
                if (f16 < f11) {
                    eVar = eVar2;
                    f12 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = a0Var.f36064c;
                }
            }
        }
        if (eVar != null) {
            float f17 = (Float.isNaN(f15) ? 1.0f : f15) - f12;
            double d3 = (f11 - f12) / f17;
            f11 = (((float) eVar.a(d3)) * f17) + f12;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d3);
            }
        }
        return f11;
    }

    public final void b(double d3, float[] fArr, float[] fArr2) {
        float f11;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f36285j[0].v(d3, dArr);
        this.f36285j[0].x(d3, dArr2);
        float f12 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f36289o;
        a0 a0Var = this.f36281f;
        float f13 = a0Var.f36066e;
        float f14 = a0Var.f36067f;
        float f15 = a0Var.f36068g;
        float f16 = a0Var.f36069h;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f20 = (float) dArr[i11];
            float f21 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f13 = f20;
                f12 = f21;
            } else if (i12 == 2) {
                f14 = f20;
                f19 = f21;
            } else if (i12 == 3) {
                f15 = f20;
                f17 = f21;
            } else if (i12 == 4) {
                f16 = f20;
                f18 = f21;
            }
        }
        float fCos = (f17 / 2.0f) + f12;
        float fSin = (f18 / 2.0f) + f19;
        p pVar = a0Var.f36073m;
        if (pVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            pVar.b(d3, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d11 = f13;
            double d12 = f14;
            float fSin2 = (float) (((Math.sin(d12) * d11) + ((double) f22)) - ((double) (f15 / 2.0f)));
            float fCos2 = (float) ((((double) f23) - (Math.cos(d12) * d11)) - ((double) (f16 / 2.0f)));
            double d13 = f12;
            double d14 = f19;
            f11 = 2.0f;
            f14 = fCos2;
            fCos = (float) ((Math.cos(d12) * d14) + (Math.sin(d12) * d13) + ((double) f24));
            fSin = (float) ((Math.sin(d12) * d14) + (((double) f25) - (Math.cos(d12) * d13)));
            f13 = fSin2;
        } else {
            f11 = 2.0f;
        }
        fArr[0] = (f15 / f11) + f13 + 0.0f;
        fArr[1] = (f16 / f11) + f14 + 0.0f;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    public final float c() {
        float[] fArr = new float[2];
        float f11 = 1.0f / 99;
        double d3 = 0.0d;
        double d11 = 0.0d;
        int i11 = 0;
        float fHypot = 0.0f;
        while (i11 < 100) {
            float f12 = i11 * f11;
            double dA = f12;
            i6.e eVar = this.f36281f.f36062a;
            float f13 = Float.NaN;
            float f14 = 0.0f;
            for (a0 a0Var : this.f36295u) {
                i6.e eVar2 = a0Var.f36062a;
                if (eVar2 != null) {
                    float f15 = a0Var.f36064c;
                    if (f15 < f12) {
                        eVar = eVar2;
                        f14 = f15;
                    } else if (Float.isNaN(f13)) {
                        f13 = a0Var.f36064c;
                    }
                }
            }
            if (eVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                dA = (((float) eVar.a((f12 - f14) / r17)) * (f13 - f14)) + f14;
            }
            double d12 = dA;
            this.f36285j[0].v(d12, this.f36290p);
            int i12 = i11;
            this.f36281f.d(d12, this.f36289o, this.f36290p, fArr, 0);
            if (i12 > 0) {
                fHypot += (float) Math.hypot(d11 - ((double) fArr[1]), d3 - ((double) fArr[0]));
            }
            d3 = fArr[0];
            d11 = fArr[1];
            i11 = i12 + 1;
        }
        return fHypot;
    }

    public final boolean d(float f11, long j9, View view, i6.e eVar) {
        boolean zD;
        boolean z11;
        float f12;
        p6.o oVar;
        float f13;
        boolean z12;
        double d3;
        float f14;
        float f15;
        float f16;
        float fSin;
        float f17;
        p6.o oVar2 = null;
        float fA = a(f11, null);
        int i11 = this.E;
        if (i11 != -1) {
            float f18 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fA / f18)) * f18;
            float f19 = (fA % f18) / f18;
            if (!Float.isNaN(this.F)) {
                f19 = (f19 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fA = ((interpolator != null ? interpolator.getInterpolation(f19) : ((double) f19) > 0.5d ? 1.0f : 0.0f) * f18) + fFloor;
        }
        HashMap map = this.f36299y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((p6.l) it.next()).c(view, fA);
            }
        }
        HashMap map2 = this.f36298x;
        if (map2 != null) {
            p6.o oVar3 = null;
            zD = false;
            for (p6.q qVar : map2.values()) {
                if (qVar instanceof p6.o) {
                    oVar3 = (p6.o) qVar;
                } else {
                    zD |= qVar.d(fA, j9, view, eVar);
                }
            }
            oVar2 = oVar3;
        } else {
            zD = false;
        }
        xz.b[] bVarArr = this.f36285j;
        a0 a0Var = this.f36281f;
        if (bVarArr != null) {
            double d11 = fA;
            bVarArr[0].v(d11, this.f36290p);
            this.f36285j[0].x(d11, this.f36291q);
            i6.b bVar = this.f36286k;
            if (bVar != null) {
                double[] dArr = this.f36290p;
                f12 = 0.0f;
                if (dArr.length > 0) {
                    bVar.v(d11, dArr);
                    this.f36286k.x(d11, this.f36291q);
                }
            } else {
                f12 = 0.0f;
            }
            if (this.H) {
                oVar = oVar2;
                f13 = 1.0f;
                z12 = zD;
                d3 = d11;
                f14 = 2.0f;
            } else {
                int[] iArr = this.f36289o;
                double[] dArr2 = this.f36290p;
                f14 = 2.0f;
                double[] dArr3 = this.f36291q;
                f13 = 1.0f;
                boolean z13 = this.f36279d;
                float f20 = a0Var.f36066e;
                float fCos = a0Var.f36067f;
                float f21 = a0Var.f36068g;
                int i12 = 1;
                float f22 = a0Var.f36069h;
                oVar = oVar2;
                if (iArr.length != 0) {
                    f15 = f21;
                    if (a0Var.f36076p.length <= iArr[iArr.length - 1]) {
                        int i13 = iArr[iArr.length - 1] + 1;
                        a0Var.f36076p = new double[i13];
                        a0Var.f36077q = new double[i13];
                    }
                } else {
                    f15 = f21;
                }
                Arrays.fill(a0Var.f36076p, Double.NaN);
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    double[] dArr4 = a0Var.f36076p;
                    int i15 = iArr[i14];
                    dArr4[i15] = dArr2[i14];
                    a0Var.f36077q[i15] = dArr3[i14];
                }
                float f23 = Float.NaN;
                float f24 = f12;
                float f25 = f24;
                float f26 = f25;
                float f27 = f26;
                int i16 = 0;
                while (true) {
                    double[] dArr5 = a0Var.f36076p;
                    f16 = f22;
                    if (i16 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i16])) {
                        f17 = f20;
                    } else {
                        f17 = f20;
                        float f28 = (float) (Double.isNaN(a0Var.f36076p[i16]) ? 0.0d : a0Var.f36076p[i16] + 0.0d);
                        float f29 = (float) a0Var.f36077q[i16];
                        if (i16 == i12) {
                            f25 = f29;
                            f22 = f16;
                            f20 = f28;
                        } else if (i16 == 2) {
                            f24 = f29;
                            f20 = f17;
                            f22 = f16;
                            fCos = f28;
                        } else if (i16 == 3) {
                            f26 = f29;
                            f20 = f17;
                            f22 = f16;
                            f15 = f28;
                        } else if (i16 == 4) {
                            f27 = f29;
                            f20 = f17;
                            f22 = f28;
                        } else if (i16 == 5) {
                            f20 = f17;
                            f22 = f16;
                            f23 = f28;
                        }
                        i16++;
                        i12 = 1;
                    }
                    f20 = f17;
                    f22 = f16;
                    i16++;
                    i12 = 1;
                }
                float f31 = f20;
                p pVar = a0Var.f36073m;
                if (pVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    pVar.b(d11, fArr, fArr2);
                    float f32 = fArr[0];
                    float f33 = fArr[1];
                    float f34 = fArr2[0];
                    float f35 = fArr2[1];
                    z12 = zD;
                    d3 = d11;
                    double d12 = f31;
                    double d13 = fCos;
                    fSin = (float) (((Math.sin(d13) * d12) + ((double) f32)) - ((double) (f15 / 2.0f)));
                    fCos = (float) ((((double) f33) - (Math.cos(d13) * d12)) - ((double) (f16 / 2.0f)));
                    double d14 = f25;
                    double d15 = f24;
                    float fCos2 = (float) ((Math.cos(d13) * d12 * d15) + (Math.sin(d13) * d14) + ((double) f34));
                    float fSin2 = (float) ((Math.sin(d13) * d12 * d15) + (((double) f35) - (Math.cos(d13) * d14)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f23)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f23)));
                    }
                } else {
                    fSin = f31;
                    z12 = zD;
                    d3 = d11;
                    if (!Float.isNaN(f23)) {
                        view.setRotation(f23 + ((float) Math.toDegrees(Math.atan2((f27 / 2.0f) + f24, (f26 / 2.0f) + f25))) + f12);
                    }
                }
                float f36 = fSin + 0.5f;
                int i17 = (int) f36;
                float f37 = fCos + 0.5f;
                int i18 = (int) f37;
                int i19 = (int) (f36 + f15);
                int i21 = (int) (f37 + f16);
                int i22 = i19 - i17;
                int i23 = i21 - i18;
                if (i22 != view.getMeasuredWidth() || i23 != view.getMeasuredHeight() || z13) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i22, 1073741824), View.MeasureSpec.makeMeasureSpec(i23, 1073741824));
                }
                view.layout(i17, i18, i19, i21);
                this.f36279d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + r1.getTop()) / f14;
                    float right = (this.D.getRight() + this.D.getLeft()) / f14;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap map3 = this.f36299y;
            if (map3 != null) {
                for (p6.l lVar : map3.values()) {
                    if (lVar instanceof p6.j) {
                        double[] dArr6 = this.f36291q;
                        if (dArr6.length > 1) {
                            view.setRotation(((p6.j) lVar).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (oVar != null) {
                double[] dArr7 = this.f36291q;
                double d16 = dArr7[0];
                double d17 = dArr7[1];
                p6.o oVar4 = oVar;
                view.setRotation(oVar4.b(fA, j9, view, eVar) + ((float) Math.toDegrees(Math.atan2(d17, d16))));
                z11 = z12 | oVar4.f34531h;
            } else {
                z11 = z12;
            }
            int i24 = 1;
            while (true) {
                xz.b[] bVarArr2 = this.f36285j;
                if (i24 >= bVarArr2.length) {
                    break;
                }
                xz.b bVar2 = bVarArr2[i24];
                float[] fArr3 = this.f36294t;
                bVar2.w(d3, fArr3);
                lx.u.O((androidx.constraintlayout.widget.b) a0Var.f36074n.get(this.f36292r[i24 - 1]), view, fArr3);
                i24++;
            }
            n nVar = this.f36283h;
            if (nVar.f36259b == 0) {
                if (fA <= f12) {
                    view.setVisibility(nVar.f36260c);
                } else {
                    n nVar2 = this.f36284i;
                    if (fA >= f13) {
                        view.setVisibility(nVar2.f36260c);
                    } else if (nVar2.f36260c != nVar.f36260c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i25 = 0;
                while (true) {
                    m[] mVarArr = this.A;
                    if (i25 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i25].g(view, fA);
                    i25++;
                }
            }
        } else {
            boolean z14 = zD;
            float f38 = a0Var.f36066e;
            a0 a0Var2 = this.f36282g;
            float fA2 = j4.s.a(a0Var2.f36066e, f38, fA, f38);
            float f39 = a0Var.f36067f;
            float fA3 = j4.s.a(a0Var2.f36067f, f39, fA, f39);
            float f40 = a0Var.f36068g;
            float f41 = a0Var2.f36068g;
            float fA4 = j4.s.a(f41, f40, fA, f40);
            float f42 = a0Var.f36069h;
            float f43 = a0Var2.f36069h;
            float f44 = fA2 + 0.5f;
            int i26 = (int) f44;
            float f45 = fA3 + 0.5f;
            int i27 = (int) f45;
            int i28 = (int) (f44 + fA4);
            int iA = (int) (f45 + j4.s.a(f43, f42, fA, f42));
            int i29 = i28 - i26;
            int i31 = iA - i27;
            if (f41 != f40 || f43 != f42 || this.f36279d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), View.MeasureSpec.makeMeasureSpec(i31, 1073741824));
                this.f36279d = false;
            }
            view.layout(i26, i27, i28, iA);
            z11 = z14;
        }
        HashMap map4 = this.f36300z;
        if (map4 != null) {
            for (p6.g gVar : map4.values()) {
                if (gVar instanceof p6.e) {
                    double[] dArr8 = this.f36291q;
                    view.setRotation(((p6.e) gVar).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    gVar.d(view, fA);
                }
            }
        }
        return z11;
    }

    public final void e(a0 a0Var) {
        a0Var.e((int) this.f36277b.getX(), (int) this.f36277b.getY(), this.f36277b.getWidth(), this.f36277b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:441:0x0caa. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0639 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r50, int r51, long r52) {
        /*
            Method dump skipped, instruction units count: 4558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.p.g(int, int, long):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        a0 a0Var = this.f36281f;
        sb2.append(a0Var.f36066e);
        sb2.append(" y: ");
        sb2.append(a0Var.f36067f);
        sb2.append(" end: x: ");
        a0 a0Var2 = this.f36282g;
        sb2.append(a0Var2.f36066e);
        sb2.append(" y: ");
        sb2.append(a0Var2.f36067f);
        return sb2.toString();
    }
}
