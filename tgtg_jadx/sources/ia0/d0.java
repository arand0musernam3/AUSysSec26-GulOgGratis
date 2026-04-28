package ia0;

import com.braze.h2;
import com.google.android.gms.internal.measurement.ib;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f23622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f23623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23624c;

    public d0(j0 j0Var) {
        j0Var.getClass();
        this.f23622a = j0Var;
        this.f23623b = new g();
    }

    public final String A(long j9) {
        r0(j9);
        return this.f23623b.a0(j9, Charsets.UTF_8);
    }

    @Override // ia0.i
    public final String D(long j9) {
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "limit < 0: "));
            return null;
        }
        long j11 = j9 == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j9 + 1;
        long jY = y((byte) 10, 0L, j11);
        g gVar = this.f23623b;
        if (jY != -1) {
            return ja0.a.c(gVar, jY);
        }
        if (j11 < LongCompanionObject.MAX_VALUE && request(j11) && gVar.G(j11 - 1) == 13 && request(j11 + 1) && gVar.G(j11) == 10) {
            return ja0.a.c(gVar, j11);
        }
        g gVar2 = new g();
        gVar.A(gVar2, 0L, Math.min(32, gVar.f23643b));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f23643b, j9) + " content=" + gVar2.q(gVar2.f23643b).f() + (char) 8230);
    }

    @Override // ia0.j0
    public final long F(g gVar, long j9) {
        gVar.getClass();
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        if (this.f23624c) {
            h2.b("closed");
            return 0L;
        }
        g gVar2 = this.f23623b;
        if (gVar2.f23643b == 0) {
            if (j9 == 0) {
                return 0L;
            }
            if (this.f23622a.F(gVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return gVar2.F(gVar, Math.min(j9, gVar2.f23643b));
    }

    @Override // ia0.i
    public final String R(Charset charset) {
        charset.getClass();
        j0 j0Var = this.f23622a;
        g gVar = this.f23623b;
        gVar.b0(j0Var);
        return gVar.a0(gVar.f23643b, charset);
    }

    @Override // ia0.i
    public final int U(y yVar) throws EOFException {
        yVar.getClass();
        if (this.f23624c) {
            h2.b("closed");
            return 0;
        }
        while (true) {
            g gVar = this.f23623b;
            int iD = ja0.a.d(gVar, yVar, true);
            if (iD != -2) {
                if (iD != -1) {
                    gVar.skip(yVar.f23688b[iD].e());
                    return iD;
                }
            } else if (this.f23622a.F(gVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // ia0.i
    public final boolean X(long j9, j jVar) {
        jVar.getClass();
        int iE = jVar.e();
        if (this.f23624c) {
            h2.b("closed");
            return false;
        }
        if (iE >= 0 && j9 >= 0 && iE <= jVar.e()) {
            return iE == 0 || ja0.d.a(this, jVar, iE, j9, j9 + 1) != -1;
        }
        return false;
    }

    public final boolean a() {
        if (this.f23624c) {
            h2.b("closed");
            return false;
        }
        g gVar = this.f23623b;
        return gVar.B() && this.f23622a.F(gVar, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f23624c) {
            return;
        }
        this.f23624c = true;
        this.f23622a.close();
        this.f23623b.a();
    }

    public final long e(j jVar) {
        jVar.getClass();
        if (this.f23624c) {
            h2.b("closed");
            return 0L;
        }
        long jMax = 0;
        while (true) {
            g gVar = this.f23623b;
            long jH = gVar.H(jMax, jVar);
            if (jH != -1) {
                return jH;
            }
            long j9 = gVar.f23643b;
            if (this.f23622a.F(gVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j9);
        }
    }

    public final d0 g() {
        return new d0(new b0(this));
    }

    @Override // ia0.i
    public final g h() {
        return this.f23623b;
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f23622a.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f23624c;
    }

    @Override // ia0.i
    public final long j0(h hVar) {
        g gVar;
        long j9 = 0;
        while (true) {
            j0 j0Var = this.f23622a;
            gVar = this.f23623b;
            if (j0Var.F(gVar, 8192L) == -1) {
                break;
            }
            long jU = gVar.u();
            if (jU > 0) {
                j9 += jU;
                hVar.x(gVar, jU);
            }
        }
        long j11 = gVar.f23643b;
        if (j11 <= 0) {
            return j9;
        }
        long j12 = j9 + j11;
        hVar.x(gVar, j11);
        return j12;
    }

    @Override // ia0.i
    public final void l0(g gVar, long j9) throws EOFException {
        g gVar2 = this.f23623b;
        try {
            r0(j9);
            gVar2.l0(gVar, j9);
        } catch (EOFException e5) {
            gVar.b0(gVar2);
            throw e5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[LOOP:2: B:22:0x0067->B:38:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.d0.p():long");
    }

    @Override // ia0.i
    public final j q(long j9) {
        r0(j9);
        return this.f23623b.q(j9);
    }

    public final int r() throws EOFException {
        r0(4L);
        int i11 = this.f23623b.readInt();
        return ((i11 & 255) << 24) | (((-16777216) & i11) >>> 24) | ((16711680 & i11) >>> 8) | ((65280 & i11) << 8);
    }

    @Override // ia0.i
    public final void r0(long j9) {
        if (request(j9)) {
            return;
        }
        i4.a.b();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        g gVar = this.f23623b;
        if (gVar.f23643b == 0 && this.f23622a.F(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(byteBuffer);
    }

    @Override // ia0.i
    public final byte readByte() {
        r0(1L);
        return this.f23623b.readByte();
    }

    @Override // ia0.i
    public final void readFully(byte[] bArr) throws EOFException {
        g gVar = this.f23623b;
        bArr.getClass();
        try {
            r0(bArr.length);
            gVar.readFully(bArr);
        } catch (EOFException e5) {
            int i11 = 0;
            while (true) {
                long j9 = gVar.f23643b;
                if (j9 <= 0) {
                    throw e5;
                }
                int i12 = gVar.read(bArr, i11, (int) j9);
                if (i12 == -1) {
                    throw new AssertionError();
                }
                i11 += i12;
            }
        }
    }

    @Override // ia0.i
    public final int readInt() {
        r0(4L);
        return this.f23623b.readInt();
    }

    @Override // ia0.i
    public final long readLong() {
        r0(8L);
        return this.f23623b.readLong();
    }

    @Override // ia0.i
    public final short readShort() {
        r0(2L);
        return this.f23623b.readShort();
    }

    @Override // ia0.i
    public final boolean request(long j9) {
        g gVar;
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return false;
        }
        if (this.f23624c) {
            h2.b("closed");
            return false;
        }
        do {
            gVar = this.f23623b;
            if (gVar.f23643b >= j9) {
                return true;
            }
        } while (this.f23622a.F(gVar, 8192L) != -1);
        return false;
    }

    @Override // ia0.i
    public final void skip(long j9) throws EOFException {
        if (this.f23624c) {
            h2.b("closed");
            return;
        }
        while (j9 > 0) {
            g gVar = this.f23623b;
            if (gVar.f23643b == 0 && this.f23622a.F(gVar, 8192L) == -1) {
                i4.a.b();
                return;
            } else {
                long jMin = Math.min(j9, gVar.f23643b);
                gVar.skip(jMin);
                j9 -= jMin;
            }
        }
    }

    public final long t() throws EOFException {
        r0(8L);
        long j9 = this.f23623b.readLong();
        return ((j9 & 255) << 56) | (((-72057594037927936L) & j9) >>> 56) | ((71776119061217280L & j9) >>> 40) | ((280375465082880L & j9) >>> 24) | ((1095216660480L & j9) >>> 8) | ((4278190080L & j9) << 8) | ((16711680 & j9) << 24) | ((65280 & j9) << 40);
    }

    public final String toString() {
        return "buffer(" + this.f23622a + ')';
    }

    public final short u() {
        r0(2L);
        return this.f23623b.Z();
    }

    @Override // ia0.i
    public final byte[] v() {
        j0 j0Var = this.f23622a;
        g gVar = this.f23623b;
        gVar.b0(j0Var);
        return gVar.O(gVar.f23643b);
    }

    @Override // ia0.i
    public final InputStream w0() {
        return new ib(this, 3);
    }

    @Override // ia0.i
    public final long y(byte b8, long j9, long j11) {
        if (this.f23624c) {
            h2.b("closed");
            return 0L;
        }
        if (0 > j9 || j9 > j11) {
            StringBuilder sbG = l1.g("fromIndex=", j9, " toIndex=");
            sbG.append(j11);
            throw new IllegalArgumentException(sbG.toString().toString());
        }
        long jMax = j9;
        while (jMax < j11) {
            g gVar = this.f23623b;
            byte b11 = b8;
            long j12 = j11;
            long jY = gVar.y(b11, jMax, j12);
            if (jY != -1) {
                return jY;
            }
            long j13 = gVar.f23643b;
            if (j13 >= j12 || this.f23622a.F(gVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            b8 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // ia0.i
    public final long z(long j9, j jVar) {
        jVar.getClass();
        return ja0.d.a(this, jVar, jVar.e(), 0L, j9);
    }
}
