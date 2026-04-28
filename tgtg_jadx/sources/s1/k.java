package s1;

import java.util.List;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f38636a;

    public k(s sVar) {
        this.f38636a = sVar;
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((z4.t) list.get(0)).y(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).y(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((z4.t) list.get(0)).w(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).w(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        m1 m1Var;
        int i11;
        m1 m1Var2;
        int i12;
        int i13;
        int size = list.size();
        m1[] m1VarArr = new m1[size];
        int size2 = list.size();
        long j11 = 0;
        int i14 = 0;
        while (true) {
            m1Var = null;
            i11 = 1;
            if (i14 >= size2) {
                break;
            }
            z4.t0 t0Var = (z4.t0) list.get(i14);
            Object objG = t0Var.G();
            m mVar = objG instanceof m ? (m) objG : null;
            if (mVar != null && ((Boolean) mVar.f38647a.getValue()).booleanValue()) {
                m1 m1VarD = t0Var.D(j9);
                long j12 = (((long) m1VarD.f47184b) & 4294967295L) | (((long) m1VarD.f47183a) << 32);
                m1VarArr[i14] = m1VarD;
                j11 = j12;
            }
            i14++;
        }
        int size3 = list.size();
        for (int i15 = 0; i15 < size3; i15++) {
            z4.t0 t0Var2 = (z4.t0) list.get(i15);
            if (m1VarArr[i15] == null) {
                m1VarArr[i15] = t0Var2.D(j9);
            }
        }
        if (w0Var.Z()) {
            i12 = (int) (j11 >> 32);
        } else {
            if (size == 0) {
                m1Var2 = null;
            } else {
                m1Var2 = m1VarArr[0];
                int i16 = size - 1;
                if (i16 != 0) {
                    int i17 = m1Var2 != null ? m1Var2.f47183a : 0;
                    if (1 <= i16) {
                        int i18 = 1;
                        while (true) {
                            m1 m1Var3 = m1VarArr[i18];
                            int i19 = m1Var3 != null ? m1Var3.f47183a : 0;
                            if (i17 < i19) {
                                m1Var2 = m1Var3;
                                i17 = i19;
                            }
                            if (i18 == i16) {
                                break;
                            }
                            i18++;
                        }
                    }
                }
            }
            i12 = m1Var2 != null ? m1Var2.f47183a : 0;
        }
        if (w0Var.Z()) {
            i13 = (int) (j11 & 4294967295L);
        } else {
            if (size != 0) {
                m1Var = m1VarArr[0];
                int i21 = size - 1;
                if (i21 != 0) {
                    int i22 = m1Var != null ? m1Var.f47184b : 0;
                    if (1 <= i21) {
                        while (true) {
                            m1 m1Var4 = m1VarArr[i11];
                            int i23 = m1Var4 != null ? m1Var4.f47184b : 0;
                            if (i22 < i23) {
                                m1Var = m1Var4;
                                i22 = i23;
                            }
                            if (i11 == i21) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            i13 = m1Var != null ? m1Var.f47184b : 0;
        }
        if (!w0Var.Z()) {
            this.f38636a.f38676d.setValue(new z5.l((((long) i12) << 32) | (((long) i13) & 4294967295L)));
        }
        return z4.w0.f(w0Var, i12, i13, new j(m1VarArr, this, i12, i13));
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((z4.t) list.get(0)).b(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).b(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((z4.t) list.get(0)).V(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).V(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
