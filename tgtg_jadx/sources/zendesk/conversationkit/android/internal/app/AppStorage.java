package zendesk.conversationkit.android.internal.app;

import ba0.g;
import c90.f;
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
import v80.p0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.model.User;
import zendesk.storage.android.PersistedProperty;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R/\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lzendesk/conversationkit/android/internal/app/AppStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "<init>", "(Lzendesk/storage/android/Storage;)V", "Lzendesk/conversationkit/android/model/User;", "getUser", "(Lx70/c;)Ljava/lang/Object;", "user", "", "setUser", "(Lzendesk/conversationkit/android/model/User;Lx70/c;)Ljava/lang/Object;", "clearUser", "Lv80/x;", "persistenceDispatcher", "Lv80/x;", "<set-?>", "persistedUser$delegate", "Lzendesk/storage/android/PersistedProperty;", "getPersistedUser", "()Lzendesk/conversationkit/android/model/User;", "setPersistedUser", "(Lzendesk/conversationkit/android/model/User;)V", "persistedUser", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStorage.kt\nzendesk/conversationkit/android/internal/app/AppStorage\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,61:1\n63#2:62\n*S KotlinDebug\n*F\n+ 1 AppStorage.kt\nzendesk/conversationkit/android/internal/app/AppStorage\n*L\n26#1:62\n*E\n"})
public final class AppStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(AppStorage.class, "persistedUser", "getPersistedUser()Lzendesk/conversationkit/android/model/User;", 0)};

    @NotNull
    private static final String KEY_PERSISTED_USER = "PERSISTED_USER";

    /* JADX INFO: renamed from: persistedUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final PersistedProperty persistedUser;

    @NotNull
    private final x persistenceDispatcher;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppStorage$clearUser$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppStorage$clearUser$2", f = "AppStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return AppStorage.this.new AnonymousClass2(cVar);
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
            AppStorage.this.setPersistedUser(null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppStorage$getUser$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppStorage$getUser$2", f = "AppStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/conversationkit/android/model/User;", "<anonymous>", "(Lv80/b0;)Lzendesk/conversationkit/android/model/User;"}, k = 3, mv = {2, 1, 0})
    public static final class C02302 extends i implements Function2<b0, c<? super User>, Object> {
        int label;

        public C02302(c<? super C02302> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return AppStorage.this.new C02302(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super User> cVar) {
            return ((C02302) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return AppStorage.this.getPersistedUser();
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.app.AppStorage$setUser$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.app.AppStorage$setUser$2", f = "AppStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02312 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ User $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02312(User user, c<? super C02312> cVar) {
            super(2, cVar);
            this.$user = user;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return AppStorage.this.new C02312(this.$user, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C02312) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            AppStorage.this.setPersistedUser(this.$user);
            return Unit.f26487a;
        }
    }

    public AppStorage(@NotNull Storage storage) {
        storage.getClass();
        f fVar = p0.f42144a;
        this.persistenceDispatcher = c90.e.f7834b.z0(1);
        this.persistedUser = new PersistedProperty(storage, KEY_PERSISTED_USER, User.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getPersistedUser() {
        return (User) this.persistedUser.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPersistedUser(User user) {
        this.persistedUser.setValue(this, $$delegatedProperties[0], user);
    }

    @Nullable
    public final Object clearUser(@NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new AnonymousClass2(null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object getUser(@NotNull c<? super User> cVar) {
        return f0.K(this.persistenceDispatcher, new C02302(null), cVar);
    }

    @Nullable
    public final Object setUser(@NotNull User user, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02312(user, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }
}
