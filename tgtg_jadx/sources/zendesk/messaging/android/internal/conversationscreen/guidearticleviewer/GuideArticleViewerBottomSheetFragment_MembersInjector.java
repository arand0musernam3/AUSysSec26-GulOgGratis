package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer;

import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.guidekit.android.GuideKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class GuideArticleViewerBottomSheetFragment_MembersInjector implements j70.a {
    private final c baseUrlProvider;
    private final c guideArticleViewerViewModelFactoryProvider;
    private final c guideKitProvider;
    private final c messagingSettingsProvider;
    private final c userDarkColorsProvider;
    private final c userLightColorsProvider;

    private GuideArticleViewerBottomSheetFragment_MembersInjector(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        this.guideKitProvider = cVar;
        this.guideArticleViewerViewModelFactoryProvider = cVar2;
        this.userDarkColorsProvider = cVar3;
        this.userLightColorsProvider = cVar4;
        this.baseUrlProvider = cVar5;
        this.messagingSettingsProvider = cVar6;
    }

    public static j70.a create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        return new GuideArticleViewerBottomSheetFragment_MembersInjector(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static void injectBaseUrl(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, String str) {
        guideArticleViewerBottomSheetFragment.baseUrl = str;
    }

    public static void injectGuideArticleViewerViewModelFactory(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, GuideArticleViewerViewModelFactory guideArticleViewerViewModelFactory) {
        guideArticleViewerBottomSheetFragment.guideArticleViewerViewModelFactory = guideArticleViewerViewModelFactory;
    }

    public static void injectGuideKit(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, GuideKit guideKit) {
        guideArticleViewerBottomSheetFragment.guideKit = guideKit;
    }

    public static void injectMessagingSettings(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, MessagingSettings messagingSettings) {
        guideArticleViewerBottomSheetFragment.messagingSettings = messagingSettings;
    }

    public static void injectUserDarkColors(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, UserColors userColors) {
        guideArticleViewerBottomSheetFragment.userDarkColors = userColors;
    }

    public static void injectUserLightColors(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, UserColors userColors) {
        guideArticleViewerBottomSheetFragment.userLightColors = userColors;
    }

    public void injectMembers(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment) {
        injectGuideKit(guideArticleViewerBottomSheetFragment, (GuideKit) this.guideKitProvider.get());
        injectGuideArticleViewerViewModelFactory(guideArticleViewerBottomSheetFragment, (GuideArticleViewerViewModelFactory) this.guideArticleViewerViewModelFactoryProvider.get());
        injectUserDarkColors(guideArticleViewerBottomSheetFragment, (UserColors) this.userDarkColorsProvider.get());
        injectUserLightColors(guideArticleViewerBottomSheetFragment, (UserColors) this.userLightColorsProvider.get());
        injectBaseUrl(guideArticleViewerBottomSheetFragment, (String) this.baseUrlProvider.get());
        injectMessagingSettings(guideArticleViewerBottomSheetFragment, (MessagingSettings) this.messagingSettingsProvider.get());
    }
}
