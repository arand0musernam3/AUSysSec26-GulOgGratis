package com.braze.push;

import android.content.Context;
import android.content.Intent;
import com.braze.h2;
import com.braze.push.BrazePushReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@z70.e(c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", f = "BrazePushReceiver.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
public final class BrazePushReceiver$Companion$handleReceivedIntent$1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleReceivedIntent$1(Context context, Intent intent, x70.c<? super BrazePushReceiver$Companion$handleReceivedIntent$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$intent = intent;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new BrazePushReceiver$Companion$handleReceivedIntent$1(this.$context, this.$intent, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((BrazePushReceiver$Companion$handleReceivedIntent$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        BrazePushReceiver.Companion companion = BrazePushReceiver.INSTANCE;
        Context applicationContext = this.$context.getApplicationContext();
        applicationContext.getClass();
        companion.handlePush(applicationContext, this.$intent);
        return Unit.f26487a;
    }
}
