package ym;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider$Factory;
import mv.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 extends km.a implements r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p70.k f46168b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p70.g f46170d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46169c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f46171e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46172f = false;

    @Override // r70.b
    public final Object a() {
        if (this.f46170d == null) {
            synchronized (this.f46171e) {
                try {
                    if (this.f46170d == null) {
                        this.f46170d = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f46170d.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f46169c) {
            return null;
        }
        p();
        return this.f46168b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f46168b;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        q();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p() {
        if (this.f46168b == null) {
            this.f46168b = new p70.k(super.getContext(), this);
            this.f46169c = b0.z.v(super.getContext());
        }
    }

    public final void q() {
        if (this.f46172f) {
            return;
        }
        this.f46172f = true;
        ((u) this).f46250y = (e0) ((ag.e) ((x) a())).f1298a.f1327i0.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        q();
    }
}
