package com.braze;

import com.braze.enums.Gender;
import com.braze.storage.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f9829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gender f9830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(BrazeUser brazeUser, Gender gender, x70.c cVar) {
        super(2, cVar);
        this.f9829a = brazeUser;
        this.f9830b = gender;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f0(this.f9829a, this.f9830b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f0(this.f9829a, this.f9830b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        String jsonObject;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        u3 u3Var = this.f9829a.userCache;
        Gender gender = this.f9830b;
        synchronized (u3Var) {
            if (gender != null) {
                try {
                    jsonObject = gender.getJsonObject();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                jsonObject = null;
            }
            u3Var.c("gender", jsonObject);
        }
        return Unit.f26487a;
    }
}
