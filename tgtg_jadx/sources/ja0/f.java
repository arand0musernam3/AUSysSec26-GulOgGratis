package ja0;

import com.google.firebase.messaging.a0;
import ia0.e0;
import ia0.f0;
import ia0.h0;
import ia0.l0;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f24800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f24801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f24802c;

    public f(a0 a0Var) {
        this.f24802c = a0Var;
        Socket socket = (Socket) a0Var.f12779b;
        this.f24800a = socket.getOutputStream();
        this.f24801b = new k(socket);
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        int i11;
        OutputStream outputStream = this.f24800a;
        a0 a0Var = this.f24802c;
        k kVar = this.f24801b;
        kVar.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) a0Var.f12780c;
            Socket socket = (Socket) a0Var.f12779b;
            atomicInteger.getClass();
            while (true) {
                int i12 = atomicInteger.get();
                if ((i12 & 1) != 0) {
                    i11 = 0;
                    break;
                }
                int i13 = i12 | 1;
                if (atomicInteger.compareAndSet(i12, i13)) {
                    i11 = i13;
                    break;
                }
            }
            if (i11 != 0) {
                if (i11 != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // ia0.h0, java.io.Flushable
    public final void flush() throws IOException {
        k kVar = this.f24801b;
        kVar.i();
        try {
            this.f24800a.flush();
            if (kVar.j()) {
                throw kVar.k(null);
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

    @Override // ia0.h0
    public final l0 i() {
        return this.f24801b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f24802c.f12779b) + ')';
    }

    @Override // ia0.h0
    public final void x(ia0.g gVar, long j9) throws IOException {
        gVar.getClass();
        ia0.b.e(gVar.f23643b, 0L, j9);
        while (j9 > 0) {
            k kVar = this.f24801b;
            kVar.f();
            e0 e0Var = gVar.f23642a;
            e0Var.getClass();
            int iMin = (int) Math.min(j9, e0Var.f23627c - e0Var.f23626b);
            kVar.i();
            try {
                try {
                    this.f24800a.write(e0Var.f23625a, e0Var.f23626b, iMin);
                    if (kVar.j()) {
                        throw kVar.k(null);
                    }
                    int i11 = e0Var.f23626b + iMin;
                    e0Var.f23626b = i11;
                    long j11 = iMin;
                    j9 -= j11;
                    gVar.f23643b -= j11;
                    if (i11 == e0Var.f23627c) {
                        gVar.f23642a = e0Var.a();
                        f0.a(e0Var);
                    }
                } catch (IOException e5) {
                    if (!kVar.j()) {
                        throw e5;
                    }
                    throw kVar.k(e5);
                }
            } catch (Throwable th2) {
                kVar.j();
                throw th2;
            }
        }
    }
}
