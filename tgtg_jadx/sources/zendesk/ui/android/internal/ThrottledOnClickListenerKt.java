package zendesk.ui.android.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a \u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"DEFAULT_DEBOUNCE_MINIMUM_INTERVAL_MILLIS", "", "throttledOnClickListener", "Lzendesk/ui/android/internal/ThrottledOnClickListener;", "minimumIntervalMillis", "onClick", "Lkotlin/Function0;", "", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThrottledOnClickListenerKt {
    private static final long DEFAULT_DEBOUNCE_MINIMUM_INTERVAL_MILLIS = 500;

    @NotNull
    public static final ThrottledOnClickListener throttledOnClickListener(long j9, @NotNull final Function0<Unit> function0) {
        function0.getClass();
        return new ThrottledOnClickListener(j9) { // from class: zendesk.ui.android.internal.ThrottledOnClickListenerKt.throttledOnClickListener.1
            @Override // zendesk.ui.android.internal.ThrottledOnClickListener
            public void onDebouncedClick(View view) {
                function0.invoke();
            }
        };
    }

    public static /* synthetic */ ThrottledOnClickListener throttledOnClickListener$default(long j9, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = DEFAULT_DEBOUNCE_MINIMUM_INTERVAL_MILLIS;
        }
        return throttledOnClickListener(j9, function0);
    }
}
