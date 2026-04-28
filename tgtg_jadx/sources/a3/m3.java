package a3;

import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.Server;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.tgtg.componentlibrary.component.chip.DemoPantryChipKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f487e;

    public /* synthetic */ m3(int i11, int i12, Object obj, u70.f fVar, boolean z11) {
        this.f483a = i12;
        this.f486d = obj;
        this.f484b = z11;
        this.f487e = fVar;
        this.f485c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f483a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(this.f485c | 1);
                lx.u.s(this.f484b, (x5.j) this.f486d, (l3) this.f487e, (m3.n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(this.f485c | 1);
                bm.a.a((b4.t) this.f486d, this.f484b, (u3.d) this.f487e, (m3.n) obj, iF2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(this.f485c | 1);
                jb.u.d(this.f484b, (m3.h1) this.f486d, (d2.n1) this.f487e, (m3.n) obj, iF3);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iF4 = m3.i.F(this.f485c | 1);
                o00.x0.j((SortingChoice) this.f486d, this.f484b, (Function2) this.f487e, (m3.n) obj, iF4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iF5 = m3.i.F(this.f485c | 1);
                b0.z.a((b4.t) this.f486d, (String) this.f487e, this.f484b, (m3.n) obj, iF5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iF6 = m3.i.F(this.f485c | 1);
                a.a.f(this.f484b, (DailyReminder) this.f486d, (Function1) this.f487e, (m3.n) obj, iF6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iF7 = m3.i.F(this.f485c | 1);
                DemoPantryChipKt.a((String) this.f486d, this.f484b, (Function1) this.f487e, (m3.n) obj, iF7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iF8 = m3.i.F(this.f485c | 1);
                ji.i.b((b4.t) this.f486d, (ArrayList) this.f487e, this.f484b, (m3.n) obj, iF8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iF9 = m3.i.F(this.f485c | 1);
                xz.b.c((Function0) this.f486d, (Function0) this.f487e, this.f484b, (m3.n) obj, iF9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iF10 = m3.i.F(this.f485c | 1);
                d40.t1.o((b4.t) this.f486d, this.f484b, (Function1) this.f487e, (m3.n) obj, iF10);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iF11 = m3.i.F(this.f485c | 1);
                b0.z.k((Server) this.f486d, this.f484b, (Function1) this.f487e, (m3.n) obj, iF11);
                break;
            case 11:
                ((Integer) obj2).intValue();
                int iF12 = m3.i.F(this.f485c | 1);
                vi.c.u((cj.q) this.f486d, this.f484b, (Function0) this.f487e, (m3.n) obj, iF12);
                break;
            case 12:
                ((Integer) obj2).intValue();
                int iF13 = m3.i.F(this.f485c | 1);
                vi.c.v((cj.q) this.f486d, (PaymentMethods) this.f487e, this.f484b, (m3.n) obj, iF13);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iF14 = m3.i.F(this.f485c | 1);
                o00.h0.a((um.u) this.f486d, (BasketResponse) this.f487e, this.f484b, (m3.n) obj, iF14);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF15 = m3.i.F(this.f485c | 1);
                wi.m.g((PickupOptionLocal) this.f486d, (String) this.f487e, this.f484b, (m3.n) obj, iF15);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ m3(Object obj, Object obj2, boolean z11, int i11, int i12) {
        this.f483a = i12;
        this.f486d = obj;
        this.f487e = obj2;
        this.f484b = z11;
        this.f485c = i11;
    }

    public /* synthetic */ m3(boolean z11, Object obj, Object obj2, int i11, int i12) {
        this.f483a = i12;
        this.f484b = z11;
        this.f486d = obj;
        this.f487e = obj2;
        this.f485c = i11;
    }
}
