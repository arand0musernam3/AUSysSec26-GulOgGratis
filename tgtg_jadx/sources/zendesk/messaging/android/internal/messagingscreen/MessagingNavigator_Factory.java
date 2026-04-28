package zendesk.messaging.android.internal.messagingscreen;

import androidx.fragment.app.FragmentManager;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingNavigator_Factory implements c {
    private final c fragmentContainerProvider;
    private final c supportFragmentManagerProvider;

    private MessagingNavigator_Factory(c cVar, c cVar2) {
        this.supportFragmentManagerProvider = cVar;
        this.fragmentContainerProvider = cVar2;
    }

    public static MessagingNavigator_Factory create(c cVar, c cVar2) {
        return new MessagingNavigator_Factory(cVar, cVar2);
    }

    public static MessagingNavigator newInstance(FragmentManager fragmentManager, int i11) {
        return new MessagingNavigator(fragmentManager, i11);
    }

    @Override // t70.a
    public MessagingNavigator get() {
        return newInstance((FragmentManager) this.supportFragmentManagerProvider.get(), ((Integer) this.fragmentContainerProvider.get()).intValue());
    }
}
