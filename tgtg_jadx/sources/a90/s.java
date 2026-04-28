package a90;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchException;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class s extends v80.a implements z70.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x70.c f1046d;

    public s(CoroutineContext coroutineContext, x70.c cVar) {
        super(coroutineContext, true);
        this.f1046d = cVar;
    }

    @Override // v80.s1
    public final boolean P() {
        return true;
    }

    @Override // z70.d
    public final z70.d getCallerFrame() {
        x70.c cVar = this.f1046d;
        if (cVar instanceof z70.d) {
            return (z70.d) cVar;
        }
        return null;
    }

    @Override // v80.s1
    public void i(Object obj) throws DispatchException {
        g.h(f0.C(obj), y70.f.b(this.f1046d));
    }

    @Override // v80.s1
    public void l(Object obj) {
        this.f1046d.resumeWith(f0.C(obj));
    }

    public void l0() {
    }
}
