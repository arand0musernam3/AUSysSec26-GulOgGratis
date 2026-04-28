package an;

import a3.l3;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b0.q;
import b2.l;
import b4.t;
import com.app.tgtg.feature.survey.rewards.RewardsSurveyActivity;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.TextMnu;
import com.app.tgtg.model.remote.item.response.TextMnuV2;
import com.braze.h2;
import d2.m2;
import d40.t1;
import g3.q4;
import g3.u7;
import g3.v7;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import lv.w;
import m2.g0;
import m3.m;
import m3.n;
import m3.s;
import o30.e0;
import o30.f0;
import v80.u;
import z1.a0;
import z1.k;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1619c;

    public /* synthetic */ b(Object obj, boolean z11, int i11) {
        this.f1617a = i11;
        this.f1619c = obj;
        this.f1618b = z11;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [T, kotlin.coroutines.CoroutineContext] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f1617a;
        String text = null;
        boolean z11 = this.f1618b;
        Object obj3 = this.f1619c;
        switch (i11) {
            case 0:
                ElementMnuV2 elementMnuV2 = (ElementMnuV2) obj3;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z12 = elementMnuV2 instanceof TextMnuV2;
                    String title = z12 ? ((TextMnuV2) elementMnuV2).getTitle() : elementMnuV2 instanceof TextMnu ? ((TextMnu) elementMnuV2).getTitle() : null;
                    if (z12) {
                        text = ((TextMnuV2) elementMnuV2).getText();
                    } else if (elementMnuV2 instanceof TextMnu) {
                        text = ((TextMnu) elementMnuV2).getText();
                    }
                    f0.d(title, text, z11, sVar, 0);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                l lVar = (l) obj3;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q4 q4Var = q4.f19349a;
                    long j9 = lv.s.G;
                    float f11 = 1;
                    q4Var.b(this.f1618b, lVar, q4.d(0L, j9, j9, j9, j9, 0L, 0L, sVar2, 2147452927), l2.g.b(8), f11, f11, sVar2, 14352816);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 2:
                u7 u7Var = (u7) obj3;
                a0 a0VarA = k.a(new q((z5.l) obj, z11, 4));
                r rVar = u7Var.f19587a;
                r rVar2 = u7Var.f19587a;
                boolean z13 = ((a0) rVar.d()).f46393c > 0;
                v7 v7Var = (v7) rVar2.f46652g.getValue();
                v7 v7Var2 = (v7) rVar2.f46654i.getValue();
                if (z13 || !a0VarA.c(v7Var)) {
                    v7Var = a0VarA.c(v7Var2) ? v7Var2 : v7.Settled;
                }
                return new Pair(a0VarA, v7Var);
            case 3:
                RewardsSurveyActivity rewardsSurveyActivity = (RewardsSurveyActivity) obj3;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i12 = RewardsSurveyActivity.f9261i;
                s sVar3 = (s) nVar3;
                if (sVar3.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    m3.f fVar = m.f29332a;
                    if (z11) {
                        sVar3.a0(-461730381);
                        s1 s1VarA = z8.a.a(sVar3);
                        if (s1VarA == null) {
                            h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return null;
                        }
                        gq.d dVar = (gq.d) t1.K(Reflection.getOrCreateKotlinClass(gq.d.class), s1VarA, e0.r(s1VarA, sVar3), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar3);
                        boolean zH = sVar3.h(rewardsSurveyActivity);
                        Object objM = sVar3.M();
                        if (zH || objM == fVar) {
                            objM = new b40.d(rewardsSurveyActivity, 8);
                            sVar3.k0(objM);
                        }
                        gq.a.b(dVar, (Function0) ((KFunction) objM), sVar3, 0);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(-461552720);
                        s1 s1VarA2 = z8.a.a(sVar3);
                        if (s1VarA2 == null) {
                            h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return null;
                        }
                        gq.b bVar = (gq.b) t1.K(Reflection.getOrCreateKotlinClass(gq.b.class), s1VarA2, e0.r(s1VarA2, sVar3), s1VarA2 instanceof p ? ((p) s1VarA2).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar3);
                        boolean zH2 = sVar3.h(rewardsSurveyActivity);
                        Object objM2 = sVar3.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new b40.d(rewardsSurveyActivity, 9);
                            sVar3.k0(objM2);
                        }
                        gq.a.a(bVar, (Function0) ((KFunction) objM2), sVar3, 0);
                        sVar3.q(false);
                    }
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 4:
                ((Integer) obj2).getClass();
                a.a.r((List) obj3, z11, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 5:
                ((Integer) obj2).getClass();
                e0.k(z11, (Function2) obj3, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 6:
                t1.b bVar2 = (t1.b) obj3;
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    d2.p.a(v1.n.k(m2.m(b4.q.f5711a, 56), ((Number) bVar2.d()).floatValue(), z11 ? lv.s.C : lv.s.D, l2.g.f26790a), sVar4, 0);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 7:
                ((Integer) obj2).getClass();
                w.a(z11, (u3.d) obj3, (n) obj, m3.i.F(385));
                return Unit.f26487a;
            case 8:
                ((Integer) obj2).getClass();
                g0.m((l3) obj3, z11, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 9:
                ((Integer) obj2).getClass();
                nn.q.f(z11, (Function1) obj3, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 10:
                ((Integer) obj2).getClass();
                rs.k.o(z11, (t) obj3, (n) obj, m3.i.F(7));
                return Unit.f26487a;
            default:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj3;
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof u)) {
                    return coroutineContext.plus(element);
                }
                CoroutineContext coroutineContext2 = (CoroutineContext) objectRef.element;
                o00.h hVar = o00.p.f31727c;
                CoroutineContext.Element element2 = coroutineContext2.get(hVar);
                if (element2 == null) {
                    return coroutineContext.plus(z11 ? new o00.p(((o00.p) ((u) element)).f31729b, o00.c.f31627a) : (u) element);
                }
                objectRef.element = ((CoroutineContext) objectRef.element).minusKey(hVar);
                return coroutineContext.plus(new o00.p(((o00.p) ((u) element)).f31729b, o00.c.f31627a));
        }
    }

    public /* synthetic */ b(Object obj, boolean z11, int i11, int i12) {
        this.f1617a = i12;
        this.f1619c = obj;
        this.f1618b = z11;
    }

    public /* synthetic */ b(boolean z11, Object obj, int i11) {
        this.f1617a = i11;
        this.f1618b = z11;
        this.f1619c = obj;
    }

    public /* synthetic */ b(boolean z11, Object obj, int i11, int i12) {
        this.f1617a = i12;
        this.f1618b = z11;
        this.f1619c = obj;
    }
}
