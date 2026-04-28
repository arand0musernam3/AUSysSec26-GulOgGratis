package ik;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import b0.z;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import com.app.tgtg.model.local.AppConstants;
import ek.q;
import f70.i;
import g3.q9;
import jb.u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ox.h;
import p70.g;
import p70.k;
import pg.e1;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHelpCenterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterFragment.kt\ncom/app/tgtg/feature/helpdesk/ui/HelpCenterFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,125:1\n172#2,9:126\n*S KotlinDebug\n*F\n+ 1 HelpCenterFragment.kt\ncom/app/tgtg/feature/helpdesk/ui/HelpCenterFragment\n*L\n34#1:126,9\n*E\n"})
public class b extends Fragment implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f24045a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f24047c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24046b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24048d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24049e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f24050f = new n1(Reflection.getOrCreateKotlinClass(q.class), new a(this, 0), new a(this, 2), new a(this, 1));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f24051g = new e0(this, 26);

    public static void p(b bVar, int i11) {
        boolean z11 = (i11 & 1) == 0;
        boolean z12 = (i11 & 2) == 0;
        f70.g gVar = bVar.o().f16069e.f20529a;
        Bundle bundleX = u.x(new Pair("ORIGIN", i.UNKNOWN));
        if (z11) {
            bundleX.putBoolean("GO_TO_STORE_SIGNUP_WEB", true);
        }
        if (z12) {
            bundleX.putBoolean("GO_TO_RECOMMEND_STORE", true);
        }
        gVar.a(new f70.b(StoreLoginActivity.class, bundleX, false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_STORE_SIGNUP), null, null, null, false, 988));
    }

    @Override // r70.b
    public final Object a() {
        if (this.f24047c == null) {
            synchronized (this.f24048d) {
                try {
                    if (this.f24047c == null) {
                        this.f24047c = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f24047c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f24046b) {
            return null;
        }
        q();
        return this.f24045a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final q o() {
        return (q) this.f24050f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f24045a;
        h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q();
        r();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        requireActivity().getOnBackPressedDispatcher().a(this.f24051g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f24051g.remove();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o0 o0Var = o().f16072h;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        m0.c.f0(o0Var, viewLifecycleOwner, new q9(this, 28));
    }

    public final void q() {
        if (this.f24045a == null) {
            this.f24045a = new k(super.getContext(), this);
            this.f24046b = z.v(super.getContext());
        }
    }

    public void r() {
        if (this.f24049e) {
            return;
        }
        this.f24049e = true;
        ((c) a()).getClass();
    }

    public final void s(String str) {
        str.getClass();
        androidx.fragment.app.o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        e1 e1Var = ((HelpCenterActivity) o0VarRequireActivity).f9007f;
        if (e1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e1Var = null;
        }
        ((TextView) e1Var.f34842c.f34795c).setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        q();
        r();
    }
}
