package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ca extends com.google.android.gms.common.internal.l {
    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof ba ? (ba) iInterfaceQueryLocalInterface : new ba(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 0);
    }

    @Override // com.google.android.gms.common.internal.f
    public final pz.d[] getApiFeatures() {
        return h.f11444d;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final int getMinApkVersion() {
        return 9410000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
