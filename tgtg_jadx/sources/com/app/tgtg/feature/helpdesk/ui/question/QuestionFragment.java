package com.app.tgtg.feature.helpdesk.ui.question;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.app.tgtg.model.remote.order.Order;
import cv.i;
import dv.b;
import ek.q;
import g3.y0;
import hk.c;
import kk.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/helpdesk/ui/question/QuestionFragment;", "Lik/b;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QuestionFragment extends a {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new d(new y0(this, 24), true, 612724886));
        return composeView;
    }

    @Override // ik.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Order order;
        Order order2;
        hk.a aVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        q qVarO = o();
        c cVarB = qVarO.b();
        String strOrderTypeMappedToItemTypeForTracking = null;
        Pair pair = new Pair(dv.a.CATEGORY, new dv.c((cVarB == null || (aVar = cVarB.f22090b) == null) ? null : aVar.c()));
        dv.a aVar2 = dv.a.ITEM_TYPE;
        if (cVarB != null && (order2 = cVarB.f22092d) != null) {
            strOrderTypeMappedToItemTypeForTracking = order2.orderTypeMappedToItemTypeForTracking();
        }
        Pair[] pairArr = {pair, new Pair(aVar2, new dv.c(strOrderTypeMappedToItemTypeForTracking)), new Pair(dv.a.SOURCE, new dv.c((String) qVarO.f16065a.a("OPENED_FROM")))};
        b bVar = new b();
        x0.i(bVar.f15174a, pairArr);
        if (cVarB != null && (order = cVarB.f22092d) != null) {
            bVar.a(dv.a.ORDER_ID, order.m429getOrderIdreIZeYA());
        }
        qVarO.f16067c.c(i.SCREEN_HELPCENTER_CATEGORY, bVar);
        c cVarB2 = o().b();
        cVarB2.getClass();
        String string = getString(cVarB2.f22089a);
        string.getClass();
        s(string);
    }
}
