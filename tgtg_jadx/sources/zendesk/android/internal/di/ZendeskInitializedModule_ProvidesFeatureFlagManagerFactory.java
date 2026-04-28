package zendesk.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.core.android.internal.app.FeatureFlagManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskInitializedModule_ProvidesFeatureFlagManagerFactory implements c {
    private final ZendeskInitializedModule module;

    private ZendeskInitializedModule_ProvidesFeatureFlagManagerFactory(ZendeskInitializedModule zendeskInitializedModule) {
        this.module = zendeskInitializedModule;
    }

    public static ZendeskInitializedModule_ProvidesFeatureFlagManagerFactory create(ZendeskInitializedModule zendeskInitializedModule) {
        return new ZendeskInitializedModule_ProvidesFeatureFlagManagerFactory(zendeskInitializedModule);
    }

    public static FeatureFlagManager providesFeatureFlagManager(ZendeskInitializedModule zendeskInitializedModule) {
        FeatureFlagManager featureFlagManager = zendeskInitializedModule.getFeatureFlagManager();
        x0.o(featureFlagManager);
        return featureFlagManager;
    }

    @Override // t70.a
    public FeatureFlagManager get() {
        return providesFeatureFlagManager(this.module);
    }
}
