package com.braze.models;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f10152a;

    public f(JSONArray jSONArray) {
        this.f10152a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Objects.nonNull(this.f10152a.opt(((Number) obj).intValue())));
    }
}
