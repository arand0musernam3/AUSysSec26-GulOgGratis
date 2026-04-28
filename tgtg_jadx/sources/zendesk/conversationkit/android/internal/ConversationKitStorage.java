package zendesk.conversationkit.android.internal;

import com.braze.h2;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import zendesk.conversationkit.android.model.VisitType;
import zendesk.faye.internal.Bayeux;
import zendesk.storage.android.PersistedProperty;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\bJ\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR/\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0007\u0010\u001e\"\u0004\b\u000b\u0010\u001fR/\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001e\"\u0004\b\u000e\u0010\u001fR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u0011\u0010\u001e\"\u0004\b\u0013\u0010\u001f¨\u0006$"}, d2 = {"Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "<init>", "(Lzendesk/storage/android/Storage;)V", "", "getPushToken", "(Lx70/c;)Ljava/lang/Object;", "pushToken", "", "setPushToken", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "integrationId", "setIntegrationId", "getClientId", "Lzendesk/conversationkit/android/model/VisitType;", "getVisitType", "visitType", "setVisitType", "(Lzendesk/conversationkit/android/model/VisitType;Lx70/c;)Ljava/lang/Object;", "Lzendesk/storage/android/Storage;", "Lv80/x;", "persistenceDispatcher", "Lv80/x;", Bayeux.KEY_CLIENT_ID, "Ljava/lang/String;", "<set-?>", "pushToken$delegate", "Lzendesk/storage/android/PersistedProperty;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "integrationId$delegate", "getIntegrationId", "visitType$delegate", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationKitStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKitStorage.kt\nzendesk/conversationkit/android/internal/ConversationKitStorage\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n20#2,7:129\n63#2:136\n63#2:137\n63#2:138\n1#3:139\n*S KotlinDebug\n*F\n+ 1 ConversationKitStorage.kt\nzendesk/conversationkit/android/internal/ConversationKitStorage\n*L\n34#1:129,7\n39#1:136\n41#1:137\n46#1:138\n*E\n"})
public final class ConversationKitStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(ConversationKitStorage.class, "pushToken", "getPushToken()Ljava/lang/String;", 0), s.t(ConversationKitStorage.class, "integrationId", "getIntegrationId()Ljava/lang/String;", 0), s.t(ConversationKitStorage.class, "visitType", "getVisitType()Ljava/lang/String;", 0)};

    @NotNull
    private static final String KEY_CLIENT_ID = "CLIENT_ID";

    @NotNull
    private static final String KEY_INTEGRATION_ID = "INTEGRATION_ID";

    @NotNull
    private static final String KEY_PUSH_TOKEN = "PUSH_TOKEN";

    @NotNull
    private static final String KEY_VISIT_TYPE = "VISIT_TYPE";

    @Nullable
    private String clientId;

    /* JADX INFO: renamed from: integrationId$delegate, reason: from kotlin metadata */
    @NotNull
    private final PersistedProperty integrationId;

    @NotNull
    private final x persistenceDispatcher;

    /* JADX INFO: renamed from: pushToken$delegate, reason: from kotlin metadata */
    @NotNull
    private final PersistedProperty pushToken;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: visitType$delegate, reason: from kotlin metadata */
    @NotNull
    private final PersistedProperty visitType;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage", f = "ConversationKitStorage.kt", l = {85}, m = "getClientId")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
        Object L$0;
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
            return ConversationKitStorage.this.getClientId(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$3", f = "ConversationKitStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationKitStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKitStorage.kt\nzendesk/conversationkit/android/internal/ConversationKitStorage$getClientId$3\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,128:1\n43#2,2:129\n*S KotlinDebug\n*F\n+ 1 ConversationKitStorage.kt\nzendesk/conversationkit/android/internal/ConversationKitStorage$getClientId$3\n*L\n86#1:129,2\n*E\n"})
    public static final class AnonymousClass3 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $newClientId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, x70.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$newClientId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStorage.this.new AnonymousClass3(this.$newClientId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationKitStorage.this.storage.set(ConversationKitStorage.KEY_CLIENT_ID, this.$newClientId, String.class);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$getPushToken$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage$getPushToken$2", f = "ConversationKitStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super String>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStorage.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super String> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                ba0.g.M(obj);
                return ConversationKitStorage.this.getPushToken();
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage", f = "ConversationKitStorage.kt", l = {103}, m = "getVisitType")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02051 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02051(x70.c<? super C02051> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationKitStorage.this.getVisitType(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$3", f = "ConversationKitStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationKitStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKitStorage.kt\nzendesk/conversationkit/android/internal/ConversationKitStorage$getVisitType$3\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,128:1\n43#2,2:129\n*S KotlinDebug\n*F\n+ 1 ConversationKitStorage.kt\nzendesk/conversationkit/android/internal/ConversationKitStorage$getVisitType$3\n*L\n104#1:129,2\n*E\n"})
    public static final class C02063 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C02063(x70.c<? super C02063> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStorage.this.new C02063(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02063) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationKitStorage.this.storage.set(ConversationKitStorage.KEY_VISIT_TYPE, "NEW", String.class);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$setIntegrationId$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage$setIntegrationId$2", f = "ConversationKitStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02072 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $integrationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02072(String str, x70.c<? super C02072> cVar) {
            super(2, cVar);
            this.$integrationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStorage.this.new C02072(this.$integrationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02072) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationKitStorage.this.setIntegrationId(this.$integrationId);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$setPushToken$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage$setPushToken$2", f = "ConversationKitStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02082 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $pushToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02082(String str, x70.c<? super C02082> cVar) {
            super(2, cVar);
            this.$pushToken = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStorage.this.new C02082(this.$pushToken, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02082) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationKitStorage.this.setPushToken(this.$pushToken);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStorage$setVisitType$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStorage$setVisitType$2", f = "ConversationKitStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02092 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ VisitType $visitType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02092(VisitType visitType, x70.c<? super C02092> cVar) {
            super(2, cVar);
            this.$visitType = visitType;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStorage.this.new C02092(this.$visitType, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02092) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationKitStorage.this.setVisitType(this.$visitType.name());
            return Unit.f26487a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConversationKitStorage(@org.jetbrains.annotations.NotNull zendesk.storage.android.Storage r5) {
        /*
            r4 = this;
            r5.getClass()
            r4.<init>()
            r4.storage = r5
            c90.f r0 = v80.p0.f42144a
            c90.e r0 = c90.e.f7834b
            r1 = 1
            v80.x r0 = r0.z0(r1)
            r4.persistenceDispatcher = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = r0.getName()
            int r2 = r1.hashCode()
            java.lang.String r3 = "CLIENT_ID"
            switch(r2) {
                case -2056817302: goto L59;
                case -527879800: goto L47;
                case 344809556: goto L35;
                case 398795216: goto L23;
                default: goto L22;
            }
        L22:
            goto L6a
        L23:
            java.lang.String r2 = "java.lang.Long"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2c
            goto L6a
        L2c:
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Object r1 = r5.get(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L6e
        L35:
            java.lang.String r2 = "java.lang.Boolean"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
            goto L6a
        L3e:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Object r1 = r5.get(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L6e
        L47:
            java.lang.String r2 = "java.lang.Float"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L50
            goto L6a
        L50:
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Object r1 = r5.get(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L6e
        L59:
            java.lang.String r2 = "java.lang.Integer"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6a
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Object r1 = r5.get(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L6e
        L6a:
            java.lang.Object r1 = r5.get(r3, r0)
        L6e:
            java.lang.String r1 = (java.lang.String) r1
            r4.clientId = r1
            zendesk.storage.android.PersistedProperty r1 = new zendesk.storage.android.PersistedProperty
            java.lang.String r2 = "PUSH_TOKEN"
            r1.<init>(r5, r2, r0)
            r4.pushToken = r1
            zendesk.storage.android.PersistedProperty r1 = new zendesk.storage.android.PersistedProperty
            java.lang.String r2 = "INTEGRATION_ID"
            r1.<init>(r5, r2, r0)
            r4.integrationId = r1
            zendesk.storage.android.PersistedProperty r1 = new zendesk.storage.android.PersistedProperty
            java.lang.String r2 = "VISIT_TYPE"
            r1.<init>(r5, r2, r0)
            r4.visitType = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.ConversationKitStorage.<init>(zendesk.storage.android.Storage):void");
    }

    private final String getIntegrationId() {
        return (String) this.integrationId.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPushToken() {
        return (String) this.pushToken.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getClientId(@org.jetbrains.annotations.NotNull x70.c<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.ConversationKitStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$1 r0 = (zendesk.conversationkit.android.internal.ConversationKitStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$1 r0 = new zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            ba0.g.M(r7)
            return r0
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L32:
            ba0.g.M(r7)
            java.lang.String r7 = r6.clientId
            if (r7 == 0) goto L3a
            return r7
        L3a:
            java.lang.String r7 = j4.s.e()
            r6.clientId = r7
            v80.x r2 = r6.persistenceDispatcher
            zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$3 r4 = new zendesk.conversationkit.android.internal.ConversationKitStorage$getClientId$3
            r5 = 0
            r4.<init>(r7, r5)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = v80.f0.K(r2, r4, r0)
            if (r0 != r1) goto L53
            return r1
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.ConversationKitStorage.getClientId(x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getVisitType(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.VisitType> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.ConversationKitStorage.C02051
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$1 r0 = (zendesk.conversationkit.android.internal.ConversationKitStorage.C02051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$1 r0 = new zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.model.VisitType r0 = (zendesk.conversationkit.android.model.VisitType) r0
            ba0.g.M(r7)
            return r0
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L32:
            ba0.g.M(r7)
            java.lang.String r7 = r6.getVisitType()
            if (r7 == 0) goto L40
            zendesk.conversationkit.android.model.VisitType r7 = zendesk.conversationkit.android.model.VisitType.valueOf(r7)
            return r7
        L40:
            zendesk.conversationkit.android.model.VisitType r7 = zendesk.conversationkit.android.model.VisitType.NEW
            java.lang.String r2 = r7.name()
            r6.setVisitType(r2)
            v80.x r2 = r6.persistenceDispatcher
            zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$3 r4 = new zendesk.conversationkit.android.internal.ConversationKitStorage$getVisitType$3
            r5 = 0
            r4.<init>(r5)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = v80.f0.K(r2, r4, r0)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.ConversationKitStorage.getVisitType(x70.c):java.lang.Object");
    }

    @Nullable
    public final Object setIntegrationId(@Nullable String str, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02072(str, null), cVar);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object setPushToken(@Nullable String str, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02082(str, null), cVar);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object setVisitType(@NotNull VisitType visitType, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02092(visitType, null), cVar);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object getPushToken(@NotNull x70.c<? super String> cVar) {
        return f0.K(this.persistenceDispatcher, new AnonymousClass2(null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIntegrationId(String str) {
        this.integrationId.setValue(this, $$delegatedProperties[1], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPushToken(String str) {
        this.pushToken.setValue(this, $$delegatedProperties[0], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisitType(String str) {
        this.visitType.setValue(this, $$delegatedProperties[2], str);
    }

    private final String getVisitType() {
        return (String) this.visitType.getValue(this, $$delegatedProperties[2]);
    }
}
