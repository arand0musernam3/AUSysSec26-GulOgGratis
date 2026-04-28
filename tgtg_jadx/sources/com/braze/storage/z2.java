package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3 f10749d;

    public z2(Context context, String str, String str2) {
        context.getClass();
        this.f10746a = context;
        this.f10747b = str;
        this.f10748c = str2;
        this.f10749d = new a3(context, str, str2);
    }

    public final String a() {
        return String.valueOf(this.f10749d.readData(DataStoreKey.SDK_AUTH, ""));
    }

    public final void b(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.m(str, 25), 6, (Object) null);
        a3 a3Var = this.f10749d;
        DataStoreKey dataStoreKey = DataStoreKey.SDK_AUTH;
        if (str == null) {
            str = "";
        }
        a3Var.writeData(dataStoreKey, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return Intrinsics.areEqual(this.f10746a, z2Var.f10746a) && Intrinsics.areEqual(this.f10747b, z2Var.f10747b) && Intrinsics.areEqual(this.f10748c, z2Var.f10748c);
    }

    public final int hashCode() {
        int iHashCode = this.f10746a.hashCode() * 31;
        String str = this.f10747b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10748c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Context context = this.f10746a;
        String str = this.f10747b;
        String str2 = this.f10748c;
        StringBuilder sb2 = new StringBuilder("SdkAuthenticationCache(context=");
        sb2.append(context);
        sb2.append(", userId=");
        sb2.append(str);
        sb2.append(", apiKey=");
        return r8.k.p(sb2, str2, ")");
    }

    public static final String a(String str) {
        return e0.f.k("Setting signature to: ", str);
    }
}
