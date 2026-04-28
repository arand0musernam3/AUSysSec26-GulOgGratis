package z4;

import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z5.m f47173a = z5.m.Rtl;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f47174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f47176d;

    public l0(q0 q0Var) {
        this.f47176d = q0Var;
    }

    @Override // z5.c
    public final float X() {
        return this.f47175c;
    }

    @Override // z4.u
    public final boolean Z() {
        b5.h0 h0Var = this.f47176d.f47200a.H.f5931d;
        return h0Var == b5.h0.LookaheadLayingOut || h0Var == b5.h0.LookaheadMeasuring;
    }

    @Override // z5.c
    public final float a() {
        return this.f47174b;
    }

    @Override // z4.u
    public final z5.m getLayoutDirection() {
        return this.f47173a;
    }

    @Override // z4.z1
    public final List i(Object obj, Function2 function2) {
        q0 q0Var = this.f47176d;
        q0Var.g();
        b5.m0 m0Var = q0Var.f47200a;
        b5.h0 h0Var = m0Var.H.f5931d;
        b5.h0 h0Var2 = b5.h0.Measuring;
        if (h0Var != h0Var2 && h0Var != b5.h0.LayingOut && h0Var != b5.h0.LookaheadMeasuring && h0Var != b5.h0.LookaheadLayingOut) {
            y4.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        q1.t0 t0Var = q0Var.f47206g;
        Object objD = t0Var.d(obj);
        if (objD == null) {
            objD = (b5.m0) q0Var.f47209j.k(obj);
            if (objD != null) {
                if (q0Var.f47213o <= 0) {
                    y4.a.b("Check failed.");
                }
                q0Var.f47213o--;
            } else {
                objD = q0Var.l(obj);
                if (objD == null) {
                    int i11 = q0Var.f47203d;
                    b5.m0 m0Var2 = new b5.m0(2);
                    m0Var.f5881r = true;
                    m0Var.C(i11, m0Var2);
                    m0Var.f5881r = false;
                    objD = m0Var2;
                }
            }
            t0Var.m(obj, objD);
        }
        b5.m0 m0Var3 = (b5.m0) objD;
        if (CollectionsKt.Q(q0Var.f47203d, m0Var.o()) != m0Var3) {
            int i12 = ((o3.e) ((o3.b) m0Var.o()).f31822b).i(m0Var3);
            if (i12 < q0Var.f47203d) {
                y4.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i13 = q0Var.f47203d;
            if (i13 != i12) {
                q0Var.i(i12, i13);
            }
        }
        q0Var.f47203d++;
        q0Var.k(m0Var3, obj, false, function2);
        return (h0Var == h0Var2 || h0Var == b5.h0.LayingOut) ? m0Var3.m() : m0Var3.l();
    }

    @Override // z4.w0
    public final v0 m0(int i11, int i12, Map map, Function1 function1, Function1 function12) {
        if ((i11 & RoundCornerImageView.DEFAULT_STROKE_COLOR) != 0 || ((-16777216) & i12) != 0) {
            y4.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new k0(i11, i12, map, function1, this, this.f47176d, function12);
    }
}
