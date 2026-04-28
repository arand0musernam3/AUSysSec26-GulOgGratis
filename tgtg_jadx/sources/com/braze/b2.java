package com.braze;

import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f9576c;

    public /* synthetic */ b2(String str, JSONObject jSONObject, int i11) {
        this.f9574a = i11;
        this.f9575b = str;
        this.f9576c = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9574a) {
            case 0:
                return BrazeUser.setCustomUserAttribute$lambda$49(this.f9575b, this.f9576c);
            default:
                return com.braze.models.outgoing.event.a.b(this.f9575b, this.f9576c);
        }
    }
}
