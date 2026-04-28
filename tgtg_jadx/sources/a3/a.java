package a3;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import g3.d7;
import g3.g7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f246e;

    public /* synthetic */ a(int i11, int i12, b4.t tVar, String str, String str2) {
        this.f242a = 12;
        this.f243b = i11;
        this.f244c = str;
        this.f245d = str2;
        this.f246e = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f242a;
        int i12 = this.f243b;
        Object obj3 = this.f246e;
        Object obj4 = this.f245d;
        Object obj5 = this.f244c;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                bx.k.b((t) obj5, (b4.f) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                lx.u.j((BaseItemMnuV2) obj5, (String) obj4, (ym.y) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                d2.c.a((b4.t) obj5, (b4.f) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(3073), this.f243b);
                break;
            case 3:
                ((Integer) obj2).intValue();
                g3.s0.m((View) obj5, (z5.c) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                g3.s0.l((g7) obj5, (b4.t) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                g3.s0.f((d7) obj5, (b4.t) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int i13 = CharityOrderActivity.f9162o;
                ((CharityOrderActivity) obj5).G((Order) obj4, (m3.b1) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                bx.o.m((go.a) obj5, (Function0) obj4, (List) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                h2.q.d((h2.k0) obj5, this.f245d, this.f243b, this.f246e, (m3.n) obj, iF);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((h2.l1) obj5).e(obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 10:
                b4.t tVar = (b4.t) obj3;
                ((Integer) obj2).intValue();
                int iF2 = m3.i.F(i12 | 1);
                m0.c.P(iF2, tVar, (Order) obj4, (Function0) obj5, (m3.n) obj);
                break;
            case 11:
                ((Integer) obj2).getClass();
                w0.e.f((DiscoverBucket) obj5, (String) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(1);
                int i14 = this.f243b;
                lp.d.i(i14, iF3, (b4.t) obj3, (String) obj5, (String) obj4, (m3.n) obj);
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((m2.e2) obj5).b((Object[]) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                pm.a.c((String) obj5, (n4.b) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                int iF4 = m3.i.F(i12 | 1);
                b0.z.e(iF4, (b4.t) obj3, (List) obj5, (Function1) obj4, (m3.n) obj);
                break;
            case 16:
                ((Integer) obj2).intValue();
                r2.h.c((p2.g) obj5, (t2.d) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                rs.k.p((b4.t) obj5, (List) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1), this.f243b);
                break;
            case 18:
                ((Integer) obj2).getClass();
                w0.e.b((sm.b) obj5, (b4.t) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1), this.f243b);
                break;
            case 19:
                ((Integer) obj2).getClass();
                bx.o.z((b4.t) obj5, (m3.u1) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((u3.d) obj3).c(obj5, obj4, (m3.n) obj, m3.i.F(i12) | 1);
                break;
            case 21:
                ((Integer) obj2).intValue();
                w8.e.c((LifecycleOwner) obj5, (w8.f) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                bx.o.y((mn.l) obj5, (ProfileFeature) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                y1.g.b((b4.t) obj5, (y1.c) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1), this.f243b);
                break;
            case 24:
                ((Integer) obj2).getClass();
                y1.g.a((y1.c) obj5, (b4.t) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((y3.c) obj5).e(obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(i12 | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(h2.k0 k0Var, Object obj, int i11, Object obj2, int i12) {
        this.f242a = 8;
        this.f244c = k0Var;
        this.f245d = obj;
        this.f243b = i11;
        this.f246e = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f242a = i12;
        this.f244c = obj;
        this.f245d = obj2;
        this.f246e = obj3;
        this.f243b = i11;
    }

    public /* synthetic */ a(Object obj, Object obj2, u70.f fVar, int i11, int i12, int i13) {
        this.f242a = i13;
        this.f244c = obj;
        this.f245d = obj2;
        this.f246e = fVar;
        this.f243b = i12;
    }

    public /* synthetic */ a(u3.d dVar, Object obj, Object obj2, int i11) {
        this.f242a = 20;
        this.f246e = dVar;
        this.f244c = obj;
        this.f245d = obj2;
        this.f243b = i11;
    }
}
