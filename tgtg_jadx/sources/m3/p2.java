package m3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p2 {
    public static List a(q2 q2Var, int i11, q2 q2Var2, boolean z11, boolean z12, boolean z13) {
        List list;
        boolean z14;
        int i12;
        int i13;
        int iU = q2Var.u(i11);
        int i14 = i11 + iU;
        int iF = q2Var.f(i11);
        int iF2 = q2Var.f(i14);
        int i15 = iF2 - iF;
        boolean z15 = i11 >= 0 && (q2Var.f29383b[(q2Var.r(i11) * 5) + 1] & 201326592) != 0;
        q2Var2.w(iU);
        q2Var2.x(i15, q2Var2.f29400t);
        if (q2Var.f29388g < i14) {
            q2Var.B(i14);
        }
        if (q2Var.f29392k < iF2) {
            q2Var.C(iF2, i14);
        }
        int[] iArr = q2Var2.f29383b;
        int i16 = q2Var2.f29400t;
        int i17 = i16 * 5;
        kotlin.collections.x.f(i17, q2Var.f29383b, i11 * 5, i14 * 5, iArr);
        Object[] objArr = q2Var2.f29384c;
        int i18 = q2Var2.f29390i;
        System.arraycopy(q2Var.f29384c, iF, objArr, i18, i15);
        int i19 = q2Var2.f29402v;
        iArr[i17 + 2] = i19;
        int i21 = i16 - i11;
        int i22 = i16 + iU;
        int iG = i18 - q2Var2.g(i16, iArr);
        int i23 = q2Var2.f29393m;
        int i24 = q2Var2.l;
        int length = objArr.length;
        boolean z16 = z15;
        int i25 = i23;
        int i26 = i16;
        while (i26 < i22) {
            if (i26 != i16) {
                int i27 = (i26 * 5) + 2;
                iArr[i27] = iArr[i27] + i21;
            }
            int[] iArr2 = iArr;
            int iG2 = q2Var2.g(i26, iArr) + iG;
            if (i25 < i26) {
                i12 = i16;
                i13 = 0;
            } else {
                i12 = i16;
                i13 = q2Var2.f29392k;
            }
            iArr2[(i26 * 5) + 4] = q2.i(iG2, i13, i24, length);
            if (i26 == i25) {
                i25++;
            }
            i26++;
            i16 = i12;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        q2Var2.f29393m = i25;
        int iA = o2.a(q2Var.f29385d, i11, q2Var.p());
        int iA2 = o2.a(q2Var.f29385d, i14, q2Var.p());
        if (iA < iA2) {
            ArrayList arrayList = q2Var.f29385d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i28 = iA; i28 < iA2; i28++) {
                a aVar = (a) arrayList.get(i28);
                aVar.f29174a += i21;
                arrayList2.add(aVar);
            }
            q2Var2.f29385d.addAll(o2.a(q2Var2.f29385d, q2Var2.f29400t, q2Var2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = kotlin.collections.n0.f26529a;
        }
        if (!list.isEmpty()) {
            HashMap map = q2Var.f29386e;
            HashMap map2 = q2Var2.f29386e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i29 = 0; i29 < size; i29++) {
                }
            }
        }
        int i31 = q2Var2.f29402v;
        q2Var2.Q(i19);
        int iG3 = q2Var.G(i11, q2Var.f29383b);
        if (!z13) {
            z14 = false;
        } else if (z11) {
            boolean z17 = iG3 >= 0;
            if (z17) {
                q2Var.R();
                q2Var.a(iG3 - q2Var.f29400t);
                q2Var.R();
            }
            q2Var.a(i11 - q2Var.f29400t);
            boolean zJ = q2Var.J();
            if (z17) {
                q2Var.O();
                q2Var.j();
                q2Var.O();
                q2Var.j();
            }
            z14 = zJ;
        } else {
            boolean zK = q2Var.K(i11, iU);
            q2Var.L(iF, i15, i11 - 1);
            z14 = zK;
        }
        if (z14) {
            v.a("Unexpectedly removed anchors");
        }
        int i32 = q2Var2.f29395o;
        int i33 = iArr3[i17 + 1];
        q2Var2.f29395o = i32 + ((1073741824 & i33) != 0 ? 1 : i33 & 67108863);
        if (z12) {
            q2Var2.f29400t = i22;
            q2Var2.f29390i = i18 + i15;
        }
        if (z16) {
            q2Var2.W(i19);
        }
        return list;
    }
}
