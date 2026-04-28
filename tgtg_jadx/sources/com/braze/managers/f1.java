package com.braze.managers;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f1 extends FunctionReferenceImpl implements i80.o {
    public f1(h1 h1Var) {
        super(4, h1Var, h1.class, "log", "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        BrazeLogger.Priority priority = (BrazeLogger.Priority) obj2;
        String str2 = (String) obj3;
        str.getClass();
        priority.getClass();
        str2.getClass();
        ((h1) this.receiver).a(str, priority, str2, (Throwable) obj4);
        return Unit.f26487a;
    }
}
