package zendesk.messaging.android.internal.conversationscreen;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.IntentDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\"/\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"/\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"/\u0010\u0012\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0005\"\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"<set-?>", "", "uri", "Landroid/content/Intent;", "getUri", "(Landroid/content/Intent;)Ljava/lang/String;", "setUri", "(Landroid/content/Intent;Ljava/lang/String;)V", "uri$delegate", "Lzendesk/messaging/android/internal/IntentDelegate$String;", "", "privateAttachmentFlag", "getPrivateAttachmentFlag", "(Landroid/content/Intent;)Z", "setPrivateAttachmentFlag", "(Landroid/content/Intent;Z)V", "privateAttachmentFlag$delegate", "Lzendesk/messaging/android/internal/IntentDelegate$Boolean;", "credentials", "getCredentials", "setCredentials", "credentials$delegate", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ImageViewerActivityKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {j4.s.t(ImageViewerActivityKt.class, "uri", "getUri(Landroid/content/Intent;)Ljava/lang/String;", 1), j4.s.t(ImageViewerActivityKt.class, "privateAttachmentFlag", "getPrivateAttachmentFlag(Landroid/content/Intent;)Z", 1), j4.s.t(ImageViewerActivityKt.class, "credentials", "getCredentials(Landroid/content/Intent;)Ljava/lang/String;", 1)};

    @NotNull
    private static final IntentDelegate.String uri$delegate = new IntentDelegate.String("INTENT_URI");

    @NotNull
    private static final IntentDelegate.Boolean privateAttachmentFlag$delegate = new IntentDelegate.Boolean("INTENT_PRIVATE_ATTACHMENT_FLAG", false);

    @NotNull
    private static final IntentDelegate.String credentials$delegate = new IntentDelegate.String("INTENT_CREDENTIALS");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCredentials(Intent intent) {
        return credentials$delegate.getValue(intent, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPrivateAttachmentFlag(Intent intent) {
        return privateAttachmentFlag$delegate.getValue(intent, $$delegatedProperties[1]).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUri(Intent intent) {
        return uri$delegate.getValue(intent, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCredentials(Intent intent, String str) {
        credentials$delegate.setValue(intent, $$delegatedProperties[2], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPrivateAttachmentFlag(Intent intent, boolean z11) {
        privateAttachmentFlag$delegate.setValue(intent, $$delegatedProperties[1], z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUri(Intent intent, String str) {
        uri$delegate.setValue(intent, $$delegatedProperties[0], str);
    }
}
