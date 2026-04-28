package com.braze;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f9578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f9579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Braze braze, JSONObject jSONObject, x70.c cVar) {
        super(2, cVar);
        this.f9578b = braze;
        this.f9579c = jSONObject;
    }

    public static final String a() {
        return "Content Cards are disabled. Not deserializing json. Returning null.";
    }

    public static final String b() {
        return "Cannot deserialize null content card json. Returning null.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        c cVar2 = new c(this.f9578b, this.f9579c, cVar);
        cVar2.f9577a = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f9577a;
        if (!((com.braze.managers.j1) this.f9578b.getUdm$android_sdk_base_release()).f10026o.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(22), 6, (Object) null);
            return null;
        }
        if (this.f9579c == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(23), 6, (Object) null);
            return null;
        }
        com.braze.storage.p pVar = ((com.braze.managers.j1) this.f9578b.getUdm$android_sdk_base_release()).D;
        JSONObject jSONObject = this.f9579c;
        pVar.getClass();
        jSONObject.getClass();
        return com.braze.models.h.a(jSONObject, pVar.f10647b, pVar, pVar.f10655j);
    }
}
