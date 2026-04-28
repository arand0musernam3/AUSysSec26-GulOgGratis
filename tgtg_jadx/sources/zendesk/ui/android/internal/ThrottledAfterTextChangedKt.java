package zendesk.ui.android.internal;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "minimumIntervalMillis", "Lkotlin/Function1;", "Landroid/text/Editable;", "", "afterTextChanged", "Lzendesk/ui/android/internal/ThrottledAfterTextChanged;", "throttledAfterTextChangedListener", "(JLkotlin/jvm/functions/Function1;)Lzendesk/ui/android/internal/ThrottledAfterTextChanged;", "DEFAULT_DEBOUNCE_MINIMUM_INTERVAL_MILLIS", "J", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThrottledAfterTextChangedKt {
    private static final long DEFAULT_DEBOUNCE_MINIMUM_INTERVAL_MILLIS = 20;

    @NotNull
    public static final ThrottledAfterTextChanged throttledAfterTextChangedListener(long j9, @NotNull final Function1<? super Editable, Unit> function1) {
        function1.getClass();
        return new ThrottledAfterTextChanged(j9) { // from class: zendesk.ui.android.internal.ThrottledAfterTextChangedKt.throttledAfterTextChangedListener.1
            @Override // zendesk.ui.android.internal.ThrottledAfterTextChanged
            public void onDebouncedAfterTextChanged(Editable text) {
                function1.invoke(text);
            }
        };
    }

    public static /* synthetic */ ThrottledAfterTextChanged throttledAfterTextChangedListener$default(long j9, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = DEFAULT_DEBOUNCE_MINIMUM_INTERVAL_MILLIS;
        }
        return throttledAfterTextChangedListener(j9, function1);
    }
}
