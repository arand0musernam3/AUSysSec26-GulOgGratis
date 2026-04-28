package m30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f29503d;

    public b() {
        a aVar = new a("base16()", "0123456789ABCDEF".toCharArray());
        super(aVar, (Character) null);
        this.f29503d = new char[512];
        char[] cArr = aVar.f29497b;
        na0.a.Y(cArr.length == 16);
        for (int i11 = 0; i11 < 256; i11++) {
            char[] cArr2 = this.f29503d;
            cArr2[i11] = cArr[i11 >>> 4];
            cArr2[i11 | 256] = cArr[i11 & 15];
        }
    }

    @Override // m30.d
    public final void c(StringBuilder sb2, byte[] bArr, int i11) {
        na0.a.d0(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.f29503d;
            sb2.append(cArr[i13]);
            sb2.append(cArr[i13 | 256]);
        }
    }
}
