package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.adyen.checkout.components.core.Address;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0001~B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0019J\u0017\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020#02H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u0019\u00107\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b7\u0010,J\u000f\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0004\b8\u0010\u0013J%\u00109\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020#022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020#02¢\u0006\u0004\b;\u0010<R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010H\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010\u0013\u001a\u0004\bJ\u0010KR \u0010N\u001a\u00020M8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010\u0013\u001a\u0004\bP\u0010QR\u001c\u0010T\u001a\n S*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR&\u0010Z\u001a\b\u0012\u0004\u0012\u00020#0Y8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b]\u0010\u0013\u001a\u0004\b\\\u0010<R\"\u0010^\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\bb\u0010\u0013\u001a\u0004\b`\u0010aR(\u0010d\u001a\u00020c8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010e\u0012\u0004\bj\u0010\u0013\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR*\u0010k\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bk\u0010l\u0012\u0004\bp\u0010\u0013\u001a\u0004\bm\u0010n\"\u0004\bo\u0010,R(\u0010q\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bq\u0010r\u0012\u0004\bu\u0010\u0013\u001a\u0004\bq\u0010s\"\u0004\bt\u0010\u0019R(\u0010w\u001a\u00020v8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bw\u0010x\u0012\u0004\b}\u0010\u0013\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u007f"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Lcom/braze/managers/IBrazeGeofenceLocationUpdateListener;", "Landroid/content/Context;", "context", "", "apiKey", "Lcom/braze/managers/m0;", "brazeManager", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/storage/i3;", "serverConfigStorageProvider", "Lcom/braze/events/e;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/managers/m0;Lcom/braze/configuration/BrazeConfigurationProvider;Lcom/braze/storage/i3;Lcom/braze/events/e;)V", "", "initializeGeofences", "()V", "", "isGeofencesEnabledFromEnvironment", "(Landroid/content/Context;)Z", "reRegisterGeofences", "setUpGeofences", "(Z)V", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "(Landroid/app/PendingIntent;)V", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "geofenceTransitionType", "analyticsEnabledForGeofenceId", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)Z", "Lcom/braze/models/BrazeGeofence;", "getBrazeGeofenceForGeofenceId", "(Ljava/lang/String;)Lcom/braze/models/BrazeGeofence;", "transitionType", "postGeofenceReport", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "Lcom/braze/models/IBrazeLocation;", "location", "requestGeofenceRefresh", "(Lcom/braze/models/IBrazeLocation;)V", "ignoreRateLimit", "Lcom/braze/models/response/m;", "serverConfig", "configureFromServerConfig", "(Lcom/braze/models/response/m;)V", "", "geofenceList", "registerGeofences", "(Ljava/util/List;)V", "unregisterGeofences", "onLocationRequestComplete", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "(Ljava/util/List;Landroid/app/PendingIntent;)V", "retrieveBrazeGeofencesFromLocalStorage", "()Ljava/util/List;", "Lcom/braze/managers/m0;", "getBrazeManager", "()Lcom/braze/managers/m0;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/storage/i3;", "Lcom/braze/storage/GeofenceDataStoreProvider;", "geofenceDataStoreProvider", "Lcom/braze/storage/GeofenceDataStoreProvider;", "getGeofenceDataStoreProvider", "()Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/location/a;", "brazeGeofenceApi", "Lcom/braze/location/a;", "getBrazeGeofenceApi", "()Lcom/braze/location/a;", "getBrazeGeofenceApi$annotations", "Lcom/braze/location/b;", "brazeLocationApi", "Lcom/braze/location/b;", "getBrazeLocationApi", "()Lcom/braze/location/b;", "getBrazeLocationApi$annotations", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "Lcom/braze/managers/n;", "brazeGeofenceReEligibilityManager", "Lcom/braze/managers/n;", "getBrazeGeofenceReEligibilityManager", "()Lcom/braze/managers/n;", "setBrazeGeofenceReEligibilityManager", "(Lcom/braze/managers/n;)V", "getBrazeGeofenceReEligibilityManager$annotations", "geofenceRequestLocation", "Lcom/braze/models/IBrazeLocation;", "getGeofenceRequestLocation", "()Lcom/braze/models/IBrazeLocation;", "setGeofenceRequestLocation", "getGeofenceRequestLocation$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeGeofenceManager implements IBrazeGeofenceLocationUpdateListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context applicationContext;
    private final com.braze.location.a brazeGeofenceApi;
    private n brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final com.braze.location.b brazeLocationApi;
    private final m0 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final GeofenceDataStoreProvider geofenceDataStoreProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final i3 serverConfigStorageProvider;

    public BrazeGeofenceManager(Context context, String str, m0 m0Var, BrazeConfigurationProvider brazeConfigurationProvider, i3 i3Var, com.braze.events.e eVar) {
        context.getClass();
        str.getClass();
        m0Var.getClass();
        brazeConfigurationProvider.getClass();
        i3Var.getClass();
        eVar.getClass();
        this.brazeManager = m0Var;
        this.configurationProvider = brazeConfigurationProvider;
        this.serverConfigStorageProvider = i3Var;
        GeofenceDataStoreProvider geofenceDataStoreProvider = new GeofenceDataStoreProvider(context, str);
        this.geofenceDataStoreProvider = geofenceDataStoreProvider;
        com.braze.location.a aVar = new com.braze.location.a(geofenceDataStoreProvider);
        this.brazeGeofenceApi = aVar;
        this.brazeLocationApi = new com.braze.location.b(context, p.f10060d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        this.brazeGeofences = CollectionsKt.t0(retrieveBrazeGeofencesFromLocalStorage());
        IBrazeGeofenceApi iBrazeGeofenceApi = aVar.f9902b;
        this.geofenceTransitionPendingIntent = iBrazeGeofenceApi != null ? iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context) : null;
        this.brazeGeofenceReEligibilityManager = new n(i3Var, eVar, geofenceDataStoreProvider);
        Companion companion = INSTANCE;
        this.isGeofencesEnabled = companion.getGeofencesEnabledFromServerConfig(i3Var) && isGeofencesEnabledFromEnvironment(context) && aVar.f9902b != null;
        this.maxNumToRegister = companion.getMaxNumToRegister(i3Var);
        if (aVar.f9902b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.b(15), 6, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.b(16), 6, (Object) null);
        setUpGeofences(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "***Geofence API not found. Please include the android-sdk-location module***";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1() {
        return "Calling setUpGeofences on geofence manager init";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$27(boolean z11) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.f("Geofences enabled server config value ", " received.", z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$28(BrazeGeofenceManager brazeGeofenceManager) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.f("Geofences enabled status newly set to ", " during server config update.", brazeGeofenceManager.isGeofencesEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$29(boolean z11) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.f("Geofences enabled status of `", "` was unchanged during server config update.", z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$30(BrazeGeofenceManager brazeGeofenceManager) {
        return r8.k.h(brazeGeofenceManager.maxNumToRegister, "Max number to register newly set to ", " via server config.");
    }

    public static final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
        return INSTANCE.getGeofencesEnabledFromConfiguration(brazeConfigurationProvider);
    }

    public static final boolean getGeofencesEnabledFromServerConfig(i3 i3Var) {
        return INSTANCE.getGeofencesEnabledFromServerConfig(i3Var);
    }

    public static final int getMaxNumToRegister(i3 i3Var) {
        return INSTANCE.getMaxNumToRegister(i3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$2() {
        return "Request to set up geofences received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$3() {
        return "Not automatically requesting Geofences on initialization due to configuration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$10() {
        return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$4() {
        return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$5() {
        return "Fine grained location permissions not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$6() {
        return "Background location access permission not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$7() {
        return "Google Play Services not available. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$8() {
        return "Braze Geofence API is not available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$9() {
        return "Google Play Services Location API not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$40(IBrazeLocation iBrazeLocation) {
        return "Single location request was successful, requesting Geofence refresh. Location:\n " + iBrazeLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$41() {
        return "Single location request was unsuccessful, not storing last updated time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$22() {
        return "Braze geofences not enabled. Not posting geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$23(String str, GeofenceTransitionType geofenceTransitionType) {
        return "Failed to record geofence " + str + " transition with transition type " + geofenceTransitionType + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$31() {
        return "Braze geofences not enabled. Not adding new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$33(List list) {
        return j4.s.f(list.size(), "Received new geofence list of size: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$34(BrazeGeofenceManager brazeGeofenceManager) {
        return j4.s.f(brazeGeofenceManager.maxNumToRegister, "Reached maximum number of new geofences: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$35(BrazeGeofence brazeGeofence) {
        return "Adding new geofence to local storage: " + brazeGeofence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$36(BrazeGeofenceManager brazeGeofenceManager) {
        return r8.k.h(brazeGeofenceManager.brazeGeofences.size(), "Added ", " new geofences to local storage.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$24() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$26() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdateFromGooglePlay$lambda$42(BrazeGeofenceManager brazeGeofenceManager, IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        brazeGeofenceManager.onLocationRequestComplete(iBrazeLocation);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$43() {
        return "Did not find stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$11() {
        return "Braze geofences not enabled. Geofences not set up.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$12(boolean z11) {
        return "Setting up geofences in setUpGeofences with reRegisterGeofences: " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$13() {
        return "Could not get pending intent to setup geofences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$15() {
        return "Tearing down geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$16() {
        return "Unregistering any Braze geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$18$lambda$17() {
        return "Deleting locally stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$38() {
        return "Braze geofences not enabled. Not un-registering geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$39() {
        return "Tearing down all geofences.";
    }

    public final boolean analyticsEnabledForGeofenceId(String geofenceId, GeofenceTransitionType geofenceTransitionType) {
        geofenceId.getClass();
        geofenceTransitionType.getClass();
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
            if (brazeGeofenceForGeofenceId != null) {
                if (geofenceTransitionType == GeofenceTransitionType.ENTER) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledEnter();
                }
                if (geofenceTransitionType == GeofenceTransitionType.EXIT) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledExit();
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void configureFromServerConfig(com.braze.models.response.m r12) {
        /*
            r11 = this;
            r12.getClass()
            boolean r0 = r12.f10264i
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.o0 r6 = new com.braze.o0
            r2 = 10
            r6.<init>(r0, r2)
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r11
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7, r8)
            r9 = 0
            r10 = 1
            if (r0 == 0) goto L2e
            android.content.Context r0 = r2.applicationContext
            r0.getClass()
            boolean r0 = r11.isGeofencesEnabledFromEnvironment(r0)
            if (r0 == 0) goto L2e
            com.braze.location.a r0 = r2.brazeGeofenceApi
            com.braze.location.IBrazeGeofenceApi r0 = r0.f9902b
            if (r0 == 0) goto L2e
            r0 = r10
            goto L2f
        L2e:
            r0 = r9
        L2f:
            boolean r3 = r2.isGeofencesEnabled
            if (r0 == r3) goto L5d
            r2.isGeofencesEnabled = r0
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            zv.a r6 = new zv.a
            r0 = 0
            r6.<init>(r11, r0)
            r7 = 6
            r8 = 0
            r4 = 0
            r5 = 0
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r2.isGeofencesEnabled
            if (r0 == 0) goto L57
            r11.setUpGeofences(r9)
            com.braze.configuration.BrazeConfigurationProvider r0 = r2.configurationProvider
            boolean r0 = r0.isAutomaticGeofenceRequestsEnabled()
            if (r0 == 0) goto L6c
            r11.requestGeofenceRefresh(r10)
            goto L6c
        L57:
            android.app.PendingIntent r0 = r2.geofenceTransitionPendingIntent
            r11.tearDownGeofences(r0)
            goto L6c
        L5d:
            com.braze.o0 r6 = new com.braze.o0
            r3 = 11
            r6.<init>(r0, r3)
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7, r8)
        L6c:
            int r0 = r12.f10262g
            if (r0 < 0) goto L81
            r2.maxNumToRegister = r0
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            zv.a r6 = new zv.a
            r0 = 1
            r6.<init>(r11, r0)
            r7 = 6
            r8 = 0
            r4 = 0
            r5 = 0
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7, r8)
        L81:
            com.braze.managers.n r0 = r2.brazeGeofenceReEligibilityManager
            r0.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.BrazeGeofenceManager.configureFromServerConfig(com.braze.models.response.m):void");
    }

    public final com.braze.location.a getBrazeGeofenceApi() {
        return this.brazeGeofenceApi;
    }

    public final BrazeGeofence getBrazeGeofenceForGeofenceId(String geofenceId) {
        Object next;
        geofenceId.getClass();
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.brazeGeofences.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((BrazeGeofence) next).getId(), geofenceId)) {
                    break;
                }
            }
            BrazeGeofence brazeGeofence = (BrazeGeofence) next;
            reentrantLock.unlock();
            return brazeGeofence;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final n getBrazeGeofenceReEligibilityManager() {
        return this.brazeGeofenceReEligibilityManager;
    }

    public final List<BrazeGeofence> getBrazeGeofences() {
        return this.brazeGeofences;
    }

    public final com.braze.location.b getBrazeLocationApi() {
        return this.brazeLocationApi;
    }

    public final m0 getBrazeManager() {
        return this.brazeManager;
    }

    public final GeofenceDataStoreProvider getGeofenceDataStoreProvider() {
        return this.geofenceDataStoreProvider;
    }

    public final IBrazeLocation getGeofenceRequestLocation() {
        return this.geofenceRequestLocation;
    }

    public final PendingIntent getGeofenceTransitionPendingIntent() {
        return this.geofenceTransitionPendingIntent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initializeGeofences() {
        /*
            r8 = this;
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            zv.b r5 = new zv.b
            r1 = 13
            r5.<init>(r1)
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.braze.managers.BrazeGeofenceManager$Companion r2 = com.braze.managers.BrazeGeofenceManager.INSTANCE
            com.braze.storage.i3 r3 = r1.serverConfigStorageProvider
            boolean r2 = r2.getGeofencesEnabledFromServerConfig(r3)
            r3 = 1
            if (r2 == 0) goto L30
            android.content.Context r2 = r1.applicationContext
            r2.getClass()
            boolean r2 = r8.isGeofencesEnabledFromEnvironment(r2)
            if (r2 == 0) goto L30
            com.braze.location.a r2 = r1.brazeGeofenceApi
            com.braze.location.IBrazeGeofenceApi r2 = r2.f9902b
            if (r2 == 0) goto L30
            r2 = r3
            goto L31
        L30:
            r2 = 0
        L31:
            r1.isGeofencesEnabled = r2
            com.braze.configuration.BrazeConfigurationProvider r2 = r1.configurationProvider
            boolean r2 = r2.isAutomaticGeofenceRequestsEnabled()
            if (r2 == 0) goto L3f
            r8.requestGeofenceRefresh(r3)
            return
        L3f:
            zv.b r5 = new zv.b
            r2 = 14
            r5.<init>(r2)
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.BrazeGeofenceManager.initializeGeofences():void");
    }

    /* JADX INFO: renamed from: isGeofencesEnabled, reason: from getter */
    public final boolean getIsGeofencesEnabled() {
        return this.isGeofencesEnabled;
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        context.getClass();
        if (!INSTANCE.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.composer.b(24), 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.composer.b(25), 6, (Object) null);
            return false;
        }
        int i11 = 29;
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.composer.b(26), 6, (Object) null);
            return false;
        }
        if (!com.braze.support.p.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.composer.b(27), 7, (Object) null);
            return false;
        }
        int i12 = 1;
        if (this.brazeGeofenceApi.f9902b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(i12), 7, (Object) null);
            return false;
        }
        try {
            Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.composer.b(28), 7, (Object) null);
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.composer.b(i11), 7, (Object) null);
            return false;
        }
    }

    @Override // com.braze.managers.IBrazeGeofenceLocationUpdateListener
    public void onLocationRequestComplete(IBrazeLocation location) {
        if (location == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(6), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.c(location, 1), 7, (Object) null);
        requestGeofenceRefresh(location);
        this.brazeGeofenceReEligibilityManager.b(DateTimeUtils.nowInSeconds());
    }

    public void postGeofenceReport(String geofenceId, GeofenceTransitionType transitionType) {
        geofenceId.getClass();
        transitionType.getClass();
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.b(11), 6, (Object) null);
            return;
        }
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f10176g;
        String string = transitionType.toString();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        com.braze.models.k kVarG = aVar.g(geofenceId, lowerCase);
        if (kVarG == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new zv.c(geofenceId, transitionType, 0), 6, (Object) null);
            return;
        }
        if (analyticsEnabledForGeofenceId(geofenceId, transitionType)) {
            ((r) this.brazeManager).a(kVarG);
        }
        BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
        if (brazeGeofenceForGeofenceId != null && this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds(), brazeGeofenceForGeofenceId, transitionType)) {
            ((r) this.brazeManager).g(kVarG);
        }
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        String strC;
        geofenceList.getClass();
        ArrayList<BrazeGeofence> arrayList = new ArrayList(geofenceList);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.b(3), 6, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : arrayList) {
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    double latitude = iBrazeLocation.getLatitude();
                    double longitude = iBrazeLocation.getLongitude();
                    double latitude2 = brazeGeofence.getLatitude();
                    double longitude2 = brazeGeofence.getLongitude();
                    double radians = Math.toRadians(latitude2 - latitude);
                    double radians2 = Math.toRadians(longitude2 - longitude);
                    double d3 = 2;
                    brazeGeofence.setDistanceFromGeofenceRefresh(Math.asin(Math.sqrt((Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(latitude)) * Math.pow(Math.sin(radians2 / d3), 2.0d)) + Math.pow(Math.sin(radians / d3), 2.0d))) * 1.2742E7d);
                }
            }
            kotlin.collections.h0.q(arrayList);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i90.j(6, arrayList), 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
            Iterator it = arrayList.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BrazeGeofence brazeGeofence2 = (BrazeGeofence) it.next();
                if (i11 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.a(this, 2), 7, (Object) null);
                    break;
                } else {
                    this.brazeGeofences.add(brazeGeofence2);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.k(brazeGeofence2, 1), 7, (Object) null);
                    i11++;
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.a(this, 3), 7, (Object) null);
            GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
            DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
            List<BrazeGeofence> list = this.brazeGeofences;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.d(BrazeGeofence.Companion.serializer(), 0), list);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = ((list instanceof Map) || list == null) ? "{}" : "[]";
                    }
                    geofenceDataStoreProvider.writeData(dataStoreKey, strC);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
                }
            }
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(arrayList);
            setUpGeofences(true);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        geofenceList.getClass();
        geofenceRequestIntent.getClass();
        com.braze.location.a aVar = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        context.getClass();
        aVar.getClass();
        context.getClass();
        geofenceList.getClass();
        geofenceRequestIntent.getClass();
        IBrazeGeofenceApi iBrazeGeofenceApi = aVar.f9902b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.registerGeofences(context, geofenceList, geofenceRequestIntent, aVar.f9901a);
        }
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        location.getClass();
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(12), 7, (Object) null);
            return;
        }
        this.geofenceRequestLocation = location;
        if (location != null) {
            ((r) this.brazeManager).a(location);
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        com.braze.location.b bVar = this.brazeLocationApi;
        zendesk.core.android.internal.a aVar = new zendesk.core.android.internal.a(this, 12);
        bVar.getClass();
        IBrazeLocationApi iBrazeLocationApi = bVar.f9903a;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.requestSingleLocationUpdate(aVar);
        }
    }

    public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage() {
        ArrayList arrayList;
        Collection collection;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
        DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str) || Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        collection = kotlin.collections.n0.f26529a;
                    } else {
                        try {
                            n90.b bVar = n90.c.f30748d;
                            bVar.getClass();
                            collection = (List) bVar.b(new m90.d(BrazeGeofence.Companion.serializer(), 0), str);
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            collection = kotlin.collections.n0.f26529a;
                        }
                    }
                    arrayList = CollectionsKt.t0(collection);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(2), 7, (Object) null);
        }
        return arrayList;
    }

    public final void setBrazeGeofenceReEligibilityManager(n nVar) {
        nVar.getClass();
        this.brazeGeofenceReEligibilityManager = nVar;
    }

    public final void setGeofenceRequestLocation(IBrazeLocation iBrazeLocation) {
        this.geofenceRequestLocation = iBrazeLocation;
    }

    public final void setGeofencesEnabled(boolean z11) {
        this.isGeofencesEnabled = z11;
    }

    public final void setMaxNumToRegister(int i11) {
        this.maxNumToRegister = i11;
    }

    public final void setUpGeofences(boolean reRegisterGeofences) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(9), 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.o0(reRegisterGeofences, 12), 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(10), 7, (Object) null);
            return;
        }
        if (reRegisterGeofences) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent geofenceRequestIntent) {
        BrazeGeofenceManager brazeGeofenceManager;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.composer.b(23), 7, (Object) null);
        if (geofenceRequestIntent != null) {
            brazeGeofenceManager = this;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(0), 7, (Object) null);
            com.braze.location.a aVar = brazeGeofenceManager.brazeGeofenceApi;
            Context context = brazeGeofenceManager.applicationContext;
            context.getClass();
            aVar.getClass();
            context.getClass();
            IBrazeGeofenceApi iBrazeGeofenceApi = aVar.f9902b;
            if (iBrazeGeofenceApi != null) {
                iBrazeGeofenceApi.teardownGeofences(context, geofenceRequestIntent);
            }
        } else {
            brazeGeofenceManager = this;
        }
        ReentrantLock reentrantLock = brazeGeofenceManager.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(5), 7, (Object) null);
            brazeGeofenceManager.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            brazeGeofenceManager.brazeGeofences.clear();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(7), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(8), 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "<init>", "()V", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Z", "Lcom/braze/storage/i3;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "(Lcom/braze/storage/i3;)Z", "", "getMaxNumToRegister", "(Lcom/braze/storage/i3;)I", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$0() {
            return "Geofences enabled in server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$1() {
            return "Geofences explicitly disabled via server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$2() {
            return "Geofences implicitly disabled via server configuration.";
        }

        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            configurationProvider.getClass();
            return configurationProvider.isGeofencesEnabled();
        }

        public final boolean getGeofencesEnabledFromServerConfig(i3 serverConfigStorageProvider) {
            serverConfigStorageProvider.getClass();
            if (!serverConfigStorageProvider.J()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.b(19), 6, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.I()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.b(17), 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.b(18), 6, (Object) null);
            return false;
        }

        public final int getMaxNumToRegister(i3 serverConfigStorageProvider) {
            serverConfigStorageProvider.getClass();
            if (serverConfigStorageProvider.q() > 0) {
                return serverConfigStorageProvider.q();
            }
            return 20;
        }

        private Companion() {
        }
    }

    public final int getMaxNumToRegister() {
        return this.maxNumToRegister;
    }

    public static /* synthetic */ void getBrazeGeofenceApi$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofenceReEligibilityManager$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofences$annotations() {
    }

    public static /* synthetic */ void getBrazeLocationApi$annotations() {
    }

    public static /* synthetic */ void getGeofenceRequestLocation$annotations() {
    }

    public static /* synthetic */ void getGeofenceTransitionPendingIntent$annotations() {
    }

    public static /* synthetic */ void getMaxNumToRegister$annotations() {
    }

    public static /* synthetic */ void isGeofencesEnabled$annotations() {
    }

    public void requestGeofenceRefresh(boolean ignoreRateLimit) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(4), 7, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(ignoreRateLimit, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }
}
