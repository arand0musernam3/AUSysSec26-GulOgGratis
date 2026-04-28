package zendesk.messaging.android.internal.conversationscreen.cache;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage;", "", "Lv80/x;", "persistenceDispatcher", "Lzendesk/storage/android/Storage;", "storage", "<init>", "(Lv80/x;Lzendesk/storage/android/Storage;)V", "Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;", "messagingUIPersistence", "", "setMessagingPersistence", "(Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;Lx70/c;)Ljava/lang/Object;", "", "conversationId", "getMessagingPersistence", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "clear", "(Lx70/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "updateMessagingUIPersistence", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lx70/c;)Ljava/lang/Object;", "Lv80/x;", "Lzendesk/storage/android/Storage;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagingStorage {

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$clear$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$clear$2", f = "MessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return MessagingStorage.this.new AnonymousClass2(cVar);
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
            MessagingStorage.this.storage.clear();
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$getMessagingPersistence$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$getMessagingPersistence$2", f = "MessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;", "<anonymous>", "(Lv80/b0;)Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nMessagingStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingStorage.kt\nzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage$getMessagingPersistence$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,98:1\n20#2,7:99\n*S KotlinDebug\n*F\n+ 1 MessagingStorage.kt\nzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage$getMessagingPersistence$2\n*L\n45#1:99,7\n*E\n"})
    public static final class C04272 extends i implements Function2<b0, c<? super MessagingUIPersistence>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04272(String str, c<? super C04272> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return MessagingStorage.this.new C04272(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super MessagingUIPersistence> cVar) {
            return ((C04272) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r0 = r6.label
                if (r0 != 0) goto L7b
                ba0.g.M(r7)
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r7 = zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage.this
                zendesk.storage.android.Storage r7 = zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage.access$getStorage$p(r7)
                java.lang.String r0 = r6.$conversationId
                java.lang.Class<zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence> r1 = zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence.class
                java.lang.String r2 = r1.getName()
                int r3 = r2.hashCode()
                switch(r3) {
                    case -2056817302: goto L55;
                    case -527879800: goto L43;
                    case 344809556: goto L31;
                    case 398795216: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L66
            L1f:
                java.lang.String r3 = "java.lang.Long"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L28
                goto L66
            L28:
                java.lang.Class r1 = java.lang.Long.TYPE
                java.lang.Object r7 = r7.get(r0, r1)
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r7 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r7
                goto L6a
            L31:
                java.lang.String r3 = "java.lang.Boolean"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L3a
                goto L66
            L3a:
                java.lang.Class r1 = java.lang.Boolean.TYPE
                java.lang.Object r7 = r7.get(r0, r1)
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r7 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r7
                goto L6a
            L43:
                java.lang.String r3 = "java.lang.Float"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4c
                goto L66
            L4c:
                java.lang.Class r1 = java.lang.Float.TYPE
                java.lang.Object r7 = r7.get(r0, r1)
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r7 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r7
                goto L6a
            L55:
                java.lang.String r3 = "java.lang.Integer"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L66
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.Object r7 = r7.get(r0, r1)
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r7 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r7
                goto L6a
            L66:
                java.lang.Object r7 = r7.get(r0, r1)
            L6a:
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r7 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r7
                if (r7 != 0) goto L7a
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r0 = new zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence
                java.lang.String r1 = r6.$conversationId
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
            L7a:
                return r7
            L7b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r7)
                r7 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage.C04272.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$setMessagingPersistence$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$setMessagingPersistence$2", f = "MessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nMessagingStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingStorage.kt\nzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage$setMessagingPersistence$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,98:1\n43#2,2:99\n*S KotlinDebug\n*F\n+ 1 MessagingStorage.kt\nzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage$setMessagingPersistence$2\n*L\n35#1:99,2\n*E\n"})
    public static final class C04282 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ MessagingUIPersistence $messagingUIPersistence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04282(MessagingUIPersistence messagingUIPersistence, c<? super C04282> cVar) {
            super(2, cVar);
            this.$messagingUIPersistence = messagingUIPersistence;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return MessagingStorage.this.new C04282(this.$messagingUIPersistence, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04282) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            MessagingStorage.this.storage.set(this.$messagingUIPersistence.getConversationId(), this.$messagingUIPersistence, MessagingUIPersistence.class);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$updateMessagingUIPersistence$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage$updateMessagingUIPersistence$2", f = "MessagingStorage.kt", l = {68, 69}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04292 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Function1<MessagingUIPersistence, MessagingUIPersistence> $block;
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04292(String str, Function1<? super MessagingUIPersistence, MessagingUIPersistence> function1, c<? super C04292> cVar) {
            super(2, cVar);
            this.$conversationId = str;
            this.$block = function1;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return MessagingStorage.this.new C04292(this.$conversationId, this.$block, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04292) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r1.setMessagingPersistence(r5, r4) == r0) goto L15;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                ba0.g.M(r5)
                goto L40
            L10:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r5)
                r5 = 0
                return r5
            L17:
                ba0.g.M(r5)
                goto L2b
            L1b:
                ba0.g.M(r5)
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r5 = zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage.this
                java.lang.String r1 = r4.$conversationId
                r4.label = r3
                java.lang.Object r5 = r5.getMessagingPersistence(r1, r4)
                if (r5 != r0) goto L2b
                goto L3f
            L2b:
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r5 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r5
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r1 = zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage.this
                kotlin.jvm.functions.Function1<zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence, zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence> r3 = r4.$block
                java.lang.Object r5 = r3.invoke(r5)
                zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r5 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r5
                r4.label = r2
                java.lang.Object r5 = r1.setMessagingPersistence(r5, r4)
                if (r5 != r0) goto L40
            L3f:
                return r0
            L40:
                kotlin.Unit r5 = kotlin.Unit.f26487a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage.C04292.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MessagingStorage(@NotNull x xVar, @NotNull Storage storage) {
        xVar.getClass();
        storage.getClass();
        this.persistenceDispatcher = xVar;
        this.storage = storage;
    }

    @Nullable
    public final Object clear(@NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new AnonymousClass2(null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object getMessagingPersistence(@NotNull String str, @NotNull c<? super MessagingUIPersistence> cVar) {
        return f0.K(this.persistenceDispatcher, new C04272(str, null), cVar);
    }

    @Nullable
    public final Object setMessagingPersistence(@NotNull MessagingUIPersistence messagingUIPersistence, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C04282(messagingUIPersistence, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object updateMessagingUIPersistence(@NotNull String str, @NotNull Function1<? super MessagingUIPersistence, MessagingUIPersistence> function1, @NotNull c<? super Unit> cVar) {
        Object objK = f0.K(this.persistenceDispatcher, new C04292(str, function1, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }
}
