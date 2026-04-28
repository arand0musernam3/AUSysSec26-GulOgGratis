package jg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Fragment implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p70.k f25168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p70.g f25170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f25171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25172f;

    public d(int i11) {
        this.f25167a = i11;
        switch (i11) {
            case 1:
                this.f25169c = false;
                this.f25171e = new Object();
                this.f25172f = false;
                break;
            case 2:
                this.f25169c = false;
                this.f25171e = new Object();
                this.f25172f = false;
                break;
            default:
                this.f25169c = false;
                this.f25171e = new Object();
                this.f25172f = false;
                break;
        }
    }

    @Override // r70.b
    public final Object a() {
        switch (this.f25167a) {
            case 0:
                if (this.f25170d == null) {
                    synchronized (this.f25171e) {
                        try {
                            if (this.f25170d == null) {
                                this.f25170d = new p70.g(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f25170d.a();
            case 1:
                if (this.f25170d == null) {
                    synchronized (this.f25171e) {
                        try {
                            if (this.f25170d == null) {
                                this.f25170d = new p70.g(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f25170d.a();
            default:
                if (this.f25170d == null) {
                    synchronized (this.f25171e) {
                        try {
                            if (this.f25170d == null) {
                                this.f25170d = new p70.g(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f25170d.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        switch (this.f25167a) {
            case 0:
                if (super.getContext() != null || this.f25169c) {
                    q();
                }
                break;
            case 1:
                if (super.getContext() != null || this.f25169c) {
                    o();
                }
                break;
            default:
                if (super.getContext() != null || this.f25169c) {
                    p();
                }
                break;
        }
        return this.f25168b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        switch (this.f25167a) {
        }
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public void o() {
        if (this.f25168b == null) {
            this.f25168b = new p70.k(super.getContext(), this);
            this.f25169c = b0.z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        switch (this.f25167a) {
            case 0:
                super.onAttach(activity);
                p70.k kVar = this.f25168b;
                ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                q();
                if (!this.f25172f) {
                    this.f25172f = true;
                    ((k0) a()).getClass();
                }
                break;
            case 1:
                super.onAttach(activity);
                p70.k kVar2 = this.f25168b;
                ox.h.q(kVar2 == null || p70.g.d(kVar2) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                o();
                r();
                break;
            default:
                super.onAttach(activity);
                p70.k kVar3 = this.f25168b;
                ox.h.q(kVar3 == null || p70.g.d(kVar3) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                p();
                if (!this.f25172f) {
                    this.f25172f = true;
                    ((ag.e) ((om.m) a())).getClass();
                    ((om.l) this).f32671g = new ky.p(22);
                }
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        switch (this.f25167a) {
            case 0:
                LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
            case 1:
                LayoutInflater layoutInflaterOnGetLayoutInflater2 = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater2.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater2, this));
            default:
                LayoutInflater layoutInflaterOnGetLayoutInflater3 = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater3.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater3, this));
        }
    }

    public void p() {
        if (this.f25168b == null) {
            this.f25168b = new p70.k(super.getContext(), this);
            this.f25169c = b0.z.v(super.getContext());
        }
    }

    public void q() {
        if (this.f25168b == null) {
            this.f25168b = new p70.k(super.getContext(), this);
            this.f25169c = b0.z.v(super.getContext());
        }
    }

    public void r() {
        if (this.f25172f) {
            return;
        }
        this.f25172f = true;
        ((nm.e) this).f31097g = (mv.e0) ((ag.e) ((nm.f) a())).f1298a.f1327i0.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        switch (this.f25167a) {
            case 0:
                super.onAttach(context);
                q();
                if (!this.f25172f) {
                    this.f25172f = true;
                    ((k0) a()).getClass();
                }
                break;
            case 1:
                super.onAttach(context);
                o();
                r();
                break;
            default:
                super.onAttach(context);
                p();
                if (!this.f25172f) {
                    this.f25172f = true;
                    ((ag.e) ((om.m) a())).getClass();
                    ((om.l) this).f32671g = new ky.p(22);
                }
                break;
        }
    }
}
