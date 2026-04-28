package com.adyen.checkout.core;

import a90.p;
import c90.e;
import c90.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import v80.p0;
import v80.v1;
import v80.x;
import zendesk.analyticskit.android.model.AnalyticsValueType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/core/DispatcherProvider;", "", "<init>", "()V", "Lv80/v1;", "dispatcher", "", "overrideMain", "(Lv80/v1;)V", "Lv80/x;", "overrideIO", "(Lv80/x;)V", "overrideDefault", "resetMain", "resetIO", "resetDefault", "resetAll", "Lkotlin/Function0;", "mainFactory", "Lkotlin/jvm/functions/Function0;", "defaultFactory", "ioFactory", "getMain", "()Lv80/v1;", "Main", "getDefault", "()Lv80/x;", AnalyticsValueType.DEFAULT_TYPE, "getIO", "IO", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DispatcherProvider {

    @NotNull
    public static final DispatcherProvider INSTANCE = new DispatcherProvider();

    @NotNull
    private static Function0<? extends v1> mainFactory = new Function0<v1>() { // from class: com.adyen.checkout.core.DispatcherProvider$mainFactory$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final v1 invoke() {
            f fVar = p0.f42144a;
            return p.f1044a;
        }
    };

    @NotNull
    private static Function0<? extends x> defaultFactory = new Function0<x>() { // from class: com.adyen.checkout.core.DispatcherProvider$defaultFactory$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final x invoke() {
            return p0.f42144a;
        }
    };

    @NotNull
    private static Function0<? extends x> ioFactory = new Function0<x>() { // from class: com.adyen.checkout.core.DispatcherProvider$ioFactory$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final x invoke() {
            f fVar = p0.f42144a;
            return e.f7834b;
        }
    };

    private DispatcherProvider() {
    }

    @NotNull
    public final x getDefault() {
        return (x) defaultFactory.invoke();
    }

    @NotNull
    public final x getIO() {
        return (x) ioFactory.invoke();
    }

    @NotNull
    public final v1 getMain() {
        return (v1) mainFactory.invoke();
    }

    public final void overrideDefault(@NotNull final x dispatcher) {
        dispatcher.getClass();
        defaultFactory = new Function0<x>() { // from class: com.adyen.checkout.core.DispatcherProvider.overrideDefault.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final x invoke() {
                return dispatcher;
            }
        };
    }

    public final void overrideIO(@NotNull final x dispatcher) {
        dispatcher.getClass();
        ioFactory = new Function0<x>() { // from class: com.adyen.checkout.core.DispatcherProvider.overrideIO.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final x invoke() {
                return dispatcher;
            }
        };
    }

    public final void overrideMain(@NotNull final v1 dispatcher) {
        dispatcher.getClass();
        mainFactory = new Function0<v1>() { // from class: com.adyen.checkout.core.DispatcherProvider.overrideMain.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final v1 invoke() {
                return dispatcher;
            }
        };
    }

    public final void resetAll() {
        resetMain();
        resetIO();
        resetDefault();
    }

    public final void resetDefault() {
        defaultFactory = new Function0<x>() { // from class: com.adyen.checkout.core.DispatcherProvider.resetDefault.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final x invoke() {
                return p0.f42144a;
            }
        };
    }

    public final void resetIO() {
        ioFactory = new Function0<x>() { // from class: com.adyen.checkout.core.DispatcherProvider.resetIO.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final x invoke() {
                f fVar = p0.f42144a;
                return e.f7834b;
            }
        };
    }

    public final void resetMain() {
        mainFactory = new Function0<v1>() { // from class: com.adyen.checkout.core.DispatcherProvider.resetMain.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final v1 invoke() {
                f fVar = p0.f42144a;
                return p.f1044a;
            }
        };
    }
}
