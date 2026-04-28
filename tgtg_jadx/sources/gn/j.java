package gn;

import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.response.charity.CharityPlanCollectorType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20621i;

    public /* synthetic */ j(b4.t tVar, String str, String str2, String str3, String str4, String str5, CharityPlanCollectorType charityPlanCollectorType, Function0 function0, int i11) {
        this.f20613a = 3;
        this.f20614b = tVar;
        this.f20615c = str;
        this.f20616d = str2;
        this.f20618f = str3;
        this.f20619g = str4;
        this.f20620h = str5;
        this.f20621i = charityPlanCollectorType;
        this.f20617e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20613a;
        Object obj3 = this.f20617e;
        Object obj4 = this.f20621i;
        Object obj5 = this.f20620h;
        Object obj6 = this.f20619g;
        Object obj7 = this.f20618f;
        Object obj8 = this.f20616d;
        Object obj9 = this.f20615c;
        Object obj10 = this.f20614b;
        switch (i11) {
            case 0:
                dn.k kVar = (dn.k) obj8;
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                a.m(iF, kVar, (fn.c) obj9, (List) obj10, (Function0) obj3, (Function1) obj7, (Function1) obj6, (Function1) obj5, (Function2) obj4, (m3.n) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i12 = SurpriseBagOrderActivity.f9178y;
                ((SurpriseBagOrderActivity) obj10).J((Order) obj9, (b1) obj8, (b1) obj3, (b1) obj7, (b1) obj6, (b1) obj5, (b1) obj4, (m3.n) obj, m3.i.F(1797553));
                break;
            case 2:
                ((Integer) obj2).getClass();
                oo.a.Q((Invitation) obj10, (Function0) obj3, (Function0) obj9, (Function0) obj8, (b1) obj7, (b1) obj6, (Integer) obj5, (u3.d) obj4, (m3.n) obj, m3.i.F(12582913));
                break;
            default:
                ((Integer) obj2).getClass();
                zz.f.b((b4.t) obj10, (String) obj9, (String) obj8, (String) obj7, (String) obj6, (String) obj5, (CharityPlanCollectorType) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(7));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j(Invitation invitation, Function0 function0, Function0 function02, Function0 function03, b1 b1Var, b1 b1Var2, Integer num, u3.d dVar, int i11) {
        this.f20613a = 2;
        this.f20614b = invitation;
        this.f20617e = function0;
        this.f20615c = function02;
        this.f20616d = function03;
        this.f20618f = b1Var;
        this.f20619g = b1Var2;
        this.f20620h = num;
        this.f20621i = dVar;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i11, int i12) {
        this.f20613a = i12;
        this.f20614b = obj;
        this.f20615c = obj2;
        this.f20616d = obj3;
        this.f20617e = obj4;
        this.f20618f = obj5;
        this.f20619g = obj6;
        this.f20620h = obj7;
        this.f20621i = obj8;
    }
}
