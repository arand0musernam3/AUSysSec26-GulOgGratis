package zendesk.ui.android.internal;

import android.os.SystemClock;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lzendesk/ui/android/internal/ThrottledOnClickListener;", "Landroid/view/View$OnClickListener;", "minimumIntervalMillis", "", "<init>", "(J)V", "lastClickMap", "", "", "onDebouncedClick", "", "view", "Landroid/view/View;", "onClick", "clickedView", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ThrottledOnClickListener implements View.OnClickListener {
    public static final int $stable = 8;

    @NotNull
    private final Map<Integer, Long> lastClickMap;
    private final long minimumIntervalMillis;

    public ThrottledOnClickListener(long j9) {
        this.minimumIntervalMillis = j9;
        this.lastClickMap = new ConcurrentHashMap();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View clickedView) {
        clickedView.getClass();
        int id2 = clickedView.getId();
        Long l = this.lastClickMap.get(Integer.valueOf(id2));
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (l == null || Math.abs(jUptimeMillis - l.longValue()) > this.minimumIntervalMillis) {
            this.lastClickMap.put(Integer.valueOf(id2), Long.valueOf(jUptimeMillis));
            onDebouncedClick(clickedView);
        }
    }

    public abstract void onDebouncedClick(@Nullable View view);

    public ThrottledOnClickListener() {
        this(0L, 1, null);
    }

    public /* synthetic */ ThrottledOnClickListener(long j9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 500L : j9);
    }
}
