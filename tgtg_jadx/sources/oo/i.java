package oo;

import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32761a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f32762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f32763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Order f32764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f32765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f32766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f32767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f32768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f32769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1 f32770j;

    public /* synthetic */ i(Order order, Boolean bool, Long l, Function0 function0, Function0 function02, Function0 function03, b1 b1Var, b1 b1Var2, boolean z11) {
        this.f32764d = order;
        this.f32762b = l;
        this.f32763c = bool;
        this.f32765e = function0;
        this.f32766f = function02;
        this.f32767g = b1Var;
        this.f32768h = function03;
        this.f32769i = z11;
        this.f32770j = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32761a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a.s(this.f32762b, this.f32763c, this.f32764d, this.f32765e, this.f32766f, this.f32767g, this.f32768h, this.f32769i, this.f32770j, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a.s(this.f32762b, this.f32763c, this.f32764d, this.f32765e, this.f32766f, this.f32767g, this.f32768h, this.f32769i, this.f32770j, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ i(Long l, Boolean bool, Order order, Function0 function0, Function0 function02, b1 b1Var, Function0 function03, boolean z11, b1 b1Var2, int i11) {
        this.f32762b = l;
        this.f32763c = bool;
        this.f32764d = order;
        this.f32765e = function0;
        this.f32766f = function02;
        this.f32767g = b1Var;
        this.f32768h = function03;
        this.f32769i = z11;
        this.f32770j = b1Var2;
    }
}
