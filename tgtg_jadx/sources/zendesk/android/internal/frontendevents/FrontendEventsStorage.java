package zendesk.android.internal.frontendevents;

import ba0.g;
import com.braze.h2;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzendesk/android/internal/frontendevents/FrontendEventsStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "Lv80/x;", "persistenceDispatcher", "<init>", "(Lzendesk/storage/android/Storage;Lv80/x;)V", "", "createNewSUID", "()Ljava/lang/String;", "", "resetSUIDTimestamp", "()V", "", "storedTimestamp", "", "isOutOfDate", "(J)Z", "getSUID", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/storage/android/Storage;", "Lv80/x;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrontendEventsStorage {

    @Deprecated
    @NotNull
    public static final String KEY_SUID = "suid";

    @Deprecated
    @NotNull
    public static final String KEY_SUID_TIMESTAMP = "suid_timestamp";

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long OUT_OF_DATE_DURATION = 1800000;

    /* JADX INFO: renamed from: zendesk.android.internal.frontendevents.FrontendEventsStorage$getSUID$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.frontendevents.FrontendEventsStorage$getSUID$2", f = "FrontendEventsStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super String>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return FrontendEventsStorage.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super String> cVar) {
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
            String str = (String) FrontendEventsStorage.this.storage.get(FrontendEventsStorage.KEY_SUID, String.class);
            Long l = (Long) FrontendEventsStorage.this.storage.get(FrontendEventsStorage.KEY_SUID_TIMESTAMP, Long.TYPE);
            long jLongValue = l != null ? l.longValue() : 0L;
            FrontendEventsStorage frontendEventsStorage = FrontendEventsStorage.this;
            if (str == null) {
                String strCreateNewSUID = frontendEventsStorage.createNewSUID();
                FrontendEventsStorage.this.resetSUIDTimestamp();
                return strCreateNewSUID;
            }
            boolean zIsOutOfDate = frontendEventsStorage.isOutOfDate(jLongValue);
            FrontendEventsStorage frontendEventsStorage2 = FrontendEventsStorage.this;
            if (!zIsOutOfDate) {
                frontendEventsStorage2.resetSUIDTimestamp();
                return str;
            }
            String strCreateNewSUID2 = frontendEventsStorage2.createNewSUID();
            FrontendEventsStorage.this.resetSUIDTimestamp();
            return strCreateNewSUID2;
        }
    }

    public FrontendEventsStorage(@NotNull Storage storage, @NotNull x xVar) {
        storage.getClass();
        xVar.getClass();
        this.storage = storage;
        this.persistenceDispatcher = xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String createNewSUID() {
        String strE = s.e();
        this.storage.set(KEY_SUID, strE, String.class);
        return strE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOutOfDate(long storedTimestamp) {
        return System.currentTimeMillis() - storedTimestamp > OUT_OF_DATE_DURATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetSUIDTimestamp() {
        this.storage.set(KEY_SUID_TIMESTAMP, Long.valueOf(System.currentTimeMillis()), Long.TYPE);
    }

    @Nullable
    public final Object getSUID(@NotNull c<? super String> cVar) {
        return f0.K(this.persistenceDispatcher, new AnonymousClass2(null), cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzendesk/android/internal/frontendevents/FrontendEventsStorage$Companion;", "", "<init>", "()V", "KEY_SUID", "", "KEY_SUID_TIMESTAMP", "OUT_OF_DATE_DURATION", "", "getOUT_OF_DATE_DURATION", "()J", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getOUT_OF_DATE_DURATION() {
            return FrontendEventsStorage.OUT_OF_DATE_DURATION;
        }

        private Companion() {
        }
    }
}
