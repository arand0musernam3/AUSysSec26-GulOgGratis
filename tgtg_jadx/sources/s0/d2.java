package s0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38314a = new ArrayList();

    public static void b(ArrayList arrayList, int i11, int[] iArr, int i12) {
        if (i12 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    iArr[i12] = i13;
                    b(arrayList, i11, iArr, i12 + 1);
                    break;
                } else if (i13 == iArr[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
        }
    }

    public final void a(i2 i2Var) {
        this.f38314a.add(i2Var);
    }

    public final List c(ArrayList arrayList) {
        c2 c2Var;
        c2 c2Var2;
        c2 c2Var3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.f38314a;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        boolean z11 = false;
        b(arrayList3, size2, new int[size2], 0);
        i2[] i2VarArr = new i2[arrayList.size()];
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z12 = true;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (iArr[i11] < arrayList.size()) {
                    i2 i2Var = (i2) arrayList2.get(i11);
                    i2 i2Var2 = (i2) arrayList.get(iArr[i11]);
                    i2Var.getClass();
                    i2Var2.getClass();
                    z12 &= i2Var2.f38349b.a() <= i2Var.f38349b.a() && i2Var2.f38348a == i2Var.f38348a && ((c2Var = i2Var.f38350c) == (c2Var2 = c2.DEFAULT) || (c2Var3 = i2Var2.f38350c) == c2Var2 || c2Var3 == c2Var);
                    if (!z12) {
                        break;
                    }
                    i2VarArr[iArr[i11]] = (i2) arrayList2.get(i11);
                }
            }
            if (z12) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            return Arrays.asList(i2VarArr);
        }
        return null;
    }
}
