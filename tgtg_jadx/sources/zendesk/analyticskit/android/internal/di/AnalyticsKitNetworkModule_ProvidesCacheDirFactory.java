package zendesk.analyticskit.android.internal.di;

import android.content.Context;
import java.io.File;
import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitNetworkModule_ProvidesCacheDirFactory implements c {
    private final c contextProvider;
    private final AnalyticsKitNetworkModule module;

    private AnalyticsKitNetworkModule_ProvidesCacheDirFactory(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        this.module = analyticsKitNetworkModule;
        this.contextProvider = cVar;
    }

    public static AnalyticsKitNetworkModule_ProvidesCacheDirFactory create(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        return new AnalyticsKitNetworkModule_ProvidesCacheDirFactory(analyticsKitNetworkModule, cVar);
    }

    public static File providesCacheDir(AnalyticsKitNetworkModule analyticsKitNetworkModule, Context context) {
        File fileProvidesCacheDir = analyticsKitNetworkModule.providesCacheDir(context);
        x0.o(fileProvidesCacheDir);
        return fileProvidesCacheDir;
    }

    @Override // t70.a
    public File get() {
        return providesCacheDir(this.module, (Context) this.contextProvider.get());
    }
}
