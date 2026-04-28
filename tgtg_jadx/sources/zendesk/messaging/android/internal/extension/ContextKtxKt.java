package zendesk.messaging.android.internal.extension;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"getMessagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroid/content/Context;", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", MessagingComponentKt.USER_LIGHT_COLORS, "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "isNightModeActive", "", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContextKtxKt {
    @NotNull
    public static final MessagingTheme getMessagingTheme(@NotNull Context context, @NotNull MessagingSettings messagingSettings, @NotNull UserColors userColors, @NotNull UserColors userColors2) {
        context.getClass();
        messagingSettings.getClass();
        userColors.getClass();
        userColors2.getClass();
        return isNightModeActive(context) ? MessagingTheme.INSTANCE.from(context, messagingSettings.getDarkTheme(), userColors2) : MessagingTheme.INSTANCE.from(context, messagingSettings.getLightTheme(), userColors);
    }

    private static final boolean isNightModeActive(Context context) {
        int i11;
        int i12 = AppCompatDelegate.i();
        if (i12 == 2) {
            return true;
        }
        return (i12 == 1 || (i11 = context.getResources().getConfiguration().uiMode & 48) == 0 || i11 == 16 || i11 != 32) ? false : true;
    }
}
