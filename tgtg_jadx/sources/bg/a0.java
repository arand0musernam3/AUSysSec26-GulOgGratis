package bg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider$Factory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends androidx.fragment.app.y implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.k f6107a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f6109c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6108b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6110d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6111e = false;

    @Override // r70.b
    public final Object a() {
        if (this.f6109c == null) {
            synchronized (this.f6110d) {
                try {
                    if (this.f6109c == null) {
                        this.f6109c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f6109c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f6108b) {
            return null;
        }
        p();
        return this.f6107a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f6107a;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        q();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p() {
        if (this.f6107a == null) {
            this.f6107a = new p70.k(super.getContext(), this);
            this.f6108b = b0.z.v(super.getContext());
        }
    }

    public final void q() {
        if (this.f6111e) {
            return;
        }
        this.f6111e = true;
        ((b1) this).f6125f = (cv.b) ((ag.e) ((c1) a())).f1298a.E.get();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        q();
    }
}
