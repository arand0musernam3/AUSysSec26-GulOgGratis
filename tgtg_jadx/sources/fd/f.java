package fd;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f17563a;

    public f(Drawable drawable) {
        this.f17563a = drawable;
    }

    @Override // fd.l
    public final boolean a() {
        return false;
    }

    @Override // fd.l
    public final int b() {
        return ae.q.b(this.f17563a);
    }

    @Override // fd.l
    public final void c(Canvas canvas) {
        this.f17563a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f17563a, ((f) obj).f17563a);
    }

    @Override // fd.l
    public final int getHeight() {
        return ae.q.a(this.f17563a);
    }

    @Override // fd.l
    public final long getSize() {
        Drawable drawable = this.f17563a;
        long jB = ((long) ae.q.b(drawable)) * 4 * ((long) ae.q.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f17563a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f17563a + ", shareable=false)";
    }
}
