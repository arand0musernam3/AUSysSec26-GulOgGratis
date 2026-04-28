package com.android.installreferrer.api;

import a40.d0;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import hz.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f8865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8866b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f8866b = bVar;
        if (installReferrerStateListener != null) {
            this.f8865a = installReferrerStateListener;
        } else {
            d0.k("Please specify a listener to know when setup is done.");
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i11 = hz.b.f22560g;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            aVar = iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new hz.a(iBinder);
        }
        b bVar = this.f8866b;
        bVar.f8869c = aVar;
        bVar.f8867a = 2;
        this.f8865a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f8866b;
        bVar.f8869c = null;
        bVar.f8867a = 0;
        this.f8865a.onInstallReferrerServiceDisconnected();
    }
}
