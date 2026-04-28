package r00;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.l;
import e10.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37526e;

    public i(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, m mVar, n nVar, int i11) {
        super(context, looper, 4, iVar, mVar, nVar);
        this.f37522a = context;
        this.f37523b = i11;
        this.f37524c = null;
        this.f37525d = 1;
        this.f37526e = true;
    }

    public final Bundle b() {
        String packageName = this.f37522a.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f37523b);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f37526e);
        bundle.putString("androidPackageName", packageName);
        String str = this.f37524c;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f37525d);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.wallet.internal.IOwService", 6);
    }

    @Override // com.google.android.gms.common.internal.f
    public final pz.d[] getApiFeatures() {
        return v.f15553d;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
