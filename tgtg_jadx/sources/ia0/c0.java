package ia0;

import com.braze.h2;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f23611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f23612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23613c;

    public c0(h0 h0Var) {
        h0Var.getClass();
        this.f23611a = h0Var;
        this.f23612b = new g();
    }

    @Override // ia0.h
    public final h M(String str) {
        str.getClass();
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.F0(str);
        a();
        return this;
    }

    public final h a() {
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        g gVar = this.f23612b;
        long jU = gVar.u();
        if (jU > 0) {
            this.f23611a.x(gVar, jU);
        }
        return this;
    }

    @Override // ia0.h
    public final long b0(j0 j0Var) {
        j0Var.getClass();
        long j9 = 0;
        while (true) {
            long jF = j0Var.F(this.f23612b, 8192L);
            if (jF == -1) {
                return j9;
            }
            j9 += jF;
            a();
        }
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        h0 h0Var = this.f23611a;
        if (this.f23613c) {
            return;
        }
        try {
            g gVar = this.f23612b;
            long j9 = gVar.f23643b;
            if (j9 > 0) {
                h0Var.x(gVar, j9);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            h0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f23613c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ia0.h, ia0.h0, java.io.Flushable
    public final void flush() {
        if (this.f23613c) {
            h2.b("closed");
            return;
        }
        g gVar = this.f23612b;
        long j9 = gVar.f23643b;
        h0 h0Var = this.f23611a;
        if (j9 > 0) {
            h0Var.x(gVar, j9);
        }
        h0Var.flush();
    }

    @Override // ia0.h
    public final g h() {
        return this.f23612b;
    }

    @Override // ia0.h0
    public final l0 i() {
        return this.f23611a.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f23613c;
    }

    @Override // ia0.h
    public final h n0(int i11, int i12, byte[] bArr) {
        bArr.getClass();
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.write(bArr, i11, i12);
        a();
        return this;
    }

    @Override // ia0.h
    public final h o0(j jVar) {
        jVar.getClass();
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.y0(jVar);
        a();
        return this;
    }

    @Override // ia0.h
    public final h s0(long j9) {
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.A0(j9);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f23611a + ')';
    }

    @Override // ia0.h
    public final h write(byte[] bArr) {
        bArr.getClass();
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.write(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // ia0.h
    public final h writeByte(int i11) {
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.z0(i11);
        a();
        return this;
    }

    @Override // ia0.h
    public final h writeInt(int i11) {
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.C0(i11);
        a();
        return this;
    }

    @Override // ia0.h
    public final h writeShort(int i11) {
        if (this.f23613c) {
            h2.b("closed");
            return null;
        }
        this.f23612b.D0(i11);
        a();
        return this;
    }

    @Override // ia0.h0
    public final void x(g gVar, long j9) {
        gVar.getClass();
        if (this.f23613c) {
            h2.b("closed");
        } else {
            this.f23612b.x(gVar, j9);
            a();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f23613c) {
            int iWrite = this.f23612b.write(byteBuffer);
            a();
            return iWrite;
        }
        h2.b("closed");
        return 0;
    }
}
