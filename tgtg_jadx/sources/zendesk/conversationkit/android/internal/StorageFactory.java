package zendesk.conversationkit.android.internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import w.a0;
import zendesk.conversationkit.android.internal.app.AppStorage;
import zendesk.conversationkit.android.internal.metadata.MetadataStorage;
import zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage;
import zendesk.conversationkit.android.internal.user.UserStorage;
import zendesk.storage.android.Serializer;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006\""}, d2 = {"Lzendesk/conversationkit/android/internal/StorageFactory;", "", "Landroid/content/Context;", "context", "Lzendesk/storage/android/Serializer;", "serializer", "", "integrationId", "Ln90/c;", "json", "<init>", "(Landroid/content/Context;Lzendesk/storage/android/Serializer;Ljava/lang/String;Ln90/c;)V", "Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "createConversationKitStorage", "()Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "appId", "Lzendesk/conversationkit/android/internal/app/AppStorage;", "createAppStorage", "(Ljava/lang/String;)Lzendesk/conversationkit/android/internal/app/AppStorage;", "userId", "Lzendesk/conversationkit/android/internal/user/UserStorage;", "createUserStorage", "(Ljava/lang/String;)Lzendesk/conversationkit/android/internal/user/UserStorage;", "Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;", "createProactiveMessagingStorage", "()Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;", "Lzendesk/conversationkit/android/internal/metadata/MetadataStorage;", "createMetadataStorage", "(Ljava/lang/String;)Lzendesk/conversationkit/android/internal/metadata/MetadataStorage;", "Landroid/content/Context;", "Lzendesk/storage/android/Serializer;", "Ljava/lang/String;", "Ln90/c;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StorageFactory {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String PROACTIVE_MESSAGING_STORAGE_NAMESPACE = "zendesk.conversationkit.proactivemessaging";

    @NotNull
    private final Context context;

    @NotNull
    private final String integrationId;

    @NotNull
    private final n90.c json;

    @NotNull
    private final Serializer serializer;

    public StorageFactory(@NotNull Context context, @NotNull Serializer serializer, @NotNull String str, @NotNull n90.c cVar) {
        context.getClass();
        serializer.getClass();
        str.getClass();
        cVar.getClass();
        this.context = context;
        this.serializer = serializer;
        this.integrationId = str;
        this.json = cVar;
    }

    @NotNull
    public final AppStorage createAppStorage(@NotNull String appId) {
        appId.getClass();
        return new AppStorage(zendesk.storage.android.StorageFactory.INSTANCE.create(e0.f.k("zendesk.conversationkit.app.", appId), this.context, new StorageType.Complex(this.serializer), this.integrationId));
    }

    @NotNull
    public final ConversationKitStorage createConversationKitStorage() {
        return new ConversationKitStorage(zendesk.storage.android.StorageFactory.INSTANCE.create("zendesk.conversationkit", this.context, StorageType.Basic.INSTANCE, this.integrationId));
    }

    @NotNull
    public final MetadataStorage createMetadataStorage(@NotNull String appId) {
        appId.getClass();
        return new MetadataStorage(zendesk.storage.android.StorageFactory.INSTANCE.create(a0.p("zendesk.conversationkit.app.", appId, ".metadata"), this.context, new StorageType.Complex(this.serializer), this.integrationId), this.json);
    }

    @NotNull
    public final ProactiveMessagingStorage createProactiveMessagingStorage() {
        return new ProactiveMessagingStorage(zendesk.storage.android.StorageFactory.INSTANCE.create(PROACTIVE_MESSAGING_STORAGE_NAMESPACE, this.context, new StorageType.Complex(this.serializer), this.integrationId));
    }

    @NotNull
    public final UserStorage createUserStorage(@NotNull String userId) {
        userId.getClass();
        return new UserStorage(zendesk.storage.android.StorageFactory.INSTANCE.create(e0.f.k("zendesk.conversationkit.user.", userId), this.context, new StorageType.Complex(this.serializer), this.integrationId));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/conversationkit/android/internal/StorageFactory$Companion;", "", "<init>", "()V", "PROACTIVE_MESSAGING_STORAGE_NAMESPACE", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
