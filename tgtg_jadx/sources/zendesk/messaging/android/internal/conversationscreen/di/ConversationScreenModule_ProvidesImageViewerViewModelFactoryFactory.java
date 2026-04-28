package zendesk.messaging.android.internal.conversationscreen.di;

import android.os.Bundle;
import ea.f;
import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.conversationscreen.ImageViewerViewModelFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationScreenModule_ProvidesImageViewerViewModelFactoryFactory implements c {
    private final c defaultArgsProvider;
    private final ConversationScreenModule module;
    private final c savedStateRegistryOwnerProvider;

    private ConversationScreenModule_ProvidesImageViewerViewModelFactoryFactory(ConversationScreenModule conversationScreenModule, c cVar, c cVar2) {
        this.module = conversationScreenModule;
        this.savedStateRegistryOwnerProvider = cVar;
        this.defaultArgsProvider = cVar2;
    }

    public static ConversationScreenModule_ProvidesImageViewerViewModelFactoryFactory create(ConversationScreenModule conversationScreenModule, c cVar, c cVar2) {
        return new ConversationScreenModule_ProvidesImageViewerViewModelFactoryFactory(conversationScreenModule, cVar, cVar2);
    }

    public static ImageViewerViewModelFactory providesImageViewerViewModelFactory(ConversationScreenModule conversationScreenModule, f fVar, Bundle bundle) {
        ImageViewerViewModelFactory imageViewerViewModelFactoryProvidesImageViewerViewModelFactory = conversationScreenModule.providesImageViewerViewModelFactory(fVar, bundle);
        x0.o(imageViewerViewModelFactoryProvidesImageViewerViewModelFactory);
        return imageViewerViewModelFactoryProvidesImageViewerViewModelFactory;
    }

    @Override // t70.a
    public ImageViewerViewModelFactory get() {
        return providesImageViewerViewModelFactory(this.module, (f) this.savedStateRegistryOwnerProvider.get(), (Bundle) this.defaultArgsProvider.get());
    }
}
