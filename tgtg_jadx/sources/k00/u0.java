package k00;

import com.braze.h2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f25696a;

    public u0(q0 q0Var) {
        this.f25696a = q0Var;
    }

    @Override // k00.y0
    public final int a() {
        return y0.e((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y0 y0Var = (y0) obj;
        int iA = y0Var.a();
        int iE = y0.e((byte) 64);
        if (iE != iA) {
            return iE - y0Var.a();
        }
        q0 q0Var = ((u0) y0Var).f25696a;
        q0 q0Var2 = this.f25696a;
        byte[] bArr = q0Var2.f25684b;
        int length = bArr.length;
        byte[] bArr2 = q0Var.f25684b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return n0.f25672a.compare(q0Var2.l(), q0Var.l());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            return this.f25696a.equals(((u0) obj).f25696a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y0.e((byte) 64)), this.f25696a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        h0 h0Var;
        int i11;
        boolean z11;
        i0 i0Var = k0.f25662d;
        k0 i0Var2 = i0Var.f25665c;
        if (i0Var2 == null) {
            h0 h0Var2 = i0Var.f25663a;
            char[] cArr = h0Var2.f25647b;
            int i12 = 0;
            while (true) {
                if (i12 >= cArr.length) {
                    h0Var = h0Var2;
                    break;
                }
                char c3 = cArr[i12];
                if (c3 < 'a' || c3 > 'z') {
                    i12++;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= cArr.length) {
                            z11 = false;
                            break;
                        }
                        char c7 = cArr[i13];
                        if (c7 >= 'A' && c7 <= 'Z') {
                            z11 = true;
                            break;
                        }
                        i13++;
                    }
                    if (z11) {
                        h2.b("Cannot call upperCase() on a mixed-case alphabet");
                        return null;
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i14 = 0; i14 < cArr.length; i14++) {
                        char c8 = cArr[i14];
                        if (c8 >= 97 && c8 <= 122) {
                            c8 ^= 32;
                        }
                        cArr2[i14] = (char) c8;
                    }
                    h0Var = new h0(h0Var2.f25646a.concat(".upperCase()"), cArr2);
                    byte[] bArr = h0Var.f25652g;
                    if (h0Var2.f25653h && !h0Var.f25653h) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i11 = 65; i11 <= 90; i11++) {
                            int i15 = i11 | 32;
                            byte b8 = bArr[i11];
                            byte b11 = bArr[i15];
                            if (b8 == -1) {
                                bArrCopyOf[i11] = b11;
                            } else {
                                char c11 = (char) i11;
                                char c12 = (char) i15;
                                if (b11 != -1) {
                                    h2.b(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                    return null;
                                }
                                bArrCopyOf[i15] = b8;
                            }
                        }
                        h0Var = new h0(h0Var.f25646a.concat(".ignoreCase()"), h0Var.f25647b, bArrCopyOf, true);
                    }
                }
            }
            i0Var2 = h0Var == h0Var2 ? i0Var : new i0(h0Var);
            i0Var.f25665c = i0Var2;
        }
        byte[] bArrL = this.f25696a.l();
        return w.a0.p("h'", i0Var2.c(bArrL.length, bArrL), "'");
    }
}
