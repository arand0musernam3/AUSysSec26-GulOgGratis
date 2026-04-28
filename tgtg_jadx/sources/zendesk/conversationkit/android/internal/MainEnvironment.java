package zendesk.conversationkit.android.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import o30.e0;
import org.jetbrains.annotations.NotNull;
import q90.z;
import u70.j;
import u70.l;
import v80.b0;
import zendesk.conversationkit.android.ConversationKitSettings;
import zendesk.conversationkit.android.internal.app.AppActionProcessor;
import zendesk.conversationkit.android.internal.attachments.AttachmentDownloader;
import zendesk.conversationkit.android.internal.attachments.AttachmentsDownloadReceiver;
import zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory;
import zendesk.conversationkit.android.internal.metadata.MetadataFormatter;
import zendesk.conversationkit.android.internal.metadata.MetadataManager;
import zendesk.conversationkit.android.internal.rest.DefaultRestClientFiles;
import zendesk.conversationkit.android.internal.rest.RestClientFactory;
import zendesk.conversationkit.android.internal.serialization.SerializationProvider;
import zendesk.conversationkit.android.model.Config;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.storage.android.Serializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010E\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010M\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010V\u001a\u0004\u0018\u00010Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lzendesk/conversationkit/android/internal/MainEnvironment;", "Lzendesk/conversationkit/android/internal/Environment;", "Landroid/content/Context;", "context", "Lzendesk/conversationkit/android/model/Config;", "config", "Lzendesk/conversationkit/android/ConversationKitSettings;", "settings", "Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "dispatchers", "Lv80/b0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lzendesk/conversationkit/android/model/Config;Lzendesk/conversationkit/android/ConversationKitSettings;Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;Lv80/b0;)V", "Lzendesk/conversationkit/android/internal/AppAccess;", "createAppAccessLevel", "()Lzendesk/conversationkit/android/internal/AppAccess;", "Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "createMetadataManager", "()Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;", "attachmentsDownloadReceiver", "Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "createAttachmentDownloader", "(Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;)Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "createConnectivityObserver", "()Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "Lzendesk/conversationkit/android/internal/ConversationKitStore;", "createConversationKitStore", "()Lzendesk/conversationkit/android/internal/ConversationKitStore;", "Landroid/content/Context;", "Lzendesk/conversationkit/android/model/Config;", "Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "Lv80/b0;", "", "sdkVendor", "Ljava/lang/String;", "Ljava/io/File;", "cacheDir", "Ljava/io/File;", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "sdkVersion", "getSdkVersion", "()Ljava/lang/String;", "Lzendesk/conversationkit/android/internal/HostAppInfo;", "hostAppInfo", "Lzendesk/conversationkit/android/internal/HostAppInfo;", "getHostAppInfo", "()Lzendesk/conversationkit/android/internal/HostAppInfo;", "Ln90/c;", "json", "Ln90/c;", "getJson", "()Ln90/c;", "Lzendesk/storage/android/Serializer;", "serializer", "Lzendesk/storage/android/Serializer;", "getSerializer", "()Lzendesk/storage/android/Serializer;", "Lzendesk/conversationkit/android/internal/StorageFactory;", "storageFactory", "Lzendesk/conversationkit/android/internal/StorageFactory;", "getStorageFactory", "()Lzendesk/conversationkit/android/internal/StorageFactory;", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "clientDtoProvider", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "getClientDtoProvider", "()Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "Lzendesk/conversationkit/android/internal/rest/DefaultRestClientFiles;", "restClientFiles", "Lzendesk/conversationkit/android/internal/rest/DefaultRestClientFiles;", "Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "restClientFactory", "Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "getRestClientFactory", "()Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "Landroid/net/ConnectivityManager;", "connectivityManager$delegate", "Lu70/j;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "connectivityManager", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainEnvironment implements Environment {

    @NotNull
    private final File cacheDir;

    @NotNull
    private final ClientDtoProvider clientDtoProvider;

    @NotNull
    private final Config config;

    /* JADX INFO: renamed from: connectivityManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final j connectivityManager;

    @NotNull
    private final Context context;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final ConversationKitDispatchers dispatchers;

    @NotNull
    private final HostAppInfo hostAppInfo;

    @NotNull
    private final n90.c json;

    @NotNull
    private final LocaleProvider localeProvider;

    @NotNull
    private final RestClientFactory restClientFactory;

    @NotNull
    private final DefaultRestClientFiles restClientFiles;

    @NotNull
    private final String sdkVendor;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private final Serializer serializer;

    @NotNull
    private final ConversationKitSettings settings;

    @NotNull
    private final StorageFactory storageFactory;

    public MainEnvironment(@NotNull Context context, @NotNull Config config, @NotNull ConversationKitSettings conversationKitSettings, @NotNull ConversationKitDispatchers conversationKitDispatchers, @NotNull b0 b0Var) {
        context.getClass();
        config.getClass();
        conversationKitSettings.getClass();
        conversationKitDispatchers.getClass();
        b0Var.getClass();
        this.context = context;
        this.config = config;
        this.settings = conversationKitSettings;
        this.dispatchers = conversationKitDispatchers;
        this.coroutineScope = b0Var;
        this.sdkVendor = "zendesk";
        File file = new File(context.getCacheDir(), "zendesk.conversationkit");
        this.cacheDir = file;
        LocaleProvider localeProvider = new LocaleProvider(context);
        this.localeProvider = localeProvider;
        this.sdkVersion = conversationKitSettings.getZendeskVersion();
        this.hostAppInfo = HostAppInfo.INSTANCE.from(context);
        this.json = SerializationProvider.INSTANCE.getJson();
        this.serializer = new DefaultSerializer(getJson());
        this.storageFactory = new StorageFactory(context, getSerializer(), config.getIntegration().getId(), getJson());
        this.clientDtoProvider = new ClientDtoProvider("zendesk", getSdkVersion(), getHostAppInfo(), localeProvider);
        DefaultRestClientFiles defaultRestClientFiles = new DefaultRestClientFiles(context);
        this.restClientFiles = defaultRestClientFiles;
        Set setW = y.W(new Pair[]{new Pair("x-smooch-appname", new MainEnvironment$restClientFactory$1(this, null)), new Pair("x-smooch-sdk", new MainEnvironment$restClientFactory$2(this, null)), new Pair("User-Agent", new MainEnvironment$restClientFactory$3(this, null))});
        n90.c json = getJson();
        Regex regex = z.f36633e;
        this.restClientFactory = new RestClientFactory(setW, defaultRestClientFiles, file, e0.q(json, q90.y.a("application/json")));
        this.connectivityManager = l.b(new a(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectivityManager connectivityManager_delegate$lambda$0(MainEnvironment mainEnvironment) {
        return (ConnectivityManager) mainEnvironment.context.getSystemService(ConnectivityManager.class);
    }

    private final AppAccess createAppAccessLevel() {
        ConversationKitStorage conversationKitStorageCreateConversationKitStorage = getStorageFactory().createConversationKitStorage();
        return new AppAccess(new AppActionProcessor(this.settings, this.config, getRestClientFactory().createAppRestClient(this.config.getApp().getId(), this.config.getBaseUrl()), getClientDtoProvider(), getStorageFactory().createAppStorage(this.config.getApp().getId()), conversationKitStorageCreateConversationKitStorage, getStorageFactory().createProactiveMessagingStorage(), createMetadataManager(), null, 256, null), conversationKitStorageCreateConversationKitStorage);
    }

    private final AttachmentDownloader createAttachmentDownloader(AttachmentsDownloadReceiver attachmentsDownloadReceiver) {
        return new AttachmentDownloader(this.context, this.coroutineScope, attachmentsDownloadReceiver);
    }

    private final MetadataManager createMetadataManager() {
        return new MetadataManager(getStorageFactory().createMetadataStorage(this.config.getApp().getId()), new MetadataFormatter());
    }

    private final ConnectivityManager getConnectivityManager() {
        return (ConnectivityManager) this.connectivityManager.getValue();
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public ConnectivityObserver createConnectivityObserver() {
        return new ConnectivityObserver(getConnectivityManager(), this.dispatchers.io());
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public ConversationKitStore createConversationKitStore() {
        SunCoFayeClientFactory sunCoFayeClientFactory = new SunCoFayeClientFactory(this.coroutineScope);
        AttachmentsDownloadReceiver attachmentsDownloadReceiver = new AttachmentsDownloadReceiver(this.coroutineScope);
        AttachmentDownloader attachmentDownloaderCreateAttachmentDownloader = createAttachmentDownloader(attachmentsDownloadReceiver);
        ConnectivityObserver connectivityObserverCreateConnectivityObserver = createConnectivityObserver();
        ConversationKitDispatchers conversationKitDispatchers = null;
        ConversationKitStore conversationKitStore = new ConversationKitStore(this.settings, this.config, new EffectProcessor(new EffectMapper(), new AccessLevelBuilder(getRestClientFactory(), sunCoFayeClientFactory, getStorageFactory(), getClientDtoProvider(), this.restClientFiles, connectivityObserverCreateConnectivityObserver, createMetadataManager(), attachmentDownloaderCreateAttachmentDownloader, attachmentsDownloadReceiver, this.context, this.settings, this.config, getJson()), this.localeProvider), this.coroutineScope, conversationKitDispatchers, createAppAccessLevel(), connectivityObserverCreateConnectivityObserver, attachmentDownloaderCreateAttachmentDownloader, 16, null);
        sunCoFayeClientFactory.setActionDispatcher(conversationKitStore);
        return conversationKitStore;
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public ClientDtoProvider getClientDtoProvider() {
        return this.clientDtoProvider;
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public HostAppInfo getHostAppInfo() {
        return this.hostAppInfo;
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public n90.c getJson() {
        return this.json;
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public RestClientFactory getRestClientFactory() {
        return this.restClientFactory;
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public Serializer getSerializer() {
        return this.serializer;
    }

    @Override // zendesk.conversationkit.android.internal.Environment
    @NotNull
    public StorageFactory getStorageFactory() {
        return this.storageFactory;
    }

    public /* synthetic */ MainEnvironment(Context context, Config config, ConversationKitSettings conversationKitSettings, ConversationKitDispatchers conversationKitDispatchers, b0 b0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, config, conversationKitSettings, (i11 & 8) != 0 ? new DefaultConversationKitDispatchers() : conversationKitDispatchers, b0Var);
    }
}
