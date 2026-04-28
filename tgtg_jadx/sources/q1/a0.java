package q1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f35710a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f35711b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f35712c = new Object();

    public static final void a(l1 l1Var) {
        int i11 = l1Var.f35788d;
        int[] iArr = l1Var.f35786b;
        Object[] objArr = l1Var.f35787c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f35712c) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        l1Var.f35785a = false;
        l1Var.f35788d = i12;
    }

    public static final void b(f fVar, int i11) {
        fVar.f35749a = new int[i11];
        fVar.f35750b = new Object[i11];
    }

    public static final int c(f fVar, Object obj, int i11) {
        int i12 = fVar.f35751c;
        if (i12 == 0) {
            return -1;
        }
        try {
            int iA = r1.a.a(i12, i11, fVar.f35749a);
            if (iA < 0 || Intrinsics.areEqual(obj, fVar.f35750b[iA])) {
                return iA;
            }
            int i13 = iA + 1;
            while (i13 < i12 && fVar.f35749a[i13] == i11) {
                if (Intrinsics.areEqual(obj, fVar.f35750b[i13])) {
                    return i13;
                }
                i13++;
            }
            for (int i14 = iA - 1; i14 >= 0 && fVar.f35749a[i14] == i11; i14--) {
                if (Intrinsics.areEqual(obj, fVar.f35750b[i14])) {
                    return i14;
                }
            }
            return ~i13;
        } catch (IndexOutOfBoundsException unused) {
            org.bouncycastle.jce.provider.a.o();
            return 0;
        }
    }
}
