package r5;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.measurement.cg;
import h7.i0;
import i4.l0;
import kotlin.jvm.functions.Function1;
import m5.k0;
import m5.q0;
import m5.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5.y f37635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.g f37636b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f37644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q0 f37645k;
    public s l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h4.c f37647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h4.c f37648o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f37637c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f37646m = b.f37629c;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f37649p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f37650q = l0.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f37651r = new Matrix();

    public c(c5.y yVar, j30.g gVar) {
        this.f37635a = yVar;
        this.f37636b = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, u70.j] */
    public final void a() {
        boolean z11;
        j30.g gVar = this.f37636b;
        ?? r22 = gVar.f24503c;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view = (View) gVar.f24502b;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.f37646m;
            float[] fArr = this.f37650q;
            function1.invoke(new l0(fArr));
            this.f37635a.s(fArr);
            Matrix matrix = this.f37651r;
            i4.g0.v(matrix, fArr);
            y yVar = this.f37644j;
            yVar.getClass();
            long j9 = yVar.f37715b;
            s sVar = this.l;
            sVar.getClass();
            q0 q0Var = this.f37645k;
            q0Var.getClass();
            h4.c cVar = this.f37647n;
            cVar.getClass();
            h4.c cVar2 = this.f37648o;
            cVar2.getClass();
            boolean z12 = this.f37640f;
            boolean z13 = this.f37641g;
            boolean z14 = this.f37642h;
            boolean z15 = this.f37643i;
            CursorAnchorInfo.Builder builder = this.f37649p;
            builder.reset();
            builder.setMatrix(matrix);
            t0 t0Var = yVar.f37716c;
            int iG = t0.g(j9);
            builder.setSelectionRange(iG, t0.f(j9));
            if (!z12 || iG < 0) {
                z11 = z13;
            } else {
                int iR = sVar.r(iG);
                h4.c cVarC = q0Var.c(iR);
                z11 = z13;
                float fB = n80.p.b(cVarC.f21380a, 0.0f, (int) (q0Var.f29619c >> 32));
                boolean zM = cg.m(cVar, fB, cVarC.f21381b);
                boolean zM2 = cg.m(cVar, fB, cVarC.f21383d);
                boolean z16 = q0Var.a(iR) == x5.j.Rtl;
                int i11 = (zM || zM2) ? 1 : 0;
                if (!zM || !zM2) {
                    i11 |= 2;
                }
                if (z16) {
                    i11 |= 4;
                }
                int i12 = i11;
                float f11 = cVarC.f21381b;
                float f12 = cVarC.f21383d;
                builder.setInsertionMarkerLocation(fB, f11, f12, f12, i12);
            }
            if (z11) {
                int iG2 = t0Var != null ? t0.g(t0Var.f29650a) : -1;
                int iF = t0Var != null ? t0.f(t0Var.f29650a) : -1;
                if (iG2 >= 0 && iG2 < iF) {
                    builder.setComposingText(iG2, yVar.f37714a.f29538b.subSequence(iG2, iF));
                    int iR2 = sVar.r(iG2);
                    int iR3 = sVar.r(iF);
                    float[] fArr2 = new float[(iR3 - iR2) * 4];
                    q0Var.f29618b.a(k0.b(iR2, iR3), fArr2);
                    int i13 = iG2;
                    while (i13 < iF) {
                        int iR4 = sVar.r(i13);
                        int i14 = (iR4 - iR2) * 4;
                        float f13 = fArr2[i14];
                        int i15 = iF;
                        float f14 = fArr2[i14 + 1];
                        int i16 = iR2;
                        float f15 = fArr2[i14 + 2];
                        float f16 = fArr2[i14 + 3];
                        int i17 = i13;
                        int i18 = (cVar.f21380a < f15 ? 1 : 0) & (f13 < cVar.f21382c ? 1 : 0) & (cVar.f21381b < f16 ? 1 : 0) & (f14 < cVar.f21383d ? 1 : 0);
                        if (!cg.m(cVar, f13, f14) || !cg.m(cVar, f15, f16)) {
                            i18 |= 2;
                        }
                        if (q0Var.a(iR4) == x5.j.Rtl) {
                            i18 |= 4;
                        }
                        builder.addCharacterBounds(i17, f13, f14, f15, f16, i18);
                        i13 = i17 + 1;
                        iF = i15;
                        iR2 = i16;
                    }
                }
            }
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 33 && z14) {
                a70.a.r(builder, cVar2);
            }
            if (i19 >= 34 && z15) {
                i0.a(builder, q0Var, cVar);
            }
            ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f37639e = false;
        }
    }
}
