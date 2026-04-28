package a2;

import a3.u1;
import i2.e0;
import i2.v;
import i2.y;
import java.util.List;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f198b;

    public d(e0 e0Var, u1 u1Var, y yVar) {
        this.f197a = e0Var;
        this.f198b = u1Var;
    }

    @Override // a2.o
    public final float a(float f11, float f12) {
        e0 e0Var = this.f197a;
        int iP = e0Var.p();
        k1 k1Var = e0Var.f22833p;
        int i11 = ((v) k1Var.getValue()).f22908c + iP;
        if (i11 == 0) {
            return 0.0f;
        }
        int i12 = e0Var.f22823e;
        if (f11 < 0.0f) {
            i12++;
        }
        int iC = n80.p.c(((int) (f12 / i11)) + i12, 0, e0Var.o());
        e0Var.p();
        int i13 = ((v) k1Var.getValue()).f22908c;
        long j9 = i12;
        long j11 = 1;
        long j12 = j9 - j11;
        if (j12 < 0) {
            j12 = 0;
        }
        int i14 = (int) j12;
        long j13 = j9 + j11;
        if (j13 > 2147483647L) {
            j13 = 2147483647L;
        }
        int iAbs = Math.abs((n80.p.c(n80.p.c(iC, i14, (int) j13), 0, e0Var.o()) - i12) * i11) - i11;
        int i15 = iAbs >= 0 ? iAbs : 0;
        if (i15 == 0) {
            return i15;
        }
        return Math.signum(f11) * i15;
    }

    @Override // a2.o
    public final float b(float f11) {
        e0 e0Var = this.f197a;
        p pVar = e0Var.n().f22918n;
        List list = e0Var.n().f22906a;
        int size = list.size();
        float f12 = Float.POSITIVE_INFINITY;
        float f13 = Float.NEGATIVE_INFINITY;
        for (int i11 = 0; i11 < size; i11++) {
            i2.h hVar = (i2.h) list.get(i11);
            int iL = w.b.L(e0Var.n());
            int i12 = -e0Var.n().f22911f;
            int i13 = e0Var.n().f22909d;
            int i14 = e0Var.n().f22907b;
            int i15 = ((i2.g) hVar).f22855j;
            e0Var.o();
            float fA = i15 - pVar.a(iL, i14, i12, i13);
            if (fA <= 0.0f && fA > f13) {
                f13 = fA;
            }
            if (fA >= 0.0f && fA < f12) {
                f12 = fA;
            }
        }
        if (f13 == Float.NEGATIVE_INFINITY) {
            f13 = f12;
        }
        if (f12 == Float.POSITIVE_INFINITY) {
            f12 = f13;
        }
        if (!e0Var.d()) {
            if (ba0.g.A(e0Var, f11)) {
                f13 = 0.0f;
                f12 = 0.0f;
            } else {
                f12 = 0.0f;
            }
        }
        if (!e0Var.c()) {
            f13 = 0.0f;
            if (!ba0.g.A(e0Var, f11)) {
                f12 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f13);
        Float fValueOf2 = Float.valueOf(f12);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) this.f198b.invoke(Float.valueOf(f11), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            c2.a.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }
}
