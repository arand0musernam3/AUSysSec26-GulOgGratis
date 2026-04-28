package yz;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import cz.j;
import j30.g;
import java.util.Objects;
import qc.y;
import u00.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f46345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f46346b;

    public c(j jVar, Bundle bundle) {
        this.f46345a = bundle;
        Objects.requireNonNull(jVar);
        this.f46346b = jVar;
    }

    @Override // yz.e
    public final int a() {
        return 1;
    }

    @Override // yz.e
    public final void b() {
        g gVar = (g) this.f46346b.f13632b;
        Bundle bundle = this.f46345a;
        gVar.getClass();
        try {
            Bundle bundle2 = new Bundle();
            u00.d.T(bundle, bundle2);
            h hVar = (h) gVar.f24503c;
            Parcel parcelL = hVar.L();
            n00.d.c(parcelL, bundle2);
            hVar.M(2, parcelL);
            u00.d.T(bundle2, bundle);
            Parcel parcelJ = hVar.J(8, hVar.L());
            a aVarU = b.U(parcelJ.readStrongBinder());
            parcelJ.recycle();
            gVar.f24504d = (View) b.V(aVarU);
            ViewGroup viewGroup = (ViewGroup) gVar.f24502b;
            viewGroup.removeAllViews();
            viewGroup.addView((View) gVar.f24504d);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }
}
