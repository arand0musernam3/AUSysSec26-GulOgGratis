package m30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {
    public c(String str, String str2) {
        a aVar = new a(str, str2.toCharArray());
        super(aVar, (Character) '=');
        na0.a.Y(aVar.f29497b.length == 64);
    }

    @Override // m30.d
    public final void c(StringBuilder sb2, byte[] bArr, int i11) {
        int i12 = 0;
        na0.a.d0(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 2;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16);
            i12 += 3;
            int i16 = i15 | (bArr[i14] & 255);
            a aVar = this.f29505a;
            char[] cArr = aVar.f29497b;
            char[] cArr2 = aVar.f29497b;
            sb2.append(cArr[i16 >>> 18]);
            sb2.append(cArr2[(i16 >>> 12) & 63]);
            sb2.append(cArr2[(i16 >>> 6) & 63]);
            sb2.append(cArr2[i16 & 63]);
        }
        if (i12 < i11) {
            b(i12, i11 - i12, sb2, bArr);
        }
    }
}
