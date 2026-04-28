package r80;

import com.braze.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f37780b = AtomicIntegerFieldUpdater.newUpdater(b.class, Constants.BRAZE_PUSH_CONTENT_KEY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f37781a;

    public final int a() {
        return f37780b.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.f37781a);
    }
}
