package kotlin.collections;

import c5.l3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class y extends x {
    public static int A(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int B(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Integer C(int i11, int[] iArr) {
        iArr.getClass();
        if (i11 < 0 || i11 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i11]);
    }

    public static Object D(int i11, Object[] objArr) {
        objArr.getClass();
        if (i11 < 0 || i11 >= objArr.length) {
            return null;
        }
        return objArr[i11];
    }

    public static int E(Object[] objArr, Object obj) {
        objArr.getClass();
        int i11 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i11 < length) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i11 < length2) {
            if (Intrinsics.areEqual(obj, objArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final void F(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) throws IOException {
        objArr.getClass();
        sb2.append(charSequence2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
            }
            kotlin.text.r.a(sb2, obj, function1);
        }
        sb2.append(charSequence3);
    }

    public static String G(byte[] bArr, String str, Function1 function1, int i11) {
        String str2 = (i11 & 2) != 0 ? "" : "[";
        String str3 = (i11 & 4) == 0 ? "]" : "";
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        bArr.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i12 = 0;
        for (byte b8 : bArr) {
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str);
            }
            if (function1 != null) {
                sb2.append((CharSequence) function1.invoke(Byte.valueOf(b8)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b8));
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static String H(Object[] objArr, String str, String str2, String str3, Function1 function1, int i11) throws IOException {
        if ((i11 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i11 & 2) != 0 ? "" : str2;
        String str6 = (i11 & 4) != 0 ? "" : str3;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        objArr.getClass();
        StringBuilder sb2 = new StringBuilder();
        F(objArr, sb2, str4, str5, str6, "...", function1);
        return sb2.toString();
    }

    public static Object I(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        qc.y.h("Array is empty.");
        return null;
    }

    public static int J(Object[] objArr, Object obj) {
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (Intrinsics.areEqual(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    length2 = i12;
                }
            }
        }
        return -1;
    }

    public static Object K(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static char L(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            qc.y.h("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        i4.a.f("Array has more than one element.");
        return (char) 0;
    }

    public static Object M(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            qc.y.h("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        i4.a.f("Array has more than one element.");
        return null;
    }

    public static List N(Comparator comparator, Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            x.p(comparator, objArr);
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final void O(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List P(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return n0.f26529a;
        }
        if (length == 1) {
            return c0.c(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d3 : dArr) {
            arrayList.add(Double.valueOf(d3));
        }
        return arrayList;
    }

    public static List Q(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return n0.f26529a;
        }
        if (length == 1) {
            return c0.c(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    public static List R(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return n0.f26529a;
        }
        if (length == 1) {
            return c0.c(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static List S(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return n0.f26529a;
        }
        if (length == 1) {
            return c0.c(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j9 : jArr) {
            arrayList.add(Long.valueOf(j9));
        }
        return arrayList;
    }

    public static List T(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return n0.f26529a;
        }
        if (length == 1) {
            return c0.c(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static List U(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return n0.f26529a;
        }
        if (length == 1) {
            return c0.c(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z11 : zArr) {
            arrayList.add(Boolean.valueOf(z11));
        }
        return arrayList;
    }

    public static Set V(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return p0.f26531a;
        }
        if (length == 1) {
            return g1.b(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w0.a(iArr.length));
        for (int i11 : iArr) {
            linkedHashSet.add(Integer.valueOf(i11));
        }
        return linkedHashSet;
    }

    public static Set W(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return p0.f26531a;
        }
        if (length == 1) {
            return g1.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w0.a(objArr.length));
        O(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList X(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(new Pair(objArr[i11], objArr2[i11]));
        }
        return arrayList;
    }

    public static Sequence r(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? o80.d.f32106a : new l3(objArr, 2);
    }

    public static boolean s(char[] cArr, char c3) {
        int length = cArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (c3 == cArr[i11]) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    public static boolean t(int[] iArr, int i11) {
        iArr.getClass();
        int length = iArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (i11 == iArr[i12]) {
                break;
            }
            i12++;
        }
        return i12 >= 0;
    }

    public static boolean u(long[] jArr, long j9) {
        int length = jArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (j9 == jArr[i11]) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    public static boolean v(Object[] objArr, Object obj) {
        objArr.getClass();
        return E(objArr, obj) >= 0;
    }

    public static ArrayList w(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object x(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        qc.y.h("Array is empty.");
        return null;
    }

    public static Object y(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static IntRange z(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }
}
