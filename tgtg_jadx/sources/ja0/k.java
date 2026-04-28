package ja0;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends ia0.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Socket f24816n;

    public k(Socket socket) {
        this.f24816n = socket;
    }

    @Override // ia0.d
    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // ia0.d
    public final void l() {
        Socket socket = this.f24816n;
        try {
            socket.close();
        } catch (AssertionError e5) {
            if (!p.a(e5)) {
                throw e5;
            }
            p.f24847a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
        } catch (Exception e11) {
            p.f24847a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
