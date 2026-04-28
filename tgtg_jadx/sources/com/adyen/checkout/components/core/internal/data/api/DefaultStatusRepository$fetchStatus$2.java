package com.adyen.checkout.components.core.internal.data.api;

import ba0.g;
import com.adyen.checkout.components.core.internal.data.model.StatusRequest;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.braze.h2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.p;
import u70.q;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$2", f = "StatusRepository.kt", l = {109}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "<anonymous>", "(Lv80/b0;)Lu70/q;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStatusRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository$fetchStatus$2\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n*L\n1#1,147:1\n17#2,6:148\n*S KotlinDebug\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository$fetchStatus$2\n*L\n108#1:148,6\n*E\n"})
public final class DefaultStatusRepository$fetchStatus$2 extends i implements Function2<b0, c<? super q<? extends StatusResponse>>, Object> {
    final /* synthetic */ String $paymentData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultStatusRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStatusRepository$fetchStatus$2(DefaultStatusRepository defaultStatusRepository, String str, c<? super DefaultStatusRepository$fetchStatus$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultStatusRepository;
        this.$paymentData = str;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        DefaultStatusRepository$fetchStatus$2 defaultStatusRepository$fetchStatus$2 = new DefaultStatusRepository$fetchStatus$2(this.this$0, this.$paymentData, cVar);
        defaultStatusRepository$fetchStatus$2.L$0 = obj;
        return defaultStatusRepository$fetchStatus$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super q<StatusResponse>> cVar) {
        return ((DefaultStatusRepository$fetchStatus$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object pVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                g.M(obj);
                DefaultStatusRepository defaultStatusRepository = this.this$0;
                String str = this.$paymentData;
                o oVar = q.f40850b;
                StatusService statusService = defaultStatusRepository.statusService;
                String str2 = defaultStatusRepository.clientKey;
                StatusRequest statusRequest = new StatusRequest(str);
                this.label = 1;
                obj = statusService.checkStatus$components_core_release(str2, statusRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            pVar = (StatusResponse) obj;
            o oVar2 = q.f40850b;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Throwable th2) {
            o oVar3 = q.f40850b;
            pVar = new p(th2);
        }
        return new q(pVar);
    }
}
