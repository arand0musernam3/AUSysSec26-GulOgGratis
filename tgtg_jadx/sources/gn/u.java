package gn;

import android.app.Activity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import ii.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20667a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20676j;

    public /* synthetic */ u(b4.t tVar, Activity activity, j0 j0Var, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function1 function13, int i11) {
        this.f20673g = tVar;
        this.f20674h = activity;
        this.f20675i = j0Var;
        this.f20668b = function1;
        this.f20669c = function0;
        this.f20670d = function12;
        this.f20671e = function02;
        this.f20676j = function03;
        this.f20672f = function13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20667a;
        Object obj3 = this.f20671e;
        Object obj4 = this.f20669c;
        Object obj5 = this.f20676j;
        Object obj6 = this.f20675i;
        Object obj7 = this.f20672f;
        Object obj8 = this.f20670d;
        Object obj9 = this.f20668b;
        Object obj10 = this.f20674h;
        Object obj11 = this.f20673g;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                a.c((nq.d) obj11, (fn.c) obj10, (Function1) obj9, (Function1) obj8, (Function2) obj5, (Function1) obj7, (Function0) obj4, (Function0) obj3, (Function1) obj6, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ii.l.i((b4.t) obj11, (Activity) obj10, (j0) obj6, (Function1) obj9, (Function0) obj4, (Function1) obj8, (Function0) obj3, (Function0) obj5, (Function1) obj7, (m3.n) obj, m3.i.F(100663297));
                break;
            default:
                ((Integer) obj2).getClass();
                int i12 = SurpriseBagOrderActivity.f9178y;
                ((SurpriseBagOrderActivity) obj11).I((Order) obj10, (b1) obj9, (b1) obj8, (b1) obj7, (b1) obj6, (b1) obj5, (b1) obj4, (b1) obj3, (m3.n) obj, m3.i.F(14380465));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ u(SurpriseBagOrderActivity surpriseBagOrderActivity, Order order, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, int i11) {
        this.f20673g = surpriseBagOrderActivity;
        this.f20674h = order;
        this.f20668b = b1Var;
        this.f20670d = b1Var2;
        this.f20672f = b1Var3;
        this.f20675i = b1Var4;
        this.f20676j = b1Var5;
        this.f20669c = b1Var6;
        this.f20671e = b1Var7;
    }

    public /* synthetic */ u(nq.d dVar, fn.c cVar, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, Function0 function02, Function1 function14, int i11) {
        this.f20673g = dVar;
        this.f20674h = cVar;
        this.f20668b = function1;
        this.f20670d = function12;
        this.f20676j = function2;
        this.f20672f = function13;
        this.f20669c = function0;
        this.f20671e = function02;
        this.f20675i = function14;
    }
}
