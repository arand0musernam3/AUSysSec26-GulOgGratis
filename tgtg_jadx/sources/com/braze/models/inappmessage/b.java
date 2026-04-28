package com.braze.models.inappmessage;

import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f10160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, m0 m0Var, x70.c cVar) {
        super(2, cVar);
        this.f10158b = str;
        this.f10159c = str2;
        this.f10160d = m0Var;
    }

    public static final String a(String str) {
        return e0.f.k("Logging click on in-app message with button id: ", str);
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b bVar = new b(this.f10158b, this.f10159c, this.f10160d, cVar);
        bVar.f10157a = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        b0 b0Var = (b0) this.f10157a;
        String str = this.f10158b;
        if (str == null || StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m(10), 6, (Object) null);
            com.braze.models.k kVarK = com.braze.models.outgoing.event.b.f10176g.k(this.f10159c);
            if (kVarK != null) {
                ((r) this.f10160d).a(kVarK);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n(this.f10158b, 1), 6, (Object) null);
            com.braze.models.k kVarI = com.braze.models.outgoing.event.b.f10176g.i(this.f10159c, this.f10158b);
            if (kVarI != null) {
                ((r) this.f10160d).a(kVarI);
            }
        }
        return Unit.f26487a;
    }

    public static final String a() {
        return "Logging click on in-app message";
    }
}
