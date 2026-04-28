package ia0;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte[][] f23644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int[] f23645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(byte[][] bArr, int[] iArr) {
        super(j.f23646d.f23647a);
        bArr.getClass();
        this.f23644e = bArr;
        this.f23645f = iArr;
    }

    private final Object writeReplace() {
        return v();
    }

    @Override // ia0.j
    public final String a() {
        throw null;
    }

    @Override // ia0.j
    public final j d(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f23644e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int[] iArr = this.f23645f;
            int i13 = iArr[length + i11];
            int i14 = iArr[i11];
            messageDigest.update(bArr[i11], i13, i14 - i12);
            i11++;
            i12 = i14;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new j(bArrDigest);
    }

    @Override // ia0.j
    public final int e() {
        return this.f23645f[this.f23644e.length - 1];
    }

    @Override // ia0.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.e() == e() && m(0, jVar, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // ia0.j
    public final String f() {
        return v().f();
    }

    @Override // ia0.j
    public final int g(int i11, byte[] bArr) {
        bArr.getClass();
        return v().g(i11, bArr);
    }

    @Override // ia0.j
    public final int hashCode() {
        int i11 = this.f23648b;
        if (i11 != 0) {
            return i11;
        }
        byte[][] bArr = this.f23644e;
        int length = bArr.length;
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        while (i12 < length) {
            int[] iArr = this.f23645f;
            int i15 = iArr[length + i12];
            int i16 = iArr[i12];
            byte[] bArr2 = bArr[i12];
            int i17 = (i16 - i14) + i15;
            while (i15 < i17) {
                i13 = (i13 * 31) + bArr2[i15];
                i15++;
            }
            i12++;
            i14 = i16;
        }
        this.f23648b = i13;
        return i13;
    }

    @Override // ia0.j
    public final byte[] i() {
        return u();
    }

    @Override // ia0.j
    public final byte j(int i11) {
        byte[][] bArr = this.f23644e;
        int length = bArr.length - 1;
        int[] iArr = this.f23645f;
        b.e(iArr[length], i11, 1L);
        int iA = ja0.e.a(this, i11);
        return bArr[iA][(i11 - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[bArr.length + iA]];
    }

    @Override // ia0.j
    public final int k(byte[] bArr) {
        bArr.getClass();
        return v().k(bArr);
    }

    @Override // ia0.j
    public final boolean m(int i11, j jVar, int i12) {
        jVar.getClass();
        if (i11 >= 0 && i11 <= e() - i12) {
            int i13 = i12 + i11;
            int iA = ja0.e.a(this, i11);
            int i14 = 0;
            while (i11 < i13) {
                int[] iArr = this.f23645f;
                int i15 = iA == 0 ? 0 : iArr[iA - 1];
                int i16 = iArr[iA] - i15;
                byte[][] bArr = this.f23644e;
                int i17 = iArr[bArr.length + iA];
                int iMin = Math.min(i13, i16 + i15) - i11;
                if (jVar.n(i14, bArr[iA], (i11 - i15) + i17, iMin)) {
                    i14 += iMin;
                    i11 += iMin;
                    iA++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // ia0.j
    public final boolean n(int i11, byte[] bArr, int i12, int i13) {
        bArr.getClass();
        if (i11 < 0 || i11 > e() - i13 || i12 < 0 || i12 > bArr.length - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int iA = ja0.e.a(this, i11);
        while (i11 < i14) {
            int[] iArr = this.f23645f;
            int i15 = iA == 0 ? 0 : iArr[iA - 1];
            int i16 = iArr[iA] - i15;
            byte[][] bArr2 = this.f23644e;
            int i17 = iArr[bArr2.length + iA];
            int iMin = Math.min(i14, i16 + i15) - i11;
            if (!b.a((i11 - i15) + i17, bArr2[iA], i12, bArr, iMin)) {
                return false;
            }
            i12 += iMin;
            i11 += iMin;
            iA++;
        }
        return true;
    }

    @Override // ia0.j
    public final String o(Charset charset) {
        charset.getClass();
        return v().o(charset);
    }

    @Override // ia0.j
    public final j p(int i11, int i12) {
        if (i12 == -1234567890) {
            i12 = e();
        }
        if (i11 < 0) {
            i4.a.i(r8.k.h(i11, "beginIndex=", " < 0"));
            return null;
        }
        if (i12 > e()) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "endIndex=", " > length(");
            sbK.append(e());
            sbK.append(')');
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        int i13 = i12 - i11;
        if (i13 < 0) {
            i4.a.i(r8.k.k("endIndex=", i12, i11, " < beginIndex="));
            return null;
        }
        if (i11 == 0 && i12 == e()) {
            return this;
        }
        if (i11 == i12) {
            return j.f23646d;
        }
        int iA = ja0.e.a(this, i11);
        int iA2 = ja0.e.a(this, i12 - 1);
        byte[][] bArr = this.f23644e;
        byte[][] bArr2 = (byte[][]) kotlin.collections.x.l(bArr, iA, iA2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f23645f;
        if (iA <= iA2) {
            int i14 = iA;
            int i15 = 0;
            while (true) {
                iArr[i15] = Math.min(iArr2[i14] - i11, i13);
                int i16 = i15 + 1;
                iArr[i15 + bArr2.length] = iArr2[bArr.length + i14];
                if (i14 == iA2) {
                    break;
                }
                i14++;
                i15 = i16;
            }
        }
        int i17 = iA != 0 ? iArr2[iA - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i11 - i17) + iArr[length];
        return new g0(bArr2, iArr);
    }

    @Override // ia0.j
    public final j r() {
        return v().r();
    }

    @Override // ia0.j
    public final void t(g gVar, int i11) {
        int iA = ja0.e.a(this, 0);
        int i12 = 0;
        while (i12 < i11) {
            int[] iArr = this.f23645f;
            int i13 = iA == 0 ? 0 : iArr[iA - 1];
            int i14 = iArr[iA] - i13;
            byte[][] bArr = this.f23644e;
            int i15 = iArr[bArr.length + iA];
            int iMin = Math.min(i11, i14 + i13) - i12;
            int i16 = (i12 - i13) + i15;
            e0 e0Var = new e0(bArr[iA], i16, i16 + iMin, true, false);
            e0 e0Var2 = gVar.f23642a;
            if (e0Var2 == null) {
                e0Var.f23631g = e0Var;
                e0Var.f23630f = e0Var;
                gVar.f23642a = e0Var;
            } else {
                e0 e0Var3 = e0Var2.f23631g;
                e0Var3.getClass();
                e0Var3.b(e0Var);
            }
            i12 += iMin;
            iA++;
        }
        gVar.f23643b += (long) i11;
    }

    @Override // ia0.j
    public final String toString() {
        return v().toString();
    }

    public final byte[] u() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.f23644e;
        int length = bArr2.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f23645f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = i15 - i12;
            kotlin.collections.x.e(i13, bArr2[i11], i14, bArr, i14 + i16);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    public final j v() {
        return new j(u());
    }
}
