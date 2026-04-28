package k90;

import java.util.Iterator;
import kotlin.collections.r0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import m90.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26237b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f26236a = i11;
        this.f26237b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f26236a) {
            case 0:
                return new f((y) this.f26237b);
            case 1:
                return ArrayIteratorKt.iterator((Object[]) this.f26237b);
            case 2:
                return new r0((Iterator) ((Function0) this.f26237b).invoke());
            default:
                return ((Sequence) this.f26237b).iterator();
        }
    }
}
