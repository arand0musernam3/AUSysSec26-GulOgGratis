package yi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider$Factory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends com.google.android.material.bottomsheet.m implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p70.k f46027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p70.g f46029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f46030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46031f;

    public u(int i11) {
        this.f46026a = i11;
        switch (i11) {
            case 1:
                this.f46028c = false;
                this.f46030e = new Object();
                this.f46031f = false;
                break;
            default:
                this.f46028c = false;
                this.f46030e = new Object();
                this.f46031f = false;
                break;
        }
    }

    @Override // r70.b
    public final Object a() {
        switch (this.f46026a) {
            case 0:
                if (this.f46029d == null) {
                    synchronized (this.f46030e) {
                        try {
                            if (this.f46029d == null) {
                                this.f46029d = new p70.g(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f46029d.a();
            default:
                if (this.f46029d == null) {
                    synchronized (this.f46030e) {
                        try {
                            if (this.f46029d == null) {
                                this.f46029d = new p70.g(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f46029d.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        switch (this.f46026a) {
            case 0:
                if (super.getContext() != null || this.f46028c) {
                    q();
                }
                break;
            default:
                if (super.getContext() != null || this.f46028c) {
                    r();
                }
                break;
        }
        return this.f46027b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        switch (this.f46026a) {
        }
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        switch (this.f46026a) {
            case 0:
                super.onAttach(activity);
                p70.k kVar = this.f46027b;
                ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                q();
                if (!this.f46031f) {
                    this.f46031f = true;
                    ((s) a()).getClass();
                }
                break;
            default:
                super.onAttach(activity);
                p70.k kVar2 = this.f46027b;
                ox.h.q(kVar2 == null || p70.g.d(kVar2) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                r();
                if (!this.f46031f) {
                    this.f46031f = true;
                    ((f0) this).f45984i = (dj.a) ((ag.e) ((g0) a())).f1300c.get();
                }
                break;
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        switch (this.f46026a) {
            case 0:
                LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
            default:
                LayoutInflater layoutInflaterOnGetLayoutInflater2 = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater2.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater2, this));
        }
    }

    public void q() {
        if (this.f46027b == null) {
            this.f46027b = new p70.k(super.getContext(), this);
            this.f46028c = b0.z.v(super.getContext());
        }
    }

    public void r() {
        if (this.f46027b == null) {
            this.f46027b = new p70.k(super.getContext(), this);
            this.f46028c = b0.z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        switch (this.f46026a) {
            case 0:
                super.onAttach(context);
                q();
                if (!this.f46031f) {
                    this.f46031f = true;
                    ((s) a()).getClass();
                }
                break;
            default:
                super.onAttach(context);
                r();
                if (!this.f46031f) {
                    this.f46031f = true;
                    ((f0) this).f45984i = (dj.a) ((ag.e) ((g0) a())).f1300c.get();
                }
                break;
        }
    }
}
