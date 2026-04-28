package n80;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final d f30711e = new d(null);

    static {
        new e((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f30704a == eVar.f30704a && this.f30705b == eVar.f30705b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f30704a * 31) + this.f30705b;
    }

    public final boolean isEmpty() {
        return Intrinsics.compare((int) this.f30704a, (int) this.f30705b) > 0;
    }

    public final String toString() {
        return this.f30704a + ".." + this.f30705b;
    }
}
