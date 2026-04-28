package g3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 implements z4.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80.b0 f18368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.b1 f18369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1.b f18370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f18371d;

    public b6(v80.b0 b0Var, t1.b1 b1Var) {
        this.f18368a = b0Var;
        this.f18369b = b1Var;
    }

    @Override // z4.a1
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        Object obj;
        Object obj2;
        Object obj3;
        b6 b6Var;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i11 = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add(((z4.t0) list2.get(i12)).D(j9));
        }
        x70.c cVar = null;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i13 = ((z4.m1) obj).f47183a;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i14 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i14);
                    int i15 = ((z4.m1) obj4).f47183a;
                    if (i13 < i15) {
                        obj = obj4;
                        i13 = i15;
                    }
                    if (i14 == size2) {
                        break;
                    }
                    i14++;
                }
            }
        }
        z4.m1 m1Var = (z4.m1) obj;
        int i16 = m1Var != null ? m1Var.f47183a : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            arrayList3.add(((z4.t0) list3.get(i17)).D(j9));
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int i18 = ((z4.m1) obj2).f47183a;
            int size4 = arrayList3.size() - 1;
            if (1 <= size4) {
                int i19 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i19);
                    int i21 = ((z4.m1) obj5).f47183a;
                    if (i18 < i21) {
                        obj2 = obj5;
                        i18 = i21;
                    }
                    if (i19 == size4) {
                        break;
                    }
                    i19++;
                }
            }
        }
        z4.m1 m1Var2 = (z4.m1) obj2;
        Integer numValueOf = m1Var2 != null ? Integer.valueOf(m1Var2.f47183a) : null;
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i22 = ((z4.m1) obj3).f47184b;
            int size5 = arrayList3.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList3.get(i11);
                    int i23 = ((z4.m1) obj6).f47184b;
                    if (i22 < i23) {
                        obj3 = obj6;
                        i22 = i23;
                    }
                    if (i11 == size5) {
                        break;
                    }
                    i11++;
                }
            }
        }
        z4.m1 m1Var3 = (z4.m1) obj3;
        int i24 = m1Var3 != null ? m1Var3.f47184b : 0;
        float f11 = c6.f18417b;
        int iMax = Math.max(w0Var.q0(f11), i16);
        float f12 = g6.f18680a;
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + w0Var.q0(f12) + iMax;
        int i25 = i16 == 0 ? (-(w0Var.q0(f12) + w0Var.q0(f11))) / 2 : 0;
        Integer num = this.f18371d;
        if (num != null) {
            t1.b bVar = this.f18370c;
            if (bVar == null) {
                IntCompanionObject intCompanionObject = IntCompanionObject.INSTANCE;
                bVar = new t1.b(num, t1.c.f39390k, null, 12);
                this.f18370c = bVar;
            }
            t1.b bVar2 = bVar;
            if (((Number) bVar2.f39361e.getValue()).intValue() != i25) {
                b0.i0 i0Var = new b0.i0(bVar2, i25, this, cVar, 3);
                b6Var = this;
                v80.f0.B(b6Var.f18368a, null, null, i0Var, 3);
            }
            int i26 = i24;
            return z4.w0.f(w0Var, iIntValue, i26, new d2.q(arrayList2, w0Var, b6Var, i25, arrayList3, i26));
        }
        this.f18371d = Integer.valueOf(i25);
        b6Var = this;
        int i262 = i24;
        return z4.w0.f(w0Var, iIntValue, i262, new d2.q(arrayList2, w0Var, b6Var, i25, arrayList3, i262));
    }
}
