package g4;

import com.braze.h2;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f19952a = new k0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        g0 g0Var2 = (g0) obj2;
        int i11 = 0;
        if (d.h(g0Var) && d.h(g0Var2)) {
            b5.m0 m0VarG = b5.m.g(g0Var);
            b5.m0 m0VarG2 = b5.m.g(g0Var2);
            if (!Intrinsics.areEqual(m0VarG, m0VarG2)) {
                Object[] objArr = new b5.m0[16];
                int i12 = 0;
                while (m0VarG != null) {
                    int i13 = i12 + 1;
                    if (objArr.length < i13) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i12 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i12 + 0);
                    }
                    objArr[0] = m0VarG;
                    i12++;
                    m0VarG = m0VarG.w();
                }
                Object[] objArr3 = new b5.m0[16];
                int i14 = 0;
                while (m0VarG2 != null) {
                    int i15 = i14 + 1;
                    if (objArr3.length < i15) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i15, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i14 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i14 + 0);
                    }
                    objArr3[0] = m0VarG2;
                    i14++;
                    m0VarG2 = m0VarG2.w();
                }
                int iMin = Math.min(i12 - 1, i14 - 1);
                if (iMin >= 0) {
                    while (Intrinsics.areEqual(objArr[i11], objArr3[i11])) {
                        if (i11 != iMin) {
                            i11++;
                        }
                    }
                    return Intrinsics.compare(((b5.m0) objArr[i11]).x(), ((b5.m0) objArr3[i11]).x());
                }
                h2.b("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (d.h(g0Var)) {
                return -1;
            }
            if (d.h(g0Var2)) {
                return 1;
            }
        }
        return 0;
    }
}
