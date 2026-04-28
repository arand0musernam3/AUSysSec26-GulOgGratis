package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.Address;
import com.braze.h2;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @NonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile xz.a zzB;
    u0 zza;
    final Handler zzb;

    @NonNull
    protected d zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final m zzn;
    private final com.google.android.gms.common.a zzo;
    private o zzr;
    private IInterface zzs;
    private m0 zzu;
    private final b zzw;
    private final c zzx;
    private final int zzy;
    private final String zzz;
    private static final pz.d[] zze = new pz.d[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private pz.b zzC = null;
    private boolean zzD = false;
    private volatile p0 zzE = null;

    @NonNull
    protected AtomicInteger zzd = new AtomicInteger(0);

    public f(Context context, Looper looper, t0 t0Var, com.google.android.gms.common.a aVar, int i11, b bVar, c cVar, String str) {
        i0.i(context, "Context must not be null");
        this.zzl = context;
        i0.i(looper, "Looper must not be null");
        this.zzm = looper;
        i0.i(t0Var, "Supervisor must not be null");
        this.zzn = t0Var;
        i0.i(aVar, "API availability must not be null");
        this.zzo = aVar;
        this.zzb = new k0(this, looper);
        this.zzy = i11;
        this.zzw = bVar;
        this.zzx = cVar;
        this.zzz = str;
    }

    public final void a(int i11, IInterface iInterface) {
        u0 u0Var;
        i0.b((i11 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i11;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i11 == 1) {
                    m0 m0Var = this.zzu;
                    if (m0Var != null) {
                        m mVar = this.zzn;
                        String str = this.zza.f11205a;
                        i0.h(str);
                        String str2 = this.zza.f11206b;
                        zza();
                        mVar.c(str, str2, m0Var, this.zza.f11207c);
                        this.zzu = null;
                    }
                } else if (i11 == 2 || i11 == 3) {
                    m0 m0Var2 = this.zzu;
                    if (m0Var2 != null && (u0Var = this.zza) != null) {
                        String str3 = u0Var.f11205a;
                        String str4 = u0Var.f11206b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str3);
                        sb2.append(" on ");
                        sb2.append(str4);
                        Log.e("GmsClient", sb2.toString());
                        m mVar2 = this.zzn;
                        String str5 = this.zza.f11205a;
                        i0.h(str5);
                        String str6 = this.zza.f11206b;
                        zza();
                        mVar2.c(str5, str6, m0Var2, this.zza.f11207c);
                        this.zzd.incrementAndGet();
                    }
                    m0 m0Var3 = new m0(this, this.zzd.get());
                    this.zzu = m0Var3;
                    u0 u0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new u0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new u0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = u0Var2;
                    if (u0Var2.f11207c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f11205a)));
                    }
                    m mVar3 = this.zzn;
                    String str7 = this.zza.f11205a;
                    i0.h(str7);
                    pz.b bVarB = mVar3.b(new q0(str7, this.zza.f11206b, this.zza.f11207c), m0Var3, zza(), getBindServiceExecutor());
                    if (!(bVarB.f35644b == 0)) {
                        u0 u0Var3 = this.zza;
                        String str8 = u0Var3.f11205a;
                        String str9 = u0Var3.f11206b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str8);
                        sb3.append(" on ");
                        sb3.append(str9);
                        Log.w("GmsClient", sb3.toString());
                        int i12 = bVarB.f35644b;
                        if (i12 == -1) {
                            i12 = 16;
                        }
                        if (bVarB.f35645c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, bVarB.f35645c);
                        }
                        zzb(i12, bundle, this.zzd.get());
                    }
                } else if (i11 == 4) {
                    i0.h(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iB = this.zzo.b(this.zzl, getMinApkVersion());
        if (iB == 0) {
            connect(new r(this));
        } else {
            a(1, null);
            triggerNotAvailable(new r(this), iB, null);
        }
    }

    public final void checkConnected() {
        if (isConnected()) {
            return;
        }
        h2.b("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public void connect(@NonNull d dVar) {
        i0.i(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    d0 d0Var = (d0) arrayList.get(i11);
                    synchronized (d0Var) {
                        d0Var.f11105a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i11;
        IInterface iInterface;
        o oVar;
        long j9;
        synchronized (this.zzp) {
            i11 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            oVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i11 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i11 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i11 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i11 == 4) {
            printWriter.print("CONNECTED");
        } else if (i11 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (oVar == null) {
            printWriter.println(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(oVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j11 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j11));
            j9 = 0;
            StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(str2).length());
            sb2.append(j11);
            sb2.append(" ");
            sb2.append(str2);
            printWriterAppend.println(sb2.toString());
        } else {
            j9 = 0;
        }
        if (this.zzg > j9) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i12 = this.zzf;
            if (i12 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i12 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i12 != 3) {
                printWriter.append((CharSequence) String.valueOf(i12));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j12 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(str3).length());
            sb3.append(j12);
            sb3.append(" ");
            sb3.append(str3);
            printWriterAppend2.println(sb3.toString());
        }
        if (this.zzj > j9) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) xz.b.y(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j13 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j13));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j13).length() + 1 + String.valueOf(str4).length());
            sb4.append(j13);
            sb4.append(" ");
            sb4.append(str4);
            printWriterAppend3.println(sb4.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    @NonNull
    public pz.d[] getApiFeatures() {
        return zze;
    }

    public xz.a getAttributionSourceWrapper() {
        return this.zzB;
    }

    public final pz.d[] getAvailableFeatures() {
        p0 p0Var = this.zzE;
        if (p0Var == null) {
            return null;
        }
        return p0Var.f11170b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.zzl;
    }

    @NonNull
    public String getEndpointPackageName() {
        u0 u0Var;
        if (isConnected() && (u0Var = this.zza) != null) {
            return u0Var.f11206b;
        }
        a40.d0.k("Failed to connect when checking package");
        return null;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    @NonNull
    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(n nVar, @NonNull Set<Scope> set) {
        AttributionSource attributionSource;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSource = this.zzB.f44513a) == null || attributionSource.getAttributionTag() == null) ? this.zzA : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i11 = this.zzy;
        int i12 = com.google.android.gms.common.a.f11047a;
        Scope[] scopeArr = k.f11134o;
        Bundle bundle = new Bundle();
        pz.d[] dVarArr = k.f11135p;
        k kVar = new k(6, i11, i12, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        kVar.f11139d = this.zzl.getPackageName();
        kVar.f11142g = getServiceRequestExtraArgs;
        if (set != null) {
            kVar.f11141f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            kVar.f11143h = account;
            if (nVar != null) {
                kVar.f11140e = nVar.asBinder();
            }
        } else if (requiresAccount()) {
            kVar.f11143h = getAccount();
        }
        kVar.f11144i = zze;
        kVar.f11145j = getApiFeatures();
        if (usesClientTelemetry()) {
            kVar.f11147m = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    o oVar = this.zzr;
                    if (oVar != null) {
                        ((e0) oVar).a(new l0(this, this.zzd.get()), kVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e5) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e5);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set getScopes() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface2 = this.zzs;
                i0.i(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                o oVar = this.zzr;
                if (oVar == null) {
                    return null;
                }
                return oVar.asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract String getServiceDescriptor();

    @NonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    @NonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public j getTelemetryConfiguration() {
        p0 p0Var = this.zzE;
        if (p0Var == null) {
            return null;
        }
        return p0Var.f11172d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z11;
        synchronized (this.zzp) {
            z11 = this.zzv == 4;
        }
        return z11;
    }

    public boolean isConnecting() {
        boolean z11;
        synchronized (this.zzp) {
            int i11 = this.zzv;
            z11 = true;
            if (i11 != 2 && i11 != 3) {
                z11 = false;
            }
        }
        return z11;
    }

    public void onConnectedLocked(@NonNull IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(@NonNull pz.b bVar) {
        this.zzi = bVar.f35644b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i11) {
        this.zzf = i11;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i11, IBinder iBinder, Bundle bundle, int i12) {
        n0 n0Var = new n0(this, i11, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i12, -1, n0Var));
    }

    public void onUserSignOut(@NonNull e eVar) {
        jd.f fVar = (jd.f) eVar;
        fVar.getClass();
        ((qz.z) fVar.f24983b).f37413s.f37348n.post(new a8.f(fVar));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(@NonNull xz.a aVar) {
        this.zzB = aVar;
    }

    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i11) {
        int i12 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i12, i11));
    }

    public void triggerNotAvailable(@NonNull d dVar, int i11, PendingIntent pendingIntent) {
        i0.i(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        int i12 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i12, i11, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i11, Bundle bundle, int i12) {
        o0 o0Var = new o0(this, i11, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i12, -1, o0Var));
    }

    public final void zzc(p0 p0Var) {
        this.zzE = p0Var;
        if (usesClientTelemetry()) {
            j jVar = p0Var.f11172d;
            r rVarE = r.e();
            s sVar = jVar == null ? null : jVar.f11127a;
            synchronized (rVarE) {
                if (sVar == null) {
                    rVarE.f11181a = r.f11180c;
                    return;
                }
                s sVar2 = (s) rVarE.f11181a;
                if (sVar2 == null || sVar2.f11189a < sVar.f11189a) {
                    rVarE.f11181a = sVar;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i11, IInterface iInterface) {
        a(i11, null);
    }

    public final /* synthetic */ boolean zze(int i11, int i12, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i11) {
                    return false;
                }
                a(i12, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzf(int i11) {
        int i12;
        int i13;
        synchronized (this.zzp) {
            i12 = this.zzv;
        }
        if (i12 == 3) {
            this.zzD = true;
            i13 = 5;
        } else {
            i13 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i13, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(o oVar) {
        this.zzr = oVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ b zzk() {
        return this.zzw;
    }

    public final /* synthetic */ c zzl() {
        return this.zzx;
    }

    public final /* synthetic */ pz.b zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(pz.b bVar) {
        this.zzC = bVar;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public void disconnect(@NonNull String str) {
        this.zzk = str;
        disconnect();
    }
}
