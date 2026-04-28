package m00;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends com.google.android.gms.common.internal.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f28661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f28662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f28663c;

    public h(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, qz.f fVar, qz.n nVar) {
        super(context, looper, 23, iVar, fVar, nVar);
        this.f28661a = new k1(0);
        this.f28662b = new k1(0);
        this.f28663c = new k1(0);
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new w(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 4);
    }

    @Override // com.google.android.gms.common.internal.f
    public final pz.d[] getApiFeatures() {
        return s00.h.f38519a;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final void onConnectionSuspended(int i11) {
        super.onConnectionSuspended(i11);
        synchronized (this.f28661a) {
            this.f28661a.clear();
        }
        synchronized (this.f28662b) {
            this.f28662b.clear();
        }
        synchronized (this.f28663c) {
            this.f28663c.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
