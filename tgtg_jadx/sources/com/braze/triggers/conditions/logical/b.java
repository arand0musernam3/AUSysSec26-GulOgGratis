package com.braze.triggers.conditions.logical;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements com.braze.triggers.conditions.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10820b = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10821a;

    public b(ArrayList arrayList) {
        this.f10821a = arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONArray getPropertiesJSONObject() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = this.f10821a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.c) it.next()).getPropertiesJSONObject());
            }
            return jSONArray;
        } catch (Exception e5) {
            BrazeLogger.e(f10820b, "Caught exception creating Json.", e5);
            return jSONArray;
        }
    }
}
