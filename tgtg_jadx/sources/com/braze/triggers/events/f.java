package com.braze.triggers.events;

import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10843f;

    public f(String str, BrazeProperties brazeProperties, k kVar) {
        super(brazeProperties, kVar);
        this.f10843f = str;
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "purchase";
    }
}
