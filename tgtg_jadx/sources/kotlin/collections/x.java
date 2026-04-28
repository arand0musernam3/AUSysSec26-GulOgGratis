package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class x extends v {
    public static List c(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void d(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i12, objArr2, i11, i13 - i12);
    }

    public static void e(int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i12, bArr2, i11, i13 - i12);
    }

    public static void f(int i11, int[] iArr, int i12, int i13, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i12, iArr2, i11, i13 - i12);
    }

    public static void g(int i11, long[] jArr, int i12, long[] jArr2, int i13) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i12, jArr2, i11, i13 - i12);
    }

    public static void h(char[] cArr, char[] cArr2, int i11, int i12, int i13) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i12, cArr2, i11, i13 - i12);
    }

    public static /* synthetic */ void i(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        d(0, i11, i12, objArr, objArr2);
    }

    public static /* synthetic */ void j(int i11, int[] iArr, int i12, int i13, int[] iArr2) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        f(i11, iArr, 0, i12, iArr2);
    }

    public static byte[] k(byte[] bArr, int i11, int i12) {
        bArr.getClass();
        u.a(i12, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] l(Object[] objArr, int i11, int i12) {
        objArr.getClass();
        u.a(i12, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i11, i12);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static void m(Object[] objArr, int i11, int i12, Object obj) {
        objArr.getClass();
        Arrays.fill(objArr, i11, i12, obj);
    }

    public static void n(long[] jArr, long j9) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j9);
    }

    public static void p(Comparator comparator, Object[] objArr) {
        objArr.getClass();
        comparator.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static Integer[] q(int[] iArr) {
        iArr.getClass();
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }
}
