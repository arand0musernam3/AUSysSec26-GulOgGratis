package v0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f41597d = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f41598e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f41599f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f41602c;

    public e(int i11, int i12, byte[] bArr) {
        this.f41600a = i11;
        this.f41601b = i12;
        this.f41602c = bArr;
    }

    public static e a(long j9, ByteOrder byteOrder) {
        return b(new long[]{j9}, byteOrder);
    }

    public static e b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f41599f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j9 : jArr) {
            byteBufferWrap.putInt((int) j9);
        }
        return new e(4, jArr.length, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(f41598e[this.f41600a]);
        sb2.append(", data length:");
        return r8.k.i(this.f41602c.length, ")", sb2);
    }
}
