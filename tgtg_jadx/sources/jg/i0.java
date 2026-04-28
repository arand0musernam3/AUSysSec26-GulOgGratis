package jg;

import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25187k;
    public final /* synthetic */ XmlCheckoutAddressFragment l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(XmlCheckoutAddressFragment xmlCheckoutAddressFragment, x70.c cVar, int i11) {
        super(2, cVar);
        this.f25186j = i11;
        this.l = xmlCheckoutAddressFragment;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f25186j) {
            case 0:
                return new i0(this.l, cVar, 0);
            case 1:
                return new i0(this.l, cVar, 1);
            case 2:
                return new i0(this.l, cVar, 2);
            case 3:
                return new i0(this.l, cVar, 3);
            default:
                return new i0(this.l, cVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f25186j) {
        }
        return ((i0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25186j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f25187k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    XmlCheckoutAddressFragment xmlCheckoutAddressFragment = this.l;
                    h1 h1Var = xmlCheckoutAddressFragment.x().f8225p;
                    h0 h0Var = new h0(xmlCheckoutAddressFragment, 0);
                    this.f25187k = 1;
                    if (h1Var.f45488a.collect(h0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                qc.y.m();
                return null;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f25187k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    XmlCheckoutAddressFragment xmlCheckoutAddressFragment2 = this.l;
                    h1 h1Var2 = xmlCheckoutAddressFragment2.x().f8229t;
                    h0 h0Var2 = new h0(xmlCheckoutAddressFragment2, 1);
                    this.f25187k = 1;
                    if (h1Var2.f45488a.collect(h0Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                qc.y.m();
                return null;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f25187k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    XmlCheckoutAddressFragment xmlCheckoutAddressFragment3 = this.l;
                    h1 h1Var3 = xmlCheckoutAddressFragment3.x().f8227r;
                    h0 h0Var3 = new h0(xmlCheckoutAddressFragment3, 2);
                    this.f25187k = 1;
                    if (h1Var3.f45488a.collect(h0Var3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                qc.y.m();
                return null;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f25187k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    XmlCheckoutAddressFragment xmlCheckoutAddressFragment4 = this.l;
                    h1 h1Var4 = xmlCheckoutAddressFragment4.x().f8218h;
                    h0 h0Var4 = new h0(xmlCheckoutAddressFragment4, 3);
                    this.f25187k = 1;
                    if (h1Var4.f45488a.collect(h0Var4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                qc.y.m();
                return null;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f25187k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    XmlCheckoutAddressFragment xmlCheckoutAddressFragment5 = this.l;
                    h1 h1Var5 = xmlCheckoutAddressFragment5.x().J;
                    h0 h0Var5 = new h0(xmlCheckoutAddressFragment5, 4);
                    this.f25187k = 1;
                    if (h1Var5.f45488a.collect(h0Var5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                qc.y.m();
                return null;
        }
    }
}
