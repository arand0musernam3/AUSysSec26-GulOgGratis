package c6;

import android.view.WindowInsets;
import androidx.compose.ui.node.Owner;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import b5.m0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f7680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f7681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d0 d0Var, m0 m0Var, int i11) {
        super(1);
        this.f7679a = i11;
        this.f7680b = d0Var;
        this.f7681c = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsU;
        switch (this.f7679a) {
            case 0:
                Owner owner = (Owner) obj;
                c5.y yVar = owner instanceof c5.y ? (c5.y) owner : null;
                d0 d0Var = this.f7680b;
                if (yVar != null) {
                    HashMap<j, m0> holderToLayoutNode = yVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    m0 m0Var = this.f7681c;
                    holderToLayoutNode.put(d0Var, m0Var);
                    yVar.getAndroidViewsHandler$ui().addView(d0Var);
                    yVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(m0Var, d0Var);
                    d0Var.setImportantForAccessibility(1);
                    ViewCompat.b0(d0Var, new c5.p(yVar, m0Var, yVar));
                }
                if (d0Var.getView().getParent() != d0Var) {
                    d0Var.addView(d0Var.getView());
                }
                break;
            case 1:
                l.d(this.f7680b, this.f7681c);
                break;
            default:
                m0 m0Var2 = this.f7681c;
                d0 d0Var2 = this.f7680b;
                l.d(d0Var2, m0Var2);
                ((c5.y) d0Var2.f7701c).G = true;
                int[] iArr = d0Var2.f7711n;
                int i11 = iArr[0];
                int i12 = iArr[1];
                d0Var2.getView().getLocationOnScreen(iArr);
                long j9 = d0Var2.f7712o;
                long jU = ((z4.z) obj).u();
                d0Var2.f7712o = jU;
                WindowInsetsCompat windowInsetsCompat = d0Var2.f7713p;
                if (windowInsetsCompat != null && ((i11 != iArr[0] || i12 != iArr[1] || !z5.l.a(j9, jU)) && (windowInsetsU = d0Var2.l(windowInsetsCompat).u()) != null)) {
                    d0Var2.getView().dispatchApplyWindowInsets(windowInsetsU);
                }
                break;
        }
        return Unit.f26487a;
    }
}
