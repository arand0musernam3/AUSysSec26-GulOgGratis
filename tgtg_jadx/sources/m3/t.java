package m3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a40.i f29443a = new a40.i(9);

    public static final void a(List list, int i11, int i12) {
        int iC = c(i11, list);
        if (iC < 0) {
            iC = -(iC + 1);
        }
        while (iC < list.size() && ((r0) list.get(iC)).f29408b < i12) {
        }
    }

    public static final void b(l2 l2Var, ArrayList arrayList, int i11) {
        boolean zL = l2Var.l(i11);
        int[] iArr = l2Var.f29320b;
        if (zL) {
            arrayList.add(l2Var.n(i11));
            return;
        }
        int i12 = iArr[(i11 * 5) + 3] + i11;
        for (int i13 = i11 + 1; i13 < i12; i13 += iArr[(i13 * 5) + 3]) {
            b(l2Var, arrayList, i13);
        }
    }

    public static final int c(int i11, List list) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int iCompare = Intrinsics.compare(((r0) list.get(i13)).f29408b, i11);
            if (iCompare < 0) {
                i12 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final void d(q2 q2Var, int i11, Object obj) {
        int iH = q2Var.h(i11);
        Object[] objArr = q2Var.f29384c;
        Object obj2 = objArr[iH];
        objArr[iH] = m.f29332a;
        if (obj == obj2) {
            return;
        }
        v.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
