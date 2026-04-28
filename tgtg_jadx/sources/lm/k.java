package lm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider$Factory;
import b0.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends km.a implements r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p70.k f27930b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p70.g f27932d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27931c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f27933e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27934f = false;

    @Override // r70.b
    public final Object a() {
        if (this.f27932d == null) {
            synchronized (this.f27933e) {
                try {
                    if (this.f27932d == null) {
                        this.f27932d = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f27932d.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f27931c) {
            return null;
        }
        p();
        return this.f27930b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f27930b;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        if (this.f27934f) {
            return;
        }
        this.f27934f = true;
        ((j) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p() {
        if (this.f27930b == null) {
            this.f27930b = new p70.k(super.getContext(), this);
            this.f27931c = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        p();
        if (this.f27934f) {
            return;
        }
        this.f27934f = true;
        ((j) a()).getClass();
    }
}
