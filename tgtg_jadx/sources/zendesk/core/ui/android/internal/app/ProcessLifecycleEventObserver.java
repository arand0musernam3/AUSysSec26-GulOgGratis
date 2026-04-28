package zendesk.core.ui.android.internal.app;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c0;
import androidx.lifecycle.m1;
import androidx.lifecycle.t0;
import androidx.lifecycle.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "Landroidx/lifecycle/c0;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/w;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/w;)V", "Ly80/f1;", "", "_isInForeground", "Ly80/f1;", "Ly80/i;", "isInForeground", "()Ly80/i;", "Companion", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalZendeskUIApi
public final class ProcessLifecycleEventObserver implements c0 {

    @NotNull
    private f1 _isInForeground = r.c(Boolean.FALSE);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final i isInForeground() {
        return this._isInForeground;
    }

    @Override // androidx.lifecycle.c0
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull w event) {
        source.getClass();
        event.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            f1 f1Var = this._isInForeground;
            Boolean bool = Boolean.FALSE;
            a2 a2Var = (a2) f1Var;
            a2Var.getClass();
            a2Var.k(null, bool);
            return;
        }
        if (i11 != 2) {
            return;
        }
        f1 f1Var2 = this._isInForeground;
        Boolean bool2 = Boolean.TRUE;
        a2 a2Var2 = (a2) f1Var2;
        a2Var2.getClass();
        a2Var2.k(null, bool2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver$Companion;", "", "<init>", "()V", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "newInstance", "()Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "Lv80/b0;", "processLifeCycleOwnerCoroutineScope", "()Lv80/b0;", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @InternalZendeskUIApi
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProcessLifecycleEventObserver newInstance() {
            ProcessLifecycleEventObserver processLifecycleEventObserver = new ProcessLifecycleEventObserver();
            t0.f3512i.f3518f.a(processLifecycleEventObserver);
            return processLifecycleEventObserver;
        }

        @NotNull
        public final b0 processLifeCycleOwnerCoroutineScope() {
            return m1.c(t0.f3512i);
        }

        private Companion() {
        }
    }
}
