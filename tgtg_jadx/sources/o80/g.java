package o80;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f32115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f32116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f32117c;

    public g(Sequence sequence, Function1 function1, Function1 function12) {
        sequence.getClass();
        function1.getClass();
        function12.getClass();
        this.f32115a = sequence;
        this.f32116b = function1;
        this.f32117c = function12;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new e(this);
    }
}
