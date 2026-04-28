package com.braze.models;

import com.braze.support.DateTimeUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10174b;

    public o(String str) {
        str.getClass();
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        str.getClass();
        this.f10173a = str;
        this.f10174b = jNowInMilliseconds;
    }

    public final String c() {
        return this.f10173a;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getKey() {
        return new JSONObject().put("log", this.f10173a).put("time", this.f10174b);
    }
}
