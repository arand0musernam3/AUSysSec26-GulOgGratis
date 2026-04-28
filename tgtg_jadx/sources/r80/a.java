package r80;

import com.braze.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f37778b = AtomicIntegerFieldUpdater.newUpdater(a.class, Constants.BRAZE_PUSH_CONTENT_KEY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f37779a;

    public final boolean a() {
        return f37778b.compareAndSet(this, 0, 1);
    }

    public final boolean b() {
        return this.f37779a != 0;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
