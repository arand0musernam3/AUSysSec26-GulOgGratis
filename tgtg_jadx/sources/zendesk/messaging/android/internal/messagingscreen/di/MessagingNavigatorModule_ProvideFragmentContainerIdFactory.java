package zendesk.messaging.android.internal.messagingscreen.di;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingNavigatorModule_ProvideFragmentContainerIdFactory implements c {
    private final MessagingNavigatorModule module;

    private MessagingNavigatorModule_ProvideFragmentContainerIdFactory(MessagingNavigatorModule messagingNavigatorModule) {
        this.module = messagingNavigatorModule;
    }

    public static MessagingNavigatorModule_ProvideFragmentContainerIdFactory create(MessagingNavigatorModule messagingNavigatorModule) {
        return new MessagingNavigatorModule_ProvideFragmentContainerIdFactory(messagingNavigatorModule);
    }

    public static int provideFragmentContainerId(MessagingNavigatorModule messagingNavigatorModule) {
        return messagingNavigatorModule.provideFragmentContainerId();
    }

    @Override // t70.a
    public Integer get() {
        return Integer.valueOf(provideFragmentContainerId(this.module));
    }
}
