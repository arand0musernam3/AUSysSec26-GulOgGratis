package zendesk.analyticskit.android.internal;

import s70.c;
import zendesk.analyticskit.android.internal.data.AnalyticsRepository;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAnalyticsKit_Factory implements c {
    private final c analyticsRepositoryProvider;

    private DefaultAnalyticsKit_Factory(c cVar) {
        this.analyticsRepositoryProvider = cVar;
    }

    public static DefaultAnalyticsKit_Factory create(c cVar) {
        return new DefaultAnalyticsKit_Factory(cVar);
    }

    public static DefaultAnalyticsKit newInstance(AnalyticsRepository analyticsRepository) {
        return new DefaultAnalyticsKit(analyticsRepository);
    }

    @Override // t70.a
    public DefaultAnalyticsKit get() {
        return newInstance((AnalyticsRepository) this.analyticsRepositoryProvider.get());
    }
}
