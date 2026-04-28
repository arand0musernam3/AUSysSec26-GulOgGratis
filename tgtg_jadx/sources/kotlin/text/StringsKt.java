package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"kotlin/text/r", "kotlin/text/s", "kotlin/text/t", "kotlin/text/u", "kotlin/text/v", "kotlin/text/w", "kotlin/text/x", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/y", "kotlin/text/StringsKt__StringsKt", "kotlin/text/a0", "kotlin/text/b0"}, d2 = {}, k = 4, mv = {2, 3, 0}, xi = 49)
public final class StringsKt extends b0 {
    public static boolean A(CharSequence charSequence, char c3) {
        charSequence.getClass();
        return F(charSequence, c3, 0, false, 2) >= 0;
    }

    public static boolean B(CharSequence charSequence, char c3) {
        charSequence.getClass();
        return charSequence.length() > 0 && a.a(charSequence.charAt(charSequence.length() - 1), c3, false);
    }

    public static boolean C(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? y.j((String) charSequence, str, false) : StringsKt__StringsKt.s(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int D(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int E(int i11, CharSequence charSequence, String str, boolean z11) {
        charSequence.getClass();
        str.getClass();
        return (z11 || !(charSequence instanceof String)) ? StringsKt__StringsKt.q(charSequence, str, i11, charSequence.length(), z11, false) : ((String) charSequence).indexOf(str, i11);
    }

    public static int F(CharSequence charSequence, char c3, int i11, boolean z11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        charSequence.getClass();
        return (z11 || !(charSequence instanceof String)) ? StringsKt__StringsKt.r(charSequence, new char[]{c3}, i11, z11) : ((String) charSequence).indexOf(c3, i11);
    }

    public static /* synthetic */ int G(CharSequence charSequence, String str, int i11, boolean z11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return E(i11, charSequence, str, z11);
    }

    public static boolean H(CharSequence charSequence) {
        charSequence.getClass();
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (!CharsKt.b(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static int I(int i11, String str, String str2) {
        int iD = (i11 & 2) != 0 ? D(str) : 0;
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, iD);
    }

    public static int J(CharSequence charSequence, char c3, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = D(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c3, i11);
        }
        char[] cArr = {c3};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.y.L(cArr), i11);
        }
        int length = charSequence.length() - 1;
        if (i11 > length) {
            i11 = length;
        }
        while (-1 < i11) {
            if (a.a(cArr[0], charSequence.charAt(i11), false)) {
                return i11;
            }
            i11--;
        }
        return -1;
    }

    public static List K(String str) {
        str.getClass();
        k kVar = new k(str);
        if (!kVar.hasNext()) {
            return n0.f26529a;
        }
        Object next = kVar.next();
        if (!kVar.hasNext()) {
            return kotlin.collections.c0.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (kVar.hasNext()) {
            arrayList.add(kVar.next());
        }
        return arrayList;
    }

    public static String L(int i11, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i11 < 0) {
            i4.a.f(r8.k.h(i11, "Desired length ", " is less than zero."));
            return null;
        }
        if (i11 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i11);
            sb2.append((CharSequence) str);
            int length = i11 - str.length();
            int i12 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String M(int i11, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i11 < 0) {
            i4.a.f(r8.k.h(i11, "Desired length ", " is less than zero."));
            return null;
        }
        if (i11 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i11);
            int length = i11 - str.length();
            int i12 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String N(String str, String str2) {
        str.getClass();
        str2.getClass();
        return StringsKt__StringsKt.v(str2, str) ? str.substring(str2.length()) : str;
    }

    public static String O(String str, String str2) {
        return C(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String P(String str, String str2, String str3) {
        str.getClass();
        return (str.length() >= str3.length() + str2.length() && StringsKt__StringsKt.v(str2, str) && C(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    public static StringBuilder Q(CharSequence charSequence, int i11, int i12, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i12 < i11) {
            org.bouncycastle.jce.provider.a.v(r8.k.g(i12, i11, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i11);
        sb2.append(charSequence2);
        sb2.append(charSequence, i12, charSequence.length());
        return sb2;
    }

    public static List S(String str, char[] cArr, int i11) {
        boolean z11 = (i11 & 2) == 0;
        str.getClass();
        if (cArr.length == 1) {
            return StringsKt__StringsKt.u(0, str, String.valueOf(cArr[0]), z11);
        }
        StringsKt__StringsKt.t(0);
        c cVar = new c(str, 0, new z(cArr, z11, 0));
        ArrayList arrayList = new ArrayList(e0.o(new k90.g(cVar, 3), 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(U(str, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static boolean T(String str, char c3) {
        return str.length() > 0 && a.a(str.charAt(0), c3, false);
    }

    public static String U(CharSequence charSequence, IntRange intRange) {
        charSequence.getClass();
        intRange.getClass();
        return charSequence.subSequence(intRange.f26553a, intRange.f26554b + 1).toString();
    }

    public static String V(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        int iG = G(str, str2, 0, false, 6);
        return iG == -1 ? str3 : str.substring(str2.length() + iG, str.length());
    }

    public static String W(char c3, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iJ = J(str, c3, 0, 6);
        return iJ == -1 ? str2 : str.substring(iJ + 1, str.length());
    }

    public static String X(String str, String str2) {
        str.getClass();
        str.getClass();
        int I = I(6, str, str2);
        return I == -1 ? str : str.substring(str2.length() + I, str.length());
    }

    public static String Y(String str, char c3) {
        str.getClass();
        str.getClass();
        int iF = F(str, c3, 0, false, 6);
        return iF == -1 ? str : str.substring(0, iF);
    }

    public static String Z(String str, String str2) {
        str.getClass();
        str.getClass();
        int iG = G(str, str2, 0, false, 6);
        return iG == -1 ? str : str.substring(0, iG);
    }

    public static String a0(String str, char c3) {
        str.getClass();
        str.getClass();
        int iJ = J(str, c3, 0, 6);
        return iJ == -1 ? str : str.substring(0, iJ);
    }

    public static String b0(String str, String str2) {
        str.getClass();
        str.getClass();
        int I = I(6, str, str2);
        return I == -1 ? str : str.substring(0, I);
    }

    public static Boolean c0(String str) {
        str.getClass();
        if (Intrinsics.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Long d0(String str) {
        boolean z11;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j9 = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z11 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z11 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j9 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z11 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return null;
                }
                j12 = j9 / ((long) 10);
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * ((long) 10);
            long j14 = iDigit;
            if (j13 < j9 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i11++;
        }
        return z11 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    public static CharSequence e0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean zB = CharsKt.b(charSequence.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static CharSequence f0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i11 = length - 1;
            if (!CharsKt.b(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i11 < 0) {
                return "";
            }
            length = i11;
        }
    }

    public static String g0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (!kotlin.collections.y.s(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static String h0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!kotlin.collections.y.s(cArr, str.charAt(i11))) {
                charSequenceSubSequence = str.subSequence(i11, str.length());
                break;
            }
            i11++;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z11) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (G(charSequence, (String) charSequence2, 0, z11, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.q(charSequence, charSequence2, 0, charSequence.length(), z11, false) >= 0) {
            return true;
        }
        return false;
    }
}
