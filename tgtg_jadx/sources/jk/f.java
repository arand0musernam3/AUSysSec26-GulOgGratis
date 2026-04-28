package jk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import b0.z;
import ox.h;
import p70.g;
import p70.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends ik.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f25296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25297i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25298j = false;

    @Override // ik.b, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f25297i) {
            return null;
        }
        t();
        return this.f25296h;
    }

    @Override // ik.b, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f25296h;
        h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t();
        r();
    }

    @Override // ik.b, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // ik.b
    public final void r() {
        if (this.f25298j) {
            return;
        }
        this.f25298j = true;
        ((a) a()).getClass();
    }

    public final void t() {
        if (this.f25296h == null) {
            this.f25296h = new k(super.getContext(), this);
            this.f25297i = z.v(super.getContext());
        }
    }

    @Override // ik.b, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        t();
        r();
    }
}
