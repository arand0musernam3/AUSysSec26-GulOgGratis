package v80;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends kotlin.coroutines.a implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f42174a = new x1(h1.f42106a);

    @Override // v80.i1
    public final CancellationException A() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // v80.i1
    public final Object B(x70.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // v80.i1
    public final o I(s1 s1Var) {
        return y1.f42177a;
    }

    @Override // v80.i1
    public final r0 J(Function1 function1) {
        return y1.f42177a;
    }

    @Override // v80.i1
    public final a8.h Z() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // v80.i1
    public final boolean a0() {
        return false;
    }

    @Override // v80.i1
    public final boolean g() {
        return true;
    }

    @Override // v80.i1
    public final r0 g0(boolean z11, boolean z12, al.d dVar) {
        return y1.f42177a;
    }

    @Override // v80.i1
    public final Sequence getChildren() {
        return o80.d.f32106a;
    }

    @Override // v80.i1
    public final boolean isCancelled() {
        return false;
    }

    @Override // v80.i1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // v80.i1
    public final void a(CancellationException cancellationException) {
    }
}
