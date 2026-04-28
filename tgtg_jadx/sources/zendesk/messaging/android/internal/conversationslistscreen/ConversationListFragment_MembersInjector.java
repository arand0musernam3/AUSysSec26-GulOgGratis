package zendesk.messaging.android.internal.conversationslistscreen;

import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.messaging.android.internal.messagingscreen.MessagingNavigator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationListFragment_MembersInjector implements j70.a {
    private final s70.c conversationsListScreenViewModelFactoryProvider;
    private final s70.c featureFlagManagerProvider;
    private final s70.c messagingNavigatorProvider;
    private final s70.c messagingSettingsProvider;
    private final s70.c userDarkColorsProvider;
    private final s70.c userLightColorsProvider;

    private ConversationListFragment_MembersInjector(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5, s70.c cVar6) {
        this.conversationsListScreenViewModelFactoryProvider = cVar;
        this.messagingSettingsProvider = cVar2;
        this.userDarkColorsProvider = cVar3;
        this.userLightColorsProvider = cVar4;
        this.featureFlagManagerProvider = cVar5;
        this.messagingNavigatorProvider = cVar6;
    }

    public static j70.a create(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5, s70.c cVar6) {
        return new ConversationListFragment_MembersInjector(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static void injectConversationsListScreenViewModelFactory(ConversationListFragment conversationListFragment, ConversationsListScreenViewModelFactory conversationsListScreenViewModelFactory) {
        conversationListFragment.conversationsListScreenViewModelFactory = conversationsListScreenViewModelFactory;
    }

    public static void injectFeatureFlagManager(ConversationListFragment conversationListFragment, FeatureFlagManager featureFlagManager) {
        conversationListFragment.featureFlagManager = featureFlagManager;
    }

    public static void injectMessagingNavigator(ConversationListFragment conversationListFragment, MessagingNavigator messagingNavigator) {
        conversationListFragment.messagingNavigator = messagingNavigator;
    }

    public static void injectMessagingSettings(ConversationListFragment conversationListFragment, MessagingSettings messagingSettings) {
        conversationListFragment.messagingSettings = messagingSettings;
    }

    public static void injectUserDarkColors(ConversationListFragment conversationListFragment, UserColors userColors) {
        conversationListFragment.userDarkColors = userColors;
    }

    public static void injectUserLightColors(ConversationListFragment conversationListFragment, UserColors userColors) {
        conversationListFragment.userLightColors = userColors;
    }

    public void injectMembers(ConversationListFragment conversationListFragment) {
        injectConversationsListScreenViewModelFactory(conversationListFragment, (ConversationsListScreenViewModelFactory) this.conversationsListScreenViewModelFactoryProvider.get());
        injectMessagingSettings(conversationListFragment, (MessagingSettings) this.messagingSettingsProvider.get());
        injectUserDarkColors(conversationListFragment, (UserColors) this.userDarkColorsProvider.get());
        injectUserLightColors(conversationListFragment, (UserColors) this.userLightColorsProvider.get());
        injectFeatureFlagManager(conversationListFragment, (FeatureFlagManager) this.featureFlagManagerProvider.get());
        injectMessagingNavigator(conversationListFragment, (MessagingNavigator) this.messagingNavigatorProvider.get());
    }
}
