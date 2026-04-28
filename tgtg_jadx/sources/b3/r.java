package b3;

import java.util.ArrayList;
import java.util.List;
import z4.m1;
import z4.t0;
import z4.u0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f5631a = new r();

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z11 = false;
        int iB0 = Integer.MIN_VALUE;
        int iB02 = Integer.MIN_VALUE;
        int iMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            m1 m1VarD = ((t0) list.get(i11)).D(j9);
            arrayList.add(m1VarD);
            z4.o oVar = z4.d.f47100a;
            if (m1VarD.b0(oVar) != Integer.MIN_VALUE && (iB0 == Integer.MIN_VALUE || m1VarD.b0(oVar) < iB0)) {
                iB0 = m1VarD.b0(oVar);
            }
            z4.o oVar2 = z4.d.f47101b;
            if (m1VarD.b0(oVar2) != Integer.MIN_VALUE && (iB02 == Integer.MIN_VALUE || m1VarD.b0(oVar2) > iB02)) {
                iB02 = m1VarD.b0(oVar2);
            }
            iMax = Math.max(iMax, m1VarD.f47184b);
        }
        if (iB0 != Integer.MIN_VALUE && iB02 != Integer.MIN_VALUE) {
            z11 = true;
        }
        int iMax2 = Math.max(w0Var.q0((iB0 == iB02 || !z11) ? s.f5637f : s.f5638g), iMax);
        return w0.f(w0Var, z5.a.i(j9), iMax2, new q(arrayList, iMax2, 0));
    }
}
