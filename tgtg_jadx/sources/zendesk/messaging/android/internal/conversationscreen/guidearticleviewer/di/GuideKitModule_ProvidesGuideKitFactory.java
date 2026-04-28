package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di;

import android.content.Context;
import o00.x0;
import s70.c;
import v80.b0;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.guidekit.android.GuideKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class GuideKitModule_ProvidesGuideKitFactory implements c {
    private final c baseUrlProvider;
    private final c contextProvider;
    private final c coroutineScopeProvider;
    private final c messagingSettingsProvider;
    private final GuideKitModule module;

    private GuideKitModule_ProvidesGuideKitFactory(GuideKitModule guideKitModule, c cVar, c cVar2, c cVar3, c cVar4) {
        this.module = guideKitModule;
        this.contextProvider = cVar;
        this.baseUrlProvider = cVar2;
        this.messagingSettingsProvider = cVar3;
        this.coroutineScopeProvider = cVar4;
    }

    public static GuideKitModule_ProvidesGuideKitFactory create(GuideKitModule guideKitModule, c cVar, c cVar2, c cVar3, c cVar4) {
        return new GuideKitModule_ProvidesGuideKitFactory(guideKitModule, cVar, cVar2, cVar3, cVar4);
    }

    public static GuideKit providesGuideKit(GuideKitModule guideKitModule, Context context, String str, MessagingSettings messagingSettings, b0 b0Var) {
        GuideKit guideKitProvidesGuideKit = guideKitModule.providesGuideKit(context, str, messagingSettings, b0Var);
        x0.o(guideKitProvidesGuideKit);
        return guideKitProvidesGuideKit;
    }

    @Override // t70.a
    public GuideKit get() {
        return providesGuideKit(this.module, (Context) this.contextProvider.get(), (String) this.baseUrlProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get(), (b0) this.coroutineScopeProvider.get());
    }
}
