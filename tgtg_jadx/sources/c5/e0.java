package c5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f7179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i11) {
        super(1);
        this.f7178a = i11;
        this.f7179b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7178a) {
            case 0:
                View view = this.f7179b.f7192a;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                d3 d3Var = (d3) obj;
                if (d3Var.f7162b.contains(d3Var)) {
                    f0 f0Var = this.f7179b;
                    b5.f2 snapshotObserver = f0Var.f7192a.getSnapshotObserver();
                    snapshotObserver.f5819a.d(d3Var, f0Var.K, new b5.r1(4, d3Var, f0Var));
                }
                return Unit.f26487a;
        }
    }
}
