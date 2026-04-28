package hn;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider$Factory;
import b0.z;
import ox.h;
import p70.g;
import p70.k;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends km.a implements r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f22184b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f22186d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22185c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22187e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22188f = false;

    @Override // r70.b
    public final Object a() {
        if (this.f22186d == null) {
            synchronized (this.f22187e) {
                try {
                    if (this.f22186d == null) {
                        this.f22186d = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f22186d.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f22185c) {
            return null;
        }
        p();
        return this.f22184b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f22184b;
        h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        if (this.f22188f) {
            return;
        }
        this.f22188f = true;
        ((d) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p() {
        if (this.f22184b == null) {
            this.f22184b = new k(super.getContext(), this);
            this.f22185c = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        if (this.f22188f) {
            return;
        }
        this.f22188f = true;
        ((d) a()).getClass();
    }
}
