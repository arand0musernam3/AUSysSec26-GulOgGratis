package ja0;

import com.google.firebase.messaging.a0;
import ia0.e0;
import ia0.f0;
import ia0.j0;
import ia0.l0;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f24803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f24804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f24805c;

    public g(a0 a0Var) {
        this.f24805c = a0Var;
        Socket socket = (Socket) a0Var.f12779b;
        this.f24803a = socket.getInputStream();
        this.f24804b = new k(socket);
    }

    @Override // ia0.j0
    public final long F(ia0.g gVar, long j9) throws IOException {
        gVar.getClass();
        if (j9 == 0) {
            return 0L;
        }
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        k kVar = this.f24804b;
        kVar.f();
        e0 e0VarX0 = gVar.x0(1);
        int iMin = (int) Math.min(j9, 8192 - e0VarX0.f23627c);
        try {
            kVar.i();
            try {
                int i11 = this.f24803a.read(e0VarX0.f23625a, e0VarX0.f23627c, iMin);
                if (kVar.j()) {
                    throw kVar.k(null);
                }
                if (i11 != -1) {
                    e0VarX0.f23627c += i11;
                    long j11 = i11;
                    gVar.f23643b += j11;
                    return j11;
                }
                if (e0VarX0.f23626b != e0VarX0.f23627c) {
                    return -1L;
                }
                gVar.f23642a = e0VarX0.a();
                f0.a(e0VarX0);
                return -1L;
            } catch (IOException e5) {
                if (kVar.j()) {
                    throw kVar.k(e5);
                }
                throw e5;
            } finally {
                kVar.j();
            }
        } catch (AssertionError e11) {
            if (p.a(e11)) {
                throw new IOException(e11);
            }
            throw e11;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i11;
        a0 a0Var = this.f24805c;
        k kVar = this.f24804b;
        kVar.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) a0Var.f12780c;
            Socket socket = (Socket) a0Var.f12779b;
            atomicInteger.getClass();
            while (true) {
                int i12 = atomicInteger.get();
                if ((i12 & 2) != 0) {
                    i11 = 0;
                    break;
                }
                int i13 = i12 | 2;
                if (atomicInteger.compareAndSet(i12, i13)) {
                    i11 = i13;
                    break;
                }
            }
            if (i11 != 0) {
                if (i11 == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f24803a.close();
                    }
                }
                if (kVar.j()) {
                    throw kVar.k(null);
                }
            }
        } catch (IOException e5) {
            if (!kVar.j()) {
                throw e5;
            }
            throw kVar.k(e5);
        } finally {
            kVar.j();
        }
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f24804b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.f24805c.f12779b) + ')';
    }
}
