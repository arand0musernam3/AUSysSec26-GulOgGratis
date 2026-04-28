package eo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider$Factory;
import at.c0;
import b0.z;
import p70.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends km.a implements r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f16191b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p70.g f16193d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16192c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16194e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16195f = false;

    @Override // r70.b
    public final Object a() {
        if (this.f16193d == null) {
            synchronized (this.f16194e) {
                try {
                    if (this.f16193d == null) {
                        this.f16193d = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f16193d.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f16192c) {
            return null;
        }
        p();
        return this.f16191b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f16191b;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        q();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p() {
        if (this.f16191b == null) {
            this.f16191b = new k(super.getContext(), this);
            this.f16192c = z.v(super.getContext());
        }
    }

    public final void q() {
        if (this.f16195f) {
            return;
        }
        this.f16195f = true;
        f fVar = (f) this;
        ag.e eVar = (ag.e) ((g) a());
        fVar.f16202g = new bt.b((ao.c) eVar.f1299b.f1288a.P.get());
        fVar.f16203h = new c0((f70.g) eVar.f1298a.f1321f0.get());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        q();
    }
}
