package zendesk.core.android.internal.di;

import a90.p;
import c90.e;
import c90.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.p0;
import v80.x;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@InternalZendeskApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lzendesk/core/android/internal/di/CoroutineDispatchersModule;", "", "<init>", "()V", "Lv80/x;", "mainDispatcher", "()Lv80/x;", "defaultDispatcher", "ioDispatcher", "persistenceDispatcher", "Companion", "zendesk.core_core-utilities"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoroutineDispatchersModule {

    @NotNull
    public static final String DEFAULT_DISPATCHER = "DEFAULT_DISPATCHER";

    @NotNull
    public static final String IO_DISPATCHER = "IO_DISPATCHER";

    @NotNull
    public static final String MAIN_DISPATCHER = "MAIN_DISPATCHER";

    @NotNull
    public static final String PERSISTENCE_DISPATCHER = "PERSISTENCE_DISPATCHER";

    @NotNull
    public final x defaultDispatcher() {
        return p0.f42144a;
    }

    @NotNull
    public final x ioDispatcher() {
        f fVar = p0.f42144a;
        return e.f7834b;
    }

    @NotNull
    public final x mainDispatcher() {
        f fVar = p0.f42144a;
        return p.f1044a;
    }

    @NotNull
    public final x persistenceDispatcher() {
        f fVar = p0.f42144a;
        return e.f7834b.z0(1);
    }
}
