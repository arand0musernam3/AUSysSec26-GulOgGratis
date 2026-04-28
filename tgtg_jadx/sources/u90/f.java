package u90;

import com.braze.h2;
import ia0.j0;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends ia0.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e20.a f40909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e20.a aVar, j0 j0Var, long j9, boolean z11) {
        super(j0Var);
        j0Var.getClass();
        this.f40909h = aVar;
        this.f40903b = j9;
        this.f40904c = z11;
        this.f40906e = true;
        if (j9 == 0) {
            a(null);
        }
    }

    @Override // ia0.p, ia0.j0
    public final long F(ia0.g gVar, long j9) throws IOException {
        e20.a aVar = this.f40909h;
        gVar.getClass();
        if (this.f40908g) {
            h2.b("closed");
            return 0L;
        }
        try {
            long jF = this.f23669a.F(gVar, j9);
            if (this.f40906e) {
                this.f40906e = false;
            }
            if (jF == -1) {
                a(null);
                return -1L;
            }
            long j11 = this.f40905d + jF;
            long j12 = this.f40903b;
            if (j12 == -1 || j11 <= j12) {
                this.f40905d = j11;
                if (((v90.e) aVar.f15581e).b()) {
                    a(null);
                }
                return jF;
            }
            throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
        } catch (IOException e5) {
            IOException iOExceptionA = a(e5);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f40907f) {
            return iOException;
        }
        this.f40907f = true;
        if (iOException == null && this.f40906e) {
            this.f40906e = false;
        }
        return e20.a.a(this.f40909h, this.f40904c, iOException, 8);
    }

    @Override // ia0.p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f40908g) {
            return;
        }
        this.f40908g = true;
        try {
            super.close();
            a(null);
        } catch (IOException e5) {
            IOException iOExceptionA = a(e5);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }
}
