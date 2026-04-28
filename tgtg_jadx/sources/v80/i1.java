package v80;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface i1 extends CoroutineContext.Element {
    CancellationException A();

    Object B(x70.c cVar);

    o I(s1 s1Var);

    r0 J(Function1 function1);

    a8.h Z();

    void a(CancellationException cancellationException);

    boolean a0();

    boolean g();

    r0 g0(boolean z11, boolean z12, al.d dVar);

    Sequence getChildren();

    boolean isCancelled();

    boolean start();
}
