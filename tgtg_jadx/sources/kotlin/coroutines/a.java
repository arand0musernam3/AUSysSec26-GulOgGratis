package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements CoroutineContext.Element {

    @NotNull
    private final f key;

    public a(f fVar) {
        fVar.getClass();
        this.key = fVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        function2.getClass();
        return (R) function2.invoke(r11, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public /* bridge */ <E extends CoroutineContext.Element> E get(@NotNull f fVar) {
        return (E) e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public f getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public /* bridge */ CoroutineContext minusKey(@NotNull f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public /* bridge */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
