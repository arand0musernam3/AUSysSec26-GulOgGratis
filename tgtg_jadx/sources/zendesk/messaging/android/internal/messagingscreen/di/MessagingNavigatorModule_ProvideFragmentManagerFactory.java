package zendesk.messaging.android.internal.messagingscreen.di;

import androidx.fragment.app.FragmentManager;
import k.h;
import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingNavigatorModule_ProvideFragmentManagerFactory implements c {
    private final c activityProvider;
    private final MessagingNavigatorModule module;

    private MessagingNavigatorModule_ProvideFragmentManagerFactory(MessagingNavigatorModule messagingNavigatorModule, c cVar) {
        this.module = messagingNavigatorModule;
        this.activityProvider = cVar;
    }

    public static MessagingNavigatorModule_ProvideFragmentManagerFactory create(MessagingNavigatorModule messagingNavigatorModule, c cVar) {
        return new MessagingNavigatorModule_ProvideFragmentManagerFactory(messagingNavigatorModule, cVar);
    }

    public static FragmentManager provideFragmentManager(MessagingNavigatorModule messagingNavigatorModule, h hVar) {
        FragmentManager fragmentManagerProvideFragmentManager = messagingNavigatorModule.provideFragmentManager(hVar);
        x0.o(fragmentManagerProvideFragmentManager);
        return fragmentManagerProvideFragmentManager;
    }

    @Override // t70.a
    public FragmentManager get() {
        return provideFragmentManager(this.module, (h) this.activityProvider.get());
    }
}
