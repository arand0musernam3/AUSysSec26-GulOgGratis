package c5;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b4.s implements g5.a, b5.l2, u4.e, b5.c0, b5.q2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.fragment.app.r f7288o = new androidx.fragment.app.r(this, 3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y f7289p;

    public m(y yVar) {
        this.f7289p = yVar;
    }

    @Override // g5.a
    public final Object S(b5.s1 s1Var, b5.r1 r1Var, z70.c cVar) {
        long jS = s1Var.S(0L);
        h4.c cVar2 = (h4.c) r1Var.invoke();
        h4.c cVarK = cVar2 != null ? cVar2.k(jS) : null;
        if (cVarK != null) {
            this.f7289p.requestRectangleOnScreen(new Rect((int) cVarK.f21380a, (int) cVarK.f21381b, (int) cVarK.f21382c, (int) cVarK.f21383d), false);
        }
        return Unit.f26487a;
    }

    @Override // u4.e
    public final boolean e(KeyEvent keyEvent) {
        return false;
    }

    @Override // b5.q2
    public final Object g() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        z4.m1 m1VarD = t0Var.D(j9);
        return z4.w0.Y(w0Var, m1VarD.f47183a, m1VarD.f47184b, this.f7288o, new l(m1VarD, 0));
    }

    @Override // u4.e
    public final boolean w(KeyEvent keyEvent) {
        g4.f fVar;
        int[] iArr = g4.h.f19944a;
        long jB = u4.c.b(keyEvent);
        boolean z11 = true;
        if (u4.a.a(jB, u4.a.f40710b)) {
            fVar = new g4.f(2);
        } else if (u4.a.a(jB, u4.a.f40711c)) {
            fVar = new g4.f(1);
        } else if (u4.a.a(jB, u4.a.f40723p)) {
            fVar = new g4.f(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            fVar = u4.a.a(jB, u4.a.f40715g) ? new g4.f(4) : u4.a.a(jB, u4.a.f40714f) ? new g4.f(3) : (u4.a.a(jB, u4.a.f40712d) || u4.a.a(jB, u4.a.C)) ? new g4.f(5) : (u4.a.a(jB, u4.a.f40713e) || u4.a.a(jB, u4.a.D)) ? new g4.f(6) : (u4.a.a(jB, u4.a.f40716h) || u4.a.a(jB, u4.a.f40725r) || u4.a.a(jB, u4.a.E)) ? new g4.f(7) : (u4.a.a(jB, u4.a.f40709a) || u4.a.a(jB, u4.a.f40728u)) ? new g4.f(8) : null;
        }
        if (fVar != null) {
            int i11 = fVar.f19936a;
            if (u4.c.c(keyEvent) == 2) {
                y yVar = this.f7289p;
                g4.g0 g0VarH = ((g4.p) yVar.getFocusOwner()).h();
                if (g0VarH == null || !g0VarH.f19939o || !yVar.w(i11)) {
                    Boolean boolG = ((g4.p) yVar.getFocusOwner()).g(i11, yVar.getEmbeddedViewFocusRect(), new androidx.fragment.app.r(fVar, 2));
                    if (!(boolG != null ? boolG.booleanValue() : true)) {
                        if (i11 != 1 && i11 != 2) {
                            z11 = false;
                        }
                        if (z11) {
                            Integer numC = g4.h.c(i11);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = yVar.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, yVar.getView(), iIntValue);
                            if (viewFindNextFocus == null || Intrinsics.areEqual(viewFindNextFocus, yVar)) {
                                return ((g4.p) yVar.getFocusOwner()).j(i11);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
    }
}
