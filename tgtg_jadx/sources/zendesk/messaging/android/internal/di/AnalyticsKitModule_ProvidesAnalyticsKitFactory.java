package zendesk.messaging.android.internal.di;

import android.content.Context;
import o00.x0;
import s70.c;
import v80.b0;
import zendesk.analyticskit.android.AnalyticsKit;
import zendesk.android.messaging.model.MessagingSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsKitModule_ProvidesAnalyticsKitFactory implements c {
    private final c baseUrlProvider;
    private final c contextProvider;
    private final c coroutineScopeProvider;
    private final c messagingSettingsProvider;
    private final AnalyticsKitModule module;

    private AnalyticsKitModule_ProvidesAnalyticsKitFactory(AnalyticsKitModule analyticsKitModule, c cVar, c cVar2, c cVar3, c cVar4) {
        this.module = analyticsKitModule;
        this.contextProvider = cVar;
        this.baseUrlProvider = cVar2;
        this.messagingSettingsProvider = cVar3;
        this.coroutineScopeProvider = cVar4;
    }

    public static AnalyticsKitModule_ProvidesAnalyticsKitFactory create(AnalyticsKitModule analyticsKitModule, c cVar, c cVar2, c cVar3, c cVar4) {
        return new AnalyticsKitModule_ProvidesAnalyticsKitFactory(analyticsKitModule, cVar, cVar2, cVar3, cVar4);
    }

    public static AnalyticsKit providesAnalyticsKit(AnalyticsKitModule analyticsKitModule, Context context, String str, MessagingSettings messagingSettings, b0 b0Var) {
        AnalyticsKit analyticsKitProvidesAnalyticsKit = analyticsKitModule.providesAnalyticsKit(context, str, messagingSettings, b0Var);
        x0.o(analyticsKitProvidesAnalyticsKit);
        return analyticsKitProvidesAnalyticsKit;
    }

    @Override // t70.a
    public AnalyticsKit get() {
        return providesAnalyticsKit(this.module, (Context) this.contextProvider.get(), (String) this.baseUrlProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get(), (b0) this.coroutineScopeProvider.get());
    }
}
