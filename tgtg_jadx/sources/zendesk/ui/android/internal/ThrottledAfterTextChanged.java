package zendesk.ui.android.internal;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J*\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J*\u0010\u0013\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0015"}, d2 = {"Lzendesk/ui/android/internal/ThrottledAfterTextChanged;", "Landroid/text/TextWatcher;", "minimumIntervalMillis", "", "<init>", "(J)V", "lastTextChangedTimeStamp", "Ljava/lang/Long;", "onDebouncedAfterTextChanged", "", TextBundle.TEXT_ENTRY, "Landroid/text/Editable;", "beforeTextChanged", "p0", "", "p1", "", "p2", "p3", "onTextChanged", "afterTextChanged", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ThrottledAfterTextChanged implements TextWatcher {
    public static final int $stable = 8;

    @Nullable
    private Long lastTextChangedTimeStamp;
    private final long minimumIntervalMillis;

    public /* synthetic */ ThrottledAfterTextChanged(long j9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 20L : j9);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable text) {
        Long l = this.lastTextChangedTimeStamp;
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.lastTextChangedTimeStamp = Long.valueOf(jUptimeMillis);
        if (l == null || Math.abs(jUptimeMillis - l.longValue()) > this.minimumIntervalMillis) {
            onDebouncedAfterTextChanged(text);
        }
    }

    public abstract void onDebouncedAfterTextChanged(@Nullable Editable text);

    public ThrottledAfterTextChanged(long j9) {
        this.minimumIntervalMillis = j9;
    }

    public ThrottledAfterTextChanged() {
        this(0L, 1, null);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence p02, int p12, int p22, int p32) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence p02, int p12, int p22, int p32) {
    }
}
