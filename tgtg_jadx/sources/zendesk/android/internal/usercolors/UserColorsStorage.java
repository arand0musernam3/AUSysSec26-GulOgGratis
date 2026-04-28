package zendesk.android.internal.usercolors;

import android.content.Context;
import ba0.g;
import c90.f;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import zendesk.android.internal.storage.ZendeskStorageSerializer;
import zendesk.core.android.internal.di.KotlinxSerializationModule;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageFactory;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "<init>", "(Lzendesk/storage/android/Storage;)V", "Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;", "userColors", "", "setUserColors", "(Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;Lx70/c;)Ljava/lang/Object;", "getUserColors", "(Lx70/c;)Ljava/lang/Object;", "clear", "Lzendesk/storage/android/Storage;", "Lv80/x;", "persistenceDispatcher", "Lv80/x;", "Companion", "StorageProvider", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserColorsStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String KEY_USER_COLORS = "UserColorsStorage.KEY_COLORS";

    @NotNull
    private static final String USER_COLORS_STORAGE_NAMESPACE = "zendesk.android.internal.usercolors";

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsStorage$StorageProvider;", "", "<init>", "()V", "createStorage", "Lzendesk/storage/android/Storage;", "context", "Landroid/content/Context;", "integrationId", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StorageProvider {

        @NotNull
        public static final StorageProvider INSTANCE = new StorageProvider();

        private StorageProvider() {
        }

        @NotNull
        public final Storage createStorage(@NotNull Context context, @Nullable String integrationId) {
            context.getClass();
            return StorageFactory.INSTANCE.create(UserColorsStorage.USER_COLORS_STORAGE_NAMESPACE, context, new StorageType.Complex(new ZendeskStorageSerializer(KotlinxSerializationModule.INSTANCE.provideJson())), integrationId);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.usercolors.UserColorsStorage$clear$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.usercolors.UserColorsStorage$clear$2", f = "UserColorsStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return UserColorsStorage.this.new AnonymousClass2(cVar);
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
            UserColorsStorage.this.storage.clear();
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.usercolors.UserColorsStorage$getUserColors$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.usercolors.UserColorsStorage$getUserColors$2", f = "UserColorsStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;", "<anonymous>", "(Lv80/b0;)Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nUserColorsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserColorsStorage.kt\nzendesk/android/internal/usercolors/UserColorsStorage$getUserColors$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,79:1\n20#2,7:80\n*S KotlinDebug\n*F\n+ 1 UserColorsStorage.kt\nzendesk/android/internal/usercolors/UserColorsStorage$getUserColors$2\n*L\n44#1:80,7\n*E\n"})
    public static final class C02012 extends i implements Function2<b0, c<? super UserColorsSchemePersistence>, Object> {
        int label;

        public C02012(c<? super C02012> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return UserColorsStorage.this.new C02012(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super UserColorsSchemePersistence> cVar) {
            return ((C02012) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            Storage storage = UserColorsStorage.this.storage;
            String name = UserColorsSchemePersistence.class.getName();
            switch (name.hashCode()) {
                case -2056817302:
                    if (name.equals("java.lang.Integer")) {
                        return (UserColorsSchemePersistence) storage.get(UserColorsStorage.KEY_USER_COLORS, Integer.TYPE);
                    }
                    break;
                case -527879800:
                    if (name.equals("java.lang.Float")) {
                        return (UserColorsSchemePersistence) storage.get(UserColorsStorage.KEY_USER_COLORS, Float.TYPE);
                    }
                    break;
                case 344809556:
                    if (name.equals("java.lang.Boolean")) {
                        return (UserColorsSchemePersistence) storage.get(UserColorsStorage.KEY_USER_COLORS, Boolean.TYPE);
                    }
                    break;
                case 398795216:
                    if (name.equals("java.lang.Long")) {
                        return (UserColorsSchemePersistence) storage.get(UserColorsStorage.KEY_USER_COLORS, Long.TYPE);
                    }
                    break;
            }
            return storage.get(UserColorsStorage.KEY_USER_COLORS, UserColorsSchemePersistence.class);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.usercolors.UserColorsStorage$setUserColors$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.usercolors.UserColorsStorage$setUserColors$2", f = "UserColorsStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nUserColorsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserColorsStorage.kt\nzendesk/android/internal/usercolors/UserColorsStorage$setUserColors$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,79:1\n43#2,2:80\n*S KotlinDebug\n*F\n+ 1 UserColorsStorage.kt\nzendesk/android/internal/usercolors/UserColorsStorage$setUserColors$2\n*L\n35#1:80,2\n*E\n"})
    public static final class C02022 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ UserColorsSchemePersistence $userColors;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02022(UserColorsSchemePersistence userColorsSchemePersistence, c<? super C02022> cVar) {
            super(2, cVar);
            this.$userColors = userColorsSchemePersistence;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return UserColorsStorage.this.new C02022(this.$userColors, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C02022) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            UserColorsStorage.this.storage.set(UserColorsStorage.KEY_USER_COLORS, this.$userColors, UserColorsSchemePersistence.class);
            return Unit.f26487a;
        }
    }

    public UserColorsStorage(@NotNull Storage storage) {
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
    public final Object getUserColors(@NotNull c<? super UserColorsSchemePersistence> cVar) {
        return f0.K(this.persistenceDispatcher, new C02012(null), cVar);
    }

    @Nullable
    public final Object setUserColors(@NotNull UserColorsSchemePersistence userColorsSchemePersistence, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02022(userColorsSchemePersistence, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsStorage$Companion;", "", "<init>", "()V", "KEY_USER_COLORS", "", "USER_COLORS_STORAGE_NAMESPACE", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
