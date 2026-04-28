package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.braze.h2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.i0;
import kotlin.collections.x0;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFileCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1855#2,2:336\n1855#2,2:339\n1855#2:341\n1856#2:344\n1855#2,2:346\n1855#2:348\n1856#2:351\n6442#3:338\n13579#3,2:349\n18#4:342\n26#5:343\n1#6:345\n*S KotlinDebug\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n*L\n106#1:336,2\n189#1:339,2\n207#1:341\n207#1:344\n263#1:346,2\n296#1:348\n296#1:351\n187#1:338\n299#1:349,2\n213#1:342\n213#1:343\n*E\n"})
public final class AFc1tSDK implements AFc1vSDK {

    @NotNull
    private final AFc1fSDK AFAdRevenueData;

    @NotNull
    private final AFc1jSDK getMediationNetwork;

    @NotNull
    private final AFc1sSDK getMonetizationNetwork;

    @NotNull
    private final Map<String, Integer> getRevenue;

    public AFc1tSDK(@NotNull AFc1fSDK aFc1fSDK, @NotNull AFc1jSDK aFc1jSDK) {
        aFc1fSDK.getClass();
        aFc1jSDK.getClass();
        this.AFAdRevenueData = aFc1fSDK;
        this.getMediationNetwork = aFc1jSDK;
        this.getMonetizationNetwork = new AFc1sSDK(d0.h(new AFc1uSDK("ConversionsCache", c0.c(AFe1lSDK.CONVERSION), 1), new AFc1uSDK("AttrCache", c0.c(AFe1lSDK.ATTR), 1), new AFc1uSDK("OtherCache", d0.h(AFe1lSDK.LAUNCH, AFe1lSDK.INAPP, AFe1lSDK.ADREVENUE, AFe1lSDK.ARS_VALIDATE, AFe1lSDK.PURCHASE_VALIDATE, AFe1lSDK.MANUAL_PURCHASE_VALIDATION, AFe1lSDK.SDK_SERVICES), 40)));
        this.getRevenue = x0.f(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private final void getMediationNetwork() {
        for (AFc1uSDK aFc1uSDK : this.getMonetizationNetwork.getRevenue) {
            String str = aFc1uSDK.getCurrencyIso4217Code;
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            context.getClass();
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1uSDK.getCurrencyIso4217Code;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1uSDK.getCurrencyIso4217Code, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @NotNull
    public final List<AFc1rSDK> AFAdRevenueData() {
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
            while (it.hasNext()) {
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                context3.getClass();
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                i0.t(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1rSDK currencyIso4217Code = getCurrencyIso4217Code(file2);
                if (currencyIso4217Code != null) {
                    arrayList.add(currencyIso4217Code);
                }
            }
        } catch (Exception e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e5, false, false, false, false, 120, null);
        }
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, r8.k.h(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void getCurrencyIso4217Code() {
        try {
            if (this.getMediationNetwork.getCurrencyIso4217Code("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
                context.getClass();
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                    context2.getClass();
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMediationNetwork.AFAdRevenueData("AF_CACHE_VERSION", 2);
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                context3.getClass();
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getCurrencyIso4217Code;
                    context4.getClass();
                    e80.m.e(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getCurrencyIso4217Code;
                    context5.getClass();
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMediationNetwork();
        } catch (Exception e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e5, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void getMonetizationNetwork() {
        try {
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
            while (it.hasNext()) {
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                context3.getClass();
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getCurrencyIso4217Code;
            context4.getClass();
            e80.m.e(new File(context4.getFilesDir(), "AFRequestCache"));
            getMediationNetwork();
        } catch (Exception e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e5, false, false, false, false, 120, null);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.appsflyer.internal.AFc1vSDK
    @Nullable
    public final String getRevenue(@NotNull AFc1rSDK aFc1rSDK) {
        Exception exc;
        File file;
        String str;
        List<File> listM0;
        aFc1rSDK.getClass();
        try {
            AFe1lSDK aFe1lSDK = aFc1rSDK.getMonetizationNetwork;
            aFe1lSDK.getClass();
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            context.getClass();
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1lSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1rSDK.getRevenue, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1rSDK.getMediationNetwork);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1rSDK.getRevenue);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1rSDK.getCurrencyIso4217Code(), 2));
                    outputStreamWriter.write(10);
                    AFe1lSDK aFe1lSDK2 = aFc1rSDK.getMonetizationNetwork;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1lSDK2.name());
                    outputStreamWriter.write(10);
                    Map<String, String> map = aFc1rSDK.getCurrencyIso4217Code;
                    if (map != null && !map.isEmpty()) {
                        outputStreamWriter.write("headers=");
                        Map<String, String> map2 = aFc1rSDK.getCurrencyIso4217Code;
                        map2.getClass();
                        String string = new JSONObject(map2).toString();
                        string.getClass();
                        byte[] bytes = string.getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1lSDK aFe1lSDK3 = aFc1rSDK.getMonetizationNetwork;
                    aFe1lSDK3.getClass();
                    AFc1uSDK aFc1uSDKAFAdRevenueData = AFAdRevenueData(aFe1lSDK3);
                    Integer numValueOf = aFc1uSDKAFAdRevenueData != null ? Integer.valueOf(aFc1uSDKAFAdRevenueData.getMediationNetwork) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map3 = this.getRevenue;
                    AFc1uSDK aFc1uSDKAFAdRevenueData2 = AFAdRevenueData(aFe1lSDK3);
                    if (aFc1uSDKAFAdRevenueData2 == null || (str = aFc1uSDKAFAdRevenueData2.getCurrencyIso4217Code) == null) {
                        throw new UnsupportedOperationException("Cache do not support this type of events");
                    }
                    Integer num = map3.get(str);
                    int iIntValue2 = num != null ? num.intValue() : 0;
                    if (iIntValue2 >= iIntValue) {
                        int i11 = (iIntValue2 + 1) - iIntValue;
                        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1lSDK3 + ", removing " + i11 + " item(s)", false, 4, null);
                        Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                        context2.getClass();
                        File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1lSDK3));
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        File[] fileArrListFiles = file3.listFiles();
                        if (fileArrListFiles != null && (listM0 = CollectionsKt.m0(y.N(new Comparator() { // from class: com.appsflyer.internal.AFc1tSDK.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t9, T t11) {
                                return w70.a.a(((File) t9).getName(), ((File) t11).getName());
                            }
                        }, fileArrListFiles), i11)) != null) {
                            for (File file4 : listM0) {
                                file4.delete();
                                AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                            }
                        }
                    }
                    getMediationNetwork();
                    return strValueOf;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        u00.d.p(outputStreamWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception e5) {
                exc = e5;
                if (file != null) {
                    file.delete();
                }
                AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e11) {
            exc = e11;
            file = null;
        }
    }

    private final String getMediationNetwork(AFe1lSDK aFe1lSDK) {
        String str;
        AFc1uSDK aFc1uSDKAFAdRevenueData = AFAdRevenueData(aFe1lSDK);
        if (aFc1uSDKAFAdRevenueData != null && (str = aFc1uSDKAFAdRevenueData.getCurrencyIso4217Code) != null) {
            return str;
        }
        h2.a("Cache do not support this type of events");
        return null;
    }

    private static AFc1rSDK getCurrencyIso4217Code(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(cArr);
                aFc1rSDK.AFAdRevenueData = file.getName();
                inputStreamReader.close();
                return aFc1rSDK;
            } finally {
            }
        } catch (Exception e5) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e5, false, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean getMonetizationNetwork(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
        context.getClass();
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
            context2.getClass();
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, a0.p("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
            Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
            context3.getClass();
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return AFAdRevenueData(file);
            }
        }
        return true;
    }

    private final boolean AFAdRevenueData(File file) {
        try {
            file.delete();
            getMediationNetwork();
            return true;
        } catch (Exception e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, a0.p("Could not delete ", file.getName(), " from cache"), e5, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1uSDK AFAdRevenueData(AFe1lSDK aFe1lSDK) {
        Object next;
        Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AFc1uSDK) next).getMonetizationNetwork.contains(aFe1lSDK)) {
                break;
            }
        }
        return (AFc1uSDK) next;
    }
}
