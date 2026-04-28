package com.braze.triggers.actions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f10803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JSONObject jSONObject) {
        super(jSONObject);
        jSONObject.getClass();
        this.f10803f = new LinkedHashMap();
    }
}
