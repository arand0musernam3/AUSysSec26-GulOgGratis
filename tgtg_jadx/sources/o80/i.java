package o80;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32122a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f32123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32124c;

    public i(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        this.f32124c = sequence;
        this.f32123b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f32122a) {
            case 0:
                return new h(this);
            default:
                return new e(this);
        }
    }

    public i(Function0 function0, Function1 function1) {
        function1.getClass();
        this.f32124c = function0;
        this.f32123b = function1;
    }
}
