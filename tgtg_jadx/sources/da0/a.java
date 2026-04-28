package da0;

import aa0.d;
import aa0.e;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import ia0.u;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14852f = "PublicSuffixDatabase.list";

    @Override // da0.b
    public final u a() throws IOException {
        e eVar = e.f1191a;
        Object obj = e.f1191a;
        d dVar = obj != null ? (d) obj : null;
        Context contextB = dVar != null ? dVar.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open(this.f14852f);
            inputStreamOpen.getClass();
            return ia0.b.g(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            i4.a.k("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        i4.a.k("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }
}
