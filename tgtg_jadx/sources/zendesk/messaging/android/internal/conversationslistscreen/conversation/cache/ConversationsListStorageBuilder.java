package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import android.content.Context;
import c90.e;
import c90.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.p0;
import v80.x;
import zendesk.storage.android.StorageFactory;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListStorageBuilder;", "", "Landroid/content/Context;", "context", "Lv80/x;", "dispatcher", "", "integrationId", "Ln90/c;", "json", "<init>", "(Landroid/content/Context;Lv80/x;Ljava/lang/String;Ln90/c;)V", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleaner;", "build", "()Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleaner;", "Landroid/content/Context;", "Lv80/x;", "Ljava/lang/String;", "Ln90/c;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListStorageBuilder {

    @NotNull
    private final Context context;

    @NotNull
    private final x dispatcher;

    @Nullable
    private final String integrationId;

    @NotNull
    private final c json;

    public ConversationsListStorageBuilder(@NotNull Context context, @NotNull x xVar, @Nullable String str, @NotNull c cVar) {
        context.getClass();
        xVar.getClass();
        cVar.getClass();
        this.context = context;
        this.dispatcher = xVar;
        this.integrationId = str;
        this.json = cVar;
    }

    @NotNull
    public final ConversationsListLocalStorageCleaner build() {
        return new ConversationsListLocalStorageCleanerImpl(this.dispatcher, StorageFactory.INSTANCE.create(ConversationsListLocalStorageIOKt.MULTICONVO_NAMESPACE, this.context, new StorageType.Complex(new ConversationsListLocalStorageSerializer(this.json)), this.integrationId));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConversationsListStorageBuilder(Context context, x xVar, String str, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 2) != 0) {
            f fVar = p0.f42144a;
            xVar = e.f7834b;
        }
        this(context, xVar, str, cVar);
    }
}
