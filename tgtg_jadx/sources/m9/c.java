package m9;

import android.net.Uri;
import android.os.Bundle;
import com.adyen.checkout.components.core.Address;
import g9.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.v;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f29731r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z11, int i11) {
        super(z11);
        this.f29731r = i11;
    }

    public static double[] j(String str) {
        str.getClass();
        return new double[]{Double.valueOf(Double.parseDouble(str)).doubleValue()};
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        switch (this.f29731r) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                w0.e.D(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return y.P(doubleArray2);
                }
                w0.e.D(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                String[] strArrO = w.b.O(bundle, str);
                ArrayList arrayList = new ArrayList(strArrO.length);
                for (String str2 : strArrO) {
                    arrayList.add((String) q0.f20208o.d(str2));
                }
                return (String[]) arrayList.toArray(new String[0]);
            default:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                List listT = y.T(w.b.O(bundle, str));
                ArrayList arrayList2 = new ArrayList(e0.o(listT, 10));
                Iterator it = listT.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) q0.f20208o.d((String) it.next()));
                }
                return arrayList2;
        }
    }

    @Override // g9.q0
    public final String b() {
        switch (this.f29731r) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g9.q0
    public final Object c(Object obj, String str) {
        switch (this.f29731r) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null) {
                    return j(str);
                }
                double[] dArrJ = j(str);
                int length = dArr.length;
                double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
                System.arraycopy(dArrJ, 0, dArrCopyOf, length, 1);
                return dArrCopyOf;
            case 1:
                List list = (List) obj;
                return list != null ? CollectionsKt.d0(c0.c(Double.valueOf(Double.parseDouble(str))), list) : c0.c(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                g9.d dVar = q0.f20208o;
                if (strArr == null) {
                    return new String[]{dVar.d(str)};
                }
                String[] strArr2 = {dVar.d(str)};
                int length2 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length2 + 1);
                System.arraycopy(strArr2, 0, objArrCopyOf, length2, 1);
                return (String[]) objArrCopyOf;
            default:
                List list2 = (List) obj;
                g9.d dVar2 = q0.f20208o;
                return list2 != null ? CollectionsKt.d0(c0.c(dVar2.d(str)), list2) : c0.c(dVar2.d(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g9.q0
    public final Object d(String str) {
        switch (this.f29731r) {
            case 0:
                return j(str);
            case 1:
                str.getClass();
                return c0.c(Double.valueOf(Double.parseDouble(str)));
            case 2:
                str.getClass();
                return new String[]{q0.f20208o.d(str)};
            default:
                str.getClass();
                return c0.c(q0.f20208o.d(str));
        }
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f29731r) {
            case 0:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putDoubleArray(str, dArr);
                }
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                } else {
                    double[] dArr2 = new double[list.size()];
                    Iterator it = list.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        dArr2[i11] = ((Number) it.next()).doubleValue();
                        i11++;
                    }
                    bundle.putDoubleArray(str, dArr2);
                }
                break;
            case 2:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str2 : strArr) {
                        if (str2 == null) {
                            str2 = Address.ADDRESS_NULL_PLACEHOLDER;
                        }
                        arrayList.add(str2);
                    }
                    String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                }
                break;
            default:
                List<String> list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    ArrayList arrayList2 = new ArrayList(e0.o(list2, 10));
                    for (String str3 : list2) {
                        if (str3 == null) {
                            str3 = Address.ADDRESS_NULL_PLACEHOLDER;
                        }
                        arrayList2.add(str3);
                    }
                    String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                    strArr3.getClass();
                    bundle.putStringArray(str, strArr3);
                }
                break;
        }
    }

    @Override // g9.q0
    public final boolean g(Object obj, Object obj2) {
        Double[] dArr;
        switch (this.f29731r) {
            case 0:
                double[] dArr2 = (double[]) obj;
                double[] dArr3 = (double[]) obj2;
                Double[] dArr4 = null;
                if (dArr2 != null) {
                    dArr = new Double[dArr2.length];
                    int length = dArr2.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        dArr[i11] = Double.valueOf(dArr2[i11]);
                    }
                } else {
                    dArr = null;
                }
                if (dArr3 != null) {
                    dArr4 = new Double[dArr3.length];
                    int length2 = dArr3.length;
                    for (int i12 = 0; i12 < length2; i12++) {
                        dArr4[i12] = Double.valueOf(dArr3[i12]);
                    }
                }
                return v.b(dArr, dArr4);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return v.b(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
            case 2:
                return v.b((String[]) obj, (String[]) obj2);
            default:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return v.b(list3 != null ? (String[]) list3.toArray(new String[0]) : null, list4 != null ? (String[]) list4.toArray(new String[0]) : null);
        }
    }

    @Override // g9.e
    public final Object h() {
        switch (this.f29731r) {
            case 0:
                return new double[0];
            case 1:
                return n0.f26529a;
            case 2:
                return new String[0];
            default:
                return n0.f26529a;
        }
    }

    @Override // g9.e
    public final List i(Object obj) {
        List listP;
        String strEncode;
        String strEncode2;
        switch (this.f29731r) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null && (listP = y.P(dArr)) != null) {
                    ArrayList arrayList = new ArrayList(e0.o(listP, 10));
                    Iterator it = listP.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(e0.o(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                }
                break;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList3 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        if (str != null) {
                            strEncode = Uri.encode(str, null);
                            strEncode.getClass();
                        } else {
                            strEncode = Address.ADDRESS_NULL_PLACEHOLDER;
                        }
                        arrayList3.add(strEncode);
                    }
                }
                break;
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(e0.o(list2, 10));
                    for (String str2 : list2) {
                        if (str2 != null) {
                            strEncode2 = Uri.encode(str2, null);
                            strEncode2.getClass();
                        } else {
                            strEncode2 = Address.ADDRESS_NULL_PLACEHOLDER;
                        }
                        arrayList4.add(strEncode2);
                    }
                }
                break;
        }
        return n0.f26529a;
    }
}
