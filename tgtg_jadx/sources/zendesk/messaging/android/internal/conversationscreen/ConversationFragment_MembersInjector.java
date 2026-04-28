package zendesk.messaging.android.internal.conversationscreen;

import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.guidekit.android.GuideKit;
import zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver;
import zendesk.messaging.android.internal.messagingscreen.MessagingNavigator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationFragment_MembersInjector implements j70.a {
    private final s70.c backNavigationResolverProvider;
    private final s70.c conversationScreenViewModelFactoryProvider;
    private final s70.c featureFlagManagerProvider;
    private final s70.c guideKitProvider;
    private final s70.c messagingNavigatorProvider;
    private final s70.c messagingSettingsProvider;
    private final s70.c userDarkColorsProvider;
    private final s70.c userLightColorsProvider;

    private ConversationFragment_MembersInjector(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5, s70.c cVar6, s70.c cVar7, s70.c cVar8) {
        this.conversationScreenViewModelFactoryProvider = cVar;
        this.messagingSettingsProvider = cVar2;
        this.userDarkColorsProvider = cVar3;
        this.userLightColorsProvider = cVar4;
        this.guideKitProvider = cVar5;
        this.messagingNavigatorProvider = cVar6;
        this.backNavigationResolverProvider = cVar7;
        this.featureFlagManagerProvider = cVar8;
    }

    public static j70.a create(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5, s70.c cVar6, s70.c cVar7, s70.c cVar8) {
        return new ConversationFragment_MembersInjector(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static void injectBackNavigationResolver(ConversationFragment conversationFragment, BackNavigationResolver backNavigationResolver) {
        conversationFragment.backNavigationResolver = backNavigationResolver;
    }

    public static void injectConversationScreenViewModelFactory(ConversationFragment conversationFragment, ConversationScreenViewModelFactory conversationScreenViewModelFactory) {
        conversationFragment.conversationScreenViewModelFactory = conversationScreenViewModelFactory;
    }

    public static void injectFeatureFlagManager(ConversationFragment conversationFragment, FeatureFlagManager featureFlagManager) {
        conversationFragment.featureFlagManager = featureFlagManager;
    }

    public static void injectGuideKit(ConversationFragment conversationFragment, GuideKit guideKit) {
        conversationFragment.guideKit = guideKit;
    }

    public static void injectMessagingNavigator(ConversationFragment conversationFragment, MessagingNavigator messagingNavigator) {
        conversationFragment.messagingNavigator = messagingNavigator;
    }

    public static void injectMessagingSettings(ConversationFragment conversationFragment, MessagingSettings messagingSettings) {
        conversationFragment.messagingSettings = messagingSettings;
    }

    public static void injectUserDarkColors(ConversationFragment conversationFragment, UserColors userColors) {
        conversationFragment.userDarkColors = userColors;
    }

    public static void injectUserLightColors(ConversationFragment conversationFragment, UserColors userColors) {
        conversationFragment.userLightColors = userColors;
    }

    public void injectMembers(ConversationFragment conversationFragment) {
        injectConversationScreenViewModelFactory(conversationFragment, (ConversationScreenViewModelFactory) this.conversationScreenViewModelFactoryProvider.get());
        injectMessagingSettings(conversationFragment, (MessagingSettings) this.messagingSettingsProvider.get());
        injectUserDarkColors(conversationFragment, (UserColors) this.userDarkColorsProvider.get());
        injectUserLightColors(conversationFragment, (UserColors) this.userLightColorsProvider.get());
        injectGuideKit(conversationFragment, (GuideKit) this.guideKitProvider.get());
        injectMessagingNavigator(conversationFragment, (MessagingNavigator) this.messagingNavigatorProvider.get());
        injectBackNavigationResolver(conversationFragment, (BackNavigationResolver) this.backNavigationResolverProvider.get());
        injectFeatureFlagManager(conversationFragment, (FeatureFlagManager) this.featureFlagManagerProvider.get());
    }
}
