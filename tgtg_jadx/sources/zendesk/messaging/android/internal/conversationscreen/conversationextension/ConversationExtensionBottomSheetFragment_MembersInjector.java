package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.core.android.internal.app.FeatureFlagManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationExtensionBottomSheetFragment_MembersInjector implements j70.a {
    private final s70.c conversationExtensionViewModelFactoryProvider;
    private final s70.c featureFlagManagerProvider;
    private final s70.c messagingSettingsProvider;
    private final s70.c userDarkColorsProvider;
    private final s70.c userLightColorsProvider;

    private ConversationExtensionBottomSheetFragment_MembersInjector(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5) {
        this.conversationExtensionViewModelFactoryProvider = cVar;
        this.userDarkColorsProvider = cVar2;
        this.userLightColorsProvider = cVar3;
        this.messagingSettingsProvider = cVar4;
        this.featureFlagManagerProvider = cVar5;
    }

    public static j70.a create(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5) {
        return new ConversationExtensionBottomSheetFragment_MembersInjector(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static void injectConversationExtensionViewModelFactory(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, ConversationExtensionViewModelFactory conversationExtensionViewModelFactory) {
        conversationExtensionBottomSheetFragment.conversationExtensionViewModelFactory = conversationExtensionViewModelFactory;
    }

    public static void injectFeatureFlagManager(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, FeatureFlagManager featureFlagManager) {
        conversationExtensionBottomSheetFragment.featureFlagManager = featureFlagManager;
    }

    public static void injectMessagingSettings(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, MessagingSettings messagingSettings) {
        conversationExtensionBottomSheetFragment.messagingSettings = messagingSettings;
    }

    public static void injectUserDarkColors(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, UserColors userColors) {
        conversationExtensionBottomSheetFragment.userDarkColors = userColors;
    }

    public static void injectUserLightColors(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, UserColors userColors) {
        conversationExtensionBottomSheetFragment.userLightColors = userColors;
    }

    public void injectMembers(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
        injectConversationExtensionViewModelFactory(conversationExtensionBottomSheetFragment, (ConversationExtensionViewModelFactory) this.conversationExtensionViewModelFactoryProvider.get());
        injectUserDarkColors(conversationExtensionBottomSheetFragment, (UserColors) this.userDarkColorsProvider.get());
        injectUserLightColors(conversationExtensionBottomSheetFragment, (UserColors) this.userLightColorsProvider.get());
        injectMessagingSettings(conversationExtensionBottomSheetFragment, (MessagingSettings) this.messagingSettingsProvider.get());
        injectFeatureFlagManager(conversationExtensionBottomSheetFragment, (FeatureFlagManager) this.featureFlagManagerProvider.get());
    }
}
