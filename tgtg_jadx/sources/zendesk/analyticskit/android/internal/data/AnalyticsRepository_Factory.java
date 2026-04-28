package zendesk.analyticskit.android.internal.data;

import s70.c;
import v80.b0;
import v80.x;
import zendesk.analyticskit.android.internal.storage.AnalyticsStorage;
import zendesk.analyticskit.android.model.AnalyticsSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsRepository_Factory implements c {
    private final c analyticsServiceProvider;
    private final c analyticsSettingsProvider;
    private final c analyticsStorageProvider;
    private final c coroutineScopeProvider;
    private final c ioDispatcherProvider;

    private AnalyticsRepository_Factory(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        this.analyticsSettingsProvider = cVar;
        this.analyticsServiceProvider = cVar2;
        this.analyticsStorageProvider = cVar3;
        this.coroutineScopeProvider = cVar4;
        this.ioDispatcherProvider = cVar5;
    }

    public static AnalyticsRepository_Factory create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        return new AnalyticsRepository_Factory(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static AnalyticsRepository newInstance(AnalyticsSettings analyticsSettings, AnalyticsService analyticsService, AnalyticsStorage analyticsStorage, b0 b0Var, x xVar) {
        return new AnalyticsRepository(analyticsSettings, analyticsService, analyticsStorage, b0Var, xVar);
    }

    @Override // t70.a
    public AnalyticsRepository get() {
        return newInstance((AnalyticsSettings) this.analyticsSettingsProvider.get(), (AnalyticsService) this.analyticsServiceProvider.get(), (AnalyticsStorage) this.analyticsStorageProvider.get(), (b0) this.coroutineScopeProvider.get(), (x) this.ioDispatcherProvider.get());
    }
}
