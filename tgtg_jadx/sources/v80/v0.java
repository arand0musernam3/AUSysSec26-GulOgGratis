package v80;

import kotlin.Unit;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f42168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f42169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z0 z0Var, long j9, l lVar) {
        super(j9);
        this.f42169d = z0Var;
        this.f42168c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws DispatchException {
        this.f42168c.D(this.f42169d, Unit.f26487a);
    }

    @Override // v80.x0
    public final String toString() {
        return super.toString() + this.f42168c;
    }
}
