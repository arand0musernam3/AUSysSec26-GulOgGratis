package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f1704f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1709e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public final float a() {
        return this.f1707c;
    }

    public final int b() {
        return this.f1708d;
    }

    public final float c() {
        return this.f1706b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat(touchX=");
        sb2.append(this.f1705a);
        sb2.append(", touchY=");
        sb2.append(this.f1706b);
        sb2.append(", progress=");
        sb2.append(this.f1707c);
        sb2.append(", swipeEdge=");
        sb2.append(this.f1708d);
        sb2.append(", frameTimeMillis=");
        return w.a0.r(sb2, this.f1709e, ')');
    }

    public b(float f11, float f12, float f13, int i11, long j9) {
        this.f1705a = f11;
        this.f1706b = f12;
        this.f1707c = f13;
        this.f1708d = i11;
        this.f1709e = j9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(q9.b bVar) {
        this(bVar.f36362c, bVar.f36363d, bVar.f36361b, bVar.f36360a, bVar.f36364e);
        bVar.getClass();
    }
}
