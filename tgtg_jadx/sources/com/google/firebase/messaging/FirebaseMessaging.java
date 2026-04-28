package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.n1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static c0 store;
    static ScheduledExecutorService syncExecutor;
    private final o autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final p30.g firebaseApp;
    private final q gmsRpc;
    private final s40.a iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final t metadata;
    private final z requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task<i0> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = 28800;
    static t40.b transportFactory = new m(1);

    public FirebaseMessaging(p30.g gVar, s40.a aVar, t40.b bVar, q40.c cVar, final t tVar, final q qVar, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = bVar;
        this.firebaseApp = gVar;
        this.autoInit = new o(this, cVar);
        gVar.a();
        final Context context = gVar.f34222a;
        this.context = context;
        j jVar = new j(0);
        this.lifecycleCallbacks = jVar;
        this.metadata = tVar;
        this.gmsRpc = qVar;
        this.requestDeduplicator = new z(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        gVar.a();
        Context context2 = gVar.f34222a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(jVar);
        } else {
            Log.w(TAG, "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a();
        }
        final int i11 = 1;
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f12844b;

            {
                this.f12844b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f12844b.lambda$new$4();
                        break;
                    default:
                        this.f12844b.lambda$new$2();
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new wz.a("Firebase-Messaging-Topics-Io"));
        d10.o oVarB = Tasks.b(scheduledThreadPoolExecutor, new Callable() { // from class: com.google.firebase.messaging.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g0 g0Var;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduledThreadPoolExecutor;
                FirebaseMessaging firebaseMessaging = this;
                t tVar2 = tVar;
                q qVar2 = qVar;
                synchronized (g0.class) {
                    try {
                        WeakReference weakReference = g0.f12807b;
                        g0Var = weakReference != null ? (g0) weakReference.get() : null;
                        if (g0Var == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            g0 g0Var2 = new g0();
                            synchronized (g0Var2) {
                                g0Var2.f12808a = n1.l(sharedPreferences, scheduledThreadPoolExecutor2);
                            }
                            g0.f12807b = new WeakReference(g0Var2);
                            g0Var = g0Var2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new i0(firebaseMessaging, tVar2, g0Var, qVar2, context3, scheduledThreadPoolExecutor2);
            }
        });
        this.topicsSubscriberTask = oVarB;
        oVarB.h(executor2, new k(this, 0));
        final int i12 = 0;
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f12844b;

            {
                this.f12844b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f12844b.lambda$new$4();
                        break;
                    default:
                        this.f12844b.lambda$new$2();
                        break;
                }
            }
        });
    }

    public static synchronized void clearStoreForTest() {
        store = null;
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new m(0);
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull p30.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        com.google.android.gms.common.internal.i0.i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    @NonNull
    private static synchronized c0 getStore(Context context) {
        try {
            if (store == null) {
                store = new c0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return store;
    }

    private String getSubtype() {
        p30.g gVar = this.firebaseApp;
        gVar.a();
        return "[DEFAULT]".equals(gVar.f34223b) ? "" : this.firebaseApp.d();
    }

    public static ty.f getTransportFactory() {
        return (ty.f) transportFactory.get();
    }

    private void handleProxiedNotificationData() {
        Task taskC;
        int i11;
        oz.b bVar = this.gmsRpc.f12869c;
        if (bVar.f33805c.w() >= 241100000) {
            oz.o oVarD = oz.o.d(bVar.f33804b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (oVarD) {
                i11 = oVarD.f33844a;
                oVarD.f33844a = i11 + 1;
            }
            taskC = oVarD.e(new oz.n(i11, 5, bundle, 1)).i(oz.h.f33818c, oz.d.f33812c);
        } else {
            taskC = Tasks.c(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskC.h(this.initExecutor, new k(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initializeProxyNotifications, reason: merged with bridge method [inline-methods] */
    public void lambda$new$4() {
        w.b(this.context);
        l0.h(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(String str) {
        p30.g gVar = this.firebaseApp;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f34223b)) {
            if (Log.isLoggable(TAG, 3)) {
                StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                p30.g gVar2 = this.firebaseApp;
                gVar2.a();
                sb2.append(gVar2.f34223b);
                Log.d(TAG, sb2.toString());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new i(this.context).b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task lambda$blockingGetToken$13(String str, b0 b0Var, String str2) throws Exception {
        c0 store2 = getStore(this.context);
        String subtype = getSubtype();
        String strA = this.metadata.a();
        synchronized (store2) {
            String strA2 = b0.a(str2, System.currentTimeMillis(), strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = store2.f12789a.edit();
                editorEdit.putString(c0.a(subtype, str), strA2);
                editorEdit.commit();
            }
        }
        if (b0Var == null || !str2.equals(b0Var.f12785a)) {
            lambda$new$1(str2);
        }
        return Tasks.d(str2);
    }

    private Task lambda$blockingGetToken$14(String str, b0 b0Var) {
        q qVar = this.gmsRpc;
        return qVar.a(qVar.c(t.b(qVar.f12867a), "*", new Bundle())).o(this.fileExecutor, new b40.a(this, str, b0Var, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ty.f lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    private /* synthetic */ void lambda$deleteToken$8(d10.g gVar) {
        try {
            t.b(this.firebaseApp);
            throw null;
        } catch (Exception e5) {
            gVar.a(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deleteToken$9(d10.g gVar) {
        try {
            q qVar = this.gmsRpc;
            qVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            Tasks.await(qVar.a(qVar.c(t.b(qVar.f12867a), "*", bundle)));
            c0 store2 = getStore(this.context);
            String subtype = getSubtype();
            String strB = t.b(this.firebaseApp);
            synchronized (store2) {
                String strA = c0.a(subtype, strB);
                SharedPreferences.Editor editorEdit = store2.f12789a.edit();
                editorEdit.remove(strA);
                editorEdit.commit();
            }
            gVar.b(null);
        } catch (Exception e5) {
            gVar.a(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$7(d10.g gVar) {
        try {
            gVar.b(blockingGetToken());
        } catch (Exception e5) {
            gVar.a(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleProxiedNotificationData$5(oz.a aVar) {
        if (aVar != null) {
            l0.f(aVar.f33799a);
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(i0 i0Var) {
        if (isAutoInitEnabled()) {
            i0Var.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNotificationDelegationEnabled$6(Void r32) {
        l0.h(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ty.f lambda$static$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$subscribeToTopic$10(String str, i0 i0Var) throws Exception {
        i0Var.getClass();
        d10.o oVarD = i0Var.d(new f0("S", str));
        i0Var.f();
        return oVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$unsubscribeFromTopic$11(String str, i0 i0Var) throws Exception {
        i0Var.getClass();
        d10.o oVarD = i0Var.d(new f0("U", str));
        i0Var.f();
        return oVarD;
    }

    private boolean shouldRetainProxyNotifications() {
        w.b(this.context);
        if (!w.c(this.context)) {
            return false;
        }
        if (this.firebaseApp.b(r30.a.class) != null) {
            return true;
        }
        return l0.d() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        Task taskJ;
        b0 tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.f12785a;
        }
        String strB = t.b(this.firebaseApp);
        z zVar = this.requestDeduplicator;
        synchronized (zVar) {
            taskJ = (Task) zVar.f12894b.get(strB);
            if (taskJ == null) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Making new request for: " + strB);
                }
                taskJ = lambda$blockingGetToken$14(strB, tokenWithoutTriggeringSync).j(zVar.f12893a, new a50.d(zVar, 7, strB));
                zVar.f12894b.put(strB, taskJ);
            } else if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) Tasks.await(taskJ);
        } catch (InterruptedException | ExecutionException e5) {
            throw new IOException(e5);
        }
    }

    @NonNull
    public Task<Void> deleteToken() {
        if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.d(null);
        }
        d10.g gVar = new d10.g();
        Executors.newSingleThreadExecutor(new wz.a("Firebase-Messaging-Network-Io")).execute(new n(this, gVar, 1));
        return gVar.f13697a;
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return l0.d();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j9) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new wz.a("TAG"));
                }
                syncExecutor.schedule(runnable, j9, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    @NonNull
    public Task<String> getToken() {
        d10.g gVar = new d10.g();
        this.initExecutor.execute(new n(this, gVar, 0));
        return gVar.f13697a;
    }

    public b0 getTokenWithoutTriggeringSync() {
        b0 b0VarB;
        c0 store2 = getStore(this.context);
        String subtype = getSubtype();
        String strB = t.b(this.firebaseApp);
        synchronized (store2) {
            b0VarB = b0.b(store2.f12789a.getString(c0.a(subtype, strB), null));
        }
        return b0VarB;
    }

    public Task<i0> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        boolean zBooleanValue;
        o oVar = this.autoInit;
        synchronized (oVar) {
            try {
                oVar.a();
                Boolean bool = oVar.f12857d;
                zBooleanValue = bool != null ? bool.booleanValue() : oVar.f12858e.firebaseApp.h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public boolean isGmsCorePresent() {
        return this.metadata.d();
    }

    public boolean isNotificationDelegationEnabled() {
        return w.c(this.context);
    }

    @Deprecated
    public void send(@NonNull y yVar) {
        if (TextUtils.isEmpty(yVar.f12891a.getString("google.to"))) {
            i4.a.f("Missing 'to'");
            return;
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage(GMS_PACKAGE);
        intent.putExtras(yVar.f12891a);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z11) {
        o oVar = this.autoInit;
        synchronized (oVar) {
            try {
                oVar.a();
                c50.w wVar = oVar.f12856c;
                if (wVar != null) {
                    ((u30.j) oVar.f12854a).b(wVar);
                    oVar.f12856c = null;
                }
                p30.g gVar = oVar.f12858e.firebaseApp;
                gVar.a();
                SharedPreferences.Editor editorEdit = gVar.f34222a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z11);
                editorEdit.apply();
                if (z11) {
                    oVar.f12858e.startSyncIfNecessary();
                }
                oVar.f12857d = Boolean.valueOf(z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z11) {
        p30.g gVarC = p30.g.c();
        gVarC.a();
        gVarC.f34222a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z11).apply();
        l0.h(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    @NonNull
    public Task<Void> setNotificationDelegationEnabled(boolean z11) {
        d10.o oVarD;
        Executor executor = this.initExecutor;
        Context context = this.context;
        if (Build.VERSION.SDK_INT >= 29) {
            d10.g gVar = new d10.g();
            executor.execute(new v(context, z11, gVar, 0));
            oVarD = gVar.f13697a;
        } else {
            oVarD = Tasks.d(null);
        }
        oVarD.h(new l0.b(0), new k(this, 1));
        return oVarD;
    }

    public synchronized void setSyncScheduledOrRunning(boolean z11) {
        this.syncScheduledOrRunning = z11;
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(@NonNull String str) {
        return this.topicsSubscriberTask.n(new ax.u(str, 1));
    }

    public synchronized void syncWithDelaySecondsInternal(long j9) {
        enqueueTaskWithDelaySeconds(new e0(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j9), MAX_DELAY_SEC)), j9);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(b0 b0Var) {
        if (b0Var != null) {
            return System.currentTimeMillis() > b0Var.f12787c + 604800000 || !this.metadata.a().equals(b0Var.f12786b);
        }
        return true;
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(@NonNull String str) {
        return this.topicsSubscriberTask.n(new ax.u(str, 2));
    }

    @NonNull
    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(p30.g.c());
    }

    public FirebaseMessaging(p30.g gVar, s40.a aVar, t40.b bVar, t40.b bVar2, u40.e eVar, t40.b bVar3, q40.c cVar, t tVar) {
        this(gVar, aVar, bVar3, cVar, tVar, new q(gVar, tVar, bVar, bVar2, eVar), Executors.newSingleThreadExecutor(new wz.a("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new wz.a("Firebase-Messaging-Init")), new ThreadPoolExecutor(0, 1, MIN_DELAY_SEC, TimeUnit.SECONDS, new LinkedBlockingQueue(), new wz.a("Firebase-Messaging-File-Io")));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FirebaseMessaging(p30.g gVar, s40.a aVar, t40.b bVar, t40.b bVar2, u40.e eVar, t40.b bVar3, q40.c cVar) {
        this(gVar, aVar, bVar, bVar2, eVar, bVar3, cVar, new t(gVar.f34222a));
        gVar.a();
    }
}
