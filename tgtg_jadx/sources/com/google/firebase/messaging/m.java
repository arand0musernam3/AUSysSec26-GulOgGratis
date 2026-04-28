package com.google.firebase.messaging;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements t40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12847a;

    public /* synthetic */ m(int i11) {
        this.f12847a = i11;
    }

    @Override // t40.b
    public final Object get() {
        switch (this.f12847a) {
            case 0:
                return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            case 1:
                return FirebaseMessaging.lambda$static$0();
            case 2:
                return Collections.EMPTY_SET;
            case 3:
                return null;
            case 4:
                u30.k kVar = ExecutorsRegistrar.f12751a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new v30.f(Executors.newFixedThreadPool(4, new v30.b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f12754d.get());
            case 5:
                u30.k kVar2 = ExecutorsRegistrar.f12751a;
                return new v30.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new v30.b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f12754d.get());
            case 6:
                u30.k kVar3 = ExecutorsRegistrar.f12751a;
                return new v30.f(Executors.newCachedThreadPool(new v30.b("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f12754d.get());
            default:
                u30.k kVar4 = ExecutorsRegistrar.f12751a;
                return Executors.newSingleThreadScheduledExecutor(new v30.b("Firebase Scheduler", 0, null));
        }
    }
}
