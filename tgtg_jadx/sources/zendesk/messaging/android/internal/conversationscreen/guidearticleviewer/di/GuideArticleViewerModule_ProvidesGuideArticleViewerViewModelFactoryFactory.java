package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di;

import android.os.Bundle;
import ea.f;
import o00.x0;
import s70.c;
import zendesk.guidekit.android.GuideKit;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModelFactory;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class GuideArticleViewerModule_ProvidesGuideArticleViewerViewModelFactoryFactory implements c {
    private final c defaultArgsProvider;
    private final c guideKitProvider;
    private final c messagingEventDispatcherProvider;
    private final GuideArticleViewerModule module;
    private final c savedStateRegistryOwnerProvider;

    private GuideArticleViewerModule_ProvidesGuideArticleViewerViewModelFactoryFactory(GuideArticleViewerModule guideArticleViewerModule, c cVar, c cVar2, c cVar3, c cVar4) {
        this.module = guideArticleViewerModule;
        this.guideKitProvider = cVar;
        this.messagingEventDispatcherProvider = cVar2;
        this.savedStateRegistryOwnerProvider = cVar3;
        this.defaultArgsProvider = cVar4;
    }

    public static GuideArticleViewerModule_ProvidesGuideArticleViewerViewModelFactoryFactory create(GuideArticleViewerModule guideArticleViewerModule, c cVar, c cVar2, c cVar3, c cVar4) {
        return new GuideArticleViewerModule_ProvidesGuideArticleViewerViewModelFactoryFactory(guideArticleViewerModule, cVar, cVar2, cVar3, cVar4);
    }

    public static GuideArticleViewerViewModelFactory providesGuideArticleViewerViewModelFactory(GuideArticleViewerModule guideArticleViewerModule, GuideKit guideKit, MessagingEventDispatcher messagingEventDispatcher, f fVar, Bundle bundle) {
        GuideArticleViewerViewModelFactory guideArticleViewerViewModelFactoryProvidesGuideArticleViewerViewModelFactory = guideArticleViewerModule.providesGuideArticleViewerViewModelFactory(guideKit, messagingEventDispatcher, fVar, bundle);
        x0.o(guideArticleViewerViewModelFactoryProvidesGuideArticleViewerViewModelFactory);
        return guideArticleViewerViewModelFactoryProvidesGuideArticleViewerViewModelFactory;
    }

    @Override // t70.a
    public GuideArticleViewerViewModelFactory get() {
        return providesGuideArticleViewerViewModelFactory(this.module, (GuideKit) this.guideKitProvider.get(), (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get(), (f) this.savedStateRegistryOwnerProvider.get(), (Bundle) this.defaultArgsProvider.get());
    }
}
