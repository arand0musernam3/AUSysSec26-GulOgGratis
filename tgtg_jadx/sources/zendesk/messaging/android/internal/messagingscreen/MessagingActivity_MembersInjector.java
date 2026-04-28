package zendesk.messaging.android.internal.messagingscreen;

import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingActivity_MembersInjector implements j70.a {
    private final c messagingNavigatorProvider;
    private final c messagingScreenViewModelFactoryProvider;
    private final c messagingSettingsProvider;
    private final c userDarkColorsProvider;
    private final c userLightColorsProvider;

    private MessagingActivity_MembersInjector(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        this.messagingSettingsProvider = cVar;
        this.userDarkColorsProvider = cVar2;
        this.userLightColorsProvider = cVar3;
        this.messagingScreenViewModelFactoryProvider = cVar4;
        this.messagingNavigatorProvider = cVar5;
    }

    public static j70.a create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        return new MessagingActivity_MembersInjector(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static void injectMessagingNavigator(MessagingActivity messagingActivity, MessagingNavigator messagingNavigator) {
        messagingActivity.messagingNavigator = messagingNavigator;
    }

    public static void injectMessagingScreenViewModelFactory(MessagingActivity messagingActivity, MessagingScreenViewModelFactory messagingScreenViewModelFactory) {
        messagingActivity.messagingScreenViewModelFactory = messagingScreenViewModelFactory;
    }

    public static void injectMessagingSettings(MessagingActivity messagingActivity, MessagingSettings messagingSettings) {
        messagingActivity.messagingSettings = messagingSettings;
    }

    public static void injectUserDarkColors(MessagingActivity messagingActivity, UserColors userColors) {
        messagingActivity.userDarkColors = userColors;
    }

    public static void injectUserLightColors(MessagingActivity messagingActivity, UserColors userColors) {
        messagingActivity.userLightColors = userColors;
    }

    public void injectMembers(MessagingActivity messagingActivity) {
        injectMessagingSettings(messagingActivity, (MessagingSettings) this.messagingSettingsProvider.get());
        injectUserDarkColors(messagingActivity, (UserColors) this.userDarkColorsProvider.get());
        injectUserLightColors(messagingActivity, (UserColors) this.userLightColorsProvider.get());
        injectMessagingScreenViewModelFactory(messagingActivity, (MessagingScreenViewModelFactory) this.messagingScreenViewModelFactoryProvider.get());
        injectMessagingNavigator(messagingActivity, (MessagingNavigator) this.messagingNavigatorProvider.get());
    }
}
