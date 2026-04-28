package com.google.android.gms.common.api;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface f extends b {
    void connect(com.google.android.gms.common.internal.d dVar);

    void disconnect();

    void disconnect(String str);

    pz.d[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(com.google.android.gms.common.internal.n nVar, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(com.google.android.gms.common.internal.e eVar);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
