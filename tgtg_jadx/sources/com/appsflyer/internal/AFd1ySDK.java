package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1bSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g1;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nExceptionManageCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n11653#2,9:131\n13579#2:140\n11653#2,9:141\n13579#2:150\n13580#2:152\n11662#2:153\n13580#2:155\n11662#2:156\n4117#2:158\n4217#2,2:159\n4117#2:165\n4217#2,2:166\n1#3:151\n1#3:154\n1#3:157\n1549#4:161\n1620#4,3:162\n1549#4:168\n1620#4,3:169\n*S KotlinDebug\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n*L\n69#1:131,9\n69#1:140\n71#1:141,9\n71#1:150\n71#1:152\n71#1:153\n69#1:155\n69#1:156\n101#1:158\n101#1:159,2\n119#1:165\n119#1:166,2\n71#1:151\n69#1:154\n101#1:161\n101#1:162,3\n120#1:168\n120#1:169,3\n*E\n"})
public final class AFd1ySDK implements AFc1aSDK {

    @NotNull
    private final AFc1fSDK getMonetizationNetwork;

    public AFd1ySDK(@NotNull AFc1fSDK aFc1fSDK) {
        aFc1fSDK.getClass();
        this.getMonetizationNetwork = aFc1fSDK;
    }

    private final File getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NotNull
    public final List<AFc1bSDK> AFAdRevenueData() {
        List<AFc1bSDK> listP;
        File[] fileArrListFiles;
        ArrayList arrayList;
        File[] fileArrListFiles2;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                listP = null;
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            fileArrListFiles2 = file.listFiles();
                        } catch (Throwable th2) {
                            AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th2.getMessage(), false, 4, null);
                        }
                        if (fileArrListFiles2 != null) {
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                AFc1bSDK.Companion companion = AFc1bSDK.INSTANCE;
                                file2.getClass();
                                AFc1bSDK aFc1bSDKAFAdRevenueData = AFc1bSDK.Companion.AFAdRevenueData(e80.k.a(file2));
                                if (aFc1bSDKAFAdRevenueData != null) {
                                    arrayList.add(aFc1bSDKAFAdRevenueData);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listP = e0.p(arrayList2);
                }
                if (listP == null) {
                    listP = n0.f26529a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listP;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @Nullable
    public final String getCurrencyIso4217Code(@NotNull Throwable th2, @NotNull String str) {
        String str2;
        File file;
        th2.getClass();
        str.getClass();
        synchronized (this) {
            File monetizationNetwork = getMonetizationNetwork();
            str2 = null;
            if (monetizationNetwork != null) {
                file = new File(monetizationNetwork, "6.18.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1bSDK aFc1bSDKAFAdRevenueData = AFd1tSDK.AFAdRevenueData(th2, str);
                    String str3 = aFc1bSDKAFAdRevenueData.getMonetizationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1bSDK.Companion companion = AFc1bSDK.INSTANCE;
                        AFc1bSDK aFc1bSDKAFAdRevenueData2 = AFc1bSDK.Companion.AFAdRevenueData(e80.k.a(file2));
                        if (aFc1bSDKAFAdRevenueData2 != null) {
                            aFc1bSDKAFAdRevenueData2.getRevenue++;
                            aFc1bSDKAFAdRevenueData = aFc1bSDKAFAdRevenueData2;
                        }
                    }
                    e80.k.b(file2, aFc1bSDKAFAdRevenueData.getRevenue());
                    str2 = str3;
                } catch (Exception e5) {
                    AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e5.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getMediationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getRevenue(@NotNull String... strArr) {
        boolean zE;
        strArr.getClass();
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                zE = true;
                if (monetizationNetwork != null) {
                    if (strArr.length == 0) {
                        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zE = e80.m.e(monetizationNetwork);
                    } else {
                        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(y.H(strArr, ", ", null, null, null, 62)), false, 4, null);
                        File[] fileArrListFiles = monetizationNetwork.listFiles();
                        if (fileArrListFiles != null) {
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!y.v(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
                            for (File file2 : arrayList) {
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(e80.m.e(file2)));
                            }
                            Set setV0 = CollectionsKt.v0(arrayList2);
                            if (setV0.isEmpty()) {
                                setV0 = g1.b(Boolean.TRUE);
                            }
                            Set set = setV0;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.N(set)).booleanValue()) {
                                zE = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zE;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void AFAdRevenueData(int i11, int i12) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        name.getClass();
                        int iAFAdRevenueData = AFj1aSDK.AFAdRevenueData(name);
                        if (i11 > iAFAdRevenueData || iAFAdRevenueData > i12) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
                    for (File file2 : arrayList) {
                        file2.getClass();
                        arrayList2.add(Boolean.valueOf(e80.m.e(file2)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final int getRevenue() {
        Iterator<T> it = AFAdRevenueData().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((AFc1bSDK) it.next()).getRevenue;
        }
        return i11;
    }
}
