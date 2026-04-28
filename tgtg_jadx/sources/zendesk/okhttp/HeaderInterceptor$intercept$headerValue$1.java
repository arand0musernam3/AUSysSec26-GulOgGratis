package zendesk.okhttp;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.okhttp.HeaderInterceptor$intercept$headerValue$1", f = "HeaderInterceptor.kt", l = {30}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
public final class HeaderInterceptor$intercept$headerValue$1 extends i implements Function2<b0, c<? super String>, Object> {
    final /* synthetic */ Function1<c<? super String>, Object> $headerValueProvider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderInterceptor$intercept$headerValue$1(Function1<? super c<? super String>, ? extends Object> function1, c<? super HeaderInterceptor$intercept$headerValue$1> cVar) {
        super(2, cVar);
        this.$headerValueProvider = function1;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new HeaderInterceptor$intercept$headerValue$1(this.$headerValueProvider, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super String> cVar) {
        return ((HeaderInterceptor$intercept$headerValue$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        Function1<c<? super String>, Object> function1 = this.$headerValueProvider;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
