package com.braze.enums;

import com.braze.models.IPutIntoJson;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum g implements IPutIntoJson {
    SUBSCRIBED,
    UNSUBSCRIBED;

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getValue() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "subscribed";
        }
        if (iOrdinal == 1) {
            return "unsubscribed";
        }
        e40.a.f();
        return null;
    }
}
