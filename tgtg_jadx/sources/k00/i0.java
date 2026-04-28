package k00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final char[] f25657e;

    public i0(h0 h0Var) {
        super(h0Var, (Character) null);
        this.f25657e = new char[512];
        char[] cArr = h0Var.f25647b;
        if (cArr.length != 16) {
            i4.a.h();
            throw null;
        }
        for (int i11 = 0; i11 < 256; i11++) {
            char[] cArr2 = this.f25657e;
            cArr2[i11] = cArr[i11 >>> 4];
            cArr2[i11 | 256] = cArr[i11 & 15];
        }
    }

    @Override // k00.k0
    public final void a(StringBuilder sb2, byte[] bArr, int i11) {
        a.m(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.f25657e;
            sb2.append(cArr[i13]);
            sb2.append(cArr[i13 | 256]);
        }
    }
}
