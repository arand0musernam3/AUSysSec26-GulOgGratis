package zendesk.android.internal.network;

import android.content.Context;
import java.io.File;
import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_CacheDirFactory implements c {
    private final c contextProvider;
    private final NetworkModule module;

    private NetworkModule_CacheDirFactory(NetworkModule networkModule, c cVar) {
        this.module = networkModule;
        this.contextProvider = cVar;
    }

    public static File cacheDir(NetworkModule networkModule, Context context) {
        File fileCacheDir = networkModule.cacheDir(context);
        x0.o(fileCacheDir);
        return fileCacheDir;
    }

    public static NetworkModule_CacheDirFactory create(NetworkModule networkModule, c cVar) {
        return new NetworkModule_CacheDirFactory(networkModule, cVar);
    }

    @Override // t70.a
    public File get() {
        return cacheDir(this.module, (Context) this.contextProvider.get());
    }
}
