package com.braze.storage;

import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p1 {
    public static String a(com.braze.models.k kVar) throws JSONException {
        kVar.getClass();
        int i11 = com.braze.models.outgoing.event.push.c.f10186i;
        String strA = com.braze.models.outgoing.event.push.b.a(kVar);
        return ((com.braze.models.outgoing.event.b) kVar).d() + strA;
    }
}
