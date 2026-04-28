package zendesk.messaging.android.internal.messagingscreen;

import android.content.Intent;
import j4.s;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.IntentDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\"/\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"<set-?>", "", "credentials", "Landroid/content/Intent;", "getCredentials", "(Landroid/content/Intent;)Ljava/lang/String;", "setCredentials", "(Landroid/content/Intent;Ljava/lang/String;)V", "credentials$delegate", "Lzendesk/messaging/android/internal/IntentDelegate$String;", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MessagingActivityIntentBuilderKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(MessagingActivityIntentBuilderKt.class, "credentials", "getCredentials(Landroid/content/Intent;)Ljava/lang/String;", 1)};

    @NotNull
    private static final IntentDelegate.String credentials$delegate = new IntentDelegate.String("CREDENTIALS");

    @NotNull
    public static final String getCredentials(@NotNull Intent intent) {
        intent.getClass();
        return credentials$delegate.getValue(intent, $$delegatedProperties[0]);
    }

    public static final void setCredentials(@NotNull Intent intent, @NotNull String str) {
        intent.getClass();
        str.getClass();
        credentials$delegate.setValue(intent, $$delegatedProperties[0], str);
    }
}
