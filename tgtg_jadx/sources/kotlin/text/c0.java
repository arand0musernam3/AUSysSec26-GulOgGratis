package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static final boolean a(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final String b(long j9) {
        return bx.o.S(CharsKt__CharJVMKt.checkRadix(16), j9);
    }

    public static final String c(int i11) {
        return bx.o.S(CharsKt__CharJVMKt.checkRadix(16), ((long) i11) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte d(java.lang.String r3) {
        /*
            r3.getClass()
            u70.z r0 = f(r3)
            r1 = 0
            if (r0 == 0) goto L1c
            int r0 = r0.f40866a
            r2 = 255(0xff, float:3.57E-43)
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L15
            goto L1c
        L15:
            byte r0 = (byte) r0
            u70.w r2 = new u70.w
            r2.<init>(r0)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 == 0) goto L22
            byte r3 = r2.f40863a
            return r3
        L22:
            kotlin.text.StringsKt__StringNumberConversionsKt.h(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.c0.d(java.lang.String):byte");
    }

    public static final int e(String str) {
        str.getClass();
        u70.z zVarF = f(str);
        if (zVarF != null) {
            return zVarF.f40866a;
        }
        StringsKt__StringNumberConversionsKt.h(str);
        throw null;
    }

    public static final u70.z f(String str) {
        int i11;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        u70.y yVar = u70.z.f40865b;
        int iDivideUnsigned = 119304647;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i13 = i12 * 10;
            int i14 = iDigit + i13;
            if (Integer.compareUnsigned(i14, i13) < 0) {
                return null;
            }
            i11++;
            i12 = i14;
        }
        return new u70.z(i12);
    }

    public static final long g(String str) {
        str.getClass();
        u70.c0 c0VarH = h(str);
        if (c0VarH != null) {
            return c0VarH.f40834a;
        }
        StringsKt__StringNumberConversionsKt.h(str);
        throw null;
    }

    public static final u70.c0 h(String str) {
        str.getClass();
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j9 = 10;
        u70.b0 b0Var = u70.c0.f40833b;
        long j11 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j11, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j9);
                if (Long.compareUnsigned(j11, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j12 = j11 * j9;
            u70.y yVar = u70.z.f40865b;
            long j13 = (((long) iDigit) & 4294967295L) + j12;
            if (Long.compareUnsigned(j13, j12) < 0) {
                return null;
            }
            i11++;
            j11 = j13;
        }
        return new u70.c0(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final short i(java.lang.String r3) {
        /*
            r3.getClass()
            u70.z r0 = f(r3)
            r1 = 0
            if (r0 == 0) goto L1d
            int r0 = r0.f40866a
            r2 = 65535(0xffff, float:9.1834E-41)
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L16
            goto L1d
        L16:
            short r0 = (short) r0
            u70.g0 r2 = new u70.g0
            r2.<init>(r0)
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 == 0) goto L23
            short r3 = r2.f40839a
            return r3
        L23:
            kotlin.text.StringsKt__StringNumberConversionsKt.h(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.c0.i(java.lang.String):short");
    }
}
