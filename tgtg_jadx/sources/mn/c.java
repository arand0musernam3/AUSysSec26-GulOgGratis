package mn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.o0;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b5.r1;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lv.s;
import mv.q;
import mv.r0;
import mv.u;
import mv.z;
import u70.m;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/c;", "Lkm/a;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileFragment.kt\ncom/app/tgtg/feature/main/fragments/profile/ui/ProfileFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,81:1\n106#2,15:82\n*S KotlinDebug\n*F\n+ 1 ProfileFragment.kt\ncom/app/tgtg/feature/main/fragments/profile/ui/ProfileFragment\n*L\n26#1:82,15\n*E\n"})
public final class c extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f30007g;

    public c() {
        u70.j jVarA = u70.l.a(m.NONE, new ky.i(new ky.i(this, 5), 6));
        this.f30007g = new n1(Reflection.getOrCreateKotlinClass(l.class), new bl.c(jVarA, 16), new r1(11, this, jVarA), new bl.c(jVarA, 17));
    }

    @Override // km.a
    public final z o() {
        return z.PROFILE;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(a.f29999a);
        l lVarQ = q();
        cv.i iVar = cv.i.SCREEN_MENU;
        iVar.getClass();
        lVarQ.f30024f.b(iVar);
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            ViewCompat.k0(view, new e.b(this, 29));
            view.requestApplyInsets();
        }
        l lVarQ = q();
        x70.c cVar = null;
        f0.B(m1.d(lVarQ), null, null, new f(lVarQ, cVar, 2), 3);
        l lVarQ2 = q();
        f0.B(m1.d(lVarQ2), null, null, new f(lVarQ2, cVar, 3), 3);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (r0.u(contextRequireContext)) {
            l lVarQ3 = q();
            f0.B(m1.d(lVarQ3), null, null, new defpackage.k(lVarQ3, cVar, 3), 3);
            l lVarQ4 = q();
            u uVar = lVarQ4.f30025g;
            uVar.getClass();
            String strA = uVar.a(mv.k.APPTRK_CM_RECIPE_GENERATOR);
            if (strA != null ? ox.h.w(strA, q.TREATMENT.a()) : false) {
                f0.B(m1.d(lVarQ4), null, null, new f(lVarQ4, cVar, 0), 3);
            }
        }
    }

    @Override // km.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        a70.a.t(o0VarRequireActivity, s.J);
    }

    public final l q() {
        return (l) this.f30007g.getValue();
    }
}
