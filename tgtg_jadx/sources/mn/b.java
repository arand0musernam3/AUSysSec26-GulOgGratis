package mn;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider$Factory;
import b0.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends km.a implements r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p70.k f30002b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p70.g f30004d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30003c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30005e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30006f = false;

    @Override // r70.b
    public final Object a() {
        if (this.f30004d == null) {
            synchronized (this.f30005e) {
                try {
                    if (this.f30004d == null) {
                        this.f30004d = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f30004d.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f30003c) {
            return null;
        }
        p();
        return this.f30002b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f30002b;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        if (this.f30006f) {
            return;
        }
        this.f30006f = true;
        ((d) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p() {
        if (this.f30002b == null) {
            this.f30002b = new p70.k(super.getContext(), this);
            this.f30003c = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        if (this.f30006f) {
            return;
        }
        this.f30006f = true;
        ((d) a()).getClass();
    }
}
