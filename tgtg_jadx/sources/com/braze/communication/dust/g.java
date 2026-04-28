package com.braze.communication.dust;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, x70.c cVar) {
        super(2, cVar);
        this.f9617a = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.f9617a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f9617a, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws IOException {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        URLConnection uRLConnectionOpenConnection = new URL(this.f9617a).openConnection();
        uRLConnectionOpenConnection.setRequestProperty("Accept", "text/event-stream");
        uRLConnectionOpenConnection.setDoInput(true);
        uRLConnectionOpenConnection.connect();
        return uRLConnectionOpenConnection;
    }
}
