package m0;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends s0.x0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28495n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f28496o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var, Size size) {
        super(34, size);
        this.f28496o = h1Var;
    }

    @Override // s0.x0
    public final ListenableFuture f() {
        switch (this.f28495n) {
            case 0:
                return ((h1) this.f28496o).f28519f;
            default:
                return x0.g.c((Surface) this.f28496o);
        }
    }

    public e1(Surface surface, Size size, int i11) {
        super(i11, size);
        this.f28496o = surface;
    }
}
