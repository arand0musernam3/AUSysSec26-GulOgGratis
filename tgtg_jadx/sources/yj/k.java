package yj;

import android.content.Context;
import androidx.lifecycle.m1;
import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import com.app.tgtg.model.remote.user.response.MonthlyMoneySaved;
import f2.c0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import v80.b0;
import v80.f0;
import v80.i1;
import z1.b4;
import z1.e0;
import z1.k3;
import z1.l3;
import z1.q2;
import z1.z;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenView;
import zendesk.ui.android.common.retryerror.RetryErrorState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46099d;

    public /* synthetic */ k(Ref.FloatRef floatRef, q2 q2Var, Ref.FloatRef floatRef2, e0 e0Var) {
        this.f46096a = 2;
        this.f46097b = floatRef;
        this.f46098c = q2Var;
        this.f46099d = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f46096a;
        x70.c cVar = null;
        Object obj2 = this.f46099d;
        Object obj3 = this.f46098c;
        Object obj4 = this.f46097b;
        switch (i11) {
            case 0:
                xj.k kVar = (xj.k) obj4;
                List list = (List) obj3;
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                kVar.e(dv.d.FAVORITE_HEART, basicItem, dv.d.ADDED, list.indexOf(basicItem), list.size());
                ((Function2) obj2).invoke((Item) basicItem, Boolean.FALSE);
                f0.B(m1.d(kVar), null, null, new tg.g(kVar, basicItem, cVar, 12), 3);
                return Unit.f26487a;
            case 1:
                z zVar = (z) obj4;
                i1 i1Var = (i1) obj3;
                k3 k3Var = (k3) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f11 = zVar.f46781q ? 1.0f : -1.0f;
                l3 l3Var = zVar.f46780p;
                long jE = l3Var.e(l3Var.h(f11 * fFloatValue));
                l3 l3Var2 = k3Var.f46577a;
                float fG = l3Var.g(l3Var.e(l3Var2.c(l3Var2.f46594k, jE, 1))) * f11;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    i1Var.a(cancellationException);
                }
                return Unit.f26487a;
            case 2:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj4;
                t1.h hVar = (t1.h) obj;
                float fFloatValue2 = ((Number) hVar.f39447e.getValue()).floatValue() - floatRef.element;
                float fA = ((q2) obj3).a(fFloatValue2);
                floatRef.element = ((Number) hVar.f39447e.getValue()).floatValue();
                ((Ref.FloatRef) obj2).element = ((Number) hVar.b()).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    hVar.a();
                }
                return Unit.f26487a;
            case 3:
                return ConversationsListScreenView.retryErrorViewRenderingUpdate$lambda$15$lambda$13((ConversationsListScreenView) obj4, (Context) obj3, (String) obj2, (RetryErrorState) obj);
            default:
                MoneySavedResponse moneySavedResponse = (MoneySavedResponse) obj4;
                f2.l lVar = (f2.l) obj;
                int i12 = MoneySavedActivity.f9312g;
                lVar.getClass();
                List<MonthlyMoneySaved> moneySavedList = moneySavedResponse.getMoneySavedList();
                lVar.r(moneySavedList.size(), null, new vm.p(moneySavedList, 3), new u3.d(new vi.o(moneySavedList, (b0) obj3, (c0) obj2, moneySavedResponse), true, 2039820996));
                return Unit.f26487a;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i11) {
        this.f46096a = i11;
        this.f46097b = obj;
        this.f46098c = obj2;
        this.f46099d = obj3;
    }

    public /* synthetic */ k(z zVar, b4 b4Var, i1 i1Var, k3 k3Var) {
        this.f46096a = 1;
        this.f46097b = zVar;
        this.f46098c = i1Var;
        this.f46099d = k3Var;
    }
}
