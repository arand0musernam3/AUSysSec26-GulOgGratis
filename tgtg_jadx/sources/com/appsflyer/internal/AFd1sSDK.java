package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/ExtensionsKt\n*L\n16#1:25\n16#1:26,3\n*E\n"})
public final class AFd1sSDK {
    @NotNull
    public static final JSONArray getMediationNetwork(@NotNull List<AFc1bSDK> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFc1bSDK) it.next()).getMonetizationNetwork());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getMediationNetwork(@NotNull HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
