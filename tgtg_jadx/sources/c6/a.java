package c6;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat;
import h7.f1;
import h7.o1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends WindowInsetsAnimationCompat$Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i11) {
        super(1);
        this.f7669c = i11;
        this.f7670d = viewGroup;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List list) {
        switch (this.f7669c) {
            case 0:
                return ((d0) this.f7670d).l(windowInsetsCompat);
            default:
                d6.z zVar = (d6.z) this.f7670d;
                if (zVar.l) {
                    return windowInsetsCompat;
                }
                View childAt = zVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, zVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, zVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? windowInsetsCompat : windowInsetsCompat.o(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final f1 e(o1 o1Var, f1 f1Var) {
        switch (this.f7669c) {
            case 0:
                b5.x xVar = ((d0) this.f7670d).f7723z.G.f5857c;
                if (!xVar.n()) {
                    return f1Var;
                }
                long J = a.a.J(xVar.S(0L));
                int i11 = (int) (J >> 32);
                if (i11 < 0) {
                    i11 = 0;
                }
                int i12 = (int) (J & 4294967295L);
                if (i12 < 0) {
                    i12 = 0;
                }
                long jU = z4.c0.i(xVar).u();
                int i13 = (int) (jU >> 32);
                int i14 = (int) (jU & 4294967295L);
                long j9 = xVar.f47185c;
                long J2 = a.a.J(xVar.S((((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L)));
                int i15 = i13 - ((int) (J2 >> 32));
                if (i15 < 0) {
                    i15 = 0;
                }
                int i16 = i14 - ((int) (4294967295L & J2));
                int i17 = i16 >= 0 ? i16 : 0;
                return (i11 == 0 && i12 == 0 && i15 == 0 && i17 == 0) ? f1Var : new f1(j.k(f1Var.f21536a, i11, i12, i15, i17), j.k(f1Var.f21537b, i11, i12, i15, i17));
            default:
                d6.z zVar = (d6.z) this.f7670d;
                if (zVar.l) {
                    return f1Var;
                }
                View childAt = zVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, zVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, zVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return f1Var;
                }
                x6.d dVarB = x6.d.b(iMax, iMax2, iMax3, iMax4);
                return new f1(WindowInsetsCompat.p(f1Var.f21536a, dVarB.f43873a, dVarB.f43874b, dVarB.f43875c, dVarB.f43876d), WindowInsetsCompat.p(f1Var.f21537b, dVarB.f43873a, dVarB.f43874b, dVarB.f43875c, dVarB.f43876d));
        }
    }
}
