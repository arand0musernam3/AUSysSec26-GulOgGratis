package ia0;

import com.braze.h2;
import com.google.android.gms.internal.measurement.ib;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f23642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23643b;

    public final void A(g gVar, long j9, long j11) {
        gVar.getClass();
        long j12 = j9;
        b.e(this.f23643b, j12, j11);
        if (j11 == 0) {
            return;
        }
        gVar.f23643b += j11;
        e0 e0Var = this.f23642a;
        while (true) {
            e0Var.getClass();
            long j13 = e0Var.f23627c - e0Var.f23626b;
            if (j12 < j13) {
                break;
            }
            j12 -= j13;
            e0Var = e0Var.f23630f;
        }
        e0 e0Var2 = e0Var;
        long j14 = j11;
        while (j14 > 0) {
            e0Var2.getClass();
            e0 e0VarC = e0Var2.c();
            int i11 = e0VarC.f23626b + ((int) j12);
            e0VarC.f23626b = i11;
            e0VarC.f23627c = Math.min(i11 + ((int) j14), e0VarC.f23627c);
            e0 e0Var3 = gVar.f23642a;
            if (e0Var3 == null) {
                e0VarC.f23631g = e0VarC;
                e0VarC.f23630f = e0VarC;
                gVar.f23642a = e0VarC;
            } else {
                e0 e0Var4 = e0Var3.f23631g;
                e0Var4.getClass();
                e0Var4.b(e0VarC);
            }
            j14 -= (long) (e0VarC.f23627c - e0VarC.f23626b);
            e0Var2 = e0Var2.f23630f;
            j12 = 0;
        }
    }

    public final void A0(long j9) {
        boolean z11;
        if (j9 == 0) {
            z0(48);
            return;
        }
        if (j9 < 0) {
            j9 = -j9;
            if (j9 < 0) {
                F0("-9223372036854775808");
                return;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        byte[] bArr = ja0.a.f24792a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j9)) * 10) >>> 5;
        int i11 = iNumberOfLeadingZeros + (j9 > ja0.a.f24793b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z11) {
            i11++;
        }
        e0 e0VarX0 = x0(i11);
        byte[] bArr2 = e0VarX0.f23625a;
        int i12 = e0VarX0.f23627c + i11;
        while (j9 != 0) {
            long j11 = 10;
            i12--;
            bArr2[i12] = ja0.a.f24792a[(int) (j9 % j11)];
            j9 /= j11;
        }
        if (z11) {
            bArr2[i12 - 1] = 45;
        }
        e0VarX0.f23627c += i11;
        this.f23643b += (long) i11;
    }

    public final boolean B() {
        return this.f23643b == 0;
    }

    public final void B0(long j9) {
        if (j9 == 0) {
            z0(48);
            return;
        }
        long j11 = (j9 >>> 1) | j9;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j21 = j19 + (j19 >>> 8);
        long j22 = j21 + (j21 >>> 16);
        int i11 = (int) ((((j22 & 63) + ((j22 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        e0 e0VarX0 = x0(i11);
        byte[] bArr = e0VarX0.f23625a;
        int i12 = e0VarX0.f23627c;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            bArr[i13] = ja0.a.f24792a[(int) (15 & j9)];
            j9 >>>= 4;
        }
        e0VarX0.f23627c += i11;
        this.f23643b += (long) i11;
    }

    public final void C0(int i11) {
        e0 e0VarX0 = x0(4);
        byte[] bArr = e0VarX0.f23625a;
        int i12 = e0VarX0.f23627c;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        e0VarX0.f23627c = i12 + 4;
        this.f23643b += 4;
    }

    @Override // ia0.i
    public final String D(long j9) throws EOFException {
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "limit < 0: "));
            return null;
        }
        long j11 = LongCompanionObject.MAX_VALUE;
        if (j9 != LongCompanionObject.MAX_VALUE) {
            j11 = j9 + 1;
        }
        long j12 = j11;
        long jY = y((byte) 10, 0L, j12);
        if (jY != -1) {
            return ja0.a.c(this, jY);
        }
        if (j12 < this.f23643b && G(j12 - 1) == 13 && G(j12) == 10) {
            return ja0.a.c(this, j12);
        }
        g gVar = new g();
        A(gVar, 0L, Math.min(32, this.f23643b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f23643b, j9) + " content=" + gVar.q(gVar.f23643b).f() + (char) 8230);
    }

    public final void D0(int i11) {
        e0 e0VarX0 = x0(2);
        byte[] bArr = e0VarX0.f23625a;
        int i12 = e0VarX0.f23627c;
        bArr[i12] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 1] = (byte) (i11 & 255);
        e0VarX0.f23627c = i12 + 2;
        this.f23643b += 2;
    }

    public final void E0(int i11, int i12, String str) {
        char cCharAt;
        str.getClass();
        if (i11 < 0) {
            i4.a.i(j4.s.f(i11, "beginIndex < 0: "));
            return;
        }
        if (i12 < i11) {
            i4.a.i(r8.k.k("endIndex < beginIndex: ", i12, i11, " < "));
            return;
        }
        if (i12 > str.length()) {
            i4.a.c(str.length(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "endIndex > string.length: ", " > "));
            return;
        }
        while (i11 < i12) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 128) {
                e0 e0VarX0 = x0(1);
                byte[] bArr = e0VarX0.f23625a;
                int i13 = e0VarX0.f23627c - i11;
                int iMin = Math.min(i12, 8192 - i13);
                int i14 = i11 + 1;
                bArr[i11 + i13] = (byte) cCharAt2;
                while (true) {
                    i11 = i14;
                    if (i11 >= iMin || (cCharAt = str.charAt(i11)) >= 128) {
                        break;
                    }
                    i14 = i11 + 1;
                    bArr[i11 + i13] = (byte) cCharAt;
                }
                int i15 = e0VarX0.f23627c;
                int i16 = (i13 + i11) - i15;
                e0VarX0.f23627c = i15 + i16;
                this.f23643b += (long) i16;
            } else {
                if (cCharAt2 < 2048) {
                    e0 e0VarX02 = x0(2);
                    byte[] bArr2 = e0VarX02.f23625a;
                    int i17 = e0VarX02.f23627c;
                    bArr2[i17] = (byte) ((cCharAt2 >> 6) | BERTags.PRIVATE);
                    bArr2[i17 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    e0VarX02.f23627c = i17 + 2;
                    this.f23643b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    e0 e0VarX03 = x0(3);
                    byte[] bArr3 = e0VarX03.f23625a;
                    int i18 = e0VarX03.f23627c;
                    bArr3[i18] = (byte) ((cCharAt2 >> '\f') | BERTags.FLAGS);
                    bArr3[i18 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i18 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    e0VarX03.f23627c = i18 + 3;
                    this.f23643b += 3;
                } else {
                    int i19 = i11 + 1;
                    char cCharAt3 = i19 < i12 ? str.charAt(i19) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        z0(63);
                        i11 = i19;
                    } else {
                        int i21 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        e0 e0VarX04 = x0(4);
                        byte[] bArr4 = e0VarX04.f23625a;
                        int i22 = e0VarX04.f23627c;
                        bArr4[i22] = (byte) ((i21 >> 18) | 240);
                        bArr4[i22 + 1] = (byte) (((i21 >> 12) & 63) | 128);
                        bArr4[i22 + 2] = (byte) (((i21 >> 6) & 63) | 128);
                        bArr4[i22 + 3] = (byte) ((i21 & 63) | 128);
                        e0VarX04.f23627c = i22 + 4;
                        this.f23643b += 4;
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
    }

    @Override // ia0.j0
    public final long F(g gVar, long j9) {
        gVar.getClass();
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        long j11 = this.f23643b;
        if (j11 == 0) {
            return -1L;
        }
        if (j9 > j11) {
            j9 = j11;
        }
        gVar.x(this, j9);
        return j9;
    }

    public final void F0(String str) {
        str.getClass();
        E0(0, str.length(), str);
    }

    public final byte G(long j9) {
        b.e(this.f23643b, j9, 1L);
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        long j11 = this.f23643b;
        if (j11 - j9 < j9) {
            while (j11 > j9) {
                e0Var = e0Var.f23631g;
                e0Var.getClass();
                j11 -= (long) (e0Var.f23627c - e0Var.f23626b);
            }
            return e0Var.f23625a[(int) ((((long) e0Var.f23626b) + j9) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i11 = e0Var.f23627c;
            int i12 = e0Var.f23626b;
            long j13 = ((long) (i11 - i12)) + j12;
            if (j13 > j9) {
                return e0Var.f23625a[(int) ((((long) i12) + j9) - j12)];
            }
            e0Var = e0Var.f23630f;
            e0Var.getClass();
            j12 = j13;
        }
    }

    public final void G0(int i11) {
        if (i11 < 128) {
            z0(i11);
            return;
        }
        if (i11 < 2048) {
            e0 e0VarX0 = x0(2);
            byte[] bArr = e0VarX0.f23625a;
            int i12 = e0VarX0.f23627c;
            bArr[i12] = (byte) ((i11 >> 6) | BERTags.PRIVATE);
            bArr[i12 + 1] = (byte) ((i11 & 63) | 128);
            e0VarX0.f23627c = i12 + 2;
            this.f23643b += 2;
            return;
        }
        if (55296 <= i11 && i11 < 57344) {
            z0(63);
            return;
        }
        if (i11 < 65536) {
            e0 e0VarX02 = x0(3);
            byte[] bArr2 = e0VarX02.f23625a;
            int i13 = e0VarX02.f23627c;
            bArr2[i13] = (byte) ((i11 >> 12) | BERTags.FLAGS);
            bArr2[i13 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i11 & 63) | 128);
            e0VarX02.f23627c = i13 + 3;
            this.f23643b += 3;
            return;
        }
        if (i11 > 1114111) {
            i4.a.f("Unexpected code point: 0x".concat(b.i(i11)));
            return;
        }
        e0 e0VarX03 = x0(4);
        byte[] bArr3 = e0VarX03.f23625a;
        int i14 = e0VarX03.f23627c;
        bArr3[i14] = (byte) ((i11 >> 18) | 240);
        bArr3[i14 + 1] = (byte) (((i11 >> 12) & 63) | 128);
        bArr3[i14 + 2] = (byte) (((i11 >> 6) & 63) | 128);
        bArr3[i14 + 3] = (byte) ((i11 & 63) | 128);
        e0VarX03.f23627c = i14 + 4;
        this.f23643b += 4;
    }

    public final long H(long j9, j jVar) {
        jVar.getClass();
        long j11 = 0;
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "fromIndex < 0: "));
            return 0L;
        }
        e0 e0Var = this.f23642a;
        if (e0Var == null) {
            return -1L;
        }
        long j12 = this.f23643b;
        if (j12 - j9 < j9) {
            while (j12 > j9) {
                e0Var = e0Var.f23631g;
                e0Var.getClass();
                j12 -= (long) (e0Var.f23627c - e0Var.f23626b);
            }
            if (jVar.e() == 2) {
                byte bJ = jVar.j(0);
                byte bJ2 = jVar.j(1);
                while (j12 < this.f23643b) {
                    byte[] bArr = e0Var.f23625a;
                    int i11 = e0Var.f23627c;
                    for (int i12 = (int) ((((long) e0Var.f23626b) + j9) - j12); i12 < i11; i12++) {
                        byte b8 = bArr[i12];
                        if (b8 == bJ || b8 == bJ2) {
                            return ((long) (i12 - e0Var.f23626b)) + j12;
                        }
                    }
                    j12 += (long) (e0Var.f23627c - e0Var.f23626b);
                    e0Var = e0Var.f23630f;
                    e0Var.getClass();
                    j9 = j12;
                }
            } else {
                byte[] bArrI = jVar.i();
                while (j12 < this.f23643b) {
                    byte[] bArr2 = e0Var.f23625a;
                    int i13 = e0Var.f23627c;
                    for (int i14 = (int) ((((long) e0Var.f23626b) + j9) - j12); i14 < i13; i14++) {
                        byte b11 = bArr2[i14];
                        for (byte b12 : bArrI) {
                            if (b11 == b12) {
                                return ((long) (i14 - e0Var.f23626b)) + j12;
                            }
                        }
                    }
                    j12 += (long) (e0Var.f23627c - e0Var.f23626b);
                    e0Var = e0Var.f23630f;
                    e0Var.getClass();
                    j9 = j12;
                }
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (e0Var.f23627c - e0Var.f23626b)) + j11;
            if (j13 > j9) {
                break;
            }
            e0Var = e0Var.f23630f;
            e0Var.getClass();
            j11 = j13;
        }
        if (jVar.e() == 2) {
            byte bJ3 = jVar.j(0);
            byte bJ4 = jVar.j(1);
            while (j11 < this.f23643b) {
                byte[] bArr3 = e0Var.f23625a;
                int i15 = e0Var.f23627c;
                for (int i16 = (int) ((((long) e0Var.f23626b) + j9) - j11); i16 < i15; i16++) {
                    byte b13 = bArr3[i16];
                    if (b13 == bJ3 || b13 == bJ4) {
                        return ((long) (i16 - e0Var.f23626b)) + j11;
                    }
                }
                j11 += (long) (e0Var.f23627c - e0Var.f23626b);
                e0Var = e0Var.f23630f;
                e0Var.getClass();
                j9 = j11;
            }
        } else {
            byte[] bArrI2 = jVar.i();
            while (j11 < this.f23643b) {
                byte[] bArr4 = e0Var.f23625a;
                int i17 = e0Var.f23627c;
                for (int i18 = (int) ((((long) e0Var.f23626b) + j9) - j11); i18 < i17; i18++) {
                    byte b14 = bArr4[i18];
                    for (byte b15 : bArrI2) {
                        if (b14 == b15) {
                            return ((long) (i18 - e0Var.f23626b)) + j11;
                        }
                    }
                }
                j11 += (long) (e0Var.f23627c - e0Var.f23626b);
                e0Var = e0Var.f23630f;
                e0Var.getClass();
                j9 = j11;
            }
        }
        return -1L;
    }

    public final long I(j jVar) {
        jVar.getClass();
        return H(0L, jVar);
    }

    public final boolean J(int i11, long j9, j jVar) {
        jVar.getClass();
        if (i11 >= 0 && j9 >= 0 && ((long) i11) + j9 <= this.f23643b && i11 <= jVar.e()) {
            return i11 == 0 || ja0.a.a(this, jVar, j9, j9 + 1, i11) != -1;
        }
        return false;
    }

    public final f L(f fVar) {
        fVar.getClass();
        byte[] bArr = ja0.a.f24792a;
        fVar.getClass();
        if (fVar == b.f23604a) {
            fVar = new f();
        }
        if (fVar.f23632a != null) {
            h2.b("already attached to a buffer");
            return null;
        }
        fVar.f23632a = this;
        fVar.f23633b = true;
        return fVar;
    }

    @Override // ia0.h
    public final /* bridge */ /* synthetic */ h M(String str) {
        F0(str);
        return this;
    }

    public final byte[] O(long j9) throws EOFException {
        if (j9 < 0 || j9 > 2147483647L) {
            i4.a.i(e0.f.i(j9, "byteCount: "));
            return null;
        }
        if (this.f23643b < j9) {
            i4.a.b();
            return null;
        }
        byte[] bArr = new byte[(int) j9];
        readFully(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r1 = new ia0.g();
        r1.A0(r8);
        r1.z0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.g0()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Q() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.g.Q():long");
    }

    @Override // ia0.i
    public final String R(Charset charset) {
        charset.getClass();
        return a0(this.f23643b, charset);
    }

    @Override // ia0.i
    public final int U(y yVar) throws EOFException {
        yVar.getClass();
        int iD = ja0.a.d(this, yVar, false);
        if (iD == -1) {
            return -1;
        }
        skip(yVar.f23688b[iD].e());
        return iD;
    }

    @Override // ia0.i
    public final boolean X(long j9, j jVar) {
        jVar.getClass();
        return J(jVar.e(), j9, jVar);
    }

    public final short Z() throws EOFException {
        short s7 = readShort();
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >>> 8));
    }

    public final void a() throws EOFException {
        skip(this.f23643b);
    }

    public final String a0(long j9, Charset charset) throws EOFException {
        charset.getClass();
        if (j9 < 0 || j9 > 2147483647L) {
            i4.a.i(e0.f.i(j9, "byteCount: "));
            return null;
        }
        if (this.f23643b < j9) {
            i4.a.b();
            return null;
        }
        if (j9 == 0) {
            return "";
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        int i11 = e0Var.f23626b;
        if (((long) i11) + j9 > e0Var.f23627c) {
            return new String(O(j9), charset);
        }
        int i12 = (int) j9;
        String str = new String(e0Var.f23625a, i11, i12, charset);
        int i13 = e0Var.f23626b + i12;
        e0Var.f23626b = i13;
        this.f23643b -= j9;
        if (i13 == e0Var.f23627c) {
            this.f23642a = e0Var.a();
            f0.a(e0Var);
        }
        return str;
    }

    @Override // ia0.h
    public final long b0(j0 j0Var) {
        j0Var.getClass();
        long j9 = 0;
        while (true) {
            long jF = j0Var.F(this, 8192L);
            if (jF == -1) {
                return j9;
            }
            j9 += jF;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        long j9 = this.f23643b;
        g gVar = (g) obj;
        if (j9 != gVar.f23643b) {
            return false;
        }
        if (j9 == 0) {
            return true;
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        e0 e0Var2 = gVar.f23642a;
        e0Var2.getClass();
        int i11 = e0Var.f23626b;
        int i12 = e0Var2.f23626b;
        long j11 = 0;
        while (j11 < this.f23643b) {
            long jMin = Math.min(e0Var.f23627c - i11, e0Var2.f23627c - i12);
            long j12 = 0;
            while (j12 < jMin) {
                int i13 = i11 + 1;
                int i14 = i12 + 1;
                if (e0Var.f23625a[i11] != e0Var2.f23625a[i12]) {
                    return false;
                }
                j12++;
                i11 = i13;
                i12 = i14;
            }
            if (i11 == e0Var.f23627c) {
                e0Var = e0Var.f23630f;
                e0Var.getClass();
                i11 = e0Var.f23626b;
            }
            if (i12 == e0Var2.f23627c) {
                e0Var2 = e0Var2.f23630f;
                e0Var2.getClass();
                i12 = e0Var2.f23626b;
            }
            j11 += jMin;
        }
        return true;
    }

    public final String g0() {
        return a0(this.f23643b, Charsets.UTF_8);
    }

    public final int hashCode() {
        e0 e0Var = this.f23642a;
        if (e0Var == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = e0Var.f23627c;
            for (int i13 = e0Var.f23626b; i13 < i12; i13++) {
                i11 = (i11 * 31) + e0Var.f23625a[i13];
            }
            e0Var = e0Var.f23630f;
            e0Var.getClass();
        } while (e0Var != this.f23642a);
        return i11;
    }

    @Override // ia0.j0
    public final l0 i() {
        return l0.f23657d;
    }

    public final int i0() {
        int i11;
        int i12;
        int i13;
        if (this.f23643b == 0) {
            i4.a.b();
            return 0;
        }
        byte bG = G(0L);
        if ((bG & ByteCompanionObject.MIN_VALUE) == 0) {
            i11 = bG & ByteCompanionObject.MAX_VALUE;
            i13 = 0;
            i12 = 1;
        } else if ((bG & 224) == 192) {
            i11 = bG & 31;
            i12 = 2;
            i13 = 128;
        } else if ((bG & 240) == 224) {
            i11 = bG & 15;
            i12 = 3;
            i13 = NewHope.SENDB_BYTES;
        } else {
            if ((bG & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i11 = bG & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j9 = i12;
        if (this.f23643b < j9) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "size < ", ": ");
            sbK.append(this.f23643b);
            sbK.append(" (to read code point prefixed 0x");
            sbK.append(b.h(bG));
            sbK.append(')');
            throw new EOFException(sbK.toString());
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j11 = i14;
            byte bG2 = G(j11);
            if ((bG2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i11 = (i11 << 6) | (bG2 & 63);
        }
        skip(j9);
        if (i11 > 1114111) {
            return 65533;
        }
        if ((55296 > i11 || i11 >= 57344) && i11 >= i13) {
            return i11;
        }
        return 65533;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // ia0.i
    public final long j0(h hVar) {
        long j9 = this.f23643b;
        if (j9 > 0) {
            hVar.x(this, j9);
        }
        return j9;
    }

    @Override // ia0.i
    public final void l0(g gVar, long j9) throws EOFException {
        long j11 = this.f23643b;
        if (j11 >= j9) {
            gVar.x(this, j9);
        } else {
            gVar.x(this, j11);
            i4.a.b();
        }
    }

    @Override // ia0.h
    public final /* bridge */ /* synthetic */ h n0(int i11, int i12, byte[] bArr) {
        write(bArr, i11, i12);
        return this;
    }

    @Override // ia0.h
    public final /* bridge */ /* synthetic */ h o0(j jVar) {
        y0(jVar);
        return this;
    }

    @Override // ia0.i
    public final j q(long j9) throws EOFException {
        if (j9 < 0 || j9 > 2147483647L) {
            i4.a.i(e0.f.i(j9, "byteCount: "));
            return null;
        }
        if (this.f23643b < j9) {
            i4.a.b();
            return null;
        }
        if (j9 < 4096) {
            return new j(O(j9));
        }
        j jVarU0 = u0((int) j9);
        skip(j9);
        return jVarU0;
    }

    @Override // ia0.i
    public final void r0(long j9) throws EOFException {
        if (this.f23643b >= j9) {
            return;
        }
        i4.a.b();
    }

    public final int read(byte[] bArr, int i11, int i12) {
        bArr.getClass();
        b.e(bArr.length, i11, i12);
        e0 e0Var = this.f23642a;
        if (e0Var == null) {
            return -1;
        }
        int iMin = Math.min(i12, e0Var.f23627c - e0Var.f23626b);
        byte[] bArr2 = e0Var.f23625a;
        int i13 = e0Var.f23626b;
        kotlin.collections.x.e(i11, bArr2, i13, bArr, i13 + iMin);
        int i14 = e0Var.f23626b + iMin;
        e0Var.f23626b = i14;
        this.f23643b -= (long) iMin;
        if (i14 == e0Var.f23627c) {
            this.f23642a = e0Var.a();
            f0.a(e0Var);
        }
        return iMin;
    }

    @Override // ia0.i
    public final byte readByte() throws EOFException {
        if (this.f23643b == 0) {
            i4.a.b();
            return (byte) 0;
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        int i11 = e0Var.f23626b;
        int i12 = e0Var.f23627c;
        int i13 = i11 + 1;
        byte b8 = e0Var.f23625a[i11];
        this.f23643b--;
        if (i13 != i12) {
            e0Var.f23626b = i13;
            return b8;
        }
        this.f23642a = e0Var.a();
        f0.a(e0Var);
        return b8;
    }

    @Override // ia0.i
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = read(bArr, i11, bArr.length - i11);
            if (i12 == -1) {
                i4.a.b();
                return;
            }
            i11 += i12;
        }
    }

    @Override // ia0.i
    public final int readInt() throws EOFException {
        if (this.f23643b < 4) {
            i4.a.b();
            return 0;
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        int i11 = e0Var.f23626b;
        int i12 = e0Var.f23627c;
        if (i12 - i11 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = e0Var.f23625a;
        int i13 = i11 + 3;
        int i14 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
        int i15 = i11 + 4;
        int i16 = (bArr[i13] & 255) | i14;
        this.f23643b -= 4;
        if (i15 != i12) {
            e0Var.f23626b = i15;
            return i16;
        }
        this.f23642a = e0Var.a();
        f0.a(e0Var);
        return i16;
    }

    @Override // ia0.i
    public final long readLong() throws EOFException {
        if (this.f23643b < 8) {
            i4.a.b();
            return 0L;
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        int i11 = e0Var.f23626b;
        int i12 = e0Var.f23627c;
        if (i12 - i11 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = e0Var.f23625a;
        int i13 = i11 + 7;
        long j9 = ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
        int i14 = i11 + 8;
        long j11 = j9 | (((long) bArr[i13]) & 255);
        this.f23643b -= 8;
        if (i14 != i12) {
            e0Var.f23626b = i14;
            return j11;
        }
        this.f23642a = e0Var.a();
        f0.a(e0Var);
        return j11;
    }

    @Override // ia0.i
    public final short readShort() throws EOFException {
        if (this.f23643b < 2) {
            i4.a.b();
            return (short) 0;
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        int i11 = e0Var.f23626b;
        int i12 = e0Var.f23627c;
        if (i12 - i11 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = e0Var.f23625a;
        int i13 = i11 + 1;
        int i14 = (bArr[i11] & 255) << 8;
        int i15 = i11 + 2;
        int i16 = (bArr[i13] & 255) | i14;
        this.f23643b -= 2;
        if (i15 == i12) {
            this.f23642a = e0Var.a();
            f0.a(e0Var);
        } else {
            e0Var.f23626b = i15;
        }
        return (short) i16;
    }

    @Override // ia0.i
    public final boolean request(long j9) {
        return this.f23643b >= j9;
    }

    @Override // ia0.h
    public final /* bridge */ /* synthetic */ h s0(long j9) {
        A0(j9);
        return this;
    }

    @Override // ia0.i
    public final void skip(long j9) throws EOFException {
        while (j9 > 0) {
            e0 e0Var = this.f23642a;
            if (e0Var == null) {
                i4.a.b();
                return;
            }
            int iMin = (int) Math.min(j9, e0Var.f23627c - e0Var.f23626b);
            long j11 = iMin;
            this.f23643b -= j11;
            j9 -= j11;
            int i11 = e0Var.f23626b + iMin;
            e0Var.f23626b = i11;
            if (i11 == e0Var.f23627c) {
                this.f23642a = e0Var.a();
                f0.a(e0Var);
            }
        }
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        g gVar = new g();
        if (this.f23643b == 0) {
            return gVar;
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        e0 e0VarC = e0Var.c();
        gVar.f23642a = e0VarC;
        e0VarC.f23631g = e0VarC;
        e0VarC.f23630f = e0VarC;
        for (e0 e0Var2 = e0Var.f23630f; e0Var2 != e0Var; e0Var2 = e0Var2.f23630f) {
            e0 e0Var3 = e0VarC.f23631g;
            e0Var3.getClass();
            e0Var2.getClass();
            e0Var3.b(e0Var2.c());
        }
        gVar.f23643b = this.f23643b;
        return gVar;
    }

    public final String toString() {
        long j9 = this.f23643b;
        if (j9 <= 2147483647L) {
            return u0((int) j9).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f23643b).toString());
    }

    public final long u() {
        long j9 = this.f23643b;
        if (j9 == 0) {
            return 0L;
        }
        e0 e0Var = this.f23642a;
        e0Var.getClass();
        e0 e0Var2 = e0Var.f23631g;
        e0Var2.getClass();
        int i11 = e0Var2.f23627c;
        return (i11 >= 8192 || !e0Var2.f23629e) ? j9 : j9 - ((long) (i11 - e0Var2.f23626b));
    }

    public final j u0(int i11) {
        if (i11 == 0) {
            return j.f23646d;
        }
        b.e(this.f23643b, 0L, i11);
        e0 e0Var = this.f23642a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            e0Var.getClass();
            int i15 = e0Var.f23627c;
            int i16 = e0Var.f23626b;
            if (i15 == i16) {
                i4.a.d("s.limit == s.pos");
                return null;
            }
            i13 += i15 - i16;
            i14++;
            e0Var = e0Var.f23630f;
        }
        byte[][] bArr = new byte[i14][];
        int[] iArr = new int[i14 * 2];
        e0 e0Var2 = this.f23642a;
        int i17 = 0;
        while (i12 < i11) {
            e0Var2.getClass();
            bArr[i17] = e0Var2.f23625a;
            i12 += e0Var2.f23627c - e0Var2.f23626b;
            iArr[i17] = Math.min(i12, i11);
            iArr[i17 + i14] = e0Var2.f23626b;
            e0Var2.f23628d = true;
            i17++;
            e0Var2 = e0Var2.f23630f;
        }
        return new g0(bArr, iArr);
    }

    @Override // ia0.i
    public final byte[] v() {
        return O(this.f23643b);
    }

    @Override // ia0.i
    public final InputStream w0() {
        return new ib(this, 2);
    }

    public final void write(byte[] bArr, int i11, int i12) {
        bArr.getClass();
        long j9 = i12;
        b.e(bArr.length, i11, j9);
        int i13 = i12 + i11;
        while (i11 < i13) {
            e0 e0VarX0 = x0(1);
            int iMin = Math.min(i13 - i11, 8192 - e0VarX0.f23627c);
            int i14 = i11 + iMin;
            kotlin.collections.x.e(e0VarX0.f23627c, bArr, i11, e0VarX0.f23625a, i14);
            e0VarX0.f23627c += iMin;
            i11 = i14;
        }
        this.f23643b += j9;
    }

    @Override // ia0.h
    public final /* bridge */ /* synthetic */ h writeByte(int i11) {
        z0(i11);
        return this;
    }

    @Override // ia0.h
    public final /* bridge */ /* synthetic */ h writeInt(int i11) {
        C0(i11);
        return this;
    }

    @Override // ia0.h
    public final /* bridge */ /* synthetic */ h writeShort(int i11) {
        D0(i11);
        return this;
    }

    @Override // ia0.h0
    public final void x(g gVar, long j9) {
        e0 e0VarB;
        gVar.getClass();
        if (gVar == this) {
            i4.a.f("source == this");
            return;
        }
        b.e(gVar.f23643b, 0L, j9);
        while (j9 > 0) {
            e0 e0Var = gVar.f23642a;
            e0Var.getClass();
            int i11 = e0Var.f23627c;
            e0 e0Var2 = gVar.f23642a;
            e0Var2.getClass();
            long j11 = i11 - e0Var2.f23626b;
            int i12 = 0;
            if (j9 < j11) {
                e0 e0Var3 = this.f23642a;
                e0 e0Var4 = e0Var3 != null ? e0Var3.f23631g : null;
                if (e0Var4 != null && e0Var4.f23629e) {
                    if ((((long) e0Var4.f23627c) + j9) - ((long) (e0Var4.f23628d ? 0 : e0Var4.f23626b)) <= 8192) {
                        e0 e0Var5 = gVar.f23642a;
                        e0Var5.getClass();
                        e0Var5.d(e0Var4, (int) j9);
                        gVar.f23643b -= j9;
                        this.f23643b += j9;
                        return;
                    }
                }
                e0 e0Var6 = gVar.f23642a;
                e0Var6.getClass();
                int i13 = (int) j9;
                if (i13 <= 0 || i13 > e0Var6.f23627c - e0Var6.f23626b) {
                    i4.a.f("byteCount out of range");
                    return;
                }
                if (i13 >= 1024) {
                    e0VarB = e0Var6.c();
                } else {
                    e0VarB = f0.b();
                    byte[] bArr = e0Var6.f23625a;
                    byte[] bArr2 = e0VarB.f23625a;
                    int i14 = e0Var6.f23626b;
                    kotlin.collections.x.e(0, bArr, i14, bArr2, i14 + i13);
                }
                e0VarB.f23627c = e0VarB.f23626b + i13;
                e0Var6.f23626b += i13;
                e0 e0Var7 = e0Var6.f23631g;
                e0Var7.getClass();
                e0Var7.b(e0VarB);
                gVar.f23642a = e0VarB;
            }
            e0 e0Var8 = gVar.f23642a;
            e0Var8.getClass();
            long j12 = e0Var8.f23627c - e0Var8.f23626b;
            gVar.f23642a = e0Var8.a();
            e0 e0Var9 = this.f23642a;
            if (e0Var9 == null) {
                this.f23642a = e0Var8;
                e0Var8.f23631g = e0Var8;
                e0Var8.f23630f = e0Var8;
            } else {
                e0 e0Var10 = e0Var9.f23631g;
                e0Var10.getClass();
                e0Var10.b(e0Var8);
                e0 e0Var11 = e0Var8.f23631g;
                if (e0Var11 == e0Var8) {
                    h2.b("cannot compact");
                    return;
                }
                e0Var11.getClass();
                if (e0Var11.f23629e) {
                    int i15 = e0Var8.f23627c - e0Var8.f23626b;
                    e0 e0Var12 = e0Var8.f23631g;
                    e0Var12.getClass();
                    int i16 = 8192 - e0Var12.f23627c;
                    e0 e0Var13 = e0Var8.f23631g;
                    e0Var13.getClass();
                    if (!e0Var13.f23628d) {
                        e0 e0Var14 = e0Var8.f23631g;
                        e0Var14.getClass();
                        i12 = e0Var14.f23626b;
                    }
                    if (i15 <= i16 + i12) {
                        e0 e0Var15 = e0Var8.f23631g;
                        e0Var15.getClass();
                        e0Var8.d(e0Var15, i15);
                        e0Var8.a();
                        f0.a(e0Var8);
                    }
                }
            }
            gVar.f23643b -= j12;
            this.f23643b += j12;
            j9 -= j12;
        }
    }

    public final e0 x0(int i11) {
        if (i11 < 1 || i11 > 8192) {
            i4.a.f("unexpected capacity");
            return null;
        }
        e0 e0Var = this.f23642a;
        if (e0Var == null) {
            e0 e0VarB = f0.b();
            this.f23642a = e0VarB;
            e0VarB.f23631g = e0VarB;
            e0VarB.f23630f = e0VarB;
            return e0VarB;
        }
        e0 e0Var2 = e0Var.f23631g;
        e0Var2.getClass();
        if (e0Var2.f23627c + i11 <= 8192 && e0Var2.f23629e) {
            return e0Var2;
        }
        e0 e0VarB2 = f0.b();
        e0Var2.b(e0VarB2);
        return e0VarB2;
    }

    @Override // ia0.i
    public final long y(byte b8, long j9, long j11) {
        e0 e0Var;
        long j12 = j9;
        long j13 = j11;
        long j14 = 0;
        if (0 > j12 || j12 > j13) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f23643b);
            org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, " fromIndex=", j12, " toIndex=");
            sb2.append(j13);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j15 = this.f23643b;
        if (j13 > j15) {
            j13 = j15;
        }
        long j16 = -1;
        if (j12 == j13 || (e0Var = this.f23642a) == null) {
            return -1L;
        }
        if (j15 - j12 < j12) {
            while (j15 > j12) {
                e0Var = e0Var.f23631g;
                e0Var.getClass();
                j15 -= (long) (e0Var.f23627c - e0Var.f23626b);
            }
            while (j15 < j13) {
                byte[] bArr = e0Var.f23625a;
                long j17 = j16;
                int iMin = (int) Math.min(e0Var.f23627c, (((long) e0Var.f23626b) + j13) - j15);
                for (int i11 = (int) ((((long) e0Var.f23626b) + j12) - j15); i11 < iMin; i11++) {
                    if (bArr[i11] == b8) {
                        return ((long) (i11 - e0Var.f23626b)) + j15;
                    }
                }
                j15 += (long) (e0Var.f23627c - e0Var.f23626b);
                e0Var = e0Var.f23630f;
                e0Var.getClass();
                j16 = j17;
                j12 = j15;
            }
            return j16;
        }
        while (true) {
            long j18 = ((long) (e0Var.f23627c - e0Var.f23626b)) + j14;
            if (j18 > j12) {
                break;
            }
            e0Var = e0Var.f23630f;
            e0Var.getClass();
            j14 = j18;
        }
        while (j14 < j13) {
            byte[] bArr2 = e0Var.f23625a;
            int iMin2 = (int) Math.min(e0Var.f23627c, (((long) e0Var.f23626b) + j13) - j14);
            for (int i12 = (int) ((((long) e0Var.f23626b) + j12) - j14); i12 < iMin2; i12++) {
                if (bArr2[i12] == b8) {
                    return ((long) (i12 - e0Var.f23626b)) + j14;
                }
            }
            j14 += (long) (e0Var.f23627c - e0Var.f23626b);
            e0Var = e0Var.f23630f;
            e0Var.getClass();
            j12 = j14;
        }
        return -1L;
    }

    public final void y0(j jVar) {
        jVar.getClass();
        jVar.t(this, jVar.e());
    }

    @Override // ia0.i
    public final long z(long j9, j jVar) {
        jVar.getClass();
        byte[] bArr = ja0.a.f24792a;
        return ja0.a.a(this, jVar, 0L, j9, jVar.e());
    }

    public final void z0(int i11) {
        e0 e0VarX0 = x0(1);
        byte[] bArr = e0VarX0.f23625a;
        int i12 = e0VarX0.f23627c;
        e0VarX0.f23627c = i12 + 1;
        bArr[i12] = (byte) i11;
        this.f23643b++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, ia0.h0
    public final void close() {
    }

    @Override // ia0.h, ia0.h0, java.io.Flushable
    public final void flush() {
    }

    @Override // ia0.i
    public final g h() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i11 = iRemaining;
        while (i11 > 0) {
            e0 e0VarX0 = x0(1);
            int iMin = Math.min(i11, 8192 - e0VarX0.f23627c);
            byteBuffer.get(e0VarX0.f23625a, e0VarX0.f23627c, iMin);
            i11 -= iMin;
            e0VarX0.f23627c += iMin;
        }
        this.f23643b += (long) iRemaining;
        return iRemaining;
    }

    @Override // ia0.h
    public final h write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        e0 e0Var = this.f23642a;
        if (e0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), e0Var.f23627c - e0Var.f23626b);
        byteBuffer.put(e0Var.f23625a, e0Var.f23626b, iMin);
        int i11 = e0Var.f23626b + iMin;
        e0Var.f23626b = i11;
        this.f23643b -= (long) iMin;
        if (i11 == e0Var.f23627c) {
            this.f23642a = e0Var.a();
            f0.a(e0Var);
        }
        return iMin;
    }
}
