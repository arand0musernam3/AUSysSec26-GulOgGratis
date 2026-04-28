package zendesk.conversationkit.android.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.ConversationKitSettings;
import zendesk.conversationkit.android.internal.app.AppActionProcessor;
import zendesk.conversationkit.android.internal.attachments.AttachmentDownloader;
import zendesk.conversationkit.android.internal.attachments.AttachmentsDownloadReceiver;
import zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory;
import zendesk.conversationkit.android.internal.metadata.MetadataManager;
import zendesk.conversationkit.android.internal.rest.RestClientFactory;
import zendesk.conversationkit.android.internal.rest.RestClientFiles;
import zendesk.conversationkit.android.model.Config;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101¨\u00062"}, d2 = {"Lzendesk/conversationkit/android/internal/AccessLevelBuilder;", "", "Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "restClientFactory", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClientFactory;", "sunCoFayeClientFactory", "Lzendesk/conversationkit/android/internal/StorageFactory;", "storageFactory", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "clientDtoProvider", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "restClientFiles", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "connectivityObserver", "Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "metadataManager", "Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "attachmentDownloader", "Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;", "attachmentsDownloadReceiver", "Landroid/content/Context;", "context", "Lzendesk/conversationkit/android/ConversationKitSettings;", "conversationKitSettings", "Lzendesk/conversationkit/android/model/Config;", "config", "Ln90/c;", "json", "<init>", "(Lzendesk/conversationkit/android/internal/rest/RestClientFactory;Lzendesk/conversationkit/android/internal/faye/SunCoFayeClientFactory;Lzendesk/conversationkit/android/internal/StorageFactory;Lzendesk/conversationkit/android/internal/ClientDtoProvider;Lzendesk/conversationkit/android/internal/rest/RestClientFiles;Lzendesk/conversationkit/android/internal/ConnectivityObserver;Lzendesk/conversationkit/android/internal/metadata/MetadataManager;Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;Landroid/content/Context;Lzendesk/conversationkit/android/ConversationKitSettings;Lzendesk/conversationkit/android/model/Config;Ln90/c;)V", "Lzendesk/conversationkit/android/internal/AccessLevel;", "buildAppAccess", "()Lzendesk/conversationkit/android/internal/AccessLevel;", "Lzendesk/conversationkit/android/model/User;", "user", "buildUserAccess", "(Lzendesk/conversationkit/android/model/User;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClientFactory;", "Lzendesk/conversationkit/android/internal/StorageFactory;", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;", "Landroid/content/Context;", "Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/model/Config;", "Ln90/c;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccessLevelBuilder {

    @NotNull
    private final AttachmentDownloader attachmentDownloader;

    @NotNull
    private final AttachmentsDownloadReceiver attachmentsDownloadReceiver;

    @NotNull
    private final ClientDtoProvider clientDtoProvider;

    @NotNull
    private final Config config;

    @NotNull
    private final ConnectivityObserver connectivityObserver;

    @NotNull
    private final Context context;

    @NotNull
    private final ConversationKitSettings conversationKitSettings;

    @NotNull
    private final n90.c json;

    @NotNull
    private final MetadataManager metadataManager;

    @NotNull
    private final RestClientFactory restClientFactory;

    @NotNull
    private final RestClientFiles restClientFiles;

    @NotNull
    private final StorageFactory storageFactory;

    @NotNull
    private final SunCoFayeClientFactory sunCoFayeClientFactory;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.AccessLevelBuilder$buildUserAccess$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.AccessLevelBuilder", f = "AccessLevelBuilder.kt", l = {92, 114}, m = "buildUserAccess")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessLevelBuilder.this.buildUserAccess(null, this);
        }
    }

    public AccessLevelBuilder(@NotNull RestClientFactory restClientFactory, @NotNull SunCoFayeClientFactory sunCoFayeClientFactory, @NotNull StorageFactory storageFactory, @NotNull ClientDtoProvider clientDtoProvider, @NotNull RestClientFiles restClientFiles, @NotNull ConnectivityObserver connectivityObserver, @NotNull MetadataManager metadataManager, @NotNull AttachmentDownloader attachmentDownloader, @NotNull AttachmentsDownloadReceiver attachmentsDownloadReceiver, @NotNull Context context, @NotNull ConversationKitSettings conversationKitSettings, @NotNull Config config, @NotNull n90.c cVar) {
        restClientFactory.getClass();
        sunCoFayeClientFactory.getClass();
        storageFactory.getClass();
        clientDtoProvider.getClass();
        restClientFiles.getClass();
        connectivityObserver.getClass();
        metadataManager.getClass();
        attachmentDownloader.getClass();
        attachmentsDownloadReceiver.getClass();
        context.getClass();
        conversationKitSettings.getClass();
        config.getClass();
        cVar.getClass();
        this.restClientFactory = restClientFactory;
        this.sunCoFayeClientFactory = sunCoFayeClientFactory;
        this.storageFactory = storageFactory;
        this.clientDtoProvider = clientDtoProvider;
        this.restClientFiles = restClientFiles;
        this.connectivityObserver = connectivityObserver;
        this.metadataManager = metadataManager;
        this.attachmentDownloader = attachmentDownloader;
        this.attachmentsDownloadReceiver = attachmentsDownloadReceiver;
        this.context = context;
        this.conversationKitSettings = conversationKitSettings;
        this.config = config;
        this.json = cVar;
    }

    @NotNull
    public final AccessLevel buildAppAccess() {
        this.attachmentsDownloadReceiver.unregisterAttachmentsReceiver$zendesk_conversationkit_conversationkit_android(this.context);
        ConversationKitStorage conversationKitStorageCreateConversationKitStorage = this.storageFactory.createConversationKitStorage();
        ConversationKitSettings conversationKitSettings = this.conversationKitSettings;
        Config config = this.config;
        return new AppAccess(new AppActionProcessor(conversationKitSettings, config, this.restClientFactory.createAppRestClient(config.getApp().getId(), this.config.getBaseUrl()), this.clientDtoProvider, this.storageFactory.createAppStorage(this.config.getApp().getId()), conversationKitStorageCreateConversationKitStorage, this.storageFactory.createProactiveMessagingStorage(), this.metadataManager, null, 256, null), conversationKitStorageCreateConversationKitStorage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object buildUserAccess(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.User r29, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.internal.AccessLevel> r30) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.AccessLevelBuilder.buildUserAccess(zendesk.conversationkit.android.model.User, x70.c):java.lang.Object");
    }
}
