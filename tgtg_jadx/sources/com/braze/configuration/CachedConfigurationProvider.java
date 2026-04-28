package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.braze.z1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.y;
import lw.o;
import rg.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\t\b\u0017\u0018\u0000 <2\u00020\u0001:\u0002\f=B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\n2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0004¢\u0006\u0004\b \u0010\u001aJ+\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b$\u0010#J+\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b%\u0010#J+\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b&\u0010#J\u001f\u0010(\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010/R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R%\u00106\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/braze/configuration/CachedConfigurationProvider;", "", "Landroid/content/Context;", "context", "", "shouldUseConfigurationCache", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "runtimeAppConfigurationProvider", "<init>", "(Landroid/content/Context;ZLcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", "key", "Lcom/braze/configuration/d;", "resourceType", "", "getResourceIdentifier", "(Ljava/lang/String;Lcom/braze/configuration/d;)I", "getFallbackConfigKey", "(Ljava/lang/String;)Ljava/lang/String;", "primaryKey", "defaultValue", "getBooleanValue", "(Ljava/lang/String;Z)Z", "getStringValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getIntValue", "(Ljava/lang/String;I)I", "getColorValue", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "getStringSetValue", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "getDrawableValue", "type", "getRuntimeConfigurationValue", "(Lcom/braze/configuration/d;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getResourceConfigurationValue", "getConfigurationValue", "readResourceValue", "resourceId", "getValueFromResources", "(Lcom/braze/configuration/d;I)Ljava/lang/Object;", "", "resetCache$android_sdk_base_release", "()V", "resetCache", "Landroid/content/Context;", "Z", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "getRuntimeAppConfigurationProvider", "()Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "setRuntimeAppConfigurationProvider", "(Lcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", "configurationCache", "Ljava/util/Map;", "getConfigurationCache", "()Ljava/util/Map;", "resourcePackageName", "Ljava/lang/String;", "Companion", "com/braze/configuration/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CachedConfigurationProvider {
    public static final c Companion = new c();
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    public CachedConfigurationProvider(Context context, boolean z11, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        context.getClass();
        runtimeAppConfigurationProvider.getClass();
        this.context = context;
        this.shouldUseConfigurationCache = z11;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.getClass();
        this.configurationCache = mapSynchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    private final String getFallbackConfigKey(String key) {
        if (StringsKt.z(key, "braze", false)) {
            return y.n(key, "braze", "appboy", false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getResourceConfigurationValue$lambda$1(String str, Object obj) {
        return "Using resources value for key: '" + str + "' and value: '" + obj + "'";
    }

    private final int getResourceIdentifier(String key, d resourceType) {
        if (key == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(key, resourceType.f9649a, this.resourcePackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRuntimeConfigurationValue$lambda$0(String str, Object obj) {
        return "Using runtime override value for key: '" + str + "' and value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$2(String str, Object obj) {
        return "Primary key '" + str + "' had no identifier. No secondary key to read resource value. Returning default value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$3() {
        return "Caught exception retrieving resource value";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$4(d dVar, String str, Object obj) {
        return "Unable to find the xml " + dVar + " configuration value with primary key '" + str + "'. Using default value '" + obj + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetCache$lambda$5() {
        return "Resetting cached configuration";
    }

    public final boolean getBooleanValue(String primaryKey, boolean defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(d.BOOLEAN, primaryKey, Boolean.valueOf(defaultValue));
        configurationValue.getClass();
        return ((Boolean) configurationValue).booleanValue();
    }

    public final Integer getColorValue(String primaryKey) {
        primaryKey.getClass();
        return (Integer) getConfigurationValue(d.COLOR, primaryKey, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(d type, String key, Object defaultValue) {
        type.getClass();
        key.getClass();
        return (this.shouldUseConfigurationCache && this.configurationCache.containsKey(key)) ? this.configurationCache.get(key) : this.runtimeAppConfigurationProvider.containsKey(key) ? getRuntimeConfigurationValue(type, key, defaultValue) : getResourceConfigurationValue(type, key, defaultValue);
    }

    public final int getDrawableValue(String primaryKey, int defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(d.DRAWABLE_IDENTIFIER, primaryKey, Integer.valueOf(defaultValue));
        configurationValue.getClass();
        return ((Integer) configurationValue).intValue();
    }

    public final int getIntValue(String primaryKey, int defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(d.INTEGER, primaryKey, Integer.valueOf(defaultValue));
        configurationValue.getClass();
        return ((Integer) configurationValue).intValue();
    }

    public final Object getResourceConfigurationValue(d type, String key, Object defaultValue) {
        type.getClass();
        key.getClass();
        Object resourceValue = readResourceValue(type, key, defaultValue);
        this.configurationCache.put(key, resourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z1(resourceValue, 10, key), 7, (Object) null);
        return resourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(d type, String key, Object defaultValue) {
        Object objValueOf;
        type.getClass();
        key.getClass();
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
            objValueOf = Integer.valueOf(defaultValue == null ? runtimeAppConfigurationProvider.getIntValue(key, 0) : runtimeAppConfigurationProvider.getIntValue(key, ((Integer) defaultValue).intValue()));
        } else if (iOrdinal == 2) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
            defaultValue.getClass();
            objValueOf = Boolean.valueOf(runtimeAppConfigurationProvider2.getBooleanValue(key, ((Boolean) defaultValue).booleanValue()));
        } else if (iOrdinal == 3) {
            objValueOf = this.runtimeAppConfigurationProvider.getStringValue(key, (String) defaultValue);
        } else if (iOrdinal == 4) {
            objValueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(key, ""), d.DRAWABLE_IDENTIFIER));
        } else {
            if (iOrdinal != 5) {
                e40.a.f();
                return null;
            }
            objValueOf = this.runtimeAppConfigurationProvider.getStringSetValue(key);
        }
        this.configurationCache.put(key, objValueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z1(objValueOf, 11, key), 7, (Object) null);
        return objValueOf;
    }

    public final Set<String> getStringSetValue(String primaryKey, Set<String> defaultValue) {
        primaryKey.getClass();
        Object configurationValue = getConfigurationValue(d.STRING_ARRAY, primaryKey, defaultValue);
        return configurationValue == null ? defaultValue : (Set) configurationValue;
    }

    public final String getStringValue(String primaryKey, String defaultValue) {
        primaryKey.getClass();
        return (String) getConfigurationValue(d.STRING, primaryKey, defaultValue);
    }

    public final Object getValueFromResources(d type, int resourceId) {
        type.getClass();
        Resources resources = this.context.getResources();
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return Integer.valueOf(resources.getInteger(resourceId));
        }
        if (iOrdinal == 1) {
            return Integer.valueOf(resources.getColor(resourceId));
        }
        if (iOrdinal == 2) {
            return Boolean.valueOf(resources.getBoolean(resourceId));
        }
        if (iOrdinal == 3) {
            String string = resources.getString(resourceId);
            string.getClass();
            return string;
        }
        if (iOrdinal == 4) {
            return Integer.valueOf(resourceId);
        }
        if (iOrdinal != 5) {
            e40.a.f();
            return null;
        }
        String[] stringArray = resources.getStringArray(resourceId);
        stringArray.getClass();
        return new HashSet(d0.h(Arrays.copyOf(stringArray, stringArray.length)));
    }

    public final Object readResourceValue(d type, String key, Object defaultValue) {
        int resourceIdentifier;
        type.getClass();
        key.getClass();
        try {
            resourceIdentifier = getResourceIdentifier(key, type);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new m(24), 4, (Object) null);
        }
        if (resourceIdentifier != 0) {
            return getValueFromResources(type, resourceIdentifier);
        }
        String fallbackConfigKey = getFallbackConfigKey(key);
        if (fallbackConfigKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z1(defaultValue, 12, key), 7, (Object) null);
            return defaultValue;
        }
        int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, type);
        if (resourceIdentifier2 != 0) {
            return getValueFromResources(type, resourceIdentifier2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o(type, key, defaultValue, 18), 7, (Object) null);
        return defaultValue;
    }

    public final void resetCache$android_sdk_base_release() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m(23), 7, (Object) null);
        this.configurationCache.clear();
    }

    public final void setRuntimeAppConfigurationProvider(RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        runtimeAppConfigurationProvider.getClass();
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context, boolean z11) {
        this(context, z11, null, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context) {
        this(context, false, null, 6, null);
        context.getClass();
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z11, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }
}
