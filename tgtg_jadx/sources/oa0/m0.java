package oa0;

import a3.l2;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import w2.o1;
import w2.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f32342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f32343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f32344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f32345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f32346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f32347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f32348k;
    public final Object l;

    public m0(l0 l0Var) {
        this.f32342e = l0Var.f32315b;
        this.f32343f = l0Var.f32316c;
        this.f32344g = l0Var.f32314a.f32358c;
        this.f32345h = l0Var.f32327o;
        this.f32346i = l0Var.f32331s;
        this.f32347j = l0Var.f32332t;
        this.f32348k = l0Var.f32333u;
        this.f32338a = l0Var.f32328p;
        this.f32339b = l0Var.f32329q;
        this.f32340c = l0Var.f32330r;
        this.l = l0Var.f32335w;
        this.f32341d = l0Var.f32336x;
    }

    public CursorAnchorInfo a() {
        z4.z zVar;
        z4.z zVarB;
        m5.q0 q0VarG;
        float f11;
        float f12;
        float f13;
        int i11;
        Matrix matrix = (Matrix) this.l;
        float[] fArr = (float[]) this.f32348k;
        o1 o1Var = (o1) this.f32343f;
        z4.z zVarD = o1Var.d();
        if (zVarD != null) {
            if (!zVarD.n()) {
                zVarD = null;
            }
            if (zVarD != null && (zVar = (z4.z) o1Var.f43010d.getValue()) != null) {
                if (!zVar.n()) {
                    zVar = null;
                }
                if (zVar != null && (zVarB = o1Var.b()) != null) {
                    if (!zVarB.n()) {
                        zVarB = null;
                    }
                    if (zVarB != null && (q0VarG = o1Var.f43008b.g()) != null) {
                        v2.b bVarD = ((s1) this.f32342e).d();
                        i4.l0.d(fArr);
                        zVarD.o(fArr);
                        i4.g0.v(matrix, fArr);
                        h4.c cVarK = l2.c(zVar).k(zVarD.g(zVar, 0L));
                        h4.c cVarK2 = l2.c(zVarB).k(zVarD.g(zVarB, 0L));
                        CursorAnchorInfo.Builder builder = (CursorAnchorInfo.Builder) this.f32347j;
                        long j9 = bVarD.f41929d;
                        m5.t0 t0Var = bVarD.f41930e;
                        boolean z11 = this.f32338a;
                        boolean z12 = this.f32339b;
                        boolean z13 = this.f32340c;
                        boolean z14 = this.f32341d;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iG = m5.t0.g(j9);
                        builder.setSelectionRange(iG, m5.t0.f(j9));
                        if (z11 && iG >= 0) {
                            h4.c cVarC = q0VarG.c(iG);
                            float fB = n80.p.b(cVarC.f21380a, 0.0f, (int) (q0VarG.f29619c >> 32));
                            boolean zJ = w2.c0.j(cVarK, fB, cVarC.f21381b);
                            boolean zJ2 = w2.c0.j(cVarK, fB, cVarC.f21383d);
                            boolean z15 = q0VarG.a(iG) == x5.j.Rtl;
                            int i12 = (zJ || zJ2) ? 1 : 0;
                            if (!zJ || !zJ2) {
                                i12 |= 2;
                            }
                            if (z15) {
                                i12 |= 4;
                            }
                            float f14 = cVarC.f21381b;
                            float f15 = cVarC.f21383d;
                            builder.setInsertionMarkerLocation(fB, f14, f15, f15, i12);
                        }
                        if (z12) {
                            int iG2 = t0Var != null ? m5.t0.g(t0Var.f29650a) : -1;
                            int iF = t0Var != null ? m5.t0.f(t0Var.f29650a) : -1;
                            if (iG2 >= 0 && iG2 < iF) {
                                builder.setComposingText(iG2, bVarD.f41928c.subSequence(iG2, iF));
                                float[] fArr2 = new float[(iF - iG2) * 4];
                                q0VarG.f29618b.a(m5.k0.b(iG2, iF), fArr2);
                                int i13 = iG2;
                                while (iG2 < iF) {
                                    int i14 = (iG2 - i13) * 4;
                                    float f16 = fArr2[i14];
                                    float f17 = fArr2[i14 + 1];
                                    float f18 = fArr2[i14 + 2];
                                    float f19 = fArr2[i14 + 3];
                                    int i15 = (f16 < cVarK.f21382c ? 1 : 0) & (cVarK.f21380a < f18 ? 1 : 0) & (cVarK.f21381b < f19 ? 1 : 0) & (f17 < cVarK.f21383d ? 1 : 0);
                                    if (!w2.c0.j(cVarK, f16, f17) || !w2.c0.j(cVarK, f18, f19)) {
                                        i15 |= 2;
                                    }
                                    int i16 = i15;
                                    if (q0VarG.a(iG2) == x5.j.Rtl) {
                                        f11 = f19;
                                        f12 = f17;
                                        f13 = f18;
                                        i11 = i16 | 4;
                                    } else {
                                        f11 = f19;
                                        f12 = f17;
                                        f13 = f18;
                                        i11 = i16;
                                    }
                                    builder.addCharacterBounds(iG2, f16, f12, f13, f11, i11);
                                    iG2++;
                                }
                            }
                        }
                        int i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 33 && z13) {
                            w2.i.a(builder, cVarK2);
                        }
                        if (i17 >= 34 && z14) {
                            w2.p.a(builder, q0VarG, cVarK);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }

    public m0(s1 s1Var, o1 o1Var, ub.a aVar, v80.b0 b0Var) {
        this.f32342e = s1Var;
        this.f32343f = o1Var;
        this.f32344g = aVar;
        this.f32345h = b0Var;
        this.f32347j = new CursorAnchorInfo.Builder();
        this.f32348k = i4.l0.a();
        this.l = new Matrix();
    }
}
