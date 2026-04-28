package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import o80.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApi21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApi21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi21\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n179#2,2:47\n1#3:49\n1#3:60\n11653#4,9:50\n13579#4:59\n13580#4:61\n11662#4:62\n1747#5,3:63\n*S KotlinDebug\n*F\n+ 1 NetworkDataCollectorApi21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi21\n*L\n17#1:47,2\n31#1:60\n31#1:50,9\n31#1:59\n31#1:61\n31#1:62\n33#1:63,3\n*E\n"})
public final class AFi1qSDK extends AFi1pSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1qSDK(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getCurrencyIso4217Code() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getMonetizationNetwork;
                connectivityManager2.getClass();
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (w_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            AFLogger.afErrorLog("Failed collecting ivc data", e5);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    public final String getRevenue() {
        Network[] allNetworks;
        Sequence sequenceR;
        Object next;
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null || (sequenceR = y.r(allNetworks)) == null) {
            return PaymentMethodTypes.UNKNOWN;
        }
        o80.e eVar = new o80.e(r.n(sequenceR, new Function1<Network, NetworkInfo>() { // from class: com.appsflyer.internal.AFi1qSDK.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: x_, reason: merged with bridge method [inline-methods] */
            public final NetworkInfo invoke(Network network) {
                ConnectivityManager connectivityManager2 = AFi1qSDK.this.getMonetizationNetwork;
                connectivityManager2.getClass();
                return connectivityManager2.getNetworkInfo(network);
            }
        }));
        while (true) {
            if (!eVar.hasNext()) {
                next = null;
                break;
            }
            next = eVar.next();
            if (AFi1pSDK.v_((NetworkInfo) next)) {
                break;
            }
        }
        NetworkInfo networkInfo = (NetworkInfo) next;
        if (networkInfo == null) {
            return PaymentMethodTypes.UNKNOWN;
        }
        int type = networkInfo.getType();
        return type != 0 ? type != 1 ? PaymentMethodTypes.UNKNOWN : "WIFI" : "MOBILE";
    }
}
