package m30;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import o00.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f29504c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f29506b;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        f29504c = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(m30.a r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.f29505a = r3
            if (r4 == 0) goto L17
            char r0 = r4.charValue()
            byte[] r3 = r3.f29502g
            int r1 = r3.length
            if (r0 >= r1) goto L17
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L17
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            na0.a.X(r0, r4, r3)
            r2.f29506b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m30.d.<init>(m30.a, java.lang.Character):void");
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        na0.a.d0(0, length, bArr.length);
        a aVar = this.f29505a;
        int i11 = aVar.f29500e;
        int i12 = aVar.f29501f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(h0.s(length, i12) * i11);
        try {
            c(sb2, bArr, length);
            return sb2.toString();
        } catch (IOException e5) {
            i4.a.d(e5);
            return null;
        }
    }

    public final void b(int i11, int i12, StringBuilder sb2, byte[] bArr) {
        na0.a.d0(i11, i11 + i12, bArr.length);
        a aVar = this.f29505a;
        int i13 = aVar.f29501f;
        int i14 = aVar.f29499d;
        int i15 = 0;
        na0.a.Y(i12 <= i13);
        long j9 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            j9 = (j9 | ((long) (bArr[i11 + i16] & 255))) << 8;
        }
        int i17 = ((i12 + 1) * 8) - i14;
        while (i15 < i12 * 8) {
            sb2.append(aVar.f29497b[((int) (j9 >>> (i17 - i15))) & aVar.f29498c]);
            i15 += i14;
        }
        Character ch = this.f29506b;
        if (ch != null) {
            while (i15 < aVar.f29501f * 8) {
                sb2.append(ch.charValue());
                i15 += i14;
            }
        }
    }

    public void c(StringBuilder sb2, byte[] bArr, int i11) {
        int i12 = 0;
        na0.a.d0(0, i11, bArr.length);
        while (i12 < i11) {
            a aVar = this.f29505a;
            b(i12, Math.min(aVar.f29501f, i11 - i12), sb2, bArr);
            i12 += aVar.f29501f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f29505a.equals(dVar.f29505a) && Objects.equals(this.f29506b, dVar.f29506b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29505a.hashCode() ^ Objects.hashCode(this.f29506b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f29505a;
        sb2.append(aVar);
        if (8 % aVar.f29499d != 0) {
            Character ch = this.f29506b;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
