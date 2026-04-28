package com.braze;

import com.braze.models.outgoing.AttributionData;
import com.braze.storage.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f10963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionData f10964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(BrazeUser brazeUser, AttributionData attributionData, x70.c cVar) {
        super(2, cVar);
        this.f10963a = brazeUser;
        this.f10964b = attributionData;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new y(this.f10963a, this.f10964b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new y(this.f10963a, this.f10964b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jsonObject;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        u3 u3Var = this.f10963a.userCache;
        AttributionData attributionData = this.f10964b;
        synchronized (u3Var) {
            if (attributionData != null) {
                try {
                    jsonObject = attributionData.getJsonObject();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                jsonObject = null;
            }
            u3Var.b(jsonObject);
        }
        return Unit.f26487a;
    }
}
