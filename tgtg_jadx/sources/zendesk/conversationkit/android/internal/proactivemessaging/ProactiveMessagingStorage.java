package zendesk.conversationkit.android.internal.proactivemessaging;

import ba0.g;
import c90.f;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.p0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "<init>", "(Lzendesk/storage/android/Storage;)V", "", "clear", "(Lx70/c;)Ljava/lang/Object;", "", "proactiveMessageId", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "getProactiveMessage", "(ILx70/c;)Ljava/lang/Object;", "proactiveMessage", "setProactiveMessage", "(Lzendesk/conversationkit/android/model/ProactiveMessage;Lx70/c;)Ljava/lang/Object;", "clearProactiveMessage", "Lzendesk/storage/android/Storage;", "Lv80/x;", "persistenceDispatcher", "Lv80/x;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProactiveMessagingStorage {

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$clear$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$clear$2", f = "ProactiveMessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingStorage.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            ProactiveMessagingStorage.this.storage.clear();
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$clearProactiveMessage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$clearProactiveMessage$2", f = "ProactiveMessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02512 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ int $proactiveMessageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02512(int i11, c<? super C02512> cVar) {
            super(2, cVar);
            this.$proactiveMessageId = i11;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingStorage.this.new C02512(this.$proactiveMessageId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C02512) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            ProactiveMessagingStorage.this.storage.remove(String.valueOf(this.$proactiveMessageId));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$getProactiveMessage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$getProactiveMessage$2", f = "ProactiveMessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "<anonymous>", "(Lv80/b0;)Lzendesk/conversationkit/android/model/ProactiveMessage;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nProactiveMessagingStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage$getProactiveMessage$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,65:1\n20#2,7:66\n*S KotlinDebug\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage$getProactiveMessage$2\n*L\n40#1:66,7\n*E\n"})
    public static final class C02522 extends i implements Function2<b0, c<? super ProactiveMessage>, Object> {
        final /* synthetic */ int $proactiveMessageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02522(int i11, c<? super C02522> cVar) {
            super(2, cVar);
            this.$proactiveMessageId = i11;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingStorage.this.new C02522(this.$proactiveMessageId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super ProactiveMessage> cVar) {
            return ((C02522) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            Storage storage = ProactiveMessagingStorage.this.storage;
            String strValueOf = String.valueOf(this.$proactiveMessageId);
            String name = ProactiveMessage.class.getName();
            switch (name.hashCode()) {
                case -2056817302:
                    if (name.equals("java.lang.Integer")) {
                        return (ProactiveMessage) storage.get(strValueOf, Integer.TYPE);
                    }
                    break;
                case -527879800:
                    if (name.equals("java.lang.Float")) {
                        return (ProactiveMessage) storage.get(strValueOf, Float.TYPE);
                    }
                    break;
                case 344809556:
                    if (name.equals("java.lang.Boolean")) {
                        return (ProactiveMessage) storage.get(strValueOf, Boolean.TYPE);
                    }
                    break;
                case 398795216:
                    if (name.equals("java.lang.Long")) {
                        return (ProactiveMessage) storage.get(strValueOf, Long.TYPE);
                    }
                    break;
            }
            return storage.get(strValueOf, ProactiveMessage.class);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$setProactiveMessage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage$setProactiveMessage$2", f = "ProactiveMessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nProactiveMessagingStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage$setProactiveMessage$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,65:1\n43#2,2:66\n*S KotlinDebug\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage$setProactiveMessage$2\n*L\n50#1:66,2\n*E\n"})
    public static final class C02532 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ProactiveMessage $proactiveMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02532(ProactiveMessage proactiveMessage, c<? super C02532> cVar) {
            super(2, cVar);
            this.$proactiveMessage = proactiveMessage;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingStorage.this.new C02532(this.$proactiveMessage, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C02532) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            ProactiveMessagingStorage.this.storage.set(String.valueOf(this.$proactiveMessage.getId()), this.$proactiveMessage, ProactiveMessage.class);
            return Unit.f26487a;
        }
    }

    public ProactiveMessagingStorage(@NotNull Storage storage) {
        storage.getClass();
        this.storage = storage;
        f fVar = p0.f42144a;
        this.persistenceDispatcher = c90.e.f7834b.z0(1);
    }

    @Nullable
    public final Object clear(@NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new AnonymousClass2(null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object clearProactiveMessage(int i11, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02512(i11, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object getProactiveMessage(int i11, @NotNull c<? super ProactiveMessage> cVar) {
        return f0.K(this.persistenceDispatcher, new C02522(i11, null), cVar);
    }

    @Nullable
    public final Object setProactiveMessage(@NotNull ProactiveMessage proactiveMessage, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02532(proactiveMessage, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }
}
