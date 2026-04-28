package n80;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f30703d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f30704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f30705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30706c = 1;

    public b(char c3, char c7) {
        this.f30704a = c3;
        this.f30705b = (char) b80.c.a(c3, c7, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f30704a, this.f30705b, this.f30706c);
    }
}
