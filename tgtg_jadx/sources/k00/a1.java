package k00;

import com.braze.h2;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f25623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f25624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f25625c = new byte[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final se.d f25626d = new se.d(24);

    public a1(ByteArrayInputStream byteArrayInputStream) {
        this.f25623a = byteArrayInputStream;
    }

    public final void A(byte b8) {
        p();
        byte b11 = this.f25624b.f25714a;
        if (b11 == b8) {
            return;
        }
        h2.b(r8.k.k("expected major type ", (b8 >> 5) & 7, (b11 >> 5) & 7, " but found "));
    }

    public final void B(int i11, byte[] bArr) throws IOException {
        int i12 = 0;
        while (i12 != i11) {
            int i13 = this.f25623a.read(bArr, i12, i11 - i12);
            if (i13 == -1) {
                i4.a.b();
                return;
            }
            i12 += i13;
        }
        this.f25624b = null;
    }

    public final byte[] G() {
        u();
        long jT = t();
        if (jT < 0 || jT > 2147483647L) {
            h2.a("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.f25623a.available() < jT) {
            i4.a.b();
            return null;
        }
        int i11 = (int) jT;
        byte[] bArr = new byte[i11];
        B(i11, bArr);
        return bArr;
    }

    public final long a() {
        A(ByteCompanionObject.MIN_VALUE);
        u();
        long jT = t();
        if (jT < 0) {
            h2.a("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (jT > 0) {
            ((ArrayDeque) this.f25626d.f39013b).push(Long.valueOf(jT));
        }
        return jT;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25623a.close();
        this.f25626d.O();
    }

    public final long e() {
        boolean z11;
        p();
        byte b8 = this.f25624b.f25714a;
        if (b8 == 0) {
            z11 = true;
        } else {
            if (b8 != 32) {
                h2.b(j4.s.f((b8 >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z11 = false;
        }
        long jT = t();
        if (jT >= 0) {
            return z11 ? jT : ~jT;
        }
        h2.a("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long g() {
        A((byte) -96);
        u();
        long jT = t();
        if (jT < 0 || jT > 4611686018427387903L) {
            h2.a("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (jT > 0) {
            ((ArrayDeque) this.f25626d.f39013b).push(Long.valueOf(jT + jT));
        }
        return jT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (r0 != (-2)) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k00.z0 p() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k00.a1.p():k00.z0");
    }

    public final boolean r() {
        A((byte) -32);
        if (this.f25624b.f25715b > 24) {
            h2.b("expected simple value");
            return false;
        }
        int iT = (int) t();
        if (iT == 20) {
            return false;
        }
        if (iT == 21) {
            return true;
        }
        h2.b("expected FALSE or TRUE");
        return false;
    }

    public final long t() throws IOException {
        z0 z0Var = this.f25624b;
        byte b8 = z0Var.f25715b;
        if (b8 < 24) {
            long j9 = b8;
            this.f25624b = null;
            return j9;
        }
        if (b8 == 24) {
            int i11 = this.f25623a.read();
            if (i11 != -1) {
                this.f25624b = null;
                return ((long) i11) & 255;
            }
            i4.a.b();
            return 0L;
        }
        byte[] bArr = this.f25625c;
        if (b8 == 25) {
            B(2, bArr);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b8 == 26) {
            B(4, bArr);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b8 != 27) {
            i4.a.k(r8.k.k("invalid additional information ", b8, (z0Var.f25714a >> 5) & 7, " for major type "));
            return 0L;
        }
        B(8, bArr);
        long j11 = bArr[0];
        long j12 = bArr[1];
        long j13 = bArr[2];
        long j14 = bArr[3];
        return ((((long) bArr[6]) & 255) << 8) | ((j14 & 255) << 32) | ((j12 & 255) << 48) | ((j11 & 255) << 56) | ((j13 & 255) << 40) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | (((long) bArr[7]) & 255);
    }

    public final void u() {
        p();
        byte b8 = this.f25624b.f25715b;
        if (b8 != 31) {
            return;
        }
        h2.b(j4.s.f(b8, "expected definite length but found "));
    }
}
