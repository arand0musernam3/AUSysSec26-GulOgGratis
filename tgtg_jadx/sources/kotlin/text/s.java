package kotlin.text;

import c5.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class s extends r {
    public static String b(String str) {
        return o80.r.k(o80.r.m(new l3(str, 4), new gt.e("    ", 15)), "\n");
    }

    public static String c(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        List listK = StringsKt.K(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (!StringsKt.H((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listK.size();
        int size = listK.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listK) {
            int i11 = length + 1;
            if (length < 0) {
                d0.n();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && StringsKt.H(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    i4.a.i(r8.k.h(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i11;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        CollectionsKt.T(arrayList3, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }

    public static String d(String str) {
        if (StringsKt.H("|")) {
            i4.a.f("marginPrefix must be non-blank string.");
            return null;
        }
        List listK = StringsKt.K(str);
        int length = str.length();
        listK.size();
        int size = listK.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listK) {
            int i12 = i11 + 1;
            String strSubstring = null;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            String str2 = (String) obj;
            if ((i11 != 0 && i11 != size) || !StringsKt.H(str2)) {
                int length2 = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1 && y.o(str2, i13, "|", false)) {
                    strSubstring = str2.substring("|".length() + i13);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i11 = i12;
        }
        StringBuilder sb2 = new StringBuilder(length);
        CollectionsKt.T(arrayList, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }
}
