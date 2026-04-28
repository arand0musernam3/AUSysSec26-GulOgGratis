package d10;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13701b;

    public /* synthetic */ i(int i11, g gVar) {
        this.f13700a = i11;
        this.f13701b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13700a) {
            case 0:
                this.f13701b.c(new TimeoutException());
                break;
            default:
                if (this.f13701b.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
                break;
        }
    }
}
