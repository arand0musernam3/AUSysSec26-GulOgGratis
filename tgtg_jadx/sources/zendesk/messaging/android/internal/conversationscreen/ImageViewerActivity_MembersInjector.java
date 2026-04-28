package zendesk.messaging.android.internal.conversationscreen;

import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.core.android.internal.app.FeatureFlagManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageViewerActivity_MembersInjector implements j70.a {
    private final s70.c featureFlagManagerProvider;
    private final s70.c imageViewerViewModelFactoryProvider;
    private final s70.c messagingSettingsProvider;
    private final s70.c userDarkColorsProvider;
    private final s70.c userLightColorsProvider;

    private ImageViewerActivity_MembersInjector(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5) {
        this.imageViewerViewModelFactoryProvider = cVar;
        this.messagingSettingsProvider = cVar2;
        this.userDarkColorsProvider = cVar3;
        this.userLightColorsProvider = cVar4;
        this.featureFlagManagerProvider = cVar5;
    }

    public static j70.a create(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5) {
        return new ImageViewerActivity_MembersInjector(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static void injectFeatureFlagManager(ImageViewerActivity imageViewerActivity, FeatureFlagManager featureFlagManager) {
        imageViewerActivity.featureFlagManager = featureFlagManager;
    }

    public static void injectImageViewerViewModelFactory(ImageViewerActivity imageViewerActivity, ImageViewerViewModelFactory imageViewerViewModelFactory) {
        imageViewerActivity.imageViewerViewModelFactory = imageViewerViewModelFactory;
    }

    public static void injectMessagingSettings(ImageViewerActivity imageViewerActivity, MessagingSettings messagingSettings) {
        imageViewerActivity.messagingSettings = messagingSettings;
    }

    public static void injectUserDarkColors(ImageViewerActivity imageViewerActivity, UserColors userColors) {
        imageViewerActivity.userDarkColors = userColors;
    }

    public static void injectUserLightColors(ImageViewerActivity imageViewerActivity, UserColors userColors) {
        imageViewerActivity.userLightColors = userColors;
    }

    public void injectMembers(ImageViewerActivity imageViewerActivity) {
        injectImageViewerViewModelFactory(imageViewerActivity, (ImageViewerViewModelFactory) this.imageViewerViewModelFactoryProvider.get());
        injectMessagingSettings(imageViewerActivity, (MessagingSettings) this.messagingSettingsProvider.get());
        injectUserDarkColors(imageViewerActivity, (UserColors) this.userDarkColorsProvider.get());
        injectUserLightColors(imageViewerActivity, (UserColors) this.userLightColorsProvider.get());
        injectFeatureFlagManager(imageViewerActivity, (FeatureFlagManager) this.featureFlagManagerProvider.get());
    }
}
