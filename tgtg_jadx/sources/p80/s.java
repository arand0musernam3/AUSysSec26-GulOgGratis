package p80;

import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f34581a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f34582b = System.nanoTime();

    public static long b() {
        return System.nanoTime() - f34582b;
    }

    @Override // p80.v
    public final TimeMark a() {
        return new t(b());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
