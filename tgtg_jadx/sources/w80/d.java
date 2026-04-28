package w80;

import a90.p;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import c90.f;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Random;
import k.j;
import kotlinx.coroutines.DispatchException;
import v80.l;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43296a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43297b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) throws DispatchException {
        int i11 = this.f43296a;
        Object obj = this.f43297b;
        switch (i11) {
            case 0:
                f fVar = p0.f42144a;
                ((l) obj).D(p.f1044a, Long.valueOf(j9));
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? w9.e.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new j((Context) obj, 1), new Random().nextInt(Math.max(1000, 1)) + InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
                break;
        }
    }

    public /* synthetic */ d(l lVar) {
        this.f43297b = lVar;
    }
}
