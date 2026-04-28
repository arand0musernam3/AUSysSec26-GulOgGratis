package cj;

import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8178k;
    public final /* synthetic */ e0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f8179m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8177j = i11;
        this.l = e0Var;
        this.f8179m = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8177j) {
            case 0:
                return new b0(this.l, this.f8179m, cVar, 0);
            default:
                return new b0(this.l, this.f8179m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8177j) {
        }
        return ((b0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8177j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f8178k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var = this.l.f8210a0;
                    ParcelDeliveryOptionId parcelDeliveryOptionIdM221boximpl = ParcelDeliveryOptionId.m221boximpl(this.f8179m);
                    this.f8178k = 1;
                    a2Var.j(parcelDeliveryOptionIdM221boximpl);
                    if (Unit.f26487a == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8178k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var2 = this.l.Y;
                    ParcelDeliveryOptionId parcelDeliveryOptionIdM221boximpl2 = ParcelDeliveryOptionId.m221boximpl(this.f8179m);
                    this.f8178k = 1;
                    a2Var2.j(parcelDeliveryOptionIdM221boximpl2);
                    if (Unit.f26487a == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
