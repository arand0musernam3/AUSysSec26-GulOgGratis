package s1;

import java.util.ArrayList;
import java.util.List;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f38679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38680b;

    public t(a0 a0Var) {
        this.f38679a = a0Var;
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iY = ((z4.t) list.get(0)).y(i11);
        int i12 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iY2 = ((z4.t) list.get(i12)).y(i11);
                if (iY2 > iY) {
                    iY = iY2;
                }
                if (i12 == size) {
                    break;
                }
                i12++;
            }
        }
        return iY;
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = ((z4.t) list.get(0)).w(i11);
        int i12 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iW2 = ((z4.t) list.get(i12)).w(i11);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i12 == size) {
                    break;
                }
                i12++;
            }
        }
        return iW;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            m1 m1VarD = ((z4.t0) list.get(i11)).D(j9);
            iMax = Math.max(iMax, m1VarD.f47183a);
            iMax2 = Math.max(iMax2, m1VarD.f47184b);
            arrayList.add(m1VarD);
        }
        boolean Z = w0Var.Z();
        a0 a0Var = this.f38679a;
        if (Z) {
            this.f38680b = true;
            a0Var.f38523a.setValue(new z5.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f38680b) {
            a0Var.f38523a.setValue(new z5.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return z4.w0.f(w0Var, iMax, iMax2, new d6.f(3, arrayList));
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((z4.t) list.get(0)).b(i11);
        int i12 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iB2 = ((z4.t) list.get(i12)).b(i11);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i12 == size) {
                    break;
                }
                i12++;
            }
        }
        return iB;
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iV = ((z4.t) list.get(0)).V(i11);
        int i12 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iV2 = ((z4.t) list.get(i12)).V(i11);
                if (iV2 > iV) {
                    iV = iV2;
                }
                if (i12 == size) {
                    break;
                }
                i12++;
            }
        }
        return iV;
    }
}
