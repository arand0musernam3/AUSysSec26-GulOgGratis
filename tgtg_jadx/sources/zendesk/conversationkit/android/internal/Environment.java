package zendesk.conversationkit.android.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import zendesk.conversationkit.android.ConversationKitSettings;
import zendesk.conversationkit.android.internal.rest.RestClientFactory;
import zendesk.conversationkit.android.model.Config;
import zendesk.storage.android.Serializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 $2\u00020\u0001:\u0001$J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lzendesk/conversationkit/android/internal/Environment;", "", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "createConnectivityObserver", "()Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "Lzendesk/conversationkit/android/internal/ConversationKitStore;", "createConversationKitStore", "()Lzendesk/conversationkit/android/internal/ConversationKitStore;", "", "getSdkVersion", "()Ljava/lang/String;", "sdkVersion", "Lzendesk/conversationkit/android/internal/HostAppInfo;", "getHostAppInfo", "()Lzendesk/conversationkit/android/internal/HostAppInfo;", "hostAppInfo", "Lzendesk/conversationkit/android/internal/StorageFactory;", "getStorageFactory", "()Lzendesk/conversationkit/android/internal/StorageFactory;", "storageFactory", "Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "getRestClientFactory", "()Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "restClientFactory", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "getClientDtoProvider", "()Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "clientDtoProvider", "Ln90/c;", "getJson", "()Ln90/c;", "json", "Lzendesk/storage/android/Serializer;", "getSerializer", "()Lzendesk/storage/android/Serializer;", "serializer", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Environment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzendesk/conversationkit/android/internal/Environment$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lzendesk/conversationkit/android/model/Config;", "config", "Lzendesk/conversationkit/android/ConversationKitSettings;", "settings", "Lv80/b0;", "coroutineScope", "Lzendesk/conversationkit/android/internal/Environment;", "main", "(Landroid/content/Context;Lzendesk/conversationkit/android/model/Config;Lzendesk/conversationkit/android/ConversationKitSettings;Lv80/b0;)Lzendesk/conversationkit/android/internal/Environment;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final Environment main(@NotNull Context context, @NotNull Config config, @NotNull ConversationKitSettings settings, @NotNull b0 coroutineScope) {
            context.getClass();
            config.getClass();
            settings.getClass();
            coroutineScope.getClass();
            return new MainEnvironment(context, config, settings, null, coroutineScope, 8, null);
        }
    }

    @NotNull
    ConnectivityObserver createConnectivityObserver();

    @NotNull
    ConversationKitStore createConversationKitStore();

    @NotNull
    ClientDtoProvider getClientDtoProvider();

    @NotNull
    HostAppInfo getHostAppInfo();

    @NotNull
    n90.c getJson();

    @NotNull
    RestClientFactory getRestClientFactory();

    @NotNull
    String getSdkVersion();

    @NotNull
    Serializer getSerializer();

    @NotNull
    StorageFactory getStorageFactory();
}
