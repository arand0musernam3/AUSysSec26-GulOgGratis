package c6;

import android.graphics.Rect;
import android.view.View;
import g4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f7761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i11) {
        super(1);
        this.f7760a = i11;
        this.f7761b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7760a) {
            case 0:
                g4.a aVar = (g4.a) obj;
                w wVar = this.f7761b;
                View viewC = l.c(wVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    g4.l focusOwner = ((c5.y) b5.m.h(wVar)).getFocusOwner();
                    View viewN = b5.o.n(wVar);
                    Integer numC = g4.h.c(aVar.f19930a);
                    int[] iArr = new int[2];
                    viewN.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewC.getLocationOnScreen(iArr2);
                    g0 g0VarB = g4.d.b(((g4.p) focusOwner).f19964c);
                    Rect rect = null;
                    h4.c cVarC = g0VarB != null ? g4.d.c(g0VarB) : null;
                    if (cVarC != null) {
                        int i11 = (int) cVarC.f21380a;
                        int i12 = iArr[0];
                        int i13 = iArr2[0];
                        int i14 = (int) cVarC.f21381b;
                        int i15 = iArr[1];
                        int i16 = iArr2[1];
                        rect = new Rect((i11 + i12) - i13, (i14 + i15) - i16, (((int) cVarC.f21382c) + i12) - i13, (((int) cVarC.f21383d) + i15) - i16);
                    }
                    if (!g4.h.b(viewC, numC, rect)) {
                        aVar.f19931b = true;
                    }
                }
                break;
            default:
                l.c(this.f7761b);
                break;
        }
        return Unit.f26487a;
    }
}
