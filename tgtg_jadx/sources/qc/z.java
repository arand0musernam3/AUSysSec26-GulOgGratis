package qc;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Drawable f36943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f36944k;
    public final /* synthetic */ Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Drawable drawable, Function0 function0, Function0 function02, x70.c cVar) {
        super(2, cVar);
        this.f36943j = drawable;
        this.f36944k = function0;
        this.l = function02;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new z(this.f36943j, this.f36944k, this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ((AnimatedImageDrawable) this.f36943j).registerAnimationCallback(new ed.b(this.f36944k, this.l));
        return Unit.f26487a;
    }
}
