package okhttp3.internal.platform;

import aa0.d;
import aa0.e;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import ma.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lma/b;", "Laa0/e;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformInitializer implements b {
    @Override // ma.b
    public final Object create(Context context) {
        context.getClass();
        e eVar = e.f1191a;
        Object obj = e.f1191a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f1191a;
    }

    @Override // ma.b
    public final List dependencies() {
        return n0.f26529a;
    }
}
