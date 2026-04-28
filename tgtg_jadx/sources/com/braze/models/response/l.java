package com.braze.models.response;

import c50.w;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f10255a;

    public l(JSONArray jSONArray) {
        this.f10255a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        Object obj2 = this.f10255a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (String) obj2;
        }
        w.l("null cannot be cast to non-null type kotlin.String");
        return null;
    }
}
