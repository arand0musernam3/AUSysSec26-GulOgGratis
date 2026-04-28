package com.braze.models.push;

import com.braze.Constants;
import com.braze.enums.d;
import com.braze.models.outgoing.event.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, long j9) throws JSONException {
        str.getClass();
        d dVar = d.H;
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str);
        jSONObjectPut.getClass();
        super(dVar, jSONObjectPut, j9, 8);
    }

    public final String f() throws JSONException {
        String string = this.f10179b.getString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        string.getClass();
        return string;
    }
}
