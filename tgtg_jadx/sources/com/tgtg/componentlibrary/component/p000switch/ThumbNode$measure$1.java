package com.tgtg.componentlibrary.component.p000switch;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t1.b;
import t1.x;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.tgtg.componentlibrary.component.switch.ThumbNode$measure$1", f = "PantrySwitch.kt", l = {397}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 3, 0})
public final class ThumbNode$measure$1 extends i implements Function2<b0, c<? super Unit>, Object> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ThumbNode f13288k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$1(ThumbNode thumbNode, float f11, c cVar) {
        super(2, cVar);
        this.f13288k = thumbNode;
        this.l = f11;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ThumbNode$measure$1(this.f13288k, this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((ThumbNode$measure$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.f13287j;
        if (i11 == 0) {
            g.M(obj);
            ThumbNode thumbNode = this.f13288k;
            b bVar = thumbNode.f13284u;
            if (bVar != null) {
                Float f11 = new Float(this.l);
                x animationSpec = thumbNode.getAnimationSpec();
                this.f13287j = 1;
                obj = b.c(bVar, f11, animationSpec, null, this, 12);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.f26487a;
        }
        if (i11 != 1) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        return Unit.f26487a;
    }
}
