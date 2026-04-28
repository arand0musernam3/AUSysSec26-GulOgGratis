package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1660:1\n78#1,22:1661\n112#1,5:1683\n129#1,5:1688\n78#1,22:1693\n106#1:1715\n78#1,22:1716\n112#1,5:1738\n123#1:1743\n112#1,5:1744\n129#1,5:1749\n140#1:1754\n129#1,5:1755\n78#1,22:1760\n112#1,5:1782\n129#1,5:1787\n1088#2,2:1792\n13293#3,2:1794\n13293#3,2:1796\n296#4,2:1798\n296#4,2:1800\n1586#4:1803\n1661#4,3:1804\n1586#4:1807\n1661#4,3:1808\n1#5:1802\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n106#1:1661,22\n123#1:1683,5\n140#1:1688,5\n145#1:1693,22\n150#1:1715\n150#1:1716,22\n155#1:1738,5\n160#1:1743\n160#1:1744,5\n165#1:1749,5\n170#1:1754\n170#1:1755,5\n175#1:1760,22\n186#1:1782,5\n197#1:1787,5\n310#1:1792,2\n976#1:1794,2\n1000#1:1796,2\n1039#1:1798,2\n1045#1:1800,2\n1425#1:1803\n1425#1:1804,3\n1467#1:1807\n1467#1:1808,3\n*E\n"})
public class StringsKt__StringsKt extends y {
    public static final int q(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12) {
        kotlin.ranges.a aVar;
        if (z12) {
            int iD = StringsKt.D(charSequence);
            if (i11 > iD) {
                i11 = iD;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            kotlin.ranges.a.f26552d.getClass();
            aVar = new kotlin.ranges.a(i11, i12, -1);
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            int length = charSequence.length();
            if (i12 > length) {
                i12 = length;
            }
            aVar = new IntRange(i11, i12, 1);
        }
        boolean z13 = charSequence instanceof String;
        int i13 = aVar.f26555c;
        int i14 = aVar.f26554b;
        int i15 = aVar.f26553a;
        if (!z13 || !(charSequence2 instanceof String)) {
            boolean z14 = z11;
            if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z15 = z14;
                    z14 = z15;
                    if (!s(charSequence4, 0, charSequence3, i15, charSequence2.length(), z15)) {
                        if (i15 == i14) {
                            break;
                        }
                        i15 += i13;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i15;
                    }
                }
            }
        } else if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
            int i16 = i15;
            while (true) {
                String str = (String) charSequence2;
                boolean z16 = z11;
                if (!y.l(0, i16, str.length(), str, (String) charSequence, z16)) {
                    if (i16 == i14) {
                        break;
                    }
                    i16 += i13;
                    z11 = z16;
                } else {
                    return i16;
                }
            }
        }
        return -1;
    }

    public static final int r(CharSequence charSequence, char[] cArr, int i11, boolean z11) {
        charSequence.getClass();
        if (!z11 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.y.L(cArr), i11);
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int length = charSequence.length() - 1;
        if (i11 > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i11);
            for (char c3 : cArr) {
                if (a.a(c3, cCharAt, z11)) {
                    return i11;
                }
            }
            if (i11 == length) {
                return -1;
            }
            i11++;
        }
    }

    public static final boolean s(CharSequence charSequence, int i11, CharSequence charSequence2, int i12, int i13, boolean z11) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i12 < 0 || i11 < 0 || i11 > charSequence.length() - i13 || i12 > charSequence2.length() - i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!a.a(charSequence.charAt(i11 + i14), charSequence2.charAt(i12 + i14), z11)) {
                return false;
            }
        }
        return true;
    }

    public static List split$default(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return u(i11, charSequence, str, z11);
            }
        }
        t(i11);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        c cVar = new c(charSequence, i11, new z(listAsList, z11, 1));
        ArrayList arrayList = new ArrayList(e0.o(new k90.g(cVar, 3), 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.U(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final void t(int i11) {
        if (i11 >= 0) {
            return;
        }
        i4.a.i(j4.s.f(i11, "Limit must be non-negative, but was "));
    }

    public static final List u(int i11, CharSequence charSequence, String str, boolean z11) {
        t(i11);
        int length = 0;
        int iE = StringsKt.E(0, charSequence, str, z11);
        if (iE == -1 || i11 == 1) {
            return kotlin.collections.c0.c(charSequence.toString());
        }
        boolean z12 = i11 > 0;
        int i12 = 10;
        if (z12 && i11 <= 10) {
            i12 = i11;
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(length, iE).toString());
            length = str.length() + iE;
            if (z12 && arrayList.size() == i11 - 1) {
                break;
            }
            iE = StringsKt.E(length, charSequence, str, z11);
        } while (iE != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean v(CharSequence charSequence, String str) {
        str.getClass();
        charSequence.getClass();
        return charSequence instanceof String ? y.p(str, (String) charSequence, false) : s(str, 0, charSequence, 0, charSequence.length(), false);
    }
}
