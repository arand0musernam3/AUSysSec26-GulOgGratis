package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends rz.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new v(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope[] f11134o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final pz.d[] f11135p = new pz.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f11140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f11141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f11142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f11143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pz.d[] f11144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pz.d[] f11145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11146k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f11148n;

    public k(int i11, int i12, int i13, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, pz.d[] dVarArr, pz.d[] dVarArr2, boolean z11, int i14, boolean z12, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f11134o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        pz.d[] dVarArr3 = f11135p;
        pz.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f11136a = i11;
        this.f11137b = i12;
        this.f11138c = i13;
        if ("com.google.android.gms".equals(str)) {
            this.f11139d = "com.google.android.gms";
        } else {
            this.f11139d = str;
        }
        if (i11 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i15 = a.f11092h;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface v0Var = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new v0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        v0 v0Var2 = (v0) v0Var;
                        Parcel parcelC = v0Var2.C(2, v0Var2.L());
                        Account account3 = (Account) j00.h.a(parcelC, Account.CREATOR);
                        parcelC.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
            this.f11143h = account2;
        } else {
            this.f11140e = iBinder;
            this.f11143h = account;
        }
        this.f11141f = scopeArr2;
        this.f11142g = bundle2;
        this.f11144i = dVarArr4;
        this.f11145j = dVarArr3;
        this.f11146k = z11;
        this.l = i14;
        this.f11147m = z12;
        this.f11148n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        v.a(this, parcel, i11);
    }
}
