package eg;

import android.content.Context;
import b4.q;
import b4.t;
import bx.o;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.order.Changes;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.n;
import um.u;
import ym.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15967g;

    public /* synthetic */ b(t tVar, FlashSalesItem flashSalesItem, boolean z11, Function1 function1, Function0 function0, int i11, int i12) {
        this.f15961a = 0;
        this.f15965e = tVar;
        this.f15966f = flashSalesItem;
        this.f15963c = z11;
        this.f15962b = function1;
        this.f15967g = function0;
        this.f15964d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f15961a;
        int i12 = this.f15964d;
        Object obj3 = this.f15967g;
        Object obj4 = this.f15962b;
        Object obj5 = this.f15966f;
        Object obj6 = this.f15965e;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                bx.k.a((t) obj6, (FlashSalesItem) obj5, this.f15963c, (Function1) obj4, (Function0) obj3, (n) obj, iF, this.f15964d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i13 = CharityOrderActivity.f9162o;
                int iF2 = m3.i.F(i12 | 1);
                ((CharityOrderActivity) obj6).M((go.a) obj5, (Function1) obj4, (List) obj3, this.f15963c, (n) obj, iF2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(i12 | 1);
                o.t((t) obj6, (Context) obj5, (Changes) obj4, (go.a) obj3, this.f15963c, (n) obj, iF3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iF4 = m3.i.F(24583);
                ki.j.e((t) obj6, (String) obj5, (String) obj4, (String) obj3, this.f15963c, (n) obj, iF4, this.f15964d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iF5 = m3.i.F(i12 | 1);
                oo.a.L(this.f15963c, (Long) obj6, (Boolean) obj5, (Function0) obj3, q.f5711a, (b1) obj4, (n) obj, iF5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF6 = m3.i.F(i12 | 1);
                na0.a.P((vm.b) obj6, (u) obj5, (z) obj4, this.f15963c, (um.g) obj3, (n) obj, iF6);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(t tVar, String str, String str2, String str3, boolean z11, int i11, int i12) {
        this.f15961a = 3;
        this.f15965e = tVar;
        this.f15966f = str;
        this.f15962b = str2;
        this.f15967g = str3;
        this.f15963c = z11;
        this.f15964d = i12;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, boolean z11, int i11, int i12) {
        this.f15961a = i12;
        this.f15965e = obj;
        this.f15966f = obj2;
        this.f15962b = obj3;
        this.f15967g = obj4;
        this.f15963c = z11;
        this.f15964d = i11;
    }

    public /* synthetic */ b(vm.b bVar, u uVar, z zVar, boolean z11, um.g gVar, int i11) {
        this.f15961a = 5;
        this.f15965e = bVar;
        this.f15966f = uVar;
        this.f15962b = zVar;
        this.f15963c = z11;
        this.f15967g = gVar;
        this.f15964d = i11;
    }

    public /* synthetic */ b(boolean z11, Long l, Boolean bool, Function0 function0, b1 b1Var, int i11) {
        this.f15961a = 4;
        this.f15963c = z11;
        this.f15965e = l;
        this.f15966f = bool;
        this.f15967g = function0;
        this.f15962b = b1Var;
        this.f15964d = i11;
    }
}
