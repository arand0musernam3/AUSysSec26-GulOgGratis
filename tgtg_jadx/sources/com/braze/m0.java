package com.braze;

import com.braze.storage.u3;
import com.braze.support.ValidationUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f9942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(BrazeUser brazeUser, String str, x70.c cVar) {
        super(2, cVar);
        this.f9942a = brazeUser;
        this.f9943b = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new m0(this.f9942a, this.f9943b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m0(this.f9942a, this.f9943b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        u3 u3Var = this.f9942a.userCache;
        String str = this.f9943b;
        synchronized (u3Var) {
            str.getClass();
            u3Var.a(ValidationUtils.ensureBrazeFieldLength(str), JSONObject.NULL);
        }
        return Unit.f26487a;
    }
}
