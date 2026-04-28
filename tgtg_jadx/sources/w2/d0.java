package w2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f42849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f42850b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r5.y f42858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m5.q0 f42859k;
    public r5.s l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h4.c f42860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h4.c f42861n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42851c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f42862o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f42863p = i4.l0.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f42864q = new Matrix();

    public d0(a aVar, z zVar) {
        this.f42849a = aVar;
        this.f42850b = zVar;
    }

    public final void a() {
        boolean z11;
        z zVar = this.f42850b;
        InputMethodManager inputMethodManagerQ = zVar.q();
        View view = (View) zVar.f43083b;
        if (!inputMethodManagerQ.isActive(view) || this.f42858j == null || this.l == null || this.f42859k == null || this.f42860m == null || this.f42861n == null) {
            return;
        }
        float[] fArr = this.f42863p;
        i4.l0.d(fArr);
        z4.z zVar2 = (z4.z) this.f42849a.f42828a.f42842r.getValue();
        if (zVar2 != null) {
            if (!zVar2.n()) {
                zVar2 = null;
            }
            if (zVar2 != null) {
                zVar2.o(fArr);
            }
        }
        h4.c cVar = this.f42861n;
        cVar.getClass();
        float f11 = -cVar.f21380a;
        h4.c cVar2 = this.f42861n;
        cVar2.getClass();
        i4.l0.h(fArr, f11, -cVar2.f21381b);
        Matrix matrix = this.f42864q;
        i4.g0.v(matrix, fArr);
        r5.y yVar = this.f42858j;
        yVar.getClass();
        long j9 = yVar.f37715b;
        r5.s sVar = this.l;
        sVar.getClass();
        m5.q0 q0Var = this.f42859k;
        q0Var.getClass();
        h4.c cVar3 = this.f42860m;
        cVar3.getClass();
        h4.c cVar4 = this.f42861n;
        cVar4.getClass();
        boolean z12 = this.f42854f;
        boolean z13 = this.f42855g;
        boolean z14 = this.f42856h;
        boolean z15 = this.f42857i;
        CursorAnchorInfo.Builder builder = this.f42862o;
        builder.reset();
        builder.setMatrix(matrix);
        m5.t0 t0Var = yVar.f37716c;
        int iG = m5.t0.g(j9);
        builder.setSelectionRange(iG, m5.t0.f(j9));
        if (!z12 || iG < 0) {
            z11 = z13;
        } else {
            int iR = sVar.r(iG);
            h4.c cVarC = q0Var.c(iR);
            z11 = z13;
            float fB = n80.p.b(cVarC.f21380a, 0.0f, (int) (q0Var.f29619c >> 32));
            boolean zJ = c0.j(cVar3, fB, cVarC.f21381b);
            boolean zJ2 = c0.j(cVar3, fB, cVarC.f21383d);
            boolean z16 = q0Var.a(iR) == x5.j.Rtl;
            int i11 = (zJ || zJ2) ? 1 : 0;
            if (!zJ || !zJ2) {
                i11 |= 2;
            }
            if (z16) {
                i11 |= 4;
            }
            int i12 = i11;
            float f12 = cVarC.f21381b;
            float f13 = cVarC.f21383d;
            builder.setInsertionMarkerLocation(fB, f12, f13, f13, i12);
        }
        if (z11) {
            int iG2 = t0Var != null ? m5.t0.g(t0Var.f29650a) : -1;
            int iF = t0Var != null ? m5.t0.f(t0Var.f29650a) : -1;
            if (iG2 >= 0 && iG2 < iF) {
                builder.setComposingText(iG2, yVar.f37714a.f29538b.subSequence(iG2, iF));
                int iR2 = sVar.r(iG2);
                int iR3 = sVar.r(iF);
                float[] fArr2 = new float[(iR3 - iR2) * 4];
                q0Var.f29618b.a(m5.k0.b(iR2, iR3), fArr2);
                int i13 = iG2;
                while (i13 < iF) {
                    int iR4 = sVar.r(i13);
                    int i14 = (iR4 - iR2) * 4;
                    float f14 = fArr2[i14];
                    int i15 = iF;
                    float f15 = fArr2[i14 + 1];
                    int i16 = iR2;
                    float f16 = fArr2[i14 + 2];
                    float f17 = fArr2[i14 + 3];
                    int i17 = i13;
                    int i18 = (cVar3.f21380a < f16 ? 1 : 0) & (f14 < cVar3.f21382c ? 1 : 0) & (cVar3.f21381b < f17 ? 1 : 0) & (f15 < cVar3.f21383d ? 1 : 0);
                    if (!c0.j(cVar3, f14, f15) || !c0.j(cVar3, f16, f17)) {
                        i18 |= 2;
                    }
                    if (q0Var.a(iR4) == x5.j.Rtl) {
                        i18 |= 4;
                    }
                    builder.addCharacterBounds(i17, f14, f15, f16, f17, i18);
                    i13 = i17 + 1;
                    iF = i15;
                    iR2 = i16;
                }
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 33 && z14) {
            i.a(builder, cVar4);
        }
        if (i19 >= 34 && z15) {
            p.a(builder, q0Var, cVar3);
        }
        zVar.q().updateCursorAnchorInfo(view, builder.build());
        this.f42853e = false;
    }
}
