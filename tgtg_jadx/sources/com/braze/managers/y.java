package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.storage.a1 f10125a;

    public y(Context context, String str) {
        context.getClass();
        str.getClass();
        this.f10125a = new com.braze.storage.a1(context, str);
    }

    public final String a() {
        com.braze.storage.a1 a1Var = this.f10125a;
        DataStoreKey dataStoreKey = DataStoreKey.DEVICE_ID;
        String string = a1Var.readString(dataStoreKey, null);
        if (string == null) {
            com.braze.storage.a1 a1Var2 = this.f10125a;
            DataStoreKey dataStoreKey2 = DataStoreKey.LEGACY_DEVICE_ID;
            string = a1Var2.readString(dataStoreKey2, null);
            this.f10125a.clearData(dataStoreKey2);
        }
        com.braze.storage.a1 a1Var3 = this.f10125a;
        DataStoreKey dataStoreKey3 = DataStoreKey.PERSISTENT_DEVICE_ID;
        if ((a1Var3.contains(dataStoreKey3) ? !Intrinsics.areEqual(this.f10125a.readString(dataStoreKey3, null), String.valueOf(722989291)) : false) || string == null) {
            string = j4.s.e();
        }
        this.f10125a.writeData(dataStoreKey, string);
        this.f10125a.writeData(dataStoreKey3, String.valueOf(722989291));
        return string;
    }
}
