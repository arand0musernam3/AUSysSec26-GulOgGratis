package zendesk.messaging.android.internal.messagingscreen.di;

import androidx.fragment.app.FragmentManager;
import k.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/di/MessagingNavigatorModule;", "", "<init>", "()V", "Lk/h;", "activity", "Landroidx/fragment/app/FragmentManager;", "provideFragmentManager", "(Lk/h;)Landroidx/fragment/app/FragmentManager;", "", "provideFragmentContainerId", "()I", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagingNavigatorModule {
    public final int provideFragmentContainerId() {
        return R.id.zma_fragment_container;
    }

    @NotNull
    public final FragmentManager provideFragmentManager(@NotNull h activity) {
        activity.getClass();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        return supportFragmentManager;
    }
}
