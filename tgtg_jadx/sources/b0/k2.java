package b0;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f5264a = new k2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 != null && !(th2 instanceof CancellationException) && wd.a.B(6, "CXCP")) {
            Log.e("CXCP", "Surface setup error!", th2);
        }
        return Unit.f26487a;
    }
}
