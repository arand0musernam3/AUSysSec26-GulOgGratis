package c6;

import android.os.Parcelable;
import android.util.SparseArray;
import b5.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f7698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(d0 d0Var, int i11) {
        super(0);
        this.f7697a = i11;
        this.f7698b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7697a) {
            case 0:
                this.f7698b.getLayoutNode().D();
                break;
            case 1:
                d0 d0Var = this.f7698b;
                if (d0Var.f7703e && d0Var.isAttachedToWindow() && d0Var.getView().getParent() == d0Var) {
                    f2 snapshotObserver = d0Var.getSnapshotObserver();
                    snapshotObserver.f5819a.d(d0Var, j.A, d0Var.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f7698b.B.saveHierarchyState(sparseArray);
                break;
            case 3:
                d0 d0Var2 = this.f7698b;
                d0Var2.getReleaseBlock().invoke(d0Var2.B);
                d0.m(d0Var2);
                break;
            case 4:
                d0 d0Var3 = this.f7698b;
                d0Var3.getResetBlock().invoke(d0Var3.B);
                break;
            default:
                d0 d0Var4 = this.f7698b;
                d0Var4.getUpdateBlock().invoke(d0Var4.B);
                break;
        }
        return Unit.f26487a;
    }
}
