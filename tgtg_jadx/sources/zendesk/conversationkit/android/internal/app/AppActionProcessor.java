package zendesk.conversationkit.android.internal.app;

import com.app.tgtg.model.local.AppConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.ConversationKitSettings;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.internal.ActionProcessor;
import zendesk.conversationkit.android.internal.ClientDtoProvider;
import zendesk.conversationkit.android.internal.ConversationKitStorage;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.internal.metadata.MetadataManager;
import zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage;
import zendesk.conversationkit.android.internal.rest.AppRestClient;
import zendesk.conversationkit.android.internal.rest.model.ClientDto;
import zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto;
import zendesk.conversationkit.android.internal.rest.model.Intent;
import zendesk.conversationkit.android.internal.rest.model.PostbackDto;
import zendesk.conversationkit.android.internal.user.Jwt;
import zendesk.conversationkit.android.model.Config;
import zendesk.conversationkit.android.model.ConversationType;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 `2\u00020\u0001:\u0001`BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020&H\u0082@¢\u0006\u0004\b'\u0010(J?\u00104\u001a\u0002032\b\b\u0002\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0018\u00010/H\u0002¢\u0006\u0004\b4\u00105J\"\u00106\u001a\u0004\u0018\u0001032\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b6\u00107J\u0018\u00109\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000208H\u0082@¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b;\u0010\"J\u0018\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020<H\u0082@¢\u0006\u0004\b=\u0010>J\u0018\u0010@\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020?H\u0082@¢\u0006\u0004\b@\u0010AJ\u0018\u0010C\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020BH\u0082@¢\u0006\u0004\bC\u0010DJ\u0018\u0010F\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020EH\u0082@¢\u0006\u0004\bF\u0010GJ\u001c\u0010J\u001a\u0004\u0018\u0001002\b\u0010I\u001a\u0004\u0018\u00010HH\u0082@¢\u0006\u0004\bJ\u0010KJ\u0018\u0010M\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020LH\u0082@¢\u0006\u0004\bM\u0010NJ\u0018\u0010P\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020OH\u0082@¢\u0006\u0004\bP\u0010QJ\u0018\u0010S\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020RH\u0082@¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0018H\u0082@¢\u0006\u0004\bU\u0010\"J\u0010\u0010V\u001a\u00020\u0018H\u0082@¢\u0006\u0004\bV\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\\R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010^R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010_¨\u0006a"}, d2 = {"Lzendesk/conversationkit/android/internal/app/AppActionProcessor;", "Lzendesk/conversationkit/android/internal/ActionProcessor;", "Lzendesk/conversationkit/android/ConversationKitSettings;", "conversationKitSettings", "Lzendesk/conversationkit/android/model/Config;", "config", "Lzendesk/conversationkit/android/internal/rest/AppRestClient;", "appRestClient", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "clientDtoProvider", "Lzendesk/conversationkit/android/internal/app/AppStorage;", "appStorage", "Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "conversationKitStorage", "Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;", "proactiveMessagingStorage", "Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "metadataManager", "Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;", "jwtDecoder", "<init>", "(Lzendesk/conversationkit/android/ConversationKitSettings;Lzendesk/conversationkit/android/model/Config;Lzendesk/conversationkit/android/internal/rest/AppRestClient;Lzendesk/conversationkit/android/internal/ClientDtoProvider;Lzendesk/conversationkit/android/internal/app/AppStorage;Lzendesk/conversationkit/android/internal/ConversationKitStorage;Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;Lzendesk/conversationkit/android/internal/metadata/MetadataManager;Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;)V", "Lzendesk/conversationkit/android/internal/Action;", "action", "Lzendesk/conversationkit/android/internal/Effect;", "process", "(Lzendesk/conversationkit/android/internal/Action;Lx70/c;)Ljava/lang/Object;", "", "invalidate", "()V", "Lzendesk/conversationkit/android/internal/Action$SetVisitType;", "processSetVisitTypeReceived", "(Lzendesk/conversationkit/android/internal/Action$SetVisitType;Lx70/c;)Ljava/lang/Object;", "processGetVisitTypeReceived", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$NetworkConnectionStatusUpdate;", "processNetworkConnectionStatusUpdate", "(Lzendesk/conversationkit/android/internal/Action$NetworkConnectionStatusUpdate;)Lzendesk/conversationkit/android/internal/Effect;", "Lzendesk/conversationkit/android/internal/Action$CreateUser;", "createUser", "(Lzendesk/conversationkit/android/internal/Action$CreateUser;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ConversationType;", "type", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "client", "Lzendesk/conversationkit/android/internal/rest/model/Intent;", "intent", "", "", "", "metadata", "Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "buildCreateConversationRequestDto", "(Lzendesk/conversationkit/android/model/ConversationType;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Lzendesk/conversationkit/android/internal/rest/model/Intent;Ljava/util/Map;)Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "appendMetadataToDefaultConversation", "(Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Lzendesk/conversationkit/android/internal/rest/model/Intent;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$LoginUser;", "processLoginUser", "(Lzendesk/conversationkit/android/internal/Action$LoginUser;Lx70/c;)Ljava/lang/Object;", "checkForPersistedUser", "Lzendesk/conversationkit/android/internal/Action$PreparePushToken;", "preparePushToken", "(Lzendesk/conversationkit/android/internal/Action$PreparePushToken;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$PushCacheIntegrationId;", "cacheIntegrationId", "(Lzendesk/conversationkit/android/internal/Action$PushCacheIntegrationId;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$AddProactiveMessage;", "processAddProactiveMessage", "(Lzendesk/conversationkit/android/internal/Action$AddProactiveMessage;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$GetProactiveMessage;", "processGetProactiveMessage", "(Lzendesk/conversationkit/android/internal/Action$GetProactiveMessage;Lx70/c;)Ljava/lang/Object;", "", "proactiveMessageId", "getProactiveCampaignData", "(Ljava/lang/Integer;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$ClearProactiveMessage;", "processClearProactiveMessage", "(Lzendesk/conversationkit/android/internal/Action$ClearProactiveMessage;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$AddConversationFields;", "processAddConversationFields", "(Lzendesk/conversationkit/android/internal/Action$AddConversationFields;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$AddConversationTags;", "processAddConversationTags", "(Lzendesk/conversationkit/android/internal/Action$AddConversationTags;Lx70/c;)Ljava/lang/Object;", "processClearConversationFields", "processClearTags", "Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/model/Config;", "Lzendesk/conversationkit/android/internal/rest/AppRestClient;", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "Lzendesk/conversationkit/android/internal/app/AppStorage;", "Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;", "Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppActionProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppActionProcessor.kt\nzendesk/conversationkit/android/internal/app/AppActionProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,379:1\n1#2:380\n*E\n"})
public final class AppActionProcessor implements ActionProcessor {

    @NotNull
    private static final String LOG_TAG = "AppActionProcessor";

    @NotNull
    private final AppRestClient appRestClient;

    @NotNull
    private final AppStorage appStorage;

    @NotNull
    private final ClientDtoProvider clientDtoProvider;

    @NotNull
    private final Config config;

    @NotNull
    private final ConversationKitSettings conversationKitSettings;

    @NotNull
    private final ConversationKitStorage conversationKitStorage;

    @NotNull
    private final Jwt.Decoder jwtDecoder;

    @NotNull
    private final MetadataManager metadataManager;

    @NotNull
    private final ProactiveMessagingStorage proactiveMessagingStorage;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$appendMetadataToDefaultConversation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {208}, m = "appendMetadataToDefaultConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
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
            return AppActionProcessor.this.appendMetadataToDefaultConversation(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$cacheIntegrationId$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {286}, m = "cacheIntegrationId")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02151 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02151(x70.c<? super C02151> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.cacheIntegrationId(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$checkForPersistedUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {265, 266}, m = "checkForPersistedUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02161 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02161(x70.c<? super C02161> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.checkForPersistedUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$createUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {121, 122, 124, AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED, 138, 141, 159, 170}, m = "createUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02171 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C02171(x70.c<? super C02171> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.createUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$getProactiveCampaignData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {319}, m = "getProactiveCampaignData")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02181 extends c {
        int label;
        /* synthetic */ Object result;

        public C02181(x70.c<? super C02181> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.getProactiveCampaignData(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$preparePushToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {279}, m = "preparePushToken")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02191 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02191(x70.c<? super C02191> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.preparePushToken(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationFields$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {336}, m = "processAddConversationFields")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02201 extends c {
        int label;
        /* synthetic */ Object result;

        public C02201(x70.c<? super C02201> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processAddConversationFields(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationTags$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {350}, m = "processAddConversationTags")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02211 extends c {
        int label;
        /* synthetic */ Object result;

        public C02211(x70.c<? super C02211> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processAddConversationTags(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {300}, m = "processAddProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02221 extends c {
        int label;
        /* synthetic */ Object result;

        public C02221(x70.c<? super C02221> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processAddProactiveMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearConversationFields$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {359}, m = "processClearConversationFields")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02231 extends c {
        int label;
        /* synthetic */ Object result;

        public C02231(x70.c<? super C02231> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processClearConversationFields(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {323}, m = "processClearProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02241 extends c {
        int label;
        /* synthetic */ Object result;

        public C02241(x70.c<? super C02241> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processClearProactiveMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearTags$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {367}, m = "processClearTags")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02251 extends c {
        int label;
        /* synthetic */ Object result;

        public C02251(x70.c<? super C02251> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processClearTags(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {305}, m = "processGetProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02261 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02261(x70.c<? super C02261> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processGetProactiveMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetVisitTypeReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {96}, m = "processGetVisitTypeReceived")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02271 extends c {
        int label;
        /* synthetic */ Object result;

        public C02271(x70.c<? super C02271> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processGetVisitTypeReceived(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processLoginUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {227, 228, 239, 241}, m = "processLoginUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02281 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C02281(x70.c<? super C02281> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processLoginUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppActionProcessor$processSetVisitTypeReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppActionProcessor", f = "AppActionProcessor.kt", l = {91}, m = "processSetVisitTypeReceived")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02291 extends c {
        int label;
        /* synthetic */ Object result;

        public C02291(x70.c<? super C02291> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionProcessor.this.processSetVisitTypeReceived(null, this);
        }
    }

    public AppActionProcessor(@NotNull ConversationKitSettings conversationKitSettings, @NotNull Config config, @NotNull AppRestClient appRestClient, @NotNull ClientDtoProvider clientDtoProvider, @NotNull AppStorage appStorage, @NotNull ConversationKitStorage conversationKitStorage, @NotNull ProactiveMessagingStorage proactiveMessagingStorage, @NotNull MetadataManager metadataManager, @NotNull Jwt.Decoder decoder) {
        conversationKitSettings.getClass();
        config.getClass();
        appRestClient.getClass();
        clientDtoProvider.getClass();
        appStorage.getClass();
        conversationKitStorage.getClass();
        proactiveMessagingStorage.getClass();
        metadataManager.getClass();
        decoder.getClass();
        this.conversationKitSettings = conversationKitSettings;
        this.config = config;
        this.appRestClient = appRestClient;
        this.clientDtoProvider = clientDtoProvider;
        this.appStorage = appStorage;
        this.conversationKitStorage = conversationKitStorage;
        this.proactiveMessagingStorage = proactiveMessagingStorage;
        this.metadataManager = metadataManager;
        this.jwtDecoder = decoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appendMetadataToDefaultConversation(zendesk.conversationkit.android.internal.rest.model.ClientDto r10, zendesk.conversationkit.android.internal.rest.model.Intent r11, x70.c<? super zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            zendesk.conversationkit.android.internal.app.AppActionProcessor$appendMetadataToDefaultConversation$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$appendMetadataToDefaultConversation$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$appendMetadataToDefaultConversation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            java.lang.Object r10 = r0.L$1
            r11 = r10
            zendesk.conversationkit.android.internal.rest.model.Intent r11 = (zendesk.conversationkit.android.internal.rest.model.Intent) r11
            java.lang.Object r10 = r0.L$0
            zendesk.conversationkit.android.internal.rest.model.ClientDto r10 = (zendesk.conversationkit.android.internal.rest.model.ClientDto) r10
            ba0.g.M(r12)
        L2f:
            r4 = r10
            r5 = r11
            goto L4b
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L39:
            ba0.g.M(r12)
            zendesk.conversationkit.android.internal.metadata.MetadataManager r12 = r9.metadataManager
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r12 = r12.getMetadata(r0)
            if (r12 != r1) goto L2f
            return r1
        L4b:
            r6 = r12
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L64
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L57
            goto L64
        L57:
            zendesk.conversationkit.android.internal.rest.model.Intent r10 = zendesk.conversationkit.android.internal.rest.model.Intent.CONVERSATION_START
            if (r5 != r10) goto L64
            r7 = 1
            r8 = 0
            r3 = 0
            r2 = r9
            zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto r10 = buildCreateConversationRequestDto$default(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L64:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.appendMetadataToDefaultConversation(zendesk.conversationkit.android.internal.rest.model.ClientDto, zendesk.conversationkit.android.internal.rest.model.Intent, x70.c):java.lang.Object");
    }

    private final CreateConversationRequestDto buildCreateConversationRequestDto(ConversationType type, ClientDto client, Intent intent, Map<String, ? extends Object> metadata) {
        return new CreateConversationRequestDto(type, intent, client, (String) null, (List) null, (PostbackDto) null, metadata, 56, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CreateConversationRequestDto buildCreateConversationRequestDto$default(AppActionProcessor appActionProcessor, ConversationType conversationType, ClientDto clientDto, Intent intent, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            conversationType = ConversationType.PERSONAL;
        }
        return appActionProcessor.buildCreateConversationRequestDto(conversationType, clientDto, intent, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cacheIntegrationId(zendesk.conversationkit.android.internal.Action.PushCacheIntegrationId r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02151
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$cacheIntegrationId$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$cacheIntegrationId$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$cacheIntegrationId$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.Action$PushCacheIntegrationId r5 = (zendesk.conversationkit.android.internal.Action.PushCacheIntegrationId) r5
            ba0.g.M(r6)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.ConversationKitStorage r6 = r4.conversationKitStorage
            java.lang.String r2 = r5.getIntegrationId()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.setIntegrationId(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            zendesk.conversationkit.android.internal.Effect$IntegrationIdCached r6 = new zendesk.conversationkit.android.internal.Effect$IntegrationIdCached
            java.lang.String r5 = r5.getIntegrationId()
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.cacheIntegrationId(zendesk.conversationkit.android.internal.Action$PushCacheIntegrationId, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkForPersistedUser(x70.c<? super zendesk.conversationkit.android.internal.Effect> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02161
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.app.AppActionProcessor$checkForPersistedUser$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$checkForPersistedUser$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$checkForPersistedUser$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.model.User r0 = (zendesk.conversationkit.android.model.User) r0
            ba0.g.M(r7)
            goto L59
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            ba0.g.M(r7)
            goto L47
        L39:
            ba0.g.M(r7)
            zendesk.conversationkit.android.internal.app.AppStorage r7 = r6.appStorage
            r0.label = r4
            java.lang.Object r7 = r7.getUser(r0)
            if (r7 != r1) goto L47
            goto L55
        L47:
            zendesk.conversationkit.android.model.User r7 = (zendesk.conversationkit.android.model.User) r7
            zendesk.conversationkit.android.internal.ConversationKitStorage r2 = r6.conversationKitStorage
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = r2.getClientId(r0)
            if (r0 != r1) goto L56
        L55:
            return r1
        L56:
            r5 = r0
            r0 = r7
            r7 = r5
        L59:
            java.lang.String r7 = (java.lang.String) r7
            zendesk.conversationkit.android.ConversationKitResult$Success r1 = new zendesk.conversationkit.android.ConversationKitResult$Success
            kotlin.Unit r2 = kotlin.Unit.f26487a
            r1.<init>(r2)
            zendesk.conversationkit.android.internal.Effect$CheckForPersistedUserResult r2 = new zendesk.conversationkit.android.internal.Effect$CheckForPersistedUserResult
            r2.<init>(r0, r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.checkForPersistedUser(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163 A[Catch: Exception -> 0x004c, HttpException -> 0x004f, SerializationException -> 0x0052, PHI: r0
      0x0163: PHI (r0v32 java.lang.Object) = (r0v31 java.lang.Object), (r0v1 java.lang.Object) binds: [B:55:0x015f, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {SerializationException -> 0x0052, HttpException -> 0x004f, Exception -> 0x004c, blocks: (B:15:0x0047, B:60:0x0182, B:22:0x0055, B:57:0x0163, B:54:0x014a), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createUser(zendesk.conversationkit.android.internal.Action.CreateUser r25, x70.c<? super zendesk.conversationkit.android.internal.Effect> r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.createUser(zendesk.conversationkit.android.internal.Action$CreateUser, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProactiveCampaignData(java.lang.Integer r6, x70.c<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02181
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.app.AppActionProcessor$getProactiveCampaignData$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$getProactiveCampaignData$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$getProactiveCampaignData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            ba0.g.M(r7)
            goto L43
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r7)
            if (r6 == 0) goto L4c
            int r6 = r6.intValue()
            zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage r7 = r5.proactiveMessagingStorage
            r0.label = r4
            java.lang.Object r7 = r7.getProactiveMessage(r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            zendesk.conversationkit.android.model.ProactiveMessage r7 = (zendesk.conversationkit.android.model.ProactiveMessage) r7
            if (r7 == 0) goto L4c
            java.lang.String r6 = r7.getJwt()
            return r6
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.getProactiveCampaignData(java.lang.Integer, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preparePushToken(zendesk.conversationkit.android.internal.Action.PreparePushToken r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02191
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$preparePushToken$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02191) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$preparePushToken$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$preparePushToken$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.Action$PreparePushToken r5 = (zendesk.conversationkit.android.internal.Action.PreparePushToken) r5
            ba0.g.M(r6)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.ConversationKitStorage r6 = r4.conversationKitStorage
            java.lang.String r2 = r5.getPushToken()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.setPushToken(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            zendesk.conversationkit.android.internal.Effect$PushTokenPrepared r6 = new zendesk.conversationkit.android.internal.Effect$PushTokenPrepared
            java.lang.String r5 = r5.getPushToken()
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.preparePushToken(zendesk.conversationkit.android.internal.Action$PreparePushToken, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAddConversationFields(zendesk.conversationkit.android.internal.Action.AddConversationFields r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02201
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationFields$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationFields$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationFields$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L4a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            java.util.Map r6 = r5.getFields()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L4a
            zendesk.conversationkit.android.internal.metadata.MetadataManager r6 = r4.metadataManager
            java.util.Map r5 = r5.getFields()
            r0.label = r3
            java.lang.Object r5 = r6.saveConversationFields(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processAddConversationFields(zendesk.conversationkit.android.internal.Action$AddConversationFields, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAddConversationTags(zendesk.conversationkit.android.internal.Action.AddConversationTags r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02211
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationTags$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationTags$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddConversationTags$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L4a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            java.util.List r6 = r5.getTags()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L4a
            zendesk.conversationkit.android.internal.metadata.MetadataManager r6 = r4.metadataManager
            java.util.List r5 = r5.getTags()
            r0.label = r3
            java.lang.Object r5 = r6.saveConversationTags(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processAddConversationTags(zendesk.conversationkit.android.internal.Action$AddConversationTags, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAddProactiveMessage(zendesk.conversationkit.android.internal.Action.AddProactiveMessage r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02221
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddProactiveMessage$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddProactiveMessage$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processAddProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L40
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage r6 = r4.proactiveMessagingStorage
            zendesk.conversationkit.android.model.ProactiveMessage r5 = r5.getProactiveMessage()
            r0.label = r3
            java.lang.Object r5 = r6.setProactiveMessage(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processAddProactiveMessage(zendesk.conversationkit.android.internal.Action$AddProactiveMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processClearConversationFields(x70.c<? super zendesk.conversationkit.android.internal.Effect> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02231
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearConversationFields$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02231) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearConversationFields$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearConversationFields$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.internal.metadata.MetadataManager r5 = r4.metadataManager
            r0.label = r3
            java.lang.Object r5 = r5.clearConversationFields(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processClearConversationFields(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processClearProactiveMessage(zendesk.conversationkit.android.internal.Action.ClearProactiveMessage r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02241
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearProactiveMessage$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearProactiveMessage$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L40
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage r6 = r4.proactiveMessagingStorage
            int r5 = r5.getProactiveMessageId()
            r0.label = r3
            java.lang.Object r5 = r6.clearProactiveMessage(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processClearProactiveMessage(zendesk.conversationkit.android.internal.Action$ClearProactiveMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processClearTags(x70.c<? super zendesk.conversationkit.android.internal.Effect> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02251
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearTags$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearTags$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processClearTags$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.internal.metadata.MetadataManager r5 = r4.metadataManager
            r0.label = r3
            java.lang.Object r5 = r5.clearConversationTags(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processClearTags(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processGetProactiveMessage(zendesk.conversationkit.android.internal.Action.GetProactiveMessage r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02261
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetProactiveMessage$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetProactiveMessage$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.Action$GetProactiveMessage r5 = (zendesk.conversationkit.android.internal.Action.GetProactiveMessage) r5
            ba0.g.M(r6)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage r6 = r4.proactiveMessagingStorage
            int r2 = r5.getProactiveMessageId()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.getProactiveMessage(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            zendesk.conversationkit.android.model.ProactiveMessage r6 = (zendesk.conversationkit.android.model.ProactiveMessage) r6
            if (r6 != 0) goto L5f
            zendesk.conversationkit.android.ConversationKitResult$Failure r6 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r5 = r5.getProactiveMessageId()
            java.lang.String r1 = "Couldn't find proactive message for id "
            java.lang.String r5 = j4.s.f(r5, r1)
            r0.<init>(r5)
            r6.<init>(r0)
            goto L65
        L5f:
            zendesk.conversationkit.android.ConversationKitResult$Success r5 = new zendesk.conversationkit.android.ConversationKitResult$Success
            r5.<init>(r6)
            r6 = r5
        L65:
            zendesk.conversationkit.android.internal.Effect$GetProactiveMessage r5 = new zendesk.conversationkit.android.internal.Effect$GetProactiveMessage
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processGetProactiveMessage(zendesk.conversationkit.android.internal.Action$GetProactiveMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processGetVisitTypeReceived(x70.c<? super zendesk.conversationkit.android.internal.Effect> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02271
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetVisitTypeReceived$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetVisitTypeReceived$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processGetVisitTypeReceived$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.internal.ConversationKitStorage r5 = r4.conversationKitStorage
            r0.label = r3
            java.lang.Object r5 = r5.getVisitType(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.model.VisitType r5 = (zendesk.conversationkit.android.model.VisitType) r5
            zendesk.conversationkit.android.internal.Effect$GetVisitType r0 = new zendesk.conversationkit.android.internal.Effect$GetVisitType
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processGetVisitTypeReceived(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[Catch: Exception -> 0x0039, HttpException -> 0x003c, TryCatch #2 {HttpException -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:53:0x0130, B:24:0x004a, B:49:0x0109, B:27:0x005f, B:41:0x00b3, B:43:0x00d2, B:45:0x00e2, B:30:0x006f, B:37:0x0097, B:33:0x0076), top: B:68:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2 A[Catch: Exception -> 0x0039, HttpException -> 0x003c, TryCatch #2 {HttpException -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:53:0x0130, B:24:0x004a, B:49:0x0109, B:27:0x005f, B:41:0x00b3, B:43:0x00d2, B:45:0x00e2, B:30:0x006f, B:37:0x0097, B:33:0x0076), top: B:68:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processLoginUser(zendesk.conversationkit.android.internal.Action.LoginUser r20, x70.c<? super zendesk.conversationkit.android.internal.Effect> r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processLoginUser(zendesk.conversationkit.android.internal.Action$LoginUser, x70.c):java.lang.Object");
    }

    private final Effect processNetworkConnectionStatusUpdate(Action.NetworkConnectionStatusUpdate action) {
        return new Effect.NetworkConnectionChanged(action.getConnectionStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processSetVisitTypeReceived(zendesk.conversationkit.android.internal.Action.SetVisitType r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.app.AppActionProcessor.C02291
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processSetVisitTypeReceived$1 r0 = (zendesk.conversationkit.android.internal.app.AppActionProcessor.C02291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.app.AppActionProcessor$processSetVisitTypeReceived$1 r0 = new zendesk.conversationkit.android.internal.app.AppActionProcessor$processSetVisitTypeReceived$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L40
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.ConversationKitStorage r6 = r4.conversationKitStorage
            zendesk.conversationkit.android.model.VisitType r5 = r5.getVisitType()
            r0.label = r3
            java.lang.Object r5 = r6.setVisitType(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.app.AppActionProcessor.processSetVisitTypeReceived(zendesk.conversationkit.android.internal.Action$SetVisitType, x70.c):java.lang.Object");
    }

    public final void invalidate() {
        Logger.w(LOG_TAG, "Invalidating AppActionProcessor", new Object[0]);
    }

    @Override // zendesk.conversationkit.android.internal.ActionProcessor
    @Nullable
    public Object process(@NotNull Action action, @NotNull x70.c<? super Effect> cVar) {
        if (action instanceof Action.NetworkConnectionStatusUpdate) {
            return processNetworkConnectionStatusUpdate((Action.NetworkConnectionStatusUpdate) action);
        }
        if (action instanceof Action.CreateUser) {
            return createUser((Action.CreateUser) action, cVar);
        }
        if (action instanceof Action.LoginUser) {
            return processLoginUser((Action.LoginUser) action, cVar);
        }
        if (action instanceof Action.CheckForPersistedUser) {
            return checkForPersistedUser(cVar);
        }
        if (action instanceof Action.PreparePushToken) {
            return preparePushToken((Action.PreparePushToken) action, cVar);
        }
        if (action instanceof Action.PushCacheIntegrationId) {
            return cacheIntegrationId((Action.PushCacheIntegrationId) action, cVar);
        }
        if (action instanceof Action.GetVisitType) {
            return processGetVisitTypeReceived(cVar);
        }
        if (action instanceof Action.SetVisitType) {
            return processSetVisitTypeReceived((Action.SetVisitType) action, cVar);
        }
        if (action instanceof Action.AddProactiveMessage) {
            return processAddProactiveMessage((Action.AddProactiveMessage) action, cVar);
        }
        if (action instanceof Action.GetProactiveMessage) {
            return processGetProactiveMessage((Action.GetProactiveMessage) action, cVar);
        }
        if (action instanceof Action.ClearProactiveMessage) {
            return processClearProactiveMessage((Action.ClearProactiveMessage) action, cVar);
        }
        if (action instanceof Action.AddConversationFields) {
            return processAddConversationFields((Action.AddConversationFields) action, cVar);
        }
        if (action instanceof Action.AddConversationTags) {
            return processAddConversationTags((Action.AddConversationTags) action, cVar);
        }
        if (action instanceof Action.ClearConversationFields) {
            return processClearConversationFields(cVar);
        }
        if (action instanceof Action.ClearConversationTags) {
            return processClearTags(cVar);
        }
        Logger.w(LOG_TAG, action + " cannot processed.", new Object[0]);
        return Effect.IncorrectAccessLevel.INSTANCE;
    }

    public /* synthetic */ AppActionProcessor(ConversationKitSettings conversationKitSettings, Config config, AppRestClient appRestClient, ClientDtoProvider clientDtoProvider, AppStorage appStorage, ConversationKitStorage conversationKitStorage, ProactiveMessagingStorage proactiveMessagingStorage, MetadataManager metadataManager, Jwt.Decoder decoder, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationKitSettings, config, appRestClient, clientDtoProvider, appStorage, conversationKitStorage, proactiveMessagingStorage, metadataManager, (i11 & 256) != 0 ? new Jwt.Decoder() : decoder);
    }
}
