package u90;

import com.braze.h2;
import ia0.h0;
import java.io.IOException;
import java.net.ProtocolException;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ia0.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e20.a f40902h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e20.a aVar, h0 h0Var, long j9, boolean z11) {
        super(h0Var);
        h0Var.getClass();
        this.f40902h = aVar;
        this.f40896b = j9;
        this.f40897c = z11;
        this.f40900f = z11;
    }

    public final IOException a(IOException iOException) {
        if (this.f40898d) {
            return iOException;
        }
        this.f40898d = true;
        return e20.a.a(this.f40902h, this.f40897c, iOException, 4);
    }

    @Override // ia0.o, ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f40901g) {
            return;
        }
        this.f40901g = true;
        long j9 = this.f40896b;
        if (j9 != -1 && this.f40899e != j9) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e5) {
            IOException iOExceptionA = a(e5);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    @Override // ia0.o, ia0.h0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e5) {
            IOException iOExceptionA = a(e5);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    @Override // ia0.o, ia0.h0
    public final void x(ia0.g gVar, long j9) throws IOException {
        gVar.getClass();
        if (this.f40901g) {
            h2.b("closed");
            return;
        }
        long j11 = this.f40896b;
        if (j11 != -1 && this.f40899e + j9 > j11) {
            StringBuilder sbG = l1.g("expected ", j11, " bytes but received ");
            sbG.append(this.f40899e + j9);
            throw new ProtocolException(sbG.toString());
        }
        try {
            if (this.f40900f) {
                this.f40900f = false;
            }
            this.f23668a.x(gVar, j9);
            this.f40899e += j9;
        } catch (IOException e5) {
            IOException iOExceptionA = a(e5);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }
}
