package kotlin.reflect.jvm.internal.impl.utils;

import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class FunctionsKt {

    @NotNull
    private static final Function1<Object, Object> IDENTITY = new Function1<Object, Object>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$IDENTITY$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    };

    @NotNull
    private static final Function1<Object, Boolean> ALWAYS_TRUE = new Function1<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_TRUE$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@Nullable Object obj) {
            return Boolean.TRUE;
        }
    };

    @NotNull
    private static final Function1<Object, Object> ALWAYS_NULL = new Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_NULL$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@Nullable Object obj) {
            return null;
        }
    };

    @NotNull
    private static final Function1<Object, Unit> DO_NOTHING = new Function1<Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m984invoke(obj);
            return Unit.f26487a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m984invoke(@Nullable Object obj) {
        }
    };

    @NotNull
    private static final Function2<Object, Object, Unit> DO_NOTHING_2 = new Function2<Object, Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m985invoke(obj, obj2);
            return Unit.f26487a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m985invoke(@Nullable Object obj, @Nullable Object obj2) {
        }
    };

    @NotNull
    private static final n DO_NOTHING_3 = new n() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_3$1
        @Override // i80.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m986invoke(obj, obj2, obj3);
            return Unit.f26487a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m986invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        }
    };

    @NotNull
    public static final <T> Function1<T, Boolean> alwaysTrue() {
        return (Function1<T, Boolean>) ALWAYS_TRUE;
    }

    @NotNull
    public static final n getDO_NOTHING_3() {
        return DO_NOTHING_3;
    }
}
