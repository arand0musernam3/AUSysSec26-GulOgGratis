package zendesk.messaging.android.internal.conversationscreen;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.IntentDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\nR/\u0010\u0006\u001a\u00020\u0005*\u00020\n2\u0006\u0010\t\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ImageViewerActivityIntentBuilder;", "", "context", "Landroid/content/Context;", "credentials", "", "conversationId", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "Landroid/content/Intent;", "getConversationId", "(Landroid/content/Intent;)Ljava/lang/String;", "setConversationId", "(Landroid/content/Intent;Ljava/lang/String;)V", "conversationId$delegate", "Lzendesk/messaging/android/internal/IntentDelegate$String;", "intent", "withFlags", "flags", "", "withUri", "uri", "withPrivateAttachmentFlag", "isPrivateAttachment", "", "build", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageViewerActivityIntentBuilder {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty2(new MutablePropertyReference2Impl(ImageViewerActivityIntentBuilder.class, "conversationId", "getConversationId(Landroid/content/Intent;)Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: conversationId$delegate, reason: from kotlin metadata */
    @NotNull
    private final IntentDelegate.String conversationId;

    @NotNull
    private final Intent intent;

    public ImageViewerActivityIntentBuilder(@NotNull Context context, @NotNull String str, @Nullable String str2) {
        context.getClass();
        str.getClass();
        this.conversationId = new IntentDelegate.String(ConversationFragment.ARG_CONVERSATION_ID);
        Intent intent = new Intent(context, (Class<?>) ImageViewerActivity.class);
        this.intent = intent;
        ImageViewerActivityKt.setCredentials(intent, str);
        if (str2 != null) {
            setConversationId(intent, str2);
        }
    }

    private final String getConversationId(Intent intent) {
        return this.conversationId.getValue(intent, $$delegatedProperties[0]);
    }

    private final void setConversationId(Intent intent, String str) {
        this.conversationId.setValue(intent, $$delegatedProperties[0], str);
    }

    @NotNull
    /* JADX INFO: renamed from: build, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    public final ImageViewerActivityIntentBuilder withFlags(int flags) {
        this.intent.setFlags(flags);
        return this;
    }

    @NotNull
    public final ImageViewerActivityIntentBuilder withPrivateAttachmentFlag(boolean isPrivateAttachment) {
        ImageViewerActivityKt.setPrivateAttachmentFlag(this.intent, isPrivateAttachment);
        return this;
    }

    @NotNull
    public final ImageViewerActivityIntentBuilder withUri(@NotNull String uri) {
        uri.getClass();
        ImageViewerActivityKt.setUri(this.intent, uri);
        return this;
    }
}
