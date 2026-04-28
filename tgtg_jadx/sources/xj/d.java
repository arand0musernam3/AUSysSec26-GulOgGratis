package xj;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.o0;
import androidx.lifecycle.n1;
import b5.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lv.s;
import mv.r0;
import mv.z;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxj/d;", "Lkm/a;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFavoritesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoritesFragment.kt\ncom/app/tgtg/feature/favorites/ui/FavoritesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,117:1\n106#2,15:118\n1128#3,6:133\n1128#3,6:139\n1128#3,6:145\n1128#3,6:151\n*S KotlinDebug\n*F\n+ 1 FavoritesFragment.kt\ncom/app/tgtg/feature/favorites/ui/FavoritesFragment\n*L\n25#1:118,15\n44#1:133,6\n50#1:139,6\n55#1:145,6\n61#1:151,6\n*E\n"})
public final class d extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f44374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44375h;

    public d() {
        u70.j jVarA = u70.l.a(m.NONE, new ky.i(new ky.i(this, 23), 24));
        this.f44374g = new n1(Reflection.getOrCreateKotlinClass(k.class), new c(jVarA, 0), new r1(19, this, jVarA), new c(jVarA, 1));
    }

    @Override // km.a
    public final z o() {
        return z.FAVORITES;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f44375h = arguments.getBoolean("SHOW_GET_NOTIFIED");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new u3.d(new a(this, 0), true, 398224457));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        q().G = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            ViewCompat.k0(view, new mp.a(this, 21));
            view.requestApplyInsets();
        }
        boolean z11 = false;
        if (((List) q().f44418n.f45488a.getValue()) != null && (!r0.isEmpty())) {
            z11 = true;
        }
        k kVarQ = q();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        kVarQ.b(r0.u(contextRequireContext), !z11);
    }

    @Override // km.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        a70.a.t(o0VarRequireActivity, s.J);
        q().H = this.f26467a == f70.i.WIDGET;
        k kVarQ = q();
        m1.a aVar = kVarQ.f44413h;
        boolean z11 = kVarQ.H;
        aVar.getClass();
        dv.a aVar2 = dv.a.SOURCE;
        dv.d dVar = z11 ? dv.d.WIDGET : null;
        ((cv.b) aVar.f28697a).c(cv.i.SCREEN_FAVORITES, h0.g.E(new Pair(aVar2, new dv.c(dVar != null ? dVar.a() : null))));
        kVarQ.H = false;
    }

    public final k q() {
        return (k) this.f44374g.getValue();
    }
}
