package zs;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import at.c0;
import bg.w0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import g3.c1;
import g9.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mv.r0;
import o30.e0;
import pg.b1;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends Fragment implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.k f48081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f48083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f48084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bt.b f48086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f48087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f48088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w0 f48089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WebView f48090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1 f48091k;
    public final mr.e l;

    public j(int i11) {
        super(i11);
        this.f48082b = false;
        this.f48084d = new Object();
        this.f48085e = false;
        zendesk.ui.android.conversation.textcell.c cVar = new zendesk.ui.android.conversation.textcell.c(this, 2);
        t tVarB = u70.l.b(new c1(this, 8));
        this.f48088h = new n1(Reflection.getOrCreateKotlinClass(o.class), new i(tVarB, 0), cVar, new i(tVarB, 1));
        this.l = new mr.e(this, 18);
    }

    public static void s(g9.p pVar, o0 o0Var) {
        pVar.getClass();
        o0Var.getClass();
        z zVarI = pVar.f20186b.i();
        if ((zVarI == null || zVarI.f20258b.f27563e != R.id.recommendStoreSuccessFragment) && pVar.g()) {
            return;
        }
        o0Var.finish();
    }

    @Override // r70.b
    public final Object a() {
        if (this.f48083c == null) {
            synchronized (this.f48084d) {
                try {
                    if (this.f48083c == null) {
                        this.f48083c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f48083c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f48082b) {
            return null;
        }
        q();
        return this.f48081a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final b1 o() {
        b1 b1Var = this.f48091k;
        if (b1Var != null) {
            return b1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolBar");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f48081a;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q();
        r();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.l.remove();
        bt.b bVar = this.f48086f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            bVar = null;
        }
        bVar.f6703c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().a(this.l);
        bt.b bVar = this.f48086f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            bVar = null;
        }
        bVar.f6703c = new t10.c(this);
        Context contextD = p70.g.d(getContext());
        contextD.getClass();
        StoreLoginActivity storeLoginActivity = (StoreLoginActivity) contextD;
        if (storeLoginActivity.f9454f != null) {
            this.f48091k = storeLoginActivity.A().f34842c;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            if (r0.q(contextRequireContext)) {
                View viewFindViewById = view.findViewById(R.id.title);
                viewFindViewById.getClass();
                TextView textView = (TextView) viewFindViewById;
                textView.requestFocus();
                textView.announceForAccessibility(textView.getText());
            }
            androidx.lifecycle.o0 o0Var = p().f48104g;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            final int i11 = 0;
            m0.c.f0(o0Var, viewLifecycleOwner, new Function1(this) { // from class: zs.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f48078b;

                {
                    this.f48078b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            e0.t(this.f48078b).c(((Integer) obj).intValue(), null);
                            break;
                        default:
                            ((View) obj).getClass();
                            j jVar = this.f48078b;
                            g9.p pVarT = e0.t(jVar);
                            o0 o0VarRequireActivity = jVar.requireActivity();
                            o0VarRequireActivity.getClass();
                            j.s(pVarT, o0VarRequireActivity);
                            break;
                    }
                    return Unit.f26487a;
                }
            });
            final int i12 = 1;
            mv.d.x((ImageButton) storeLoginActivity.A().f34842c.f34796d, new Function1(this) { // from class: zs.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f48078b;

                {
                    this.f48078b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i12) {
                        case 0:
                            e0.t(this.f48078b).c(((Integer) obj).intValue(), null);
                            break;
                        default:
                            ((View) obj).getClass();
                            j jVar = this.f48078b;
                            g9.p pVarT = e0.t(jVar);
                            o0 o0VarRequireActivity = jVar.requireActivity();
                            o0VarRequireActivity.getClass();
                            j.s(pVarT, o0VarRequireActivity);
                            break;
                    }
                    return Unit.f26487a;
                }
            });
        }
    }

    public final o p() {
        return (o) this.f48088h.getValue();
    }

    public final void q() {
        if (this.f48081a == null) {
            this.f48081a = new p70.k(super.getContext(), this);
            this.f48082b = b0.z.v(super.getContext());
        }
    }

    public final void r() {
        if (this.f48085e) {
            return;
        }
        this.f48085e = true;
        ag.e eVar = (ag.e) ((k) a());
        this.f48086f = new bt.b((ao.c) eVar.f1299b.f1288a.P.get());
        this.f48087g = new c0((f70.g) eVar.f1298a.f1321f0.get());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        q();
        r();
    }
}
