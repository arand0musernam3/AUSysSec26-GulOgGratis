package o80;

import java.util.Iterator;
import kotlin.collections.r0;
import kotlin.sequences.Sequence;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f32104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32105b;

    public b(Sequence sequence, int i11) {
        sequence.getClass();
        this.f32104a = sequence;
        this.f32105b = i11;
        if (i11 >= 0) {
            return;
        }
        i4.a.i(a0.l("count must be non-negative, but was ", i11, '.'));
        throw null;
    }

    @Override // o80.c
    public final Sequence a(int i11) {
        int i12 = this.f32105b + i11;
        return i12 < 0 ? new b(this, i11) : new b(this.f32104a, i12);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new r0(this);
    }
}
