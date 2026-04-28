package com.braze.models.outgoing.event.push;

import com.braze.Constants;
import com.braze.enums.d;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.braze.models.outgoing.event.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f10184j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10185i;

    public a(JSONObject jSONObject, String str) {
        super(d.f9714i, jSONObject, 0.0d, 12);
        this.f10185i = Intrinsics.areEqual(str, Constants.BRAZE_PUSH_ACTION_TYPE_NONE);
    }
}
