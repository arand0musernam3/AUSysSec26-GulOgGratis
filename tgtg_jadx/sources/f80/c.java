package f80;

import com.braze.h2;
import j4.s;
import kotlin.collections.f;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f17515f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f17516g = {13, 10};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f17517h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f17521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17522e;

    static {
        b bVar = b.PRESENT;
        f17517h = new c(true, false, -1, bVar);
        new c(false, true, 76, bVar);
        new c(false, true, 64, bVar);
    }

    public c(boolean z11, boolean z12, int i11, b bVar) {
        this.f17518a = z11;
        this.f17519b = z12;
        this.f17520c = i11;
        this.f17521d = bVar;
        if (z11 && z12) {
            i4.a.f("Failed requirement.");
            throw null;
        }
        this.f17522e = i11 / 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e3, code lost:
    
        if (r3 == (-8)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e5, code lost:
    
        if (r0 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e9, code lost:
    
        if (r5 == f80.b.PRESENT) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ec, code lost:
    
        i4.a.f("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f3, code lost:
    
        if (r16 != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f5, code lost:
    
        if (r6 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f8, code lost:
    
        if (r15 >= r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0202, code lost:
    
        if (f80.d.f17524b[r1[r15] & 255] == (-1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0205, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0208, code lost:
    
        if (r15 < r2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020a, code lost:
    
        if (r4 != r12) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020c, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020d, code lost:
    
        com.braze.h2.b("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0214, code lost:
    
        r0 = r1[r15] & 255;
        r2 = (char) r0;
        r0 = java.lang.Integer.toString(r0, kotlin.text.CharsKt.checkRadix(8));
        r0.getClass();
        r3 = new java.lang.StringBuilder("Symbol '");
        r3.append(r2);
        r3.append("'(");
        r3.append(r0);
        r3.append(") at index ");
        r3.append(r15 - 1);
        r3.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0249, code lost:
    
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024a, code lost:
    
        i4.a.f("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0251, code lost:
    
        i4.a.f("The last unit of input does not have enough bits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e0, code lost:
    
        if (r3 == r11) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(f80.a r20, java.lang.CharSequence r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f80.c.a(f80.a, java.lang.CharSequence, int, int):byte[]");
    }

    public static String b(c cVar, byte[] bArr) {
        int i11;
        int length = bArr.length;
        cVar.getClass();
        b bVar = cVar.f17521d;
        bArr.getClass();
        int length2 = bArr.length;
        kotlin.collections.c cVar2 = f.f26505a;
        cVar2.getClass();
        kotlin.collections.c.a(0, length, length2);
        int iC = cVar.c(length);
        byte[] bArr2 = new byte[iC];
        int length3 = bArr.length;
        cVar2.getClass();
        kotlin.collections.c.a(0, length, length3);
        int iC2 = cVar.c(length);
        if (iC < 0) {
            org.bouncycastle.jce.provider.a.v(s.f(iC, "destination offset: 0, destination size: "));
            return null;
        }
        if (iC2 < 0 || iC2 > iC) {
            org.bouncycastle.jce.provider.a.v(k.k("The destination array does not have enough capacity, destination offset: 0, destination size: ", iC, iC2, ", capacity needed: "));
            return null;
        }
        byte[] bArr3 = cVar.f17518a ? d.f17525c : d.f17523a;
        int i12 = cVar.f17519b ? cVar.f17522e : Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i11 = i13 + 2;
            if (i11 >= length) {
                break;
            }
            int iMin = Math.min((length - i13) / 3, i12);
            for (int i15 = 0; i15 < iMin; i15++) {
                int i16 = bArr[i13] & 255;
                int i17 = i13 + 2;
                int i18 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i19 = (i18 << 8) | (i16 << 16) | (bArr[i17] & 255);
                bArr2[i14] = bArr3[i19 >>> 18];
                bArr2[i14 + 1] = bArr3[(i19 >>> 12) & 63];
                int i21 = i14 + 3;
                bArr2[i14 + 2] = bArr3[(i19 >>> 6) & 63];
                i14 += 4;
                bArr2[i21] = bArr3[i19 & 63];
            }
            if (iMin == i12 && i13 != length) {
                int i22 = i14 + 1;
                byte[] bArr4 = f17516g;
                bArr2[i14] = bArr4[0];
                i14 += 2;
                bArr2[i22] = bArr4[1];
            }
        }
        int i23 = length - i13;
        if (i23 == 1) {
            int i24 = i13 + 1;
            int i25 = (bArr[i13] & 255) << 4;
            bArr2[i14] = bArr3[i25 >>> 6];
            int i26 = i14 + 2;
            bArr2[i14 + 1] = bArr3[i25 & 63];
            if (bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL) {
                bArr2[i26] = 61;
                bArr2[i14 + 3] = 61;
            }
            i13 = i24;
        } else if (i23 == 2) {
            int i27 = ((bArr[i13 + 1] & 255) << 2) | ((bArr[i13] & 255) << 10);
            bArr2[i14] = bArr3[i27 >>> 12];
            int i28 = i14 + 2;
            bArr2[i14 + 1] = bArr3[(i27 >>> 6) & 63];
            int i29 = i14 + 3;
            bArr2[i28] = bArr3[i27 & 63];
            if (bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL) {
                bArr2[i29] = 61;
            }
            i13 = i11;
        }
        if (i13 == length) {
            return new String(bArr2, Charsets.f26581e);
        }
        h2.b("Check failed.");
        return null;
    }

    public final int c(int i11) {
        int i12 = i11 / 3;
        int i13 = i11 % 3;
        int i14 = 4;
        int i15 = i12 * 4;
        if (i13 != 0) {
            b bVar = b.PRESENT;
            b bVar2 = this.f17521d;
            if (bVar2 != bVar && bVar2 != b.PRESENT_OPTIONAL) {
                i14 = i13 + 1;
            }
            i15 += i14;
        }
        if (i15 < 0) {
            i4.a.f("Input is too big");
            return 0;
        }
        if (this.f17519b) {
            i15 += ((i15 - 1) / this.f17520c) * 2;
        }
        if (i15 >= 0) {
            return i15;
        }
        i4.a.f("Input is too big");
        return 0;
    }
}
