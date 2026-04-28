package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends nx.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3023h;

    public /* synthetic */ o1(int i11) {
        this.f3023h = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // nx.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String q(int r11, int r12, byte[] r13) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o1.q(int, int, byte[]):java.lang.String");
    }

    @Override // nx.d
    public final int r(String str, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        char cCharAt;
        long j9;
        char c3;
        long j11;
        long j12;
        char c7;
        int i15;
        char cCharAt2;
        switch (this.f3023h) {
            case 0:
                int length = str.length();
                int i16 = i12 + i11;
                int i17 = 0;
                while (i17 < length && (i14 = i17 + i11) < i16 && (cCharAt = str.charAt(i17)) < 128) {
                    bArr[i14] = (byte) cCharAt;
                    i17++;
                }
                if (i17 == length) {
                    return i11 + length;
                }
                int i18 = i11 + i17;
                while (i17 < length) {
                    char cCharAt3 = str.charAt(i17);
                    if (cCharAt3 < 128 && i18 < i16) {
                        bArr[i18] = (byte) cCharAt3;
                        i18++;
                    } else if (cCharAt3 < 2048 && i18 <= i16 - 2) {
                        int i19 = i18 + 1;
                        bArr[i18] = (byte) ((cCharAt3 >>> 6) | 960);
                        i18 += 2;
                        bArr[i19] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i18 > i16 - 3) {
                            if (i18 > i16 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i13 = i17 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i13)))) {
                                    throw new p1(i17, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i18);
                            }
                            int i21 = i17 + 1;
                            if (i21 != str.length()) {
                                char cCharAt4 = str.charAt(i21);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i18 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i22 = i18 + 3;
                                    bArr[i18 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i18 += 4;
                                    bArr[i22] = (byte) ((codePoint & 63) | 128);
                                    i17 = i21;
                                } else {
                                    i17 = i21;
                                }
                            }
                            throw new p1(i17 - 1, length);
                        }
                        bArr[i18] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i23 = i18 + 2;
                        bArr[i18 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i18 += 3;
                        bArr[i23] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i17++;
                }
                return i18;
            default:
                long j13 = i11;
                long j14 = ((long) i12) + j13;
                int length2 = str.length();
                if (length2 > i12 || bArr.length - i12 < i11) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i11 + i12));
                }
                int i24 = 0;
                while (true) {
                    j9 = 1;
                    c3 = 128;
                    if (i24 < length2 && (cCharAt2 = str.charAt(i24)) < 128) {
                        n1.j(bArr, (byte) cCharAt2, j13);
                        i24++;
                        j13 = 1 + j13;
                    }
                }
                if (i24 == length2) {
                    return (int) j13;
                }
                while (i24 < length2) {
                    char cCharAt5 = str.charAt(i24);
                    if (cCharAt5 < c3 && j13 < j14) {
                        n1.j(bArr, (byte) cCharAt5, j13);
                        c7 = c3;
                        j11 = j9;
                        j12 = j13 + j9;
                    } else if (cCharAt5 >= 2048 || j13 > j14 - 2) {
                        j11 = j9;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j13 > j14 - 3) {
                            long j15 = j13;
                            if (j15 > j14 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i15 = i24 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i15)))) {
                                    throw new p1(i24, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j15);
                            }
                            int i25 = i24 + 1;
                            if (i25 != length2) {
                                char cCharAt6 = str.charAt(i25);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    n1.j(bArr, (byte) ((codePoint2 >>> 18) | 240), j15);
                                    c7 = 128;
                                    n1.j(bArr, (byte) (((codePoint2 >>> 12) & 63) | 128), j15 + j11);
                                    n1.j(bArr, (byte) (((codePoint2 >>> 6) & 63) | 128), j15 + 2);
                                    n1.j(bArr, (byte) ((codePoint2 & 63) | 128), j15 + 3);
                                    j12 = j15 + 4;
                                    i24 = i25;
                                } else {
                                    i24 = i25;
                                }
                            }
                            throw new p1(i24 - 1, length2);
                        }
                        n1.j(bArr, (byte) ((cCharAt5 >>> '\f') | 480), j13);
                        long j16 = j13;
                        n1.j(bArr, (byte) (((cCharAt5 >>> 6) & 63) | 128), j13 + j11);
                        j12 = j16 + 3;
                        n1.j(bArr, (byte) ((cCharAt5 & '?') | 128), j16 + 2);
                        c7 = 128;
                    } else {
                        j11 = j9;
                        n1.j(bArr, (byte) ((cCharAt5 >>> 6) | 960), j13);
                        n1.j(bArr, (byte) ((cCharAt5 & '?') | c3), j13 + j11);
                        j12 = j13 + 2;
                        c7 = c3;
                    }
                    i24++;
                    c3 = c7;
                    j13 = j12;
                    j9 = j11;
                }
                return (int) j13;
        }
    }
}
