package com.braze.support;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f10773a;

    public t(JSONArray jSONArray) {
        this.f10773a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objOpt = this.f10773a.opt(((Number) obj).intValue());
        Intrinsics.reifiedOperationMarker(3, "T");
        return Boolean.valueOf(Objects.nonNull(objOpt));
    }
}
