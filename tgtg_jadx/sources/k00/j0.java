package k00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends k0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public j0(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new h0(str, charArray), (Character) '=');
        if (charArray.length == 64) {
            return;
        }
        i4.a.h();
        throw null;
    }

    @Override // k00.k0
    public final void a(StringBuilder sb2, byte[] bArr, int i11) {
        int i12 = 0;
        a.m(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16) | (bArr[i12 + 2] & 255);
            h0 h0Var = this.f25663a;
            char[] cArr = h0Var.f25647b;
            char[] cArr2 = h0Var.f25647b;
            sb2.append(cArr[i14 >>> 18]);
            sb2.append(cArr2[(i14 >>> 12) & 63]);
            sb2.append(cArr2[(i14 >>> 6) & 63]);
            sb2.append(cArr2[i14 & 63]);
            i12 += 3;
        }
        if (i12 < i11) {
            b(i12, i11 - i12, sb2, bArr);
        }
    }
}
