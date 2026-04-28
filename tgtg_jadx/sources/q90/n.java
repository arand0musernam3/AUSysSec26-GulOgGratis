package q90;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static int a(int i11, int i12, String str, boolean z11) {
        while (i11 < i12) {
            char cCharAt = str.charAt(i11);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z11)) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static o b(v vVar, String str) {
        v vVar2;
        long j9;
        String str2;
        vVar.getClass();
        str.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        char c3 = ';';
        int iG = r90.e.g(str, ';', 0, 0, 6);
        char c7 = '=';
        int iG2 = r90.e.g(str, '=', 0, iG, 2);
        String str3 = null;
        if (iG2 != iG) {
            String strQ = r90.e.q(0, iG2, str);
            if (strQ.length() != 0 && r90.e.i(strQ) == -1) {
                String strQ2 = r90.e.q(iG2 + 1, iG, str);
                if (r90.e.i(strQ2) == -1) {
                    int i11 = iG + 1;
                    int length = str.length();
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    String str4 = null;
                    boolean z14 = true;
                    long jC = 253402300799999L;
                    long j11 = -1;
                    String str5 = null;
                    while (true) {
                        long j12 = LongCompanionObject.MAX_VALUE;
                        if (i11 >= length) {
                            if (j11 == Long.MIN_VALUE) {
                                vVar2 = vVar;
                                j9 = Long.MIN_VALUE;
                            } else if (j11 != -1) {
                                if (j11 <= 9223372036854775L) {
                                    j12 = j11 * ((long) 1000);
                                }
                                long j13 = jCurrentTimeMillis + j12;
                                if (j13 < jCurrentTimeMillis || j13 > 253402300799999L) {
                                    vVar2 = vVar;
                                    j9 = 253402300799999L;
                                } else {
                                    vVar2 = vVar;
                                    j9 = j13;
                                }
                            } else {
                                vVar2 = vVar;
                                j9 = jC;
                            }
                            String str6 = vVar2.f36626d;
                            if (str3 != null) {
                                if (Intrinsics.areEqual(str6, str3) || (kotlin.text.y.j(str6, str3, false) && str6.charAt((str6.length() - str3.length()) - 1) == '.' && !r90.d.f37810a.e(str6))) {
                                    str2 = str3;
                                }
                                return null;
                            }
                            str2 = str6;
                            if (str6.length() == str2.length() || da0.c.f14860d.a(str2) != null) {
                                String strSubstring = ExpiryDateInput.SEPARATOR;
                                if (str5 == null || !kotlin.text.y.p(str5, ExpiryDateInput.SEPARATOR, false)) {
                                    String strB = vVar2.b();
                                    int iJ = StringsKt.J(strB, '/', 0, 6);
                                    if (iJ != 0) {
                                        strSubstring = strB.substring(0, iJ);
                                    }
                                    str5 = strSubstring;
                                }
                                return new o(strQ, strQ2, j9, str2, str5, z13, z11, z12, z14, str4);
                            }
                            return null;
                        }
                        int iE = r90.e.e(str, c3, i11, length);
                        int iE2 = r90.e.e(str, c7, i11, iE);
                        String strQ3 = r90.e.q(i11, iE2, str);
                        String strQ4 = iE2 < iE ? r90.e.q(iE2 + 1, iE, str) : "";
                        if (strQ3.equalsIgnoreCase("expires")) {
                            try {
                                jC = c(strQ4.length(), strQ4);
                                z12 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strQ3.equalsIgnoreCase("max-age")) {
                            try {
                                j11 = Long.parseLong(strQ4);
                                if (j11 <= 0) {
                                    j11 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e5) {
                                if (!new Regex("-?\\d+").e(strQ4)) {
                                    throw e5;
                                }
                                if (kotlin.text.y.p(strQ4, "-", false)) {
                                    j12 = Long.MIN_VALUE;
                                }
                                j11 = j12;
                            }
                            z12 = true;
                        } else if (strQ3.equalsIgnoreCase("domain")) {
                            if (kotlin.text.y.j(strQ4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strB2 = r90.d.b(StringsKt.N(strQ4, "."));
                            if (strB2 == null) {
                                throw new IllegalArgumentException();
                            }
                            str3 = strB2;
                            z14 = false;
                        } else if (strQ3.equalsIgnoreCase("path")) {
                            str5 = strQ4;
                        } else if (strQ3.equalsIgnoreCase("secure")) {
                            z13 = true;
                        } else if (strQ3.equalsIgnoreCase("httponly")) {
                            z11 = true;
                        } else if (strQ3.equalsIgnoreCase("samesite")) {
                            str4 = strQ4;
                        }
                        i11 = iE + 1;
                        c3 = ';';
                        c7 = '=';
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long c(int r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q90.n.c(int, java.lang.String):long");
    }
}
