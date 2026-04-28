package c6;

import android.view.MotionEvent;
import androidx.compose.ui.node.Owner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f7683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(d0 d0Var, int i11) {
        super(1);
        this.f7682a = i11;
        this.f7683b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f7682a) {
            case 0:
                Owner owner = (Owner) obj;
                c5.y yVar = owner instanceof c5.y ? (c5.y) owner : null;
                d0 d0Var = this.f7683b;
                if (yVar != null) {
                    yVar.getAndroidViewsHandler$ui().removeViewInLayout(d0Var);
                    TypeIntrinsics.asMutableMap(yVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(yVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(d0Var));
                    d0Var.setImportantForAccessibility(0);
                }
                d0Var.removeAllViewsInLayout();
                return Unit.f26487a;
            case 1:
                this.f7683b.f7714q = (Function1) obj;
                return Unit.f26487a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                d0 d0Var2 = this.f7683b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = d0Var2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = d0Var2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
