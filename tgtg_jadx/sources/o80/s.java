package o80;

import h7.h0;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f32132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f32133b;

    public s(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        this.f32132a = sequence;
        this.f32133b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new h0(this);
    }
}
