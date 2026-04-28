package com.braze.support;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f10775a;

    public v(JSONObject jSONObject) {
        this.f10775a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objOpt = this.f10775a.opt((String) obj);
        Intrinsics.reifiedOperationMarker(3, "T");
        return Boolean.valueOf(Objects.nonNull(objOpt));
    }
}
