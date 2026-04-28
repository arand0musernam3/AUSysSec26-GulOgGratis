package f00;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.l;
import dn.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz.b f17038a;

    public h(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, iz.b bVar, m mVar, n nVar) {
        super(context, looper, 68, iVar, mVar, nVar);
        bVar = bVar == null ? iz.b.f24244c : bVar;
        k kVar = new k(20, false);
        kVar.f15018b = Boolean.FALSE;
        iz.b bVar2 = iz.b.f24244c;
        bVar.getClass();
        kVar.f15018b = Boolean.valueOf(bVar.f24245a);
        kVar.f15019c = bVar.f24246b;
        kVar.f15019c = f.a();
        this.f17038a = new iz.b(kVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        iz.b bVar = this.f17038a;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f24245a);
        bundle.putString("log_session_id", bVar.f24246b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
