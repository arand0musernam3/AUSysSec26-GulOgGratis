package g9;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20107r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z11, int i11) {
        super(z11);
        this.f20107r = i11;
    }

    public static float[] j(String str) {
        str.getClass();
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] k(String str) {
        str.getClass();
        return new int[]{((Number) q0.f20196b.d(str)).intValue()};
    }

    public static long[] l(String str) {
        str.getClass();
        return new long[]{((Number) q0.f20200f.d(str)).longValue()};
    }

    public static boolean[] m(String str) {
        str.getClass();
        return new boolean[]{((Boolean) q0.l.d(str)).booleanValue()};
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        switch (this.f20107r) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                w0.e.D(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return kotlin.collections.y.U(booleanArray2);
                }
                w0.e.D(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                w0.e.D(str);
                throw null;
            case 3:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return kotlin.collections.y.Q(floatArray2);
                }
                w0.e.D(str);
                throw null;
            case 4:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                w0.e.D(str);
                throw null;
            case 5:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return kotlin.collections.y.R(intArray2);
                }
                w0.e.D(str);
                throw null;
            case 6:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                w0.e.D(str);
                throw null;
            case 7:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return kotlin.collections.y.S(longArray2);
                }
                w0.e.D(str);
                throw null;
            case 8:
                bundle.getClass();
                str.getClass();
                if (!w.b.A(bundle, str) || w.b.T(bundle, str)) {
                    return null;
                }
                return w.b.O(bundle, str);
            default:
                bundle.getClass();
                str.getClass();
                if (!w.b.A(bundle, str) || w.b.T(bundle, str)) {
                    return null;
                }
                return kotlin.collections.y.T(w.b.O(bundle, str));
        }
    }

    @Override // g9.q0
    public final String b() {
        switch (this.f20107r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // g9.q0
    public final Object c(Object obj, String str) {
        switch (this.f20107r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return m(str);
                }
                boolean[] zArrM = m(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrM, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                d dVar = q0.l;
                return list != null ? CollectionsKt.d0(kotlin.collections.c0.c(dVar.d(str)), list) : kotlin.collections.c0.c(dVar.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return j(str);
                }
                float[] fArrJ = j(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrJ, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? CollectionsKt.d0(kotlin.collections.c0.c(Float.valueOf(Float.parseFloat(str))), list2) : kotlin.collections.c0.c(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return k(str);
                }
                int[] iArrK = k(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrK, 0, iArrCopyOf, length3, 1);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                d dVar2 = q0.f20196b;
                return list3 != null ? CollectionsKt.d0(kotlin.collections.c0.c(dVar2.d(str)), list3) : kotlin.collections.c0.c(dVar2.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return l(str);
                }
                long[] jArrL = l(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrL, 0, jArrCopyOf, length4, 1);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                d dVar3 = q0.f20200f;
                return list4 != null ? CollectionsKt.d0(kotlin.collections.c0.c(dVar3.d(str)), list4) : kotlin.collections.c0.c(dVar3.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? CollectionsKt.d0(kotlin.collections.c0.c(str), list5) : kotlin.collections.c0.c(str);
        }
    }

    @Override // g9.q0
    public final Object d(String str) {
        switch (this.f20107r) {
            case 0:
                return m(str);
            case 1:
                str.getClass();
                return kotlin.collections.c0.c(q0.l.d(str));
            case 2:
                return j(str);
            case 3:
                str.getClass();
                return kotlin.collections.c0.c(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return k(str);
            case 5:
                str.getClass();
                return kotlin.collections.c0.c(q0.f20196b.d(str));
            case 6:
                return l(str);
            case 7:
                str.getClass();
                return kotlin.collections.c0.c(q0.f20200f.d(str));
            case 8:
                str.getClass();
                return new String[]{str};
            default:
                str.getClass();
                return kotlin.collections.c0.c(str);
        }
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f20107r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, CollectionsKt.o0(list));
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    list2.getClass();
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        fArr2[i11] = ((Number) it.next()).floatValue();
                        i11++;
                    }
                    bundle.putFloatArray(str, fArr2);
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, CollectionsKt.q0(list3));
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, CollectionsKt.s0(list4));
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 == null) {
                    bundle.putString(str, null);
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                }
                break;
        }
    }

    @Override // g9.q0
    public final boolean g(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Long[] lArr;
        switch (this.f20107r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        boolArr[i11] = Boolean.valueOf(zArr[i11]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i12 = 0; i12 < length2; i12++) {
                        boolArr2[i12] = Boolean.valueOf(zArr2[i12]);
                    }
                }
                return kotlin.collections.v.b(boolArr, boolArr2);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return kotlin.collections.v.b(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
            case 2:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        fArr[i13] = Float.valueOf(fArr2[i13]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i14 = 0; i14 < length4; i14++) {
                        fArr4[i14] = Float.valueOf(fArr3[i14]);
                    }
                }
                return kotlin.collections.v.b(fArr, fArr4);
            case 3:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return kotlin.collections.v.b(list3 != null ? (Float[]) list3.toArray(new Float[0]) : null, list4 != null ? (Float[]) list4.toArray(new Float[0]) : null);
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                return kotlin.collections.v.b(iArr != null ? kotlin.collections.x.q(iArr) : null, iArr2 != null ? kotlin.collections.x.q(iArr2) : null);
            case 5:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return kotlin.collections.v.b(list5 != null ? (Integer[]) list5.toArray(new Integer[0]) : null, list6 != null ? (Integer[]) list6.toArray(new Integer[0]) : null);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length5 = jArr.length;
                    for (int i15 = 0; i15 < length5; i15++) {
                        lArr[i15] = Long.valueOf(jArr[i15]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length6 = jArr2.length;
                    for (int i16 = 0; i16 < length6; i16++) {
                        lArr2[i16] = Long.valueOf(jArr2[i16]);
                    }
                }
                return kotlin.collections.v.b(lArr, lArr2);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return kotlin.collections.v.b(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return kotlin.collections.v.b((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return kotlin.collections.v.b(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }

    @Override // g9.e
    public final Object h() {
        switch (this.f20107r) {
            case 0:
                return new boolean[0];
            case 1:
                return kotlin.collections.n0.f26529a;
            case 2:
                return new float[0];
            case 3:
                return kotlin.collections.n0.f26529a;
            case 4:
                return new int[0];
            case 5:
                return kotlin.collections.n0.f26529a;
            case 6:
                return new long[0];
            case 7:
                return kotlin.collections.n0.f26529a;
            case 8:
                return new String[0];
            default:
                return kotlin.collections.n0.f26529a;
        }
    }

    @Override // g9.e
    public final List i(Object obj) {
        List listU;
        List listQ;
        List listR;
        List listS;
        switch (this.f20107r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null && (listU = kotlin.collections.y.U(zArr)) != null) {
                    ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(listU, 10));
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null && (listQ = kotlin.collections.y.Q(fArr)) != null) {
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.o(listQ, 10));
                    Iterator it3 = listQ.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                }
                break;
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.e0.o(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null && (listR = kotlin.collections.y.R(iArr)) != null) {
                    ArrayList arrayList5 = new ArrayList(kotlin.collections.e0.o(listR, 10));
                    Iterator it5 = listR.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                }
                break;
            case 5:
                List list3 = (List) obj;
                if (list3 != null) {
                    ArrayList arrayList6 = new ArrayList(kotlin.collections.e0.o(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null && (listS = kotlin.collections.y.S(jArr)) != null) {
                    ArrayList arrayList7 = new ArrayList(kotlin.collections.e0.o(listS, 10));
                    Iterator it7 = listS.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                }
                break;
            case 7:
                List list4 = (List) obj;
                if (list4 != null) {
                    ArrayList arrayList8 = new ArrayList(kotlin.collections.e0.o(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        arrayList8.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList9 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        str.getClass();
                        String strEncode = Uri.encode(str, null);
                        strEncode.getClass();
                        arrayList9.add(strEncode);
                    }
                }
                break;
            default:
                List<String> list5 = (List) obj;
                if (list5 != null) {
                    ArrayList arrayList10 = new ArrayList(kotlin.collections.e0.o(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String strEncode2 = Uri.encode(str2, null);
                        strEncode2.getClass();
                        arrayList10.add(strEncode2);
                    }
                }
                break;
        }
        return kotlin.collections.n0.f26529a;
    }
}
