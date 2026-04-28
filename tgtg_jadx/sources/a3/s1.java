package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    public static final x2 a(m5.q0 q0Var, int i11, int i12, int i13, long j9, boolean z11, boolean z12) {
        i0 i0Var;
        if (z11) {
            i0Var = null;
        } else {
            int i14 = m5.t0.f29649c;
            int i15 = (int) (j9 >> 32);
            int i16 = (int) (4294967295L & j9);
            i0Var = new i0(new h0(jb.u.F(q0Var, i15), i15, 1L), new h0(jb.u.F(q0Var, i16), i16, 1L), m5.t0.h(j9));
        }
        return new x2(z12, 1, 1, i0Var, new f0(1L, 1, i11, i12, i13, q0Var));
    }

    public static final l b(l lVar, l lVar2) {
        int[] iArr = r1.$EnumSwitchMapping$0;
        int i11 = iArr[lVar2.ordinal()];
        if (i11 == 1) {
            return l.BEFORE;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return l.AFTER;
            }
            e40.a.f();
            return null;
        }
        int i12 = iArr[lVar.ordinal()];
        if (i12 == 1) {
            return l.BEFORE;
        }
        if (i12 == 2) {
            return l.ON;
        }
        if (i12 == 3) {
            return l.AFTER;
        }
        e40.a.f();
        return null;
    }
}
