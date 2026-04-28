package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import g3.j5;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 a2\u00020\u0001:\u0001aB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0004\u0012\u00020\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J4\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\"\u0006\b\u0000\u0010&\u0018\u0001\"\u0006\b\u0001\u0010'\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b)\u0010*J&\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,\"\u0006\b\u0000\u0010+\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b-\u0010.J<\u00100\u001a\u00020\t\"\u0006\b\u0000\u0010&\u0018\u0001\"\u0006\b\u0001\u0010'\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\b¢\u0006\u0004\b0\u00101J.\u00104\u001a\u00020\t\"\u0006\b\u0000\u0010+\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0086\b¢\u0006\u0004\b4\u00105J1\u00109\u001a\u00020\t2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001207H\u0016¢\u0006\u0004\b9\u0010:J+\u0010=\u001a\u00020\t\"\u0004\b\u0000\u0010+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b;\u0010<J3\u0010A\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\u0010>\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b?\u0010@J'\u0010D\u001a\u00020\u000f\"\b\b\u0000\u0010+*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0001¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0004\u0012\u00020\u00010\u001eH\u0001¢\u0006\u0004\bF\u0010!J#\u0010J\u001a\u00020\t\"\u0004\b\u0000\u0010+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0001¢\u0006\u0004\bH\u0010IJ\u000f\u0010L\u001a\u00020\tH\u0001¢\u0006\u0004\bK\u0010%J1\u0010N\u001a\u00020\t2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001207H\u0001¢\u0006\u0004\bM\u0010:J+\u0010S\u001a\b\u0012\u0004\u0012\u00020P0R2\u0014\b\u0002\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O02H\u0004¢\u0006\u0004\bS\u0010TJ\u001f\u0010X\u001a\u00020\t2\u0006\u0010U\u001a\u00020\u00122\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Z\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lcom/braze/storage/DataStoreProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/braze/enums/DataStoreKey;", "key", "value", "", "writeData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)V", "default", "readData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)Ljava/lang/Object;", "", "readBoolean", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "", "readString", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/String;)Ljava/lang/String;", "", "readInt", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "readFloat", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Float;)Ljava/lang/Float;", "", "readLong", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Long;)Ljava/lang/Long;", "", "Lh8/e;", "readAllData", "()Ljava/util/Map;", "clearData", "(Lcom/braze/enums/DataStoreKey;)V", "clearAllData", "()V", "K", "V", "", "readMap", "(Lcom/braze/enums/DataStoreKey;)Ljava/util/Map;", "T", "", "readList", "(Lcom/braze/enums/DataStoreKey;)Ljava/util/List;", "map", "writeMap", "(Lcom/braze/enums/DataStoreKey;Ljava/util/Map;)V", "", DefaultIssuerListDelegate.ANALYTICS_TARGET, "writeList", "(Lcom/braze/enums/DataStoreKey;Ljava/util/List;)V", "updates", "", "removals", "batchUpdate", "(Ljava/util/Map;Ljava/util/Set;)V", "write$android_sdk_base_release", "(Lh8/e;Ljava/lang/Object;)V", "write", "defaultValue", "read$android_sdk_base_release", "(Lh8/e;Ljava/lang/Object;)Ljava/lang/Object;", "read", "contains$android_sdk_base_release", "(Lh8/e;)Z", "contains", "(Lcom/braze/enums/DataStoreKey;)Z", "readAll$android_sdk_base_release", "readAll", "clear$android_sdk_base_release", "(Lh8/e;)V", "clear", "clearAll$android_sdk_base_release", "clearAll", "batchUpdates$android_sdk_base_release", "batchUpdates", "Lf8/b;", "Lh8/g;", "migrations", "Ld8/f;", "createOrGetDataStore", "(Ljava/util/List;)Ld8/f;", InAppMessageBase.MESSAGE, "", "throwable", "publishException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lv80/b0;", "getDataStoreScope$android_sdk_base_release", "()Lv80/b0;", "dataStoreScope", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DataStoreProvider {
    public static final String BRAZE_DATASTORE_PREFIX = "com.braze";
    private static final int FILE_DELETE_MAX_RETRIES = 3;
    private static final long FILE_DELETE_RETRY_DELAY_MS = 50;
    public static final String PERSISTENT_DATASTORE_PREFIX = "persistent";
    public static final String RUNTIME_CONFIG_PREFIX = "com.braze.override.runtime_config";
    private static com.braze.events.e eventPublisher;
    private final Context context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DataStoreProvider.class);
    private static final ConcurrentHashMap<String, d8.f> dataStoreInstanceCache = new ConcurrentHashMap<>();
    private static final Object scopeCreationLock = new Object();
    private static final ConcurrentHashMap<String, v80.b0> dataStoreScopeMap = new ConcurrentHashMap<>();

    public DataStoreProvider(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d8.f createOrGetDataStore$default(DataStoreProvider dataStoreProvider, List list, int i11, Object obj) {
        if (obj != null) {
            com.braze.h2.a("Super calls with default arguments not supported in this target, function: createOrGetDataStore");
            return null;
        }
        if ((i11 & 1) != 0) {
            list = kotlin.collections.n0.f26529a;
        }
        return dataStoreProvider.createOrGetDataStore(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createOrGetDataStore$lambda$10$lambda$7(DataStoreProvider dataStoreProvider, String str) {
        File filesDir = dataStoreProvider.context.getFilesDir();
        filesDir.getClass();
        return e80.m.h(filesDir, "datastore/" + str + ".preferences_pb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h8.g createOrGetDataStore$lambda$10$lambda$9(String str, DataStoreProvider dataStoreProvider, CorruptionException corruptionException) {
        corruptionException.getClass();
        String str2 = "DataStore file corrupted for " + str + ", resetting to empty preferences";
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) corruptionException, false, (Function0) new dw.d(str2, 13), 8, (Object) null);
        dataStoreProvider.publishException(str2, corruptionException);
        return w0.e.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishException(String message, Throwable throwable) {
        com.braze.events.e eVar = eventPublisher;
        if (eVar == null) {
            return;
        }
        try {
            v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new b0(eVar, message, throwable, null), 3);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lu.a(19), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishException$lambda$11() {
        return "Failed to publish exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readBoolean$lambda$2(DataStoreKey dataStoreKey, Boolean bool) {
        return "Not reading data with with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected boolean. Returning default value:'" + bool + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readFloat$lambda$5(DataStoreKey dataStoreKey, Float f11) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected float. Returning default value:'" + f11 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readInt$lambda$4(DataStoreKey dataStoreKey, Integer num) {
        DataStoreValueType type = dataStoreKey.getType();
        StringBuilder sb2 = new StringBuilder("Not reading data with key:'");
        sb2.append(dataStoreKey);
        sb2.append("' type:'");
        sb2.append(type);
        sb2.append("' due to mismatched data type - expected int. Returning default value:'");
        return b3.i.m(sb2, num, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readLong$lambda$6(DataStoreKey dataStoreKey, Long l) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected long. Returning default value:'" + l + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readString$lambda$3(DataStoreKey dataStoreKey, String str) {
        DataStoreValueType type = dataStoreKey.getType();
        StringBuilder sb2 = new StringBuilder("Not reading data with key:'");
        sb2.append(dataStoreKey);
        sb2.append("' type:'");
        sb2.append(type);
        sb2.append("' due to mismatched data type - expected string. Returning default value:'");
        return r8.k.p(sb2, str, "'");
    }

    public void batchUpdate(Map<String, ? extends Object> updates, Set<String> removals) throws Throwable {
        updates.getClass();
        removals.getClass();
        batchUpdates$android_sdk_base_release(updates, removals);
    }

    public final void batchUpdates$android_sdk_base_release(Map<String, ? extends Object> updates, Set<String> removals) throws Throwable {
        updates.getClass();
        removals.getClass();
        v80.f0.E(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new s(this, updates, removals, null));
    }

    public final <T> void clear$android_sdk_base_release(h8.e key) throws Throwable {
        key.getClass();
        v80.f0.E(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new u(this, key, null));
    }

    public final void clearAll$android_sdk_base_release() throws Throwable {
        v80.f0.E(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new w(this, null));
    }

    public void clearAllData() throws Throwable {
        clearAll$android_sdk_base_release();
    }

    public void clearData(DataStoreKey key) {
        key.getClass();
        switch (q.f10657a[key.getType().ordinal()]) {
            case 1:
                clear$android_sdk_base_release(wd.a.z(key.getKey()));
                break;
            case 2:
                clear$android_sdk_base_release(wd.a.q(key.getKey()));
                break;
            case 3:
                clear$android_sdk_base_release(wd.a.G(key.getKey()));
                break;
            case 4:
                clear$android_sdk_base_release(wd.a.k(key.getKey()));
                break;
            case 5:
                clear$android_sdk_base_release(wd.a.t(key.getKey()));
                break;
            case 6:
                clear$android_sdk_base_release(wd.a.C(key.getKey()));
                break;
            case 7:
                clear$android_sdk_base_release(wd.a.G(key.getKey()));
                break;
            case 8:
                clear$android_sdk_base_release(wd.a.G(key.getKey()));
                break;
            default:
                e40.a.f();
                break;
        }
    }

    public boolean contains(DataStoreKey key) {
        key.getClass();
        switch (q.f10657a[key.getType().ordinal()]) {
            case 1:
                return contains$android_sdk_base_release(wd.a.z(key.getKey()));
            case 2:
                return contains$android_sdk_base_release(wd.a.q(key.getKey()));
            case 3:
                return contains$android_sdk_base_release(wd.a.G(key.getKey()));
            case 4:
                return contains$android_sdk_base_release(wd.a.k(key.getKey()));
            case 5:
                return contains$android_sdk_base_release(wd.a.t(key.getKey()));
            case 6:
                return contains$android_sdk_base_release(wd.a.C(key.getKey()));
            case 7:
                return contains$android_sdk_base_release(wd.a.G(key.getKey()));
            case 8:
                return contains$android_sdk_base_release(wd.a.G(key.getKey()));
            default:
                e40.a.f();
                return false;
        }
    }

    public final <T> boolean contains$android_sdk_base_release(h8.e key) {
        key.getClass();
        return ((Boolean) v80.f0.E(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new a0(this, key, null))).booleanValue();
    }

    public final d8.f createOrGetDataStore(List<? extends f8.b> migrations) {
        migrations.getClass();
        String dataStoreFileName = getDataStoreFileName();
        ConcurrentHashMap<String, d8.f> concurrentHashMap = dataStoreInstanceCache;
        d8.f fVarPutIfAbsent = concurrentHashMap.get(dataStoreFileName);
        if (fVarPutIfAbsent == null) {
            lw.b bVar = new lw.b(1, this, dataStoreFileName);
            e8.a aVar = new e8.a(new hb0.o(25, dataStoreFileName, this));
            v80.b0 dataStoreScope$android_sdk_base_release = getDataStoreScope$android_sdk_base_release();
            dataStoreScope$android_sdk_base_release.getClass();
            h8.c cVar = new h8.c(new h8.c(new d8.y(new d8.c0(h8.d.f21664a, new cp.i(13), new j5(2, bVar)), kotlin.collections.c0.c(new d8.c(migrations, (x70.c) null, 0)), aVar, dataStoreScope$android_sdk_base_release)));
            fVarPutIfAbsent = concurrentHashMap.putIfAbsent(dataStoreFileName, cVar);
            if (fVarPutIfAbsent == null) {
                fVarPutIfAbsent = cVar;
            }
        }
        return fVarPutIfAbsent;
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract /* synthetic */ d8.f getDataStore();

    public abstract /* synthetic */ String getDataStoreFileName();

    public final v80.b0 getDataStoreScope$android_sdk_base_release() {
        return INSTANCE.getOrCreateScopeForKey$android_sdk_base_release(getDataStoreFileName());
    }

    public final <T> T read$android_sdk_base_release(h8.e key, T defaultValue) {
        key.getClass();
        return (T) v80.f0.E(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new f0(this, key, defaultValue, null));
    }

    public final Map<h8.e, Object> readAll$android_sdk_base_release() {
        return (Map) v80.f0.E(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new g0(this, null));
    }

    public Map<h8.e, Object> readAllData() {
        return readAll$android_sdk_base_release();
    }

    public Boolean readBoolean(DataStoreKey key, Boolean bool) {
        key.getClass();
        try {
            return (Boolean) read$android_sdk_base_release(wd.a.k(key.getKey()), bool);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i2.e(28, key, bool), 8, (Object) null);
            return bool;
        }
    }

    public Object readData(DataStoreKey key, Object obj) {
        key.getClass();
        try {
            switch (q.f10657a[key.getType().ordinal()]) {
                case 1:
                    h8.e eVarZ = wd.a.z(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarZ, (Integer) obj);
                case 2:
                    h8.e eVarQ = wd.a.q(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarQ, (Double) obj);
                case 3:
                    h8.e eVarG = wd.a.G(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarG, (String) obj);
                case 4:
                    h8.e eVarK = wd.a.k(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarK, (Boolean) obj);
                case 5:
                    h8.e eVarT = wd.a.t(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarT, (Float) obj);
                case 6:
                    h8.e eVarC = wd.a.C(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarC, (Long) obj);
                case 7:
                    h8.e eVarG2 = wd.a.G(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarG2, (String) obj);
                case 8:
                    h8.e eVarG3 = wd.a.G(key.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(eVarG3, (String) obj);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e5) {
            String str = "Not reading data with key:'" + key + "' type:'" + key.getType() + "' due to mismatched data type. Returning default value:'" + obj + "'";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new dw.d(str, 12), 8, (Object) null);
            publishException(str, e5);
            return obj;
        }
    }

    public Float readFloat(DataStoreKey key, Float f11) {
        key.getClass();
        try {
            return (Float) read$android_sdk_base_release(wd.a.t(key.getKey()), f11);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.b(0, key, f11), 8, (Object) null);
            return f11;
        }
    }

    public Integer readInt(DataStoreKey key, Integer num) {
        key.getClass();
        try {
            return (Integer) read$android_sdk_base_release(wd.a.z(key.getKey()), num);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.b(3, key, num), 8, (Object) null);
            return num;
        }
    }

    public final <T> List<T> readList(DataStoreKey key) {
        Collection collection;
        key.getClass();
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(key), 12, (Object) null);
            return new ArrayList();
        }
        try {
            Object data = readData(key, "");
            data.getClass();
            String str = (String) data;
            if (StringsKt.H(str)) {
                return new ArrayList();
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            if (StringsKt.H(str) || Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                collection = kotlin.collections.n0.f26529a;
            } else {
                try {
                    n90.b bVar = n90.c.f30748d;
                    i2.x xVar = bVar.f30750b;
                    Intrinsics.reifiedOperationMarker(6, "T");
                    MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                    collection = (List) bVar.b(new m90.d(ba0.g.H(xVar, null), 0), str);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                    collection = kotlin.collections.n0.f26529a;
                }
            }
            return CollectionsKt.t0(collection);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new i0(key), 8, (Object) null);
            return new ArrayList();
        }
    }

    public Long readLong(DataStoreKey key, Long l) {
        key.getClass();
        try {
            return (Long) read$android_sdk_base_release(wd.a.C(key.getKey()), l);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.b(2, key, l), 4, (Object) null);
            return l;
        }
    }

    public final <K, V> Map<K, V> readMap(DataStoreKey key) {
        key.getClass();
        if (key.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(key), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object data = readData(key, "");
            data.getClass();
            if (StringsKt.H((String) data)) {
                return new LinkedHashMap();
            }
            Intrinsics.reifiedOperationMarker(4, "K");
            Intrinsics.reifiedOperationMarker(4, "K");
            throw new UnsupportedOperationException("Non-String keys not yet supported. Key type: " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName());
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new l0(key), 8, (Object) null);
            return new LinkedHashMap();
        }
    }

    public String readString(DataStoreKey key, String str) {
        key.getClass();
        try {
            return (String) read$android_sdk_base_release(wd.a.G(key.getKey()), str);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i2.e(29, key, str), 8, (Object) null);
            return str;
        }
    }

    public final <T> void write$android_sdk_base_release(h8.e key, T value) throws Throwable {
        key.getClass();
        v80.f0.E(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new n0(this, value, key, null));
    }

    public void writeData(DataStoreKey key, Object value) {
        key.getClass();
        value.getClass();
        try {
            switch (q.f10657a[key.getType().ordinal()]) {
                case 1:
                    write$android_sdk_base_release(wd.a.z(key.getKey()), (Integer) value);
                    return;
                case 2:
                    write$android_sdk_base_release(wd.a.q(key.getKey()), (Double) value);
                    return;
                case 3:
                    write$android_sdk_base_release(wd.a.G(key.getKey()), (String) value);
                    return;
                case 4:
                    write$android_sdk_base_release(wd.a.k(key.getKey()), (Boolean) value);
                    return;
                case 5:
                    write$android_sdk_base_release(wd.a.t(key.getKey()), (Float) value);
                    return;
                case 6:
                    write$android_sdk_base_release(wd.a.C(key.getKey()), (Long) value);
                    return;
                case 7:
                    write$android_sdk_base_release(wd.a.G(key.getKey()), (String) value);
                    return;
                case 8:
                    write$android_sdk_base_release(wd.a.G(key.getKey()), (String) value);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e5) {
            String str = "Not storing data with key:'" + key + "' value:'" + value + "' type:'" + key.getType() + "' due to mismatched data type.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new dw.d(str, 11), 8, (Object) null);
            publishException(str, e5);
        }
    }

    public final <T> void writeList(DataStoreKey key, List<? extends T> list) {
        String strC;
        key.getClass();
        list.getClass();
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(key), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                i2.x xVar = bVar.f30750b;
                Intrinsics.reifiedOperationMarker(6, "T");
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                strC = bVar.c(new m90.d(ba0.g.H(xVar, null), 0), list);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = list instanceof Map ? "{}" : "[]";
            }
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new p0(key), 8, (Object) null);
        }
        try {
            writeData(key, strC);
        } catch (Exception e12) {
            e = e12;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new p0(key), 8, (Object) null);
        }
    }

    public final <K, V> void writeMap(DataStoreKey key, Map<K, ? extends V> map) {
        key.getClass();
        map.getClass();
        if (key.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(key), 12, (Object) null);
            return;
        }
        try {
            Intrinsics.reifiedOperationMarker(4, "K");
            Intrinsics.reifiedOperationMarker(4, "K");
            throw new UnsupportedOperationException("Non-String keys not yet supported. Key type: " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName());
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new r0(key), 8, (Object) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\bR2\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00100\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010%R\u0014\u00101\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010%R\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010 ¨\u00069"}, d2 = {"Lcom/braze/storage/DataStoreProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "deleteDataStoreFiles", "(Landroid/content/Context;)V", "Ljava/io/File;", "file", "", "maxRetries", "", "delayMs", "deleteFileWithRetry", "(Ljava/io/File;IJ)V", "", "fileName", "", "isWipeableDataStoreFileName", "(Ljava/lang/String;)Z", "key", "Lv80/b0;", "getOrCreateScopeForKey$android_sdk_base_release", "(Ljava/lang/String;)Lv80/b0;", "getOrCreateScopeForKey", "shutdownAllDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "Ld8/f;", "Lh8/g;", "dataStoreInstanceCache", "Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreInstanceCache$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreInstanceCache$android_sdk_base_release$annotations", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/braze/events/e;", "eventPublisher", "Lcom/braze/events/e;", "getEventPublisher$android_sdk_base_release", "()Lcom/braze/events/e;", "setEventPublisher$android_sdk_base_release", "(Lcom/braze/events/e;)V", "PERSISTENT_DATASTORE_PREFIX", "BRAZE_DATASTORE_PREFIX", "RUNTIME_CONFIG_PREFIX", "FILE_DELETE_MAX_RETRIES", "I", "FILE_DELETE_RETRY_DELAY_MS", "J", "scopeCreationLock", "Ljava/lang/Object;", "dataStoreScopeMap", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void deleteDataStoreFiles(Context context) {
            File[] fileArrListFiles;
            try {
                File file = new File(context.getFilesDir(), "datastore");
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        Companion companion = DataStoreProvider.INSTANCE;
                        String name = file2.getName();
                        name.getClass();
                        if (companion.isWipeableDataStoreFileName(name)) {
                            deleteFileWithRetry$default(companion, file2, 0, 0L, 6, null);
                        }
                    }
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lu.a(20), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteDataStoreFiles$lambda$8() {
            return "Failed to delete DataStore files";
        }

        private final void deleteFileWithRetry(File file, int maxRetries, long delayMs) throws InterruptedException {
            for (int i11 = 0; i11 < maxRetries; i11++) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.c(file, i11), 6, (Object) null);
                if (file.delete() || !file.exists()) {
                    return;
                }
                if (i11 < maxRetries - 1) {
                    Thread.sleep(delayMs);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new lw.c(maxRetries, file), 6, (Object) null);
        }

        public static /* synthetic */ void deleteFileWithRetry$default(Companion companion, File file, int i11, long j9, int i12, Object obj) throws InterruptedException {
            if ((i12 & 2) != 0) {
                i11 = 3;
            }
            if ((i12 & 4) != 0) {
                j9 = DataStoreProvider.FILE_DELETE_RETRY_DELAY_MS;
            }
            companion.deleteFileWithRetry(file, i11, j9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$10$lambda$9(File file, int i11) {
            return "Deleting DataStore file: " + file.getName() + " (attempt " + (i11 + 1) + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$11(int i11, File file) {
            return "Failed to delete DataStore file after " + i11 + " attempts: " + file.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getOrCreateScopeForKey$lambda$3$lambda$2(String str, v80.b0 b0Var) {
            return "Creating new CoroutineScope for DataStore for key: " + str + " scope: " + b0Var;
        }

        public static /* synthetic */ void shutdownAllDataStores$default(Companion companion, Context context, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                context = null;
            }
            companion.shutdownAllDataStores(context);
        }

        public final ConcurrentHashMap<String, d8.f> getDataStoreInstanceCache$android_sdk_base_release() {
            return DataStoreProvider.dataStoreInstanceCache;
        }

        public final com.braze.events.e getEventPublisher$android_sdk_base_release() {
            return DataStoreProvider.eventPublisher;
        }

        public final v80.b0 getOrCreateScopeForKey$android_sdk_base_release(String key) {
            v80.b0 b0VarB;
            key.getClass();
            v80.b0 b0Var = (v80.b0) DataStoreProvider.dataStoreScopeMap.get(key);
            if (b0Var != null && v80.f0.y(b0Var)) {
                return b0Var;
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                try {
                    b0VarB = (v80.b0) DataStoreProvider.dataStoreScopeMap.get(key);
                    if (b0VarB == null || !v80.f0.y(b0VarB)) {
                        b0VarB = v80.f0.b(BrazeCoroutineScope.INSTANCE.getCoroutineContext().plus(v80.f0.d()));
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.b(4, key, b0VarB), 6, (Object) null);
                        DataStoreProvider.dataStoreScopeMap.put(key, b0VarB);
                    }
                } finally {
                }
            }
            return b0VarB;
        }

        public final String getTAG() {
            return DataStoreProvider.TAG;
        }

        public final boolean isWipeableDataStoreFileName(String fileName) {
            fileName.getClass();
            return (!kotlin.text.y.p(fileName, DataStoreProvider.BRAZE_DATASTORE_PREFIX, false) || kotlin.text.y.p(fileName, DataStoreProvider.RUNTIME_CONFIG_PREFIX, false) || kotlin.text.y.p(fileName, DataStoreProvider.PERSISTENT_DATASTORE_PREFIX, false)) ? false : true;
        }

        public final void setEventPublisher$android_sdk_base_release(com.braze.events.e eVar) {
            DataStoreProvider.eventPublisher = eVar;
        }

        public final void shutdownAllDataStores(Context context) {
            synchronized (DataStoreProvider.scopeCreationLock) {
                try {
                    Collection<v80.b0> collectionValues = DataStoreProvider.dataStoreScopeMap.values();
                    collectionValues.getClass();
                    for (v80.b0 b0Var : collectionValues) {
                        CoroutineContext coroutineContext = b0Var.getCoroutineContext();
                        v80.h1 h1Var = v80.h1.f42106a;
                        v80.i1 i1Var = (v80.i1) coroutineContext.get(h1Var);
                        if (i1Var != null) {
                            v80.f0.m(i1Var);
                        }
                        v80.i1 i1Var2 = (v80.i1) b0Var.getCoroutineContext().get(h1Var);
                        if (i1Var2 != null) {
                            i1Var2.a(null);
                        }
                    }
                    DataStoreProvider.dataStoreScopeMap.clear();
                    Companion companion = DataStoreProvider.INSTANCE;
                    companion.getDataStoreInstanceCache$android_sdk_base_release().clear();
                    if (context != null) {
                        companion.deleteDataStoreFiles(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private Companion() {
        }

        public static /* synthetic */ void getDataStoreInstanceCache$android_sdk_base_release$annotations() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createOrGetDataStore$lambda$10$lambda$9$lambda$8(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readData$lambda$1(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeData$lambda$0(String str) {
        return str;
    }
}
