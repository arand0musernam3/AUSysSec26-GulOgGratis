package com.braze.models.response;

import com.braze.requests.o;
import com.braze.support.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.communication.d f10219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f10220b;

    public a(o oVar, com.braze.communication.d dVar) {
        oVar.getClass();
        dVar.getClass();
        this.f10219a = dVar;
        String str = (String) dVar.f9593b.get("retry-after");
        this.f10220b = str != null ? q.a(str) : null;
    }
}
