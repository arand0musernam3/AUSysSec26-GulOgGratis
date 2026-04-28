package he;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements c0 {
    @Override // he.c0
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        f fVar = LottieAnimationView.f8850n;
        Matrix matrix = ve.k.f42293a;
        if ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException)) {
            ve.c.c("Unable to load composition.", th2);
        } else {
            wy.o.k("Unable to parse composition", th2);
        }
    }
}
