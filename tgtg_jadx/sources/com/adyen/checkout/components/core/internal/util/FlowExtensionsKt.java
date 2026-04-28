package com.adyen.checkout.components.core.internal.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l;
import ba0.g;
import com.braze.h2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.i1;
import x70.c;
import y70.a;
import y80.q1;
import y80.r;
import y80.w;
import y80.y1;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u001e\u0010\u0011\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0010\"\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Ly80/i;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lv80/b0;", "coroutineScope", "Lkotlin/Function1;", "", "callback", "Lv80/i1;", "mapToCallbackWithLifeCycle", "(Ly80/i;Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)Lv80/i1;", "scope", "Ly80/q1;", "started", "initialValue", "", "flows", "Ly80/y1;", "mergeStateFlows", "(Lv80/b0;Ly80/q1;Ljava/lang/Object;[Ly80/i;)Ly80/y1;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.util.FlowExtensionsKt$mapToCallbackWithLifeCycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.util.FlowExtensionsKt$mapToCallbackWithLifeCycle$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends i implements Function2<T, c<? super Unit>, Object> {
        final /* synthetic */ Function1<T, Unit> $callback;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super T, Unit> function1, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$callback = function1;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(T t9, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(t9, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            this.$callback.invoke(this.L$0);
            return Unit.f26487a;
        }
    }

    @NotNull
    public static final <T> i1 mapToCallbackWithLifeCycle(@NotNull y80.i iVar, @NotNull LifecycleOwner lifecycleOwner, @NotNull b0 b0Var, @NotNull Function1<? super T, Unit> function1) {
        iVar.getClass();
        lifecycleOwner.getClass();
        b0Var.getClass();
        function1.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        lifecycle.getClass();
        state.getClass();
        return r.u(b0Var, new w(r.f(new l(lifecycle, state, iVar, null)), new AnonymousClass1(function1, null), 5));
    }

    @NotNull
    public static final <T> y1 mergeStateFlows(@NotNull b0 b0Var, @NotNull q1 q1Var, T t9, @NotNull y80.i... iVarArr) {
        b0Var.getClass();
        q1Var.getClass();
        iVarArr.getClass();
        return r.x(r.v((y80.i[]) Arrays.copyOf(iVarArr, iVarArr.length)), b0Var, q1Var, t9);
    }
}
