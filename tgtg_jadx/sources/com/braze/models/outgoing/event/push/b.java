package com.braze.models.outgoing.event.push;

import com.braze.Constants;
import com.braze.models.k;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static String a(k kVar) throws JSONException {
        kVar.getClass();
        String string = ((com.braze.models.outgoing.event.b) kVar).f10179b.getString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        string.getClass();
        return string;
    }
}
