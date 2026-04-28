package o80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f32131a = new q();

    public q() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sequence sequence = (Sequence) obj;
        sequence.getClass();
        return sequence.iterator();
    }
}
