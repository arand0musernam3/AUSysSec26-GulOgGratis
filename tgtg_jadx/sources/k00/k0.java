package k00;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f25662d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f25663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f25664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile k0 f25665c;

    static {
        new j0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new j0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new k0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new k0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f25662d = new i0(new h0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public k0(h0 h0Var, Character ch) {
        this.f25663a = h0Var;
        if (ch != null) {
            byte[] bArr = h0Var.f25652g;
            if (bArr.length > 61 && bArr[61] != -1) {
                i4.a.f(a.c("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.f25664b = ch;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i11) {
        int i12 = 0;
        a.m(0, i11, bArr.length);
        while (i12 < i11) {
            h0 h0Var = this.f25663a;
            b(i12, Math.min(h0Var.f25651f, i11 - i12), sb2, bArr);
            i12 += h0Var.f25651f;
        }
    }

    public final void b(int i11, int i12, StringBuilder sb2, byte[] bArr) {
        a.m(i11, i11 + i12, bArr.length);
        h0 h0Var = this.f25663a;
        int i13 = h0Var.f25651f;
        int i14 = h0Var.f25649d;
        if (i12 > i13) {
            i4.a.h();
            return;
        }
        int i15 = 0;
        long j9 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            j9 = (j9 | ((long) (bArr[i11 + i16] & 255))) << 8;
        }
        int i17 = (i12 + 1) * 8;
        while (i15 < i12 * 8) {
            sb2.append(h0Var.f25647b[((int) (j9 >>> ((i17 - i14) - i15))) & h0Var.f25648c]);
            i15 += i14;
        }
        if (this.f25664b != null) {
            while (i15 < h0Var.f25651f * 8) {
                sb2.append('=');
                i15 += i14;
            }
        }
    }

    public final String c(int i11, byte[] bArr) {
        a.m(0, i11, bArr.length);
        h0 h0Var = this.f25663a;
        int i12 = h0Var.f25651f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(h0Var.f25650e * a.a(i11, i12));
        try {
            a(sb2, bArr, i11);
            return sb2.toString();
        } catch (IOException e5) {
            i4.a.d(e5);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f25663a.equals(k0Var.f25663a) && Objects.equals(this.f25664b, k0Var.f25664b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25663a.hashCode() ^ Objects.hashCode(this.f25664b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        h0 h0Var = this.f25663a;
        sb2.append(h0Var);
        if (8 % h0Var.f25649d != 0) {
            Character ch = this.f25664b;
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

    public k0(String str, String str2) {
        this(new h0(str, str2.toCharArray()), (Character) '=');
    }
}
