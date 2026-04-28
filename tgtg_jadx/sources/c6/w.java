package c6;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import com.braze.h2;
import g4.g0;
import g4.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends b4.s implements g4.u, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f7762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f7763p = new v(this, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f7764q = new v(this, 1);

    public final g0 L0() {
        if (!getNode().isAttached()) {
            y4.a.b("visitLocalDescendants called on an unattached node");
        }
        b4.s node = getNode();
        if ((node.getAggregateChildKindSet$ui() & 1024) != 0) {
            boolean z11 = false;
            for (b4.s child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & 1024) != 0) {
                    b4.s sVarB = child$ui;
                    o3.e eVar = null;
                    while (sVarB != null) {
                        if (sVarB instanceof g0) {
                            g0 g0Var = (g0) sVarB;
                            if (z11) {
                                return g0Var;
                            }
                            z11 = true;
                        } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                            int i11 = 0;
                            for (b4.s child$ui2 = ((b5.n) sVarB).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
                                if ((child$ui2.getKindSet$ui() & 1024) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        sVarB = child$ui2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o3.e(new b4.s[16], 0);
                                        }
                                        if (sVarB != null) {
                                            eVar.b(sVarB);
                                            sVarB = null;
                                        }
                                        eVar.b(child$ui2);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        sVarB = b5.m.b(eVar);
                    }
                }
            }
        }
        h2.b("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // b4.s
    public final void onAttach() {
        ViewTreeObserver viewTreeObserver = b5.o.n(this).getViewTreeObserver();
        this.f7762o = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // b4.s
    public final void onDetach() {
        ViewTreeObserver viewTreeObserver = this.f7762o;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f7762o = null;
        b5.o.n(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z11;
        if (b5.m.g(this).f5878o == null) {
            return;
        }
        View viewC = l.c(this);
        g4.l focusOwner = ((c5.y) b5.m.h(this)).getFocusOwner();
        Owner ownerH = b5.m.h(this);
        boolean z12 = true;
        if (view == null || Intrinsics.areEqual(view, ownerH)) {
            z11 = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewC.getParent()) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        }
        if (view2 == null || Intrinsics.areEqual(view2, ownerH)) {
            z12 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewC.getParent()) {
                    break;
                }
            }
            z12 = false;
        }
        if (z11 && z12) {
            return;
        }
        if (z12) {
            g0 g0VarL0 = L0();
            if (g0VarL0.Q0().a()) {
                return;
            }
            i0.e(g0VarL0);
            return;
        }
        if (z11 && L0().Q0().c()) {
            ((g4.p) focusOwner).d(8, false, false);
        }
    }

    @Override // g4.u
    public final void x(g4.r rVar) {
        rVar.e(false);
        rVar.d(this.f7763p);
        rVar.c(this.f7764q);
    }
}
