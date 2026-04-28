package b3;

import android.view.View;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerRateableOrder;
import h2.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z4.l1;
import z4.m1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.ui.android.common.buttonbanner.ButtonBannerState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5630c;

    public /* synthetic */ q(int i11, Object obj, int i12) {
        this.f5628a = i12;
        this.f5629b = i11;
        this.f5630c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5628a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f5630c;
                l1 l1Var = (l1) obj;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m1 m1Var = (m1) arrayList.get(i11);
                    l1.o(l1Var, m1Var, 0, (this.f5629b - m1Var.f47184b) / 2);
                }
                return Unit.f26487a;
            case 1:
                Function1 function1 = (Function1) this.f5630c;
                String str = (String) obj;
                str.getClass();
                if (str.length() < this.f5629b) {
                    function1.invoke(str);
                }
                return Unit.f26487a;
            case 2:
                w0 w0Var = (w0) obj;
                f2.a aVar = ((g2.b0) this.f5630c).f18126a;
                z3.g gVarC = z3.v.c();
                z3.v.f(gVarC, z3.v.d(gVarC), gVarC != null ? gVarC.e() : null);
                aVar.getClass();
                int i12 = w0Var.f21241a;
                if (i12 == -1) {
                    i12 = 2;
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    w0Var.a(this.f5629b + i13);
                }
                return Unit.f26487a;
            case 3:
                hl.a aVar2 = (hl.a) this.f5630c;
                Integer num = (Integer) obj;
                num.intValue();
                Function2 function2 = aVar2.f22106b;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(this.f5629b), num);
                }
                return Unit.f26487a;
            case 4:
                mg.i iVar = (mg.i) this.f5630c;
                ((View) obj).getClass();
                iVar.c(this.f5629b);
                return Unit.f26487a;
            case 5:
                List list = (List) this.f5630c;
                ManufacturerRateableOrder manufacturerRateableOrder = (ManufacturerRateableOrder) obj;
                manufacturerRateableOrder.getClass();
                String strM398getOrderIdawLnToY = manufacturerRateableOrder.m398getOrderIdawLnToY();
                return Boolean.valueOf(strM398getOrderIdawLnToY == null ? false : OrderId.m213equalsimpl0(strM398getOrderIdawLnToY, ((mg.a) list.get(this.f5629b)).f29928a));
            case 6:
                return Boolean.valueOf(((List) obj).addAll(this.f5629b, (Collection) this.f5630c));
            default:
                return MessageLogView.showNewMessagesViewIfNeeded$lambda$23$lambda$22(this.f5629b, (MessageLogView) this.f5630c, (ButtonBannerState) obj);
        }
    }

    public /* synthetic */ q(Object obj, int i11, int i12) {
        this.f5628a = i12;
        this.f5630c = obj;
        this.f5629b = i11;
    }
}
