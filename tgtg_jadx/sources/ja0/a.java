package ja0;

import ia0.e0;
import java.io.EOFException;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f24792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f24793b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        f24792a = bytes;
        f24793b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, LongCompanionObject.MAX_VALUE};
    }

    public static final long a(ia0.g gVar, ia0.j jVar, long j9, long j11, int i11) {
        e0 e0Var;
        byte[] bArr;
        long j12 = j9;
        long j13 = j11;
        jVar.getClass();
        long j14 = i11;
        ia0.b.e(jVar.e(), 0, j14);
        if (i11 <= 0) {
            i4.a.f("byteCount == 0");
            return 0L;
        }
        long j15 = 0;
        if (j12 < 0) {
            i4.a.i(e0.f.i(j12, "fromIndex < 0: "));
            return 0L;
        }
        if (j12 > j13) {
            StringBuilder sbG = l1.g("fromIndex > toIndex: ", j12, " > ");
            sbG.append(j13);
            throw new IllegalArgumentException(sbG.toString().toString());
        }
        long j16 = gVar.f23643b;
        if (j13 > j16) {
            j13 = j16;
        }
        if (j12 == j13 || (e0Var = gVar.f23642a) == null) {
            return -1L;
        }
        if (j16 - j12 >= j12) {
            while (true) {
                long j17 = ((long) (e0Var.f23627c - e0Var.f23626b)) + j15;
                if (j17 > j12) {
                    break;
                }
                e0Var = e0Var.f23630f;
                e0Var.getClass();
                j15 = j17;
            }
            byte[] bArrI = jVar.i();
            byte b8 = bArrI[0];
            long jMin = Math.min(j13, (gVar.f23643b - j14) + 1);
            long j18 = j15;
            while (j18 < jMin) {
                byte[] bArr2 = e0Var.f23625a;
                int iMin = (int) Math.min(e0Var.f23627c, (((long) e0Var.f23626b) + jMin) - j18);
                for (int i12 = (int) ((((long) e0Var.f23626b) + j12) - j18); i12 < iMin; i12++) {
                    if (bArr2[i12] == b8 && b(e0Var, i12 + 1, bArrI, 1, i11)) {
                        return ((long) (i12 - e0Var.f23626b)) + j18;
                    }
                }
                j18 += (long) (e0Var.f23627c - e0Var.f23626b);
                e0Var = e0Var.f23630f;
                e0Var.getClass();
                j12 = j18;
            }
            return -1L;
        }
        while (j16 > j12) {
            e0Var = e0Var.f23631g;
            e0Var.getClass();
            j16 -= (long) (e0Var.f23627c - e0Var.f23626b);
        }
        byte[] bArrI2 = jVar.i();
        byte b11 = bArrI2[0];
        byte[] bArr3 = bArrI2;
        long jMin2 = Math.min(j13, (gVar.f23643b - j14) + 1);
        while (j16 < jMin2) {
            byte[] bArr4 = e0Var.f23625a;
            int iMin2 = (int) Math.min(e0Var.f23627c, (((long) e0Var.f23626b) + jMin2) - j16);
            int i13 = (int) ((((long) e0Var.f23626b) + j12) - j16);
            while (i13 < iMin2) {
                if (bArr4[i13] == b11) {
                    bArr = bArr3;
                    if (b(e0Var, i13 + 1, bArr, 1, i11)) {
                        return ((long) (i13 - e0Var.f23626b)) + j16;
                    }
                } else {
                    bArr = bArr3;
                }
                i13++;
                bArr3 = bArr;
            }
            j16 += (long) (e0Var.f23627c - e0Var.f23626b);
            e0Var = e0Var.f23630f;
            e0Var.getClass();
            j12 = j16;
        }
        return -1L;
    }

    public static final boolean b(e0 e0Var, int i11, byte[] bArr, int i12, int i13) {
        int i14 = e0Var.f23627c;
        byte[] bArr2 = e0Var.f23625a;
        while (i12 < i13) {
            if (i11 == i14) {
                e0Var = e0Var.f23630f;
                e0Var.getClass();
                byte[] bArr3 = e0Var.f23625a;
                bArr2 = bArr3;
                i11 = e0Var.f23626b;
                i14 = e0Var.f23627c;
            }
            if (bArr2[i11] != bArr[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static final String c(ia0.g gVar, long j9) throws EOFException {
        if (j9 > 0) {
            long j11 = j9 - 1;
            if (gVar.G(j11) == 13) {
                String strA0 = gVar.a0(j11, Charsets.UTF_8);
                gVar.skip(2L);
                return strA0;
            }
        }
        String strA02 = gVar.a0(j9, Charsets.UTF_8);
        gVar.skip(1L);
        return strA02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(ia0.g r16, ia0.y r17, boolean r18) {
        /*
            r17.getClass()
            r0 = r16
            ia0.e0 r0 = r0.f23642a
            r1 = -1
            if (r0 != 0) goto Le
            if (r18 == 0) goto Ld
            goto L5c
        Ld:
            return r1
        Le:
            byte[] r2 = r0.f23625a
            int r3 = r0.f23626b
            int r4 = r0.f23627c
            r5 = r17
            int[] r5 = r5.f23689c
            r6 = 0
            r8 = r0
            r9 = r1
            r7 = r6
        L1c:
            int r10 = r7 + 1
            r11 = r5[r7]
            int r7 = r7 + 2
            r10 = r5[r10]
            if (r10 == r1) goto L27
            r9 = r10
        L27:
            if (r8 != 0) goto L2a
            goto L5a
        L2a:
            r10 = 0
            if (r11 >= 0) goto L72
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L31:
            int r11 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r5[r7]
            if (r3 == r7) goto L3e
            goto L7c
        L3e:
            if (r13 != r12) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = r6
        L43:
            if (r11 != r4) goto L62
            r8.getClass()
            ia0.e0 r2 = r8.f23630f
            r2.getClass()
            int r4 = r2.f23626b
            byte[] r7 = r2.f23625a
            int r8 = r2.f23627c
            if (r2 != r0) goto L5e
            if (r3 == 0) goto L5a
            r2 = r7
            r7 = r10
            goto L65
        L5a:
            if (r18 == 0) goto L7c
        L5c:
            r0 = -2
            return r0
        L5e:
            r15 = r7
            r7 = r2
            r2 = r15
            goto L65
        L62:
            r7 = r8
            r8 = r4
            r4 = r11
        L65:
            if (r3 == 0) goto L6d
            r3 = r5[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto L9e
        L6d:
            r3 = r4
            r4 = r8
            r8 = r7
            r7 = r13
            goto L31
        L72:
            int r12 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L7a:
            if (r7 != r13) goto L7d
        L7c:
            return r9
        L7d:
            r14 = r5[r7]
            if (r3 != r14) goto La8
            int r7 = r7 + r11
            r3 = r5[r7]
            if (r12 != r4) goto L9c
            ia0.e0 r8 = r8.f23630f
            r8.getClass()
            int r2 = r8.f23626b
            byte[] r4 = r8.f23625a
            int r7 = r8.f23627c
            if (r8 != r0) goto L98
            r8 = r4
            r4 = r2
            r2 = r8
            r8 = r10
            goto L9e
        L98:
            r15 = r4
            r4 = r2
            r2 = r15
            goto L9e
        L9c:
            r7 = r4
            r4 = r12
        L9e:
            if (r3 < 0) goto La1
            return r3
        La1:
            int r3 = -r3
            r15 = r7
            r7 = r3
            r3 = r4
            r4 = r15
            goto L1c
        La8:
            int r7 = r7 + 1
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: ja0.a.d(ia0.g, ia0.y, boolean):int");
    }
}
