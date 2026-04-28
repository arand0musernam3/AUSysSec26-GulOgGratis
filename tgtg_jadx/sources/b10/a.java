package b10;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f5543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f5544d;

    public a(Context context, Looper looper, i iVar, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, iVar, mVar, nVar);
        this.f5541a = true;
        this.f5542b = iVar;
        this.f5543c = bundle;
        this.f5544d = iVar.f11123f;
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 2);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        i iVar = this.f5542b;
        boolean zEquals = getContext().getPackageName().equals(iVar.f11120c);
        Bundle bundle = this.f5543c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", iVar.f11120c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final boolean requiresSignIn() {
        return this.f5541a;
    }
}
